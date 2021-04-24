package views;

import dao.ConnectDB;
import javax.swing.JFrame;
import java.awt.Image;
import java.awt.Graphics;
import javax.swing.ImageIcon;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/img/backgroundnovoAGORAVAI.png"));
        Image image = icon.getImage();
        jDesktopPane1 = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }

        };
        jLabel2 = new javax.swing.JLabel();
        jmbBarraMenu = new javax.swing.JMenuBar();
        jmArquivo = new javax.swing.JMenu();
        jmListar = new javax.swing.JMenu();
        jmiListarAdotante = new javax.swing.JMenuItem();
        jmListarSeparador1 = new javax.swing.JPopupMenu.Separator();
        jmiListarAbrigo = new javax.swing.JMenuItem();
        jmListarSeparador2 = new javax.swing.JPopupMenu.Separator();
        jmiListarAnimais = new javax.swing.JMenuItem();
        jmListarSeparador3 = new javax.swing.JPopupMenu.Separator();
        jmiListarAnimaisAdotados = new javax.swing.JMenuItem();
        jmSeparador = new javax.swing.JPopupMenu.Separator();
        jmCadastro = new javax.swing.JMenu();
        jmiCadastroAbrigo = new javax.swing.JMenuItem();
        jmCadastroSeparador1 = new javax.swing.JPopupMenu.Separator();
        jmiCadastroAdotante = new javax.swing.JMenuItem();
        jmCadastroSeparador2 = new javax.swing.JPopupMenu.Separator();
        jmiCadastroAnimal = new javax.swing.JMenuItem();
        jmSobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("A-DOTA - Sistema de Adoção de Animais");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/NovoLogoADOTA.png"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(2000, 2000));
        jLabel2.setMinimumSize(new java.awt.Dimension(2000, 2000));
        jLabel2.setName(""); // NOI18N

        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(607, 607, 607)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(955, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(857, Short.MAX_VALUE))
        );

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2410, 1160));

        jmArquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/folder.png"))); // NOI18N
        jmArquivo.setMnemonic('A');
        jmArquivo.setText("Arquivo");

        jmListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/listarJm.png"))); // NOI18N
        jmListar.setText("Listar");

        jmiListarAdotante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/listarAdotantes.png"))); // NOI18N
        jmiListarAdotante.setText("Adotantes");
        jmiListarAdotante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiListarAdotanteActionPerformed(evt);
            }
        });
        jmListar.add(jmiListarAdotante);
        jmListar.add(jmListarSeparador1);

        jmiListarAbrigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/listar.png"))); // NOI18N
        jmiListarAbrigo.setText("Abrigos");
        jmListar.add(jmiListarAbrigo);
        jmListar.add(jmListarSeparador2);

        jmiListarAnimais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/listar.png"))); // NOI18N
        jmiListarAnimais.setText("Animais");
        jmiListarAnimais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiListarAnimaisActionPerformed(evt);
            }
        });
        jmListar.add(jmiListarAnimais);
        jmListar.add(jmListarSeparador3);

        jmiListarAnimaisAdotados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/listarAnimaisAdotados.png"))); // NOI18N
        jmiListarAnimaisAdotados.setText("Animais Adotados");
        jmListar.add(jmiListarAnimaisAdotados);

        jmArquivo.add(jmListar);
        jmArquivo.add(jmSeparador);

        jmCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cadastroJm.png"))); // NOI18N
        jmCadastro.setText("Cadastros");

        jmiCadastroAbrigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cadastroAbrigo.png"))); // NOI18N
        jmiCadastroAbrigo.setText("Abrigo");
        jmiCadastroAbrigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadastroAbrigoActionPerformed(evt);
            }
        });
        jmCadastro.add(jmiCadastroAbrigo);
        jmCadastro.add(jmCadastroSeparador1);

        jmiCadastroAdotante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cadastroAdotante2.png"))); // NOI18N
        jmiCadastroAdotante.setText("Adotante");
        jmiCadastroAdotante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadastroAdotanteActionPerformed(evt);
            }
        });
        jmCadastro.add(jmiCadastroAdotante);
        jmCadastro.add(jmCadastroSeparador2);

        jmiCadastroAnimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cadastroAnimais.png"))); // NOI18N
        jmiCadastroAnimal.setText("Animal");
        jmiCadastroAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadastroAnimalActionPerformed(evt);
            }
        });
        jmCadastro.add(jmiCadastroAnimal);

        jmArquivo.add(jmCadastro);

        jmbBarraMenu.add(jmArquivo);

        jmSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/info.png"))); // NOI18N
        jmSobre.setMnemonic('S');
        jmSobre.setText("Sobre");
        jmbBarraMenu.add(jmSobre);

        setJMenuBar(jmbBarraMenu);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmiCadastroAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadastroAnimalActionPerformed
        CadastroAnimal tela = new CadastroAnimal(); 
        jDesktopPane1.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_jmiCadastroAnimalActionPerformed

    private void jmiListarAnimaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiListarAnimaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmiListarAnimaisActionPerformed

    private void jmiListarAdotanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiListarAdotanteActionPerformed

    }//GEN-LAST:event_jmiListarAdotanteActionPerformed

    private void jmiCadastroAbrigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadastroAbrigoActionPerformed
        CadastroAbrigo tela = new CadastroAbrigo(); 
        jDesktopPane1.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_jmiCadastroAbrigoActionPerformed

    private void jmiCadastroAdotanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadastroAdotanteActionPerformed
        CadastroAdotante tela = new CadastroAdotante(); 
        jDesktopPane1.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_jmiCadastroAdotanteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jmArquivo;
    private javax.swing.JMenu jmCadastro;
    private javax.swing.JPopupMenu.Separator jmCadastroSeparador1;
    private javax.swing.JPopupMenu.Separator jmCadastroSeparador2;
    private javax.swing.JMenu jmListar;
    private javax.swing.JPopupMenu.Separator jmListarSeparador1;
    private javax.swing.JPopupMenu.Separator jmListarSeparador2;
    private javax.swing.JPopupMenu.Separator jmListarSeparador3;
    private javax.swing.JPopupMenu.Separator jmSeparador;
    private javax.swing.JMenu jmSobre;
    private javax.swing.JMenuBar jmbBarraMenu;
    private javax.swing.JMenuItem jmiCadastroAbrigo;
    private javax.swing.JMenuItem jmiCadastroAdotante;
    private javax.swing.JMenuItem jmiCadastroAnimal;
    private javax.swing.JMenuItem jmiListarAbrigo;
    private javax.swing.JMenuItem jmiListarAdotante;
    private javax.swing.JMenuItem jmiListarAnimais;
    private javax.swing.JMenuItem jmiListarAnimaisAdotados;
    // End of variables declaration//GEN-END:variables
}
