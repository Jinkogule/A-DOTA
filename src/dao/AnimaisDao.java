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
    ConnectDB conexao = new ConnectDB();

    @Override
    public void salvarDao(Object... valor) {
        AnimaisModelo am = (AnimaisModelo) valor[0];
        
        //padroniza (na medida do possível) os dados que serão enviados para o BD
        String Nome_Animal = padronizaString(am.getNome_Animal());
        String Raca = padronizaString(am.getRaca());
        String Cor = padronizaString(am.getCor());
        //inclui novo se for inclusão ou altera se for alteração
        if (am.getId() == 0){
            sql = "INSERT INTO animais (Nome_Animal, Tipo, Raca, Idade, Porte, Cor, Abrigo) VALUES (?, ?, ?, ?, ?, ?, ?)";
        }
        else{
            sql = "UPDATE animais SET nome=Nome_Abrigo WHERE Id=?";
        }

        try{
            conexao.abreConexao();
            stm = conexao.con.prepareStatement(sql);
            stm.setString(1, Nome_Animal);
            stm.setString(2, am.getTipo());
            stm.setString(3, Raca);
            stm.setInt(4, am.getIdade());
            stm.setString(5, am.getPorte());
            stm.setString(6, Cor);
            stm.setString(7, am.getAbrigo());
            if (am.getId()>0){
                stm.setInt(2, am.getId());
            }
            
            //Tratando ocorrência de dados inválidos
            if (!(am.getNome_Animal().matches("[A-Za-zã-ãá-áâ-âó-óô-ôó-óí-íú-úç-çé-éü-ü - ]+")) || am.getNome_Animal().isBlank()){
                throw new IllegalArgumentException("Nome inválido.");
            }
            if ("".equals(am.getTipo())){
                throw new IllegalArgumentException("Insira o valor de TIPO.");
            }
            if (!(am.getRaca().matches("[A-Za-zã-ãá-áâ-âó-óô-ôó-óí-íú-úç-çü-üé-é--- - ]+")) || am.getNome_Animal().isBlank()){
                throw new IllegalArgumentException("Raça inválida.");
            }
            if (am.getIdade() < 0){
                throw new IllegalArgumentException("Idade inválida.");
            }
            if ("".equals(am.getPorte())){
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
}