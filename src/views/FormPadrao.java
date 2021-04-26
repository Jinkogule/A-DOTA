package views;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JTextField;

abstract public class FormPadrao extends javax.swing.JInternalFrame {
    
    JLabel jlConsulta;
    JTextField jtfConsulta;
    
    public FormPadrao() {
        initComponents();
        iniciarComponentes();
        
        jbSalvar.setEnabled(false);
        jbLimpar.setEnabled(false);
        jtfId.setEnabled(false);
        habilitaCampos(false);
        
        // JTextField para Consulta
        jtfConsulta = new JTextField();
        jtfConsulta.setBounds(10, 5, 595, 25);
        jpnConsulta.add(jtfConsulta);
        
        //Centraliza o formulário
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbNovo = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();
        jbFechar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfId = new javax.swing.JTextField();
        jtfNome = new javax.swing.JTextField();
        jpnConsulta = new javax.swing.JPanel();

        jbNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/adicionar.png"))); // NOI18N
        jbNovo.setText("Novo");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });

        jbAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png"))); // NOI18N
        jbAlterar.setText("Alterar");
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        jbExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lixeira.png"))); // NOI18N
        jbExcluir.setText("Excluir");

        jbSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/vassoura.png"))); // NOI18N
        jbLimpar.setText("Limpar");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });

        jbFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete.png"))); // NOI18N
        jbFechar.setText("Fechar");
        jbFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbExcluir)
                .addGap(38, 38, 38)
                .addComponent(jbSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbLimpar)
                .addGap(18, 18, 18)
                .addComponent(jbFechar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbAlterar)
                    .addComponent(jbExcluir)
                    .addComponent(jbSalvar)
                    .addComponent(jbLimpar)
                    .addComponent(jbFechar))
                .addGap(19, 19, 19))
        );

        jLabel1.setText("ID");

        jLabel2.setText("Nome");

        jtfId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfIdActionPerformed(evt);
            }
        });

        jtfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(192, Short.MAX_VALUE))
        );

        jpnConsulta.setBackground(new java.awt.Color(0, 140, 212));

        javax.swing.GroupLayout jpnConsultaLayout = new javax.swing.GroupLayout(jpnConsulta);
        jpnConsulta.setLayout(jpnConsultaLayout);
        jpnConsultaLayout.setHorizontalGroup(
            jpnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpnConsultaLayout.setVerticalGroup(
            jpnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 173, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jpnConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFecharActionPerformed
        dispose();
    }//GEN-LAST:event_jbFecharActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        habilitaBotoes(true);
        habilitaCampos(false);
    }//GEN-LAST:event_jbLimparActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        habilitaBotoes(true);
        habilitaCampos(false);
        salvar();
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        habilitaBotoes(false);
        habilitaCampos(true);
        jtfNome.requestFocus();
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        habilitaBotoes(false);
        habilitaCampos(true);
        limpaCampo();
        jtfNome.requestFocus();
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jtfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNomeActionPerformed

    private void jtfIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfIdActionPerformed
    
    //Métodos abstratos
    abstract public void iniciarComponentes();
    abstract public void salvar();
    
    //Metodo para habilitar e desabilitar botões do formulário
    public void habilitaBotoes(boolean estado){
        jbNovo.setEnabled(estado);
        jbAlterar.setEnabled(estado);
        jbExcluir.setEnabled(estado);
        jbSalvar.setEnabled(!estado);
        jbLimpar.setEnabled(!estado);
    }
    
    //Método que padroniza as strings enviadas pelo usuário
    public static String padronizaString(String string){
        if (string.isBlank()){
            return string;
        }
        else{
            String padronizada = string.toLowerCase().replaceAll("\s+"," ");;
            char[] array = padronizada.toCharArray();
            array[0] = Character.toUpperCase(array[0]);
            for (int i = 1; i < array.length; i++) {
                if (Character.isWhitespace(array[i - 1])) {
                    array[i] = Character.toUpperCase(array[i]);
                }
            }
        return new String(array);
        }
    }

    //Metodo para habilitar e desabilitar acesso aos campos de edição
    abstract public void habilitaCampos(boolean estado);
    
    //Metodo para limpar os campos do formulário
    abstract public void limpaCampo();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbFechar;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JPanel jpnConsulta;
    public javax.swing.JTextField jtfId;
    public javax.swing.JTextField jtfNome;
    // End of variables declaration//GEN-END:variables
}
