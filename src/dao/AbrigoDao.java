package dao;

import interfaces.InterfaceDao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.AbrigoModelo;
import static views.FormPadrao.padronizaString;

public class AbrigoDao implements InterfaceDao{
    
    String sql;
    PreparedStatement stm;
    ResultSet rs;
    ConnectDB conexao = new ConnectDB();

    @Override
    public void salvarDao(Object... valor) {
        AbrigoModelo am = (AbrigoModelo) valor[0];
        
        //padroniza (na medida do possível) os dados que serão enviados para o BD
        String Nome_Abrigo = padronizaString(am.getNome_Abrigo());
        String Nome_Dono = padronizaString(am.getNome_Dono());
        String Endereco = padronizaString(am.getEndereco());

        sql = "INSERT INTO abrigo (Nome_Abrigo, Nome_Dono, Estado, Cidade, Endereco, CEP) VALUES (?, ?, ?, ?, ?, ?)";
        
        try{
            conexao.abreConexao();
            stm = conexao.con.prepareStatement(sql);
            stm.setString(1, Nome_Abrigo);
            stm.setString(2, Nome_Dono);
            stm.setString(3, am.getEstado());
            stm.setString(4, am.getCidade());
            stm.setString(5, Endereco);
            stm.setString(6, am.getCEP());
            if (am.getId()>0){
                stm.setInt(2, am.getId());
            }
            
            //tratando ocorrência de dados inválidos
            if (!(am.getNome_Abrigo().matches("[A-Za-zã-ãá-áâ-âó-óô-ôó-óí-íú-úç-çé-é - ]+")) || am.getNome_Abrigo().isBlank() || am.getNome_Abrigo().isEmpty()){
                throw new IllegalArgumentException("Nome do abrigo inválido.");
            }
            if (!(am.getNome_Dono().matches("[A-Za-zã-ãá-áâ-âó-óô-ôó-óí-íú-úç-çé-é - ]+")) || am.getNome_Dono().isBlank()){
                throw new IllegalArgumentException("Nome do dono inválido.");
            }
            if ("".equals(am.getEstado())){
                throw new IllegalArgumentException("Insira o valor de ESTADO.");
            }
            if ("".equals(am.getCidade())){
                throw new IllegalArgumentException("Insira o valor de CIDADE.");
            }
            if (!(am.getEndereco().matches("[A-Za-zã-ãá-áâ-âó-óô-ôó-óí-íú-úç-çé-é,-,0-9--- - ]+")) || am.getEndereco().isBlank()){
                throw new IllegalArgumentException("Endereço inválido.");
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
    public void preencherTabelaDao(Object... valor) {
        
        DefaultTableModel tabela = (DefaultTableModel) valor[0];
        sql = "select * from abrigo";
        try{
            conexao.abreConexao();
            stm = conexao.con.prepareStatement(sql);
            rs = stm.executeQuery();
            
            while (rs.next()){
                tabela.addRow(
                    new Object[] {
                        rs.getInt("Id"),
                        rs.getString("Nome_Abrigo"),
                        rs.getString("Nome_Dono"),
                        rs.getString("Endereco"),
                        rs.getString("CEP"),
                        rs.getString("Estado"),
                        rs.getString("Cidade")                        
                    }
                );
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro: "+e);
        }    
    }
}
