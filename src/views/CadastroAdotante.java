package views;

import controle.AdotanteControle;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CadastroAdotante extends FormPadrao{

    JLabel jlIdadeAdotante;
    JTextField jtfIdadeAdotante;

    JLabel jlEnderecoAdotante;
    JTextField jtfEnderecoAdotante;

    JLabel jlTelefoneAdotante;
    JTextField jtfTelefoneAdotante;

    JLabel jlCEP;
    JTextField jtfCEP;
    
    public CadastroAdotante(){
        setTitle("Cadastro de Adotante");
    }

    @Override
    public void iniciarComponentes() {
 
        //Componentes de "Idade da pessoa adotante"
        jlIdadeAdotante = new JLabel("Idade");
        jlIdadeAdotante.setBounds(215, 140, 50, 25);
        jPanel2.add(jlIdadeAdotante);
        
        jtfIdadeAdotante = new JTextField();
        jtfIdadeAdotante.setBounds(215, 160, 50, 25);
        jPanel2.add(jtfIdadeAdotante);

        //Componentes de "Endereco da pessoa adotante"
        jlEnderecoAdotante = new JLabel("Endereço");
        jlEnderecoAdotante.setBounds(10, 80, 255, 25);
        jPanel2.add(jlEnderecoAdotante);

        jtfEnderecoAdotante = new JTextField();
        jtfEnderecoAdotante.setBounds(10, 100, 255, 25);
        jPanel2.add(jtfEnderecoAdotante);

        //Componentes de "Telefone da pessoa adotante"
        jlTelefoneAdotante = new JLabel("Telefone");
        jlTelefoneAdotante.setBounds(10, 140, 110, 25);
        jPanel2.add(jlTelefoneAdotante);

        jtfTelefoneAdotante = new JTextField();
        jtfTelefoneAdotante.setBounds(10, 160, 110, 25);
        jPanel2.add(jtfTelefoneAdotante);

        //Componentes de "CEP da pessoa adotante"
        jlCEP = new JLabel("CEP");
        jlCEP.setBounds(130, 140, 75, 25);
        jPanel2.add(jlCEP);

        jtfCEP = new JTextField();
        jtfCEP.setBounds(130, 160, 75, 25);
        jPanel2.add(jtfCEP);

    }

    AdotanteControle controle = new AdotanteControle();

    @Override
    public void salvar() {
        controle.salvarControle(
                jtfId.getText(),
                jtfNome.getText(),
                jtfIdadeAdotante.getText(),
                jtfEnderecoAdotante.getText(),
                jtfTelefoneAdotante.getText(),
                jtfCEP.getText());
    }

    @Override
    public void habilitaCampos(boolean estado) {
        jtfNome.setEnabled(estado);
        jtfTelefoneAdotante.setEnabled(estado);
        jtfCEP.setEnabled(estado);
        jtfEnderecoAdotante.setEnabled(estado);
        jtfIdadeAdotante.setEnabled(estado);
    }

    @Override
    public void limpaCampo() {
        jtfNome.setText("");
        jtfTelefoneAdotante.setText("");
        jtfCEP.setText("");
        jtfEnderecoAdotante.setText("");
        jtfIdadeAdotante.setText("");
    }
}