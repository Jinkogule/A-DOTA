package dao;

import java.sql.*;
import javax.swing.JOptionPane;

public class ConnectDB {
    public Statement stm;
    public ResultSet rs;
    public Connection con;
    private static final String driverClass = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/a_dota?useTimezone=true&serverTimezone=UTC";
    private static final String usuario = "root";
    private static final String senha = "";
    
    public void abreConexao(){
        try{
            Class.forName(driverClass);
            con = DriverManager.getConnection(URL, usuario, senha);
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Falha na conexão com o banco de dados: "+e);
        }    
    }
    
    public void executaSQL(String sql){

        try{
            stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao executar a query: "+e);
        }
    }
    
    public void desconecta(){
        try {
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Falha ao encerrar conexão com o banco de dados: "+e);
        }       
    }    
}