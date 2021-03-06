/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uniacademia.sca.telas;

import java.awt.Dimension;
import javax.swing.JOptionPane;

/**
 *
 * @author jhon4
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        //capturar tamanho do monitor para a tela se adaptar ;
        Dimension t = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(t);
        this.setExtendedState(this.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuControle = new javax.swing.JMenu();
        jMenuItemProfessor = new javax.swing.JMenuItem();
        jMenuItemAluno = new javax.swing.JMenuItem();
        jMenuItemDisiplina = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItemSair = new javax.swing.JMenuItem();
        jMenuSobre = new javax.swing.JMenu();
        jMenuItemSistema = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Controle Acadêmico - Tela Principal");

        jMenuControle.setIcon(new javax.swing.ImageIcon("C:\\Users\\jhon4\\OneDrive\\Área de Trabalho\\Interface com Usuário\\SCA\\src\\main\\java\\br\\edu\\uniacademia\\sca\\telas\\icone\\atualizar.png")); // NOI18N
        jMenuControle.setText("Menu");

        jMenuItemProfessor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemProfessor.setIcon(new javax.swing.ImageIcon("C:\\Users\\jhon4\\OneDrive\\Área de Trabalho\\Interface com Usuário\\SCA\\src\\main\\java\\br\\edu\\uniacademia\\sca\\telas\\icone\\pngwing.com.png")); // NOI18N
        jMenuItemProfessor.setText("Professor");
        jMenuItemProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProfessorActionPerformed(evt);
            }
        });
        jMenuControle.add(jMenuItemProfessor);

        jMenuItemAluno.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemAluno.setIcon(new javax.swing.ImageIcon("C:\\Users\\jhon4\\OneDrive\\Área de Trabalho\\Interface com Usuário\\SCA\\src\\main\\java\\br\\edu\\uniacademia\\sca\\telas\\icone\\icBuscarCliente.png")); // NOI18N
        jMenuItemAluno.setText("Aluno");
        jMenuItemAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAlunoActionPerformed(evt);
            }
        });
        jMenuControle.add(jMenuItemAluno);

        jMenuItemDisiplina.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemDisiplina.setIcon(new javax.swing.ImageIcon("C:\\Users\\jhon4\\OneDrive\\Área de Trabalho\\Interface com Usuário\\SCA\\src\\main\\java\\br\\edu\\uniacademia\\sca\\telas\\icone\\book.png")); // NOI18N
        jMenuItemDisiplina.setText("Disciplina");
        jMenuItemDisiplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDisiplinaActionPerformed(evt);
            }
        });
        jMenuControle.add(jMenuItemDisiplina);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon("C:\\Users\\jhon4\\OneDrive\\Área de Trabalho\\Interface com Usuário\\SCA\\src\\main\\java\\br\\edu\\uniacademia\\sca\\telas\\icone\\laptop.png")); // NOI18N
        jMenuItem1.setText("Controle");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuControle.add(jMenuItem1);
        jMenuControle.add(jSeparator1);

        jMenuItemSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemSair.setIcon(new javax.swing.ImageIcon("C:\\Users\\jhon4\\OneDrive\\Área de Trabalho\\Interface com Usuário\\SCA\\src\\main\\java\\br\\edu\\uniacademia\\sca\\telas\\icone\\stock_spam.png")); // NOI18N
        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuControle.add(jMenuItemSair);

        jMenuBar1.add(jMenuControle);

        jMenuSobre.setText("Sobre");
        jMenuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSobreActionPerformed(evt);
            }
        });

        jMenuItemSistema.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItemSistema.setIcon(new javax.swing.ImageIcon("C:\\Users\\jhon4\\OneDrive\\Área de Trabalho\\Interface com Usuário\\SCA\\src\\main\\java\\br\\edu\\uniacademia\\sca\\telas\\icone\\sorbe.png")); // NOI18N
        jMenuItemSistema.setText("Sistema");
        jMenuItemSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSistemaActionPerformed(evt);
            }
        });
        jMenuSobre.add(jMenuItemSistema);

        jMenuBar1.add(jMenuSobre);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 908, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed

        System.exit(0);

    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuItemProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProfessorActionPerformed
        //Quando clicar no menu professor , irá direcionar para tela professor;
        Professor prof = new Professor();
        prof.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItemProfessorActionPerformed

    private void jMenuItemAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAlunoActionPerformed
        //Quando clicar no menu aluno , irá direcionar para tela aluno;
        Aluno aluno = new Aluno();
        aluno.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jMenuItemAlunoActionPerformed

    private void jMenuItemDisiplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDisiplinaActionPerformed
        //Quando clicar no menu Disciplina , irá direcionar para tela Disciplina;
        Disciplina dis = new Disciplina();
        dis.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jMenuItemDisiplinaActionPerformed

    private void jMenuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSobreActionPerformed


    }//GEN-LAST:event_jMenuSobreActionPerformed

    private void jMenuItemSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSistemaActionPerformed
        //Informação sobre a criação do sistema;
        JOptionPane.showMessageDialog(null, "Sistema Criado por: Jhonathan Meireles \n Versão: 1.0", "Sobre o Sistema", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItemSistemaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
     //Quando clicar no menu Controle , irá direcionar para tela Controle;
        Controle cont = new Controle();
        cont.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuControle;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemAluno;
    private javax.swing.JMenuItem jMenuItemDisiplina;
    private javax.swing.JMenuItem jMenuItemProfessor;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemSistema;
    private javax.swing.JMenu jMenuSobre;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
