/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import interfaces.InterfaceDao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import modelo.AnimaisModelo;
/**
 *
 * @author Lucas Couto
 */
public class AnimaisDao implements InterfaceDao{
    
    String sql;
    PreparedStatement stm;

    @Override
    public void salvarDao(Object... valor) {
        AnimaisModelo am = (AnimaisModelo) valor[0];
        //inclui novo se for inclusão ou altera se for alteração
        if (am.getId() == 0){
            sql = "INSERT INTO animais (Nome_Animal, Raca, Idade, Porte) VALUES (?, ?, ?, ?)";
        }
        else{
            sql = "UPDATE animais SET nome=Nome_Animal WHERE Id=?";
        }
        
        try{
            stm = ConnectDB.abreConexao().prepareStatement(sql);
            stm.setString(1, am.getNome_Animal());
            stm.setString(2, am.getRaca());
            stm.setInt(3, am.getIdade());
            stm.setString(4, am.getPorte());
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
        am.getNome_Animal();
        am.getRaca();
        am.getIdade();
        am.getPorte();
        
    
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
