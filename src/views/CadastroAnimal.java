package views;

import controle.AnimaisControle;
import dao.ConnectDB;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CadastroAnimal extends FormPadrao{
    ConnectDB conexao = new ConnectDB();

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
    
    JLabel jlAbrigo;
    JComboBox jcbAbrigo; //static para poder ser referenciada na função estática "preencheAbrigo"
    
    public CadastroAnimal() throws IOException, ValorInvalidoException{
        setTitle("Cadastro de Animal");
        preencheAbrigo();
        preenchePorte("src/arquivos/porte.txt");
        preencheTipo("src/arquivos/tipo.txt");
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
       
        //Componentes de "Cor do animal"
        jlCor = new JLabel("Cor");
        jlCor.setBounds(10, 140, 200, 25);
        jPanel2.add(jlCor);
        
        jtfCor = new JTextField();
        jtfCor.setBounds(10, 160, 200, 25);
        jPanel2.add(jtfCor);
        
        //Componentes de "Abrigo do Animal"
        jlAbrigo = new JLabel("Abrigo");
        jlAbrigo.setBounds(475, 80, 75, 25);
        jPanel2.add(jlAbrigo);
        
        jcbAbrigo = new JComboBox();
        jcbAbrigo.setBounds(475, 100, 133, 25);
        jPanel2.add(jcbAbrigo);
        jcbAbrigo.addItem("");       
    }
    
    AnimaisControle controle = new AnimaisControle();

    @Override
    public void salvar() {
        controle.salvarControle(
                jtfId.getText(),
                jtfNome.getText(),
                jcbTipo.getSelectedItem(),
                jtfRaca.getText(),
                jtfIdade.getText(),
                jcbPorte.getSelectedItem(),
                jtfCor.getText(),
                jcbAbrigo.getSelectedItem());
    }

    @Override
    public void habilitaCampos(boolean estado) {
        jtfNome.setEnabled(estado);
        jcbTipo.setEnabled(estado);
        jtfRaca.setEnabled(estado);
        jtfIdade.setEnabled(estado);
        jcbPorte.setEnabled(estado);
        jtfCor.setEnabled(estado);
        jcbAbrigo.setEnabled(estado);
    }

    @Override
    public void limpaCampo() {
        jtfNome.setText("");
        jcbTipo.setSelectedIndex(0);
        jtfRaca.setText("");
        jtfIdade.setText("");
        jcbPorte.setSelectedIndex(0);
        jtfCor.setText("");
        jcbAbrigo.setSelectedIndex(0);
    }
    
    //preenche JComboBoxAbrigo com informações armazenadas no banco de dados
    public void preencheAbrigo(){ //static para ser chamada ao click do botão "salvar", no "FormPadrao"
        conexao.abreConexao();
        conexao.executaSQL("select Nome_Abrigo from abrigo order by Nome_Abrigo");
        try{
            conexao.rs.first();
            do{
                jcbAbrigo.addItem(conexao.rs.getString("Nome_Abrigo"));
            }
            while(conexao.rs.next());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao preencher Abrigos."+e);
        }
        conexao.desconecta();
    }
    
    //preenche o JComboBoxTipo com as informações armazenadas em um ARQUIVO
    //não aceita valores numéricos encontrados na busca pelos dados do arquivo
    public void preencheTipo(String path) throws IOException, ValorInvalidoException {
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = "";
        
        try{
            while (true) {
                if (linha != null) {
                    if (linha.contains("[0-9]+")){
                        throw new ValorInvalidoException("Valor numérico é inválido.");
                    }
                    jcbTipo.addItem(linha);
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
    
    //preenche o JComboBoxPorte com as informações armazenadas em um ARQUIVO
    //não aceita valores numéricos encontrados na busca pelos dados do arquivo
    public void preenchePorte(String path) throws IOException, ValorInvalidoException {
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = "";
        
        try{
            while (true) {
                if (linha != null) {
                    if (linha.contains("[0-9]+")){
                        throw new ValorInvalidoException("Valor numérico é inválido.");
                    }
                    jcbPorte.addItem(linha);
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
