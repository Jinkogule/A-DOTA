package dao;

import interfaces.InterfaceDao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import modelo.AnimaisModelo;
import static views.FormPadrao.padronizaString;

public class AnimaisDao implements InterfaceDao{
    
    String sql;
    PreparedStatement stm;

    @Override
    public void salvarDao(Object... valor) {
        AnimaisModelo am = (AnimaisModelo) valor[0];
        
        //padroniza (na medida do possível) os dados que serão enviados para o BD
        String Nome_Animal = padronizaString(am.getNome_Animal());
        String Raca = padronizaString(am.getRaca());
        String Cor = padronizaString(am.getCor());
        //inclui novo se for inclusão ou altera se for alteração
        if (am.getId() == 0){
            sql = "INSERT INTO animais (Nome_Animal, Tipo, Raca, Idade, Porte, Cor) VALUES (?, ?, ?, ?, ?, ?)";
        }
        else{
            sql = "UPDATE animais SET nome=Nome_Abrigo WHERE Id=?";
        }

        try{
            stm = ConnectDB.abreConexao().prepareStatement(sql);
            stm.setString(1, Nome_Animal);
            stm.setString(2, am.getTipo());
            stm.setString(3, Raca);
            stm.setInt(4, am.getIdade());
            stm.setString(5, am.getPorte());
            stm.setString(6, Cor);
            if (am.getId()>0){
                stm.setInt(2, am.getId());
            }
            
            //Tratando ocorrência de dados inválidos
            if (!(am.getNome_Animal().matches("[A-Za-z - ã - ãá - áâ - âó - óô - ôó - óí - íú - úç - çü - ü]+")) || am.getNome_Animal().isBlank()){
                throw new IllegalArgumentException("Nome inválido.");
            }
            if (am.getTipo() == ""){
                throw new IllegalArgumentException("Insira o valor de TIPO.");
            }
            if (!(am.getRaca().matches("[A-Za-z - ã - ãá - áâ - âó - óô - ôó - óí - íú - úç - ç]+")) || am.getNome_Animal().isBlank()){
                throw new IllegalArgumentException("Raça inválida.");
            }
            if (am.getIdade() < 0){
                throw new IllegalArgumentException("Idade inválida.");
            }
            if (am.getPorte() == ""){
                throw new IllegalArgumentException("Insira o valor de PORTE.");
            }
            if (!(am.getCor().matches("[A-Za-z - ]+")) || am.getNome_Animal().isBlank()){
                throw new IllegalArgumentException("Cor inválida.");
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
