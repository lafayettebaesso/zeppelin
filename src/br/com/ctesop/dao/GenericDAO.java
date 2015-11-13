package br.com.ctesop.dao;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class GenericDAO {

    private static String ObterNomeDaClasse(Class<?> classe) {
        String nomeClasse = classe.getSimpleName();
        return nomeClasse.substring(0, nomeClasse.length() - 2);
    }

    private static void SetarParametrosStatement(PreparedStatement statement, Object[] parametros) throws SQLException {
        List<Object> listParametros = new ArrayList<>();
        listParametros.addAll(Arrays.asList(parametros));

        SetarParametrosStatement(statement, listParametros);
    }

    private static void SetarParametrosStatement(PreparedStatement statement, List<Object> parametros) throws SQLException {
        for (int i = 0; i < parametros.size(); i++) {
            Object parametro = parametros.get(i);
            if (parametro instanceof String) {
                statement.setString(i + 1, parametro.toString());
            } else if (parametro instanceof Integer) {
                statement.setInt(i + 1, (Integer) parametro);
            } else if (parametro instanceof Boolean) {
                statement.setBoolean(i + 1, (Boolean) parametro);
            } else if (parametro instanceof Date) {
                Date data = (Date) parametro;
                statement.setDate(i + 1, new java.sql.Date(data.getTime()));
            } else if (parametro instanceof Float) {
                statement.setFloat(i + 1, (Float) parametro);
            } else if (parametro == null) {
                statement.setNull(i + 1, Types.NULL);
            };
        }

    }

    private static boolean IsChavePrimaria(String coluna, String tabela) {
        return coluna.equalsIgnoreCase("id" + tabela);
    }

    private static Object ObterValorParametro(Object object, String field) throws NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

        String metodoName = field.replaceFirst("" + field.charAt(0), "" + field.toUpperCase().charAt(0));
        Method method = object.getClass().getDeclaredMethod("get" + metodoName);
        method.setAccessible(true);
        return method.invoke(object);
    }

    private static List<Object> CriarListaEntidadeRetorno(Class<?> classe, ResultSet rs) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, SQLException, IllegalArgumentException, InvocationTargetException {
        List<Object> listaRetorno = new ArrayList<>();

        while (rs.next()) {
            listaRetorno.add(CriarEntidadeRetorno(classe, rs));
        }

        return listaRetorno;
    }

    private static List<List<String>> CriarListaDeStringRetorno(Class<?> classe, ResultSet rs) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, SQLException, IllegalArgumentException, InvocationTargetException {
        List<List<String>> listaRetorno = new ArrayList<>();
        ResultSetMetaData a = rs.getMetaData();
        int rsColunas = a.getColumnCount();

        while (rs.next()) {
            int coluna = 1;
            List<String> linha = new ArrayList<>();
            while (coluna <= rsColunas) {
                linha.add(rs.getString(coluna));
                coluna++;
            }
            listaRetorno.add(linha);
        }

        return listaRetorno;
    }

    private static Object CriarEntidadeRetorno(Class<?> classe, ResultSet rs) throws NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, SQLException, ClassNotFoundException, InstantiationException {
        Object obj = CriarEntidade(classe);
        SetarEntidade(obj, rs);
        return obj;
    }

    private static Object CriarEntidade(Class<?> classe) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        return classe.newInstance();
    }

    private static void SetarEntidade(Object obj, ResultSet rs) throws NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, SQLException {
        if (obj == null || rs == null) {
            return;
        }

        for (Field declaredField : obj.getClass().getDeclaredFields()) {
            String field = declaredField.getName();
            String metodoName = field.replaceFirst("" + field.charAt(0), "" + field.toUpperCase().charAt(0));
            Method method = obj.getClass().getDeclaredMethod("set" + metodoName, declaredField.getType());
            method.setAccessible(true);
            method.invoke(obj, rs.getObject(field));
        }
    }

    private static Object ObterValorField(Field declaredField) throws InstantiationException, IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
        if (declaredField == null) {
            throw new NullPointerException("O Field não pode ser nulo!");
        }

        Object obj = declaredField.getClass().newInstance();
        String field = declaredField.getName();
        String metodoName = field.replaceFirst("" + field.charAt(0), "" + field.toUpperCase().charAt(0));
        Method method = obj.getClass().getDeclaredMethod("get" + metodoName, declaredField.getType());
        method.setAccessible(true);
        return method.invoke(obj);
    }

    public static int inserirRetornandoId(Object object) throws Exception {
        inserir(object);
        return getMaxId(object.getClass());
    }

    public static int inserirRetornandoIdSemConfirmar(Object object, Conexao c) throws Exception {
        inserirSemConfirmar(object, c);
        return getMaxId(object.getClass());
    }

    //Método para inserir as informações no banco de dados
    public static void inserir(Object object) throws Exception {
        try {
            String sql = "INSERT INTO " + object.getClass().getSimpleName().substring(0, object.getClass().getSimpleName().length() - 2) + " (";

            List<Object> parametros = new ArrayList<>();
            for (Field declaredField : object.getClass().getDeclaredFields()) {
                sql += declaredField.getName() + ", ";
                String metodoName = declaredField.getName();
                metodoName = metodoName.replaceFirst("" + metodoName.charAt(0), "" + metodoName.toUpperCase().charAt(0));
                Method method = object.getClass().getDeclaredMethod("get" + metodoName);
                method.setAccessible(true);
                parametros.add(method.invoke(object));
            }

            sql = sql.substring(0, sql.lastIndexOf(",")) + ") ";
            sql += " VALUES (";
            for (int i = 0; i < parametros.size(); i++) {
                if (i == parametros.size() - 1) {
                    sql += "?);";
                } else {
                    sql += "?,";
                }
            }

            Conexao c = new Conexao();
            PreparedStatement ps = c.getConexao().prepareCall(sql);

            SetarParametrosStatement(ps, parametros);

            ps.execute();
            c.confirmar();
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new Exception("Falha ao salvar entidade", ex);
        }
    }

    //Método para inserir as informações no banco de dados
    public static void inserirSemConfirmar(Object object, Conexao c) throws Exception {
        try {
            String sql = "INSERT INTO " + object.getClass().getSimpleName().substring(0, object.getClass().getSimpleName().length() - 2) + " (";

            List<Object> parametros = new ArrayList<>();
            for (Field declaredField : object.getClass().getDeclaredFields()) {
                sql += declaredField.getName() + ", ";
                String metodoName = declaredField.getName();
                metodoName = metodoName.replaceFirst("" + metodoName.charAt(0), "" + metodoName.toUpperCase().charAt(0));
                Method method = object.getClass().getDeclaredMethod("get" + metodoName);
                method.setAccessible(true);
                parametros.add(method.invoke(object));
            }

            sql = sql.substring(0, sql.lastIndexOf(",")) + ") ";
            sql += " VALUES (";
            for (int i = 0; i < parametros.size(); i++) {
                if (i == parametros.size() - 1) {
                    sql += "?);";
                } else {
                    sql += "?,";
                }
            }

            PreparedStatement ps = c.getConexao().prepareCall(sql);

            SetarParametrosStatement(ps, parametros);

            ps.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new Exception("Falha ao salvar entidade", ex);
        }
    }

    public static Conexao getConexao() throws Exception {
        Conexao c = new Conexao();
        return c;
    }

    public static void confirmar(Conexao c) throws Exception {
        c.confirmar();
    }

    //Método para alterar as informações no banco de dados
    public static void alterar(Object object) throws Exception {
        String sql = "UPDATE " + object.getClass().getSimpleName().substring(0, object.getClass().getSimpleName().length() - 2) + " SET ";
        String sqlWhere = " WHERE ";

        List<Object> parametros = new ArrayList<>();
        Object parametroWhere = null;
        for (Field declaredField : object.getClass().getDeclaredFields()) {
            if (IsChavePrimaria(declaredField.getName(), object.getClass().getSimpleName().substring(0, object.getClass().getSimpleName().length() - 2))) {
                sqlWhere += declaredField.getName() + " = ? ";
                parametroWhere = ObterValorParametro(object, declaredField.getName());
            } else {
                sql += declaredField.getName() + " = ?, ";
                parametros.add(ObterValorParametro(object, declaredField.getName()));
            }
        }

        sql = sql.substring(0, sql.lastIndexOf(",")) + "";
        sql += sqlWhere;
        parametros.add(parametroWhere);

        Conexao c = new Conexao();
        PreparedStatement ps = c.getConexao().prepareCall(sql);

        SetarParametrosStatement(ps, parametros);

        ps.execute();
        c.confirmar();
    }

    public static Object get(Class<?> classe, int id) throws Exception {
        String tabela = classe.getSimpleName().substring(0, classe.getSimpleName().length() - 2);
        String sql = "SELECT * FROM " + tabela + " WHERE Id" + tabela + " = ? ";

        Conexao c = new Conexao();
        PreparedStatement ps = c.getConexao().prepareCall(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            return CriarEntidadeRetorno(classe, rs);
        } else {
            return null;
        }
    }

    public static int getMaxId(Class<?> classe) throws Exception {
        String tabela = ObterNomeDaClasse(classe);
        String sql = "SELECT MAX(Id" + tabela + ") FROM " + tabela;

        Conexao c = new Conexao();
        PreparedStatement ps = c.getConexao().prepareCall(sql);
        ResultSet rs = ps.executeQuery();

        int maxId = 0;
        if (rs.next()) {
            maxId = rs.getInt(1);
        }

        return maxId;
    }

    public static Object CarregarRegistroFiltrandoPorColuna(Class<?> classe, String coluna, Object valor) throws Exception {
        return CarregarRegistroFiltrandoPorColunas(classe, new String[]{coluna}, new Object[]{valor});
    }

    public static Object CarregarRegistroFiltrandoPorColunas(Class<?> classe, String[] colunas, Object[] valores) throws Exception {
        List<Object> retorno = CarregarRegistrosFiltrandoPorColunas(classe, colunas, valores);
        if (retorno != null && !retorno.isEmpty()) {
            return retorno.get(0);
        } else {
            return null;
        }
    }

    public static List<Object> CarregarRegistrosFiltrandoPorColunas(Class<?> classe, String[] colunas, Object[] valores) throws Exception {
        String sql = "SELECT * FROM " + classe.getSimpleName().substring(0, classe.getSimpleName().length() - 2);

        if (colunas != null && valores != null && colunas.length > 0) {
            sql += " WHERE ";
            for (int i = 0; i < colunas.length; i++) {
                sql += " " + colunas[i] + " = ?,";
            }
            sql = sql.substring(0, sql.lastIndexOf(",")) + "";
        }

        Conexao c = new Conexao();
        PreparedStatement ps = c.getConexao().prepareCall(sql);

        SetarParametrosStatement(ps, valores);
        ResultSet rs = ps.executeQuery();

        List<Object> retorno = CriarListaEntidadeRetorno(classe, rs);
        return retorno;
    }

    public static List<Object> listar(Class<?> classe) throws Exception {
        return listar(classe, 0, null, null);
    }

    public static List<Object> listar(Class<?> classe, int pagina, String campo, String filtro) throws Exception {
        String sql = "SELECT * FROM " + classe.getSimpleName().substring(0, classe.getSimpleName().length() - 2);

        if (campo != null && filtro != null && !filtro.isEmpty()) {
            sql += " WHERE " + campo + " LIKE '%" + filtro + "%' LIMIT ?,10";
        }

        Conexao c = new Conexao();
        PreparedStatement ps = c.getConexao().prepareCall(sql);
        if (pagina > 0) {
            ps.setInt(1, pagina * 10);
        }
        ResultSet rs = ps.executeQuery();

        return CriarListaEntidadeRetorno(classe, rs);
    }

    public static List<List<String>> listarUtilizandoComandoInnerJoin(List<Class<?>> classes, String[] camposSelect, int pagina, String campoFiltro, String filtro) throws Exception {
        if (classes == null || classes.isEmpty()) {
            throw new Exception("Erro! A lista de classes não pode ser nula ou vazia.");
        }

        Class<?> classe = classes.remove(0);
        String classePaiNome = ObterNomeDaClasse(classe);
        String sql = "SELECT ";

        for (String campoSelect : camposSelect) {
            sql += campoSelect + ", ";
        }

        sql = sql.substring(0, sql.length() - 2) + " FROM " + classePaiNome;

        for (Class<?> classeJoin : classes) {
            String classeJoinNome = ObterNomeDaClasse(classeJoin);
            sql += " INNER JOIN " + classeJoinNome
                    + " ON " + classePaiNome + ".id" + classeJoinNome + " = " + classeJoinNome + ".id" + classeJoinNome;
        }

        if (campoFiltro != null && filtro != null && !filtro.isEmpty()) {
            sql += " WHERE " + campoFiltro + " LIKE '%" + filtro + "%'";
        }
        if (pagina > 0) {
            sql += " LIMIT ?,10";

        }
        Conexao c = new Conexao();
        PreparedStatement ps = c.getConexao().prepareCall(sql);
        if (pagina > 0) {
            ps.setInt(1, pagina * 10);
        }
        ResultSet rs = ps.executeQuery();

        return CriarListaDeStringRetorno(classe, rs);
    }
}
