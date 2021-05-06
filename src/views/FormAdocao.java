package views;

import controle.AdotadosControle;
import dao.ConnectDB;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import util.Tabela;

public class FormAdocao extends javax.swing.JInternalFrame {
    ConnectDB conexao = new ConnectDB();
    
    Tabela tabelaconsulta = new Tabela();
    
    JTextField jtfId = new JTextField();
    
    JLabel jlAdotante;
    JComboBox jcbAdotante;
    
    JLabel jlAnimal;
    JComboBox jcbAnimal;
    
    public FormAdocao() {
        initComponents();
        iniciarComponentes();
        centralizaForm();
        preencheAdotante();
        preencheAnimal();
    }
    
    //Centraliza o formulário
    public void centralizaForm(){
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
    }
    
    public void iniciarComponentes() {
        //Componentes de "Adotantes"
        jlAdotante = new JLabel("Adotante");
        jlAdotante.setBounds(50, 40, 75, 25);
        jlAdotante.setFont(jlAdotante.getFont().deriveFont(Font.BOLD, 14f));
        jpnAdocao.add(jlAdotante);
        
        jcbAdotante = new JComboBox();
        jcbAdotante.setBounds(10, 60, 150, 25);
        jpnAdocao.add(jcbAdotante);
        jcbAdotante.addItem("");
        
        //Componentes de "Animais"
        jlAnimal = new JLabel("Animal");
        jlAnimal.setBounds(330, 40, 75, 25);
        jlAnimal.setFont(jlAnimal.getFont().deriveFont(Font.BOLD, 14f));
        jpnAdocao.add(jlAnimal);
        
        jcbAnimal = new JComboBox();
        jcbAnimal.setBounds(290, 60, 150, 25);
        jpnAdocao.add(jcbAnimal);
        jcbAnimal.addItem("");
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnAdocao = new javax.swing.JPanel();
        JButtonAdota = new javax.swing.JButton();
        jButtonFechar = new javax.swing.JButton();

        jpnAdocao.setBackground(new java.awt.Color(0, 177, 177));

        JButtonAdota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/clickA-.png"))); // NOI18N
        JButtonAdota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonAdotaActionPerformed(evt);
            }
        });

        jButtonFechar.setBackground(new java.awt.Color(0, 125, 125));
        jButtonFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/close.png"))); // NOI18N
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnAdocaoLayout = new javax.swing.GroupLayout(jpnAdocao);
        jpnAdocao.setLayout(jpnAdocaoLayout);
        jpnAdocaoLayout.setHorizontalGroup(
            jpnAdocaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnAdocaoLayout.createSequentialGroup()
                .addContainerGap(414, Short.MAX_VALUE)
                .addComponent(jButtonFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jpnAdocaoLayout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(JButtonAdota)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnAdocaoLayout.setVerticalGroup(
            jpnAdocaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnAdocaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonFechar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JButtonAdota, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnAdocao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnAdocao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JButtonAdotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonAdotaActionPerformed
        salvar();
        preencheAnimal();
    }//GEN-LAST:event_JButtonAdotaActionPerformed

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonFecharActionPerformed

    AdotadosControle controle = new AdotadosControle();

   
    public void salvar() {
        controle.salvarControle(
                jtfId.getText(),
                jcbAdotante.getSelectedItem(),
                jcbAnimal.getSelectedItem());
    }
   
    //preenche JComboBoxAdotante com informações armazenadas no banco de dados
    public void preencheAdotante(){
        conexao.abreConexao();
        conexao.executaSQL("select Nome from adotante");
        try{
            conexao.rs.first();
            do{
                jcbAdotante.addItem(conexao.rs.getString("Nome"));
            }
            while(conexao.rs.next());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao preencher Adotantes."+e);
        }
    }
    
    //preenche JComboBoxAnimal com informações armazenadas no banco de dados
    public void preencheAnimal(){
        conexao.abreConexao();
        conexao.executaSQL("select Nome_Animal from animais");
        try{
            conexao.rs.first();
            jcbAnimal.removeAllItems();
            jcbAnimal.addItem("");
            do{
                jcbAnimal.addItem(conexao.rs.getString("Nome_Animal"));
            }
            while(conexao.rs.next());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao preencher Animais."+e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonAdota;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JPanel jpnAdocao;
    // End of variables declaration//GEN-END:variables
}
