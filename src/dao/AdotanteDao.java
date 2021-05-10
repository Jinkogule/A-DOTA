package dao;

import interfaces.InterfaceDao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.AdotanteModelo;
import static views.FormPadrao.padronizaString;

public class AdotanteDao implements InterfaceDao{

    String sql;
    PreparedStatement stm;
    ResultSet rs;
    ConnectDB conexao = new ConnectDB();
    
    @Override
    public void salvarDao(Object... valor) {
        AdotanteModelo am = (AdotanteModelo) valor[0];       
        //padroniza (na medida do possível) os dados que serão enviados para o BD
        String NomeAdotante = padronizaString(am.getNomeAdotante());
        String EnderecoAdotante = padronizaString(am.getEnderecoAdotante());
        String TelefoneAdotante = padronizaString(am.getTelefoneAdotante());
 
        sql = "INSERT INTO adotante (Nome, Idade, Endereco, Telefone, CEP) VALUES (?, ?, ?, ?, ?)";
     
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
            if (!(am.getNomeAdotante().matches("[A-Za-zã-ãá-áâ-âó-óô-ôó-óí-íú-úç-çé-é - ]+")) || am.getNomeAdotante().isBlank()){
                throw new IllegalArgumentException("Nome inválido.");
            }

            if (!(am.getEnderecoAdotante().matches("[A-Za-zã-ãá-áâ-âó-óô-ôó-óí-íú-úç-çé-é,-,0-9--- - ]+")) || am.getEnderecoAdotante().isBlank()){
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
    public void preencherTabelaDao(Object... valor) {
        
        DefaultTableModel tabela = (DefaultTableModel) valor[0];
        sql = "select * from adotante";
        try{
            conexao.abreConexao();
            stm = conexao.con.prepareStatement(sql);
            rs = stm.executeQuery();
            
            while (rs.next()){
                tabela.addRow(
                    new Object[] {
                        rs.getInt("Id"),
                        rs.getString("Nome"),
                        rs.getInt("Idade"),
                        rs.getString("Endereco"),
                        rs.getString("CEP"),
                        rs.getString("Telefone"),                       
                    }
                );
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro: "+e);
        }      
    }

    @Override
    public void removerDao(){}

    @Override
    public void buscarDao(){}
}