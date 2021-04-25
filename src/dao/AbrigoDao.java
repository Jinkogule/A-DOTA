package dao;

import interfaces.InterfaceDao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import modelo.AbrigoModelo;
import static views.FormPadrao.padronizaString;

public class AbrigoDao implements InterfaceDao{
    
    String sql;
    PreparedStatement stm;

    @Override
    public void salvarDao(Object... valor) {
        AbrigoModelo am = (AbrigoModelo) valor[0];
        
        //padroniza (na medida do possível) os dados que serão enviados para o BD
        String Nome_Abrigo = padronizaString(am.getNome_Abrigo());
        String Nome_Dono = padronizaString(am.getNome_Dono());
        String Endereco = padronizaString(am.getEndereco());
        String CEP = padronizaString(am.getCEP());
        //inclui novo se for inclusão ou altera se for alteração
        if (am.getId() == 0){
            sql = "INSERT INTO abrigo (Nome_Abrigo, Nome_Dono, Estado, Cidade, Endereco, CEP) VALUES (?, ?, ?, ?, ?, ?)";
        }
        else{
            sql = "UPDATE abrigo SET nome=Nome_Abrigo WHERE Id=?";
        }
        
        try{
            stm = ConnectDB.abreConexao().prepareStatement(sql);
            stm.setString(1, Nome_Abrigo);
            stm.setString(2, Nome_Dono);
            stm.setString(3, am.getEstado());
            stm.setString(4, am.getCidade());
            stm.setString(5, Endereco);
            stm.setString(6, CEP);
            if (am.getId()>0){
                stm.setInt(2, am.getId());
            }
            
            //tratando ocorrência de dados inválidos
            if (!(am.getNome_Abrigo().matches("[A-Za-z - ã - ãá - áâ - âó - óô - ôó - óí - íú - úç - ç]+")) || am.getNome_Abrigo().isBlank()){
                throw new IllegalArgumentException("Nome do abrigo inválido.");
            }
            if (!(am.getNome_Dono().matches("[A-Za-z - ã - ãá - áâ - âó - óô - ôó - óí - íú - úç - ç]+")) || am.getNome_Dono().isBlank()){
                throw new IllegalArgumentException("Nome do dono inválido.");
            }
            if (am.getEstado() == ""){
                throw new IllegalArgumentException("Insira o valor de ESTADO.");
            }
            if (am.getCidade() == ""){
                throw new IllegalArgumentException("Insira o valor de CIDADE.");
            }
            if (!(am.getEndereco().matches("[A-Za-z - ã - ãá - áâ - âó - óô - ôó - óí - íú - úç - ç, - ,]+")) || am.getEndereco().isBlank()){
                throw new IllegalArgumentException("Endereço inválido.");
            }
            
            stm.execute();
            stm.close();
            JOptionPane.showMessageDialog(null, "Cadastro Registrado.");
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro: "+e);
        }
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
