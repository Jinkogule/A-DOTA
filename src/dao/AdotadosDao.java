package dao;

import interfaces.InterfaceDao;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import modelo.AdotadosModelo;

public class AdotadosDao implements InterfaceDao{
    
    String sql, sql2;
    PreparedStatement stm, stm2;
    ConnectDB conexao = new ConnectDB();

    @Override
    public void salvarDao(Object... valor) {
        AdotadosModelo am = (AdotadosModelo) valor[0];
       
        //inclui novo se for inclusão ou altera se for alteração
        sql = "INSERT INTO adotados (Nome_Adotante, Nome_Animal) VALUES (?, ?)";
             
        sql2 = "DELETE FROM animais WHERE animais.Nome_Animal = (?)";
        
        try{
            conexao.abreConexao();
            stm = conexao.con.prepareStatement(sql);
            stm.setString(1, am.getNome_Adotante());
            stm.setString(2, am.getNome_Animal());         
            if (am.getId()>0){
                stm.setInt(2, am.getId());
            }
            
            if ("".equals(am.getNome_Adotante())){
                throw new IllegalArgumentException("Insira o valor de ADOTANTE.");
            }
            if ("".equals(am.getNome_Animal())){
                throw new IllegalArgumentException("Insira o valor de ANIMAL.");
            }
            stm.execute();
            stm.close();
            
            conexao.abreConexao();
            stm2 = conexao.con.prepareStatement(sql2);
            stm2.setString(1, am.getNome_Animal());
            stm2.execute();
            stm2.close();
            JOptionPane.showMessageDialog(null, "Adoção registrada.");
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro: "+e);
        }
    }
}