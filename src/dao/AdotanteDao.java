package dao;

import interfaces.InterfaceDao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import modelo.AbrigoModelo;
import modelo.AdotanteModelo;

public class AdotanteDao implements InterfaceDao{

    String sql;
    PreparedStatement stm;

    @Override
    public void salvarDao(Object... valor) {
        AdotanteModelo am = (AdotanteModelo) valor[0];
        //inclui novo se for inclusão ou altera se for alteração
        if (am.getId() == 0){
            sql = "INSERT INTO adotante (NomeAdotante, IdadeAdotante, EnderecoAdotante, TelefoneAdotante, CEP) VALUES (?, ?, ?, ?, ?)";
        }
        else{
            sql = "UPDATE adotante SET nome=NomeAdotante WHERE Id=?";
        }

        try{
            stm = ConnectDB.abreConexao().prepareStatement(sql);
            stm.setString(1, am.getNomeAdotante());
            stm.setString(2, am.getIdadeAdotante());
            stm.setString(3, am.getEnderecoAdotante());
            stm.setString(4, am.getTelefoneAdotante());
            stm.setString(5, am.getCEP());
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
        am.getNomeAdotante();
        am.getIdadeAdotante();
        am.getEnderecoAdotante();
        am.getTelefoneAdotante();
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

