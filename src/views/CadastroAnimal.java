package views;

import controle.AnimaisControle;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
        
public class CadastroAnimal extends FormPadrao{
    
    JLabel jlRaca;
    JTextField jtfRaca;
    
    JLabel jlIdade;
    JTextField jtfIdade;
    
    JLabel jlPorte;
    JComboBox jcbPorte;
    
    public CadastroAnimal(){
        setTitle("Cadastro de Animal");
    }
    
    @Override
    public void iniciarComponentes() {
        //Componentes de "Raça do Animal"
        jlRaca = new JLabel("Raça do Animal");
        jlRaca.setBounds(10, 80, 200, 25);
        jPanel2.add(jlRaca);
        
        jtfRaca = new JTextField();
        jtfRaca.setBounds(10, 100, 200, 25);
        jPanel2.add(jtfRaca);
        
        //Componentes de "Idade do Animal"
        jlIdade = new JLabel("Idade do Animal");
        jlIdade.setBounds(300, 80, 50, 25);
        jPanel2.add(jlIdade);
        
        jtfIdade = new JTextField();
        jtfIdade.setBounds(300, 100, 100, 25);
        jPanel2.add(jtfIdade);
        
        //Componentes de "Porte do Animal"
        jlPorte = new JLabel("Porte do Animal");
        jlPorte.setBounds(530, 80, 75, 25);
        jPanel2.add(jlPorte);
        
        jcbPorte = new JComboBox();
        jcbPorte.setBounds(530, 100, 75, 25);
        jPanel2.add(jcbPorte);
        
    }
    
    AnimaisControle controle = new AnimaisControle();

    @Override
    public void salvar() {
        controle.salvarControle(jtfId.getText(), jtfNome.getText(), jtfRaca.getText(), jtfIdade.getText());
    }

    @Override
    public void habilitaCampos(boolean estado) {
        jtfNome.setEnabled(estado);
        jtfRaca.setEnabled(estado);
        jcbPorte.setEnabled(estado);
        jtfIdade.setEnabled(estado);
    }

    @Override
    public void limpaCampo() {
        jtfNome.setText("");
        jtfRaca.setText("");
        jtfIdade.setText("");
    }
}
