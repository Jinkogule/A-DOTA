package dao;

import interfaces.InterfaceDao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import modelo.AdotanteModelo;
import static views.FormPadrao.padronizaString;

public class AdotanteDao implements InterfaceDao{

    String sql;
    PreparedStatement stm;
    ConnectDB conexao = new ConnectDB();
    
    @Override
    public void salvarDao(Object... valor) {
        AdotanteModelo am = (AdotanteModelo) valor[0];       
        //padroniza (na medida do possível) os dados que serão enviados para o BD
        String NomeAdotante = padronizaString(am.getNomeAdotante());
        String EnderecoAdotante = padronizaString(am.getEnderecoAdotante());
        String TelefoneAdotante = padronizaString(am.getTelefoneAdotante());
        //inclui novo se for inclusão ou altera se for alteração
        if (am.getId() == 0){
            sql = "INSERT INTO adotante (Nome, Idade, Endereco, Telefone, CEP) VALUES (?, ?, ?, ?, ?)";
        }
        else{
            sql = "UPDATE adotante SET nome=NomeAdotante WHERE Id=?";
        }

        try{
            conexao.abreConexao();
            stm = conexao.con.prepareStatement(sql);
            stm.setString(1, NomeAdotante);
            stm.setInt(2, am.getIdadeAdotante());
            stm.setString(3, EnderecoAdotante);
            stm.setString(4, TelefoneAdotante);
            stm.setString(5, am.getCEP());
            if (am.getId()>0){
                stm.setInt(2, am.getId());
            }
            
            //Tratando ocorrência de dados inválidos
            if (!(am.getNomeAdotante().matches("[A-Za-z - ã - ãá - áâ - âó - óô - ôó - óí - íú - úç - çü - ü]+")) || am.getNomeAdotante().isBlank()){
                throw new IllegalArgumentException("Nome inválido.");
            }

            if (!(am.getEnderecoAdotante().matches("[A-Za-z - ã - ãá - áâ - âó - óô - ôó - óí - íú - úç - ç]+")) || am.getEnderecoAdotante().isBlank()){
                throw new IllegalArgumentException("Endereço inválido.");
            }
            if (am.getIdadeAdotante() < 0){
                throw new IllegalArgumentException("Idade inválida.");
            }

            if (!(am.getTelefoneAdotante().matches("[0-9---]+")) || am.getTelefoneAdotante().isBlank()){
                throw new IllegalArgumentException("Telefone inválido.");
            }
            
            if (!(am.getCEP().matches("[0-9---]+")) || am.getCEP().isBlank()){
                throw new IllegalArgumentException("CEP inválido.");
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