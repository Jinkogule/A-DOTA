package views;

import controle.AdotanteControle;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Gabriel
 */
public class CadastroAdotante extends FormPadrao{

    JLabel jlNomeAdotante;
    JTextField jtfNomeAdotante;

    JLabel jlIdadeAdotante;
    JTextField jtfIdadeAdotante;

    JLabel jlEnderecoAdotante;
    JComboBox jcbEnderecoAdotante;

    JLabel jlTelefoneAdotante;
    JTextField jtfTelefoneAdotante;

    JLabel jlCEP;
    JTextField jtfCEP;

    public CadastroAdotante(){
        setTitle("Cadastro de adotante");
    }

    @Override
    public void iniciarComponentes() {
        //Componentes de "Adotante"
        jlNomeAdotante = new JLabel("Nome do adotante");
        jlNomeAdotante.setBounds(10, 80, 200, 25);
        jPanel2.add(jlNomeAdotante);

        jtfNomeAdotante = new JTextField();
        jtfNomeAdotante.setBounds(10, 100, 200, 25);
        jPanel2.add(jtfNomeAdotante);

        //Componentes de "Idade da pessoa adotante"
        jlIdadeAdotante = new JLabel("Idade da pessoa Adotante");
        jlIdadeAdotante.setBounds(300, 80, 50, 25);
        jPanel2.add(jlIdadeAdotante);

        jcbIdadeAdotante = new JComboBox();
        jcbIdadeAdotante.setBounds(300, 100, 100, 25);
        jPanel2.add(jcbIdadeAdotante);

        //Componentes de "Endereco da pessoa adotante"
        jlEnderecoAdotante = new JLabel("Cidade");
        jlEnderecoAdotante.setBounds(415, 80, 50, 25);
        jPanel2.add(jlEnderecoAdotante);

        jcbEnderecoAdotante = new JComboBox();
        jcbEnderecoAdotante.setBounds(415, 100, 100, 25);
        jPanel2.add(jcbEnderecoAdotante);

        //Componentes de "Telefone da pessoa adotante"
        jlTelefoneAdotante = new JLabel("Endereço");
        jlTelefoneAdotante.setBounds(10, 140, 100, 25);
        jPanel2.add(jlTelefoneAdotante);

        jtfTelefoneAdotante = new JTextField();
        jtfTelefoneAdotante.setBounds(10, 160, 595, 25);
        jPanel2.add(jtfTelefoneAdotante);

        //Componentes de "CEP da pessoa adotante"
        jlCEP = new JLabel("CEP");
        jlCEP.setBounds(530, 80, 75, 25);
        jPanel2.add(jlCEP);

        jtfCEP = new JTextField();
        jtfCEP.setBounds(530, 100, 75, 25);
        jPanel2.add(jtfCEP);

    }

    AdotanteControle controle = new AdotanteControle();

    @Override
    public void salvar() {
        controle.salvarControle(jtfId.getText(), jtfNomeAdotante.getText(), jcbIdadeAdotante.getText(), jcbEnderecoAdotante.getText(), jtfTelefoneAdotante.getText(), jtfCEP.getText());
    }

    @Override
    public void habilitaCampos(boolean estado) {
        jtfNomeAdotante.setEnabled(estado);
        jcbIdadeAdotante.setEnabled(estado);
        jcbEnderecoAdotante.setEnabled(estado);
        jtfTelefoneAdotante.setEnabled(estado);
        jtfCEP.setEnabled(estado);
    }

    @Override
    public void limpaCampo() {
        jtfNomeAdotante.setText("");
        jcbIdadeAdotante.setText("");
        jcbEnderecoAdotante.setText("");
        jtfTelefoneAdotante.setText("");
        jtfCEP.setText("");

    }
}