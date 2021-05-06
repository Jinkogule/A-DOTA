package views;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import util.Tabela;

abstract class FormListagem extends javax.swing.JInternalFrame {

    //Atributos para criação da tabela
    Tabela tabelaconsulta = new Tabela();
    JTable tabela;
    DefaultTableModel modelo = new DefaultTableModel();
    
    public FormListagem() {
        initComponents();
        criarTabela();      
        centralizaForm();
    }
    
    //Centraliza o formulário
    public void centralizaForm(){
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
    }
    
    //Métodos abstratos
    abstract public void criarTabela();

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnConsultaL = new javax.swing.JPanel();
        jButtonFechar = new javax.swing.JButton();
        jLabelLogo = new javax.swing.JLabel();

        jpnConsultaL.setBackground(new java.awt.Color(0, 177, 177));
        jpnConsultaL.setForeground(new java.awt.Color(0, 102, 0));

        jButtonFechar.setBackground(new java.awt.Color(0, 125, 125));
        jButtonFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/close.png"))); // NOI18N
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
            }
        });

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/a-dotanew.png"))); // NOI18N

        javax.swing.GroupLayout jpnConsultaLLayout = new javax.swing.GroupLayout(jpnConsultaL);
        jpnConsultaL.setLayout(jpnConsultaLLayout);
        jpnConsultaLLayout.setHorizontalGroup(
            jpnConsultaLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnConsultaLLayout.createSequentialGroup()
                .addContainerGap(193, Short.MAX_VALUE)
                .addComponent(jLabelLogo)
                .addGap(128, 128, 128)
                .addComponent(jButtonFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpnConsultaLLayout.setVerticalGroup(
            jpnConsultaLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnConsultaLLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonFechar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpnConsultaLLayout.createSequentialGroup()
                .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 390, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnConsultaL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnConsultaL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonFecharActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFechar;
    public javax.swing.JLabel jLabelLogo;
    public javax.swing.JPanel jpnConsultaL;
    // End of variables declaration//GEN-END:variables
}
