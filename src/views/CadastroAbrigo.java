package views;

import controle.AbrigoControle;
import dao.ConnectDB;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CadastroAbrigo extends FormPadrao{
    ConnectDB teste = new ConnectDB();
    
    JLabel jlDonoDoAbrigo;
    JTextField jtfDonoDoAbrigo;
    
    JLabel jlEstado;
    JComboBox jcbEstado;
    
    JLabel jlCidade;
    JComboBox jcbCidade;
    
    JLabel jlEndereco;
    JTextField jtfEndereco;
    
    JLabel jlCEP;
    JTextField jtfCEP;
    
    public CadastroAbrigo(){
        setTitle("Cadastro de Abrigo");
        preencheEstado();
        preencheCidade();
    }

    @Override
    public void iniciarComponentes() {
        //Componentes de "dono do abrigo"
        jlDonoDoAbrigo = new JLabel("Dono do Abrigo");
        jlDonoDoAbrigo.setBounds(10, 80, 200, 25);
        jPanel2.add(jlDonoDoAbrigo);
        
        jtfDonoDoAbrigo = new JTextField();
        jtfDonoDoAbrigo.setBounds(10, 100, 200, 25);
        jPanel2.add(jtfDonoDoAbrigo);
        
        //Componentes de "Estado do abrigo"
        jlEstado = new JLabel("Estado");
        jlEstado.setBounds(220, 80, 50, 25);
        jPanel2.add(jlEstado);
        
        jcbEstado = new JComboBox();
        jcbEstado.setBounds(220, 100, 150, 25);
        jPanel2.add(jcbEstado);
        jcbEstado.addItem("");
        
        //Componentes de "cidade do abrigo"
        jlCidade = new JLabel("Cidade");
        jlCidade.setBounds(375, 80, 50, 25);
        jPanel2.add(jlCidade);
        
        jcbCidade = new JComboBox();
        jcbCidade.setBounds(375, 100, 150, 25);
        jPanel2.add(jcbCidade);
        jcbCidade.addItem("");
        
        //Componentes de "cep do abrigo"
        jlCEP = new JLabel("CEP");
        jlCEP.setBounds(530, 80, 75, 25);
        jPanel2.add(jlCEP);
        
        jtfCEP = new JTextField();
        jtfCEP.setBounds(530, 100, 75, 25);
        jPanel2.add(jtfCEP);
        
        //Componentes de "endereço do abrigo"
        jlEndereco = new JLabel("Endereço");
        jlEndereco.setBounds(10, 140, 100, 25);
        jPanel2.add(jlEndereco);
        
        jtfEndereco = new JTextField();
        jtfEndereco.setBounds(10, 160, 595, 25);
        jPanel2.add(jtfEndereco);
        
    }
    
    AbrigoControle controle = new AbrigoControle();

    @Override
    public void salvar() {
        controle.salvarControle(jtfId.getText(), jtfNome.getText(), jtfDonoDoAbrigo.getText(), jcbEstado.getSelectedItem(), jcbCidade.getSelectedItem(), jtfEndereco.getText(), jtfCEP.getText());
    }
    
    @Override
    public void habilitaCampos(boolean estado) {
        jtfNome.setEnabled(estado);
        jtfDonoDoAbrigo.setEnabled(estado);
        jcbEstado.setEnabled(estado);
        jcbCidade.setEnabled(estado);
        jtfCEP.setEnabled(estado);
        jtfEndereco.setEnabled(estado);
    }
    //preenche JComboBox Estado
    public void preencheEstado(){
        teste.abreConexao();
        teste.executaSQL("select nome from estados");
        try{
            teste.rs.first();
            do{
                jcbEstado.addItem(teste.rs.getString("nome"));
            }
            while(teste.rs.next());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao preencher Estados."+e);
        }
    }
    //preenche JComboBox Cidade
    public void preencheCidade(){
        teste.abreConexao();
        teste.executaSQL("select nome from cidades order by nome");
        try{
            teste.rs.first();
            do{
                jcbCidade.addItem(teste.rs.getString("nome"));
            }
            while(teste.rs.next());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao preencher Cidades."+e);
        }
    }
        
    @Override
    public void limpaCampo() {
        jtfNome.setText("");
        jcbEstado.setSelectedIndex(0);
        jcbCidade.setSelectedIndex(0);
        jtfDonoDoAbrigo.setText("");
        jtfCEP.setText("");
        jtfEndereco.setText("");
    }
}
