package views;

import controle.AnimaisControle;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CadastroAnimal extends FormPadrao{
    
    JLabel jlTipo;
    JComboBox jcbTipo;
    
    JLabel jlRaca;
    JTextField jtfRaca;
    
    JLabel jlIdade;
    JTextField jtfIdade;
    
    JLabel jlPorte;
    JComboBox jcbPorte;
    
    JLabel jlCor;
    JTextField jtfCor;
    
    public CadastroAnimal(){
        setTitle("Cadastro de Animal");
    }

    @Override
    public void iniciarComponentes() {
        //Componentes de "Tipo do animal"
        jlTipo = new JLabel("Tipo");
        jlTipo.setBounds(300, 140, 75, 25);
        jPanel2.add(jlTipo);
        
        jcbTipo = new JComboBox();
        jcbTipo.setBounds(300, 160, 150, 25);
        jPanel2.add(jcbTipo);
        jcbTipo.addItem("");
        jcbTipo.addItem("Gato");
        jcbTipo.addItem("Cachorro");
        
        //Componentes de "Raça do animal"
        jlRaca = new JLabel("Raça");
        jlRaca.setBounds(10, 80, 260, 25);
        jPanel2.add(jlRaca);
        
        jtfRaca = new JTextField();
        jtfRaca.setBounds(10, 100, 260, 25);
        jPanel2.add(jtfRaca);
        
        //Componentes de "Idade do animal"
        jlIdade = new JLabel("Idade");
        jlIdade.setBounds(220, 140, 50, 25);
        jPanel2.add(jlIdade);
        
        jtfIdade = new JTextField();
        jtfIdade.setBounds(220, 160, 50, 25);
        jPanel2.add(jtfIdade);
        
        //Componentes de "Porte do Animal"
        jlPorte = new JLabel("Porte");
        jlPorte.setBounds(300, 80, 75, 25);
        jPanel2.add(jlPorte);
        
        jcbPorte = new JComboBox();
        jcbPorte.setBounds(300, 100, 150, 25);
        jPanel2.add(jcbPorte);
        jcbPorte.addItem("");
        jcbPorte.addItem("Pequeno");
        jcbPorte.addItem("Médio");
        jcbPorte.addItem("Grande");
        
        //Componentes de "Cor do animal"
        jlCor = new JLabel("Cor");
        jlCor.setBounds(10, 140, 200, 25);
        jPanel2.add(jlCor);
        
        jtfCor = new JTextField();
        jtfCor.setBounds(10, 160, 200, 25);
        jPanel2.add(jtfCor);
        
    }
    
    AnimaisControle controle = new AnimaisControle();

    @Override
    public void salvar() {
        controle.salvarControle(jtfId.getText(), jtfNome.getText(), jcbTipo.getSelectedItem(), jtfRaca.getText(), jtfIdade.getText(), jcbPorte.getSelectedItem(), jtfCor.getText());
    }

    @Override
    public void habilitaCampos(boolean estado) {
        jtfNome.setEnabled(estado);
        jcbTipo.setEnabled(estado);
        jtfRaca.setEnabled(estado);
        jtfIdade.setEnabled(estado);
        jcbPorte.setEnabled(estado);
        jtfCor.setEnabled(estado);
    }

    @Override
    public void limpaCampo() {
        jtfNome.setText("");
        jcbTipo.setSelectedIndex(0);
        jtfRaca.setText("");
        jtfIdade.setText("");
        jcbPorte.setSelectedIndex(0);
        jtfCor.setText("");
    }
}
