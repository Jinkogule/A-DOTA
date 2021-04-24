package dao;

import interfaces.InterfaceDao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import modelo.AbrigoModelo;

public class AbrigoDao implements InterfaceDao{
    
    String sql;
    PreparedStatement stm;

    @Override
    public void salvarDao(Object... valor) {
        AbrigoModelo am = (AbrigoModelo) valor[0];
        //inclui novo se for inclusão ou altera se for alteração
        if (am.getId() == 0){
            sql = "INSERT INTO abrigo (Nome_Abrigo, Nome_Dono, Endereco, CEP) VALUES (?, ?, ?, ?)";
        }
        else{
            sql = "UPDATE abrigo SET nome=Nome_Abrigo WHERE Id=?";
        }
        
        try{
            stm = ConnectDB.abreConexao().prepareStatement(sql);
            stm.setString(1, am.getNome_Abrigo());
            stm.setString(2, am.getNome_Dono());
            stm.setString(3, am.getEndereco());
            stm.setString(4, am.getCEP());
            if (am.getId()>0){
                stm.setInt(2, am.getId());
            }
            stm.execute();
            stm.close();
            JOptionPane.showMessageDialog(null, "Cadastro Registrado.");
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro: "+e);
        }
        am.getNome_Abrigo();
        am.getNome_Dono();
        am.getEndereco();
        am.getCEP();
        
   
        
    }

    @Override
    public void excluirDao(int id) {
        
    }

    @Override
    public void consultarDao(Object... valor) throws SQLException {
        
    }

    @Override
    public void carregarComboBoxDao(JComboBox itens) throws SQLException {
        
    }
    
}
