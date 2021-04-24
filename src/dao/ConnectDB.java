package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConnectDB {
    private static final String driverClass = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/a_dota?useTimezone=true&serverTimezone=UTC";
    private static final String usuario = "root";
    private static final String senha = "";
    
    public static Connection abreConexao(){
        Connection conexao = null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(URL, usuario, senha);
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Falha na conexão com o banco de dados: "+e);
        }
        
        return conexao;
    }
    
}
