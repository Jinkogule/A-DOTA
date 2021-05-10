package views;

import controle.AbrigoControle;
import dao.ConnectDB;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CadastroAbrigo extends FormPadrao{
    ConnectDB conexao = new ConnectDB();
    
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
    
    public CadastroAbrigo() throws IOException, ValorInvalidoException{
        setTitle("Cadastro de Abrigo");
        preencheEstado("src/arquivos/estados.txt");
        preencheCidade("src/arquivos/cidades.txt");
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
        
        //Componentes de "cidade do abrigo"
        jlCidade = new JLabel("Cidade");
        jlCidade.setBounds(375, 80, 50, 25);
        jPanel2.add(jlCidade);
        
        jcbCidade = new JComboBox();
        jcbCidade.setBounds(375, 100, 150, 25);
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
        controle.salvarControle(
                jtfId.getText(),
                jtfNome.getText(),
                jtfDonoDoAbrigo.getText(),
                jcbEstado.getSelectedItem(),
                jcbCidade.getSelectedItem(),
                jtfEndereco.getText(),
                jtfCEP.getText());
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
        jcbEstado.setSelectedIndex(0);
        jcbCidade.setSelectedIndex(0);
        jtfDonoDoAbrigo.setText("");
        jtfCEP.setText("");
        jtfEndereco.setText("");
    }
    
    //preenche o JComboBoxEstado com as informações armazenadas em um ARQUIVO
    //não aceita valores numéricos encontrados na busca pelos dados do arquivo
    public void preencheEstado(String path) throws IOException, ValorInvalidoException {
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = "";
        
        try{
            while (true) {
                if (linha != null) {
                    if (linha.contains("[0-9]+")){
                        throw new ValorInvalidoException("Valor numérico é inválido.");
                    }
                    jcbEstado.addItem(linha);
                } else
                    break;
                linha = buffRead.readLine();
            }
            buffRead.close();
        }
        catch (ValorInvalidoException e){
            JOptionPane.showMessageDialog(null, e.getMessage()+"\n");
        }
    }
    
    //preenche o JComboBoxCidade com as informações armazenadas em um ARQUIVO
    //não aceita valores numéricos encontrados na busca pelos dados do arquivo
    public void preencheCidade(String path) throws IOException, ValorInvalidoException {
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = "";
        
        try{
            while (true) {
                if (linha != null) {
                    if (linha.contains("[0-9]+")){
                        throw new ValorInvalidoException("Valor numérico é inválido.");
                    }
                    jcbCidade.addItem(linha);
                } else
                    break;
                linha = buffRead.readLine();
            }
            buffRead.close();
        }
        catch (ValorInvalidoException e){
            JOptionPane.showMessageDialog(null, e.getMessage()+"\n");
        }
    }
    
    @Override
    public void remover(){}

    @Override
    public void buscar(){}
}
