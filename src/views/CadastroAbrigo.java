/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controle.AbrigoControle;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author lucas
 */
public class CadastroAbrigo extends FormPadrao{
    
    JLabel jlNomeAbrigo;
    JTextField jtfNomeAbrigo;
    
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
        jlEstado.setBounds(300, 80, 50, 25);
        jPanel2.add(jlEstado);
        
        jcbEstado = new JComboBox();
        jcbEstado.setBounds(300, 100, 100, 25);
        jPanel2.add(jcbEstado);
        
        //Componentes de "cidade do abrigo"
        jlCidade = new JLabel("Cidade");
        jlCidade.setBounds(415, 80, 50, 25);
        jPanel2.add(jlCidade);
        
        jcbCidade = new JComboBox();
        jcbCidade.setBounds(415, 100, 100, 25);
        jPanel2.add(jcbCidade);
        
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
        controle.salvarControle(jtfId.getText(), jtfNome.getText(), jtfDonoDoAbrigo.getText(), jtfEndereco.getText(), jtfCEP.getText());
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

    @Override
    public void limpaCampo() {
        jtfNome.setText("");
        jtfNome.setText("");
        jtfDonoDoAbrigo.setText("");
        jtfCEP.setText("");
        jtfEndereco.setText("");
    }
}