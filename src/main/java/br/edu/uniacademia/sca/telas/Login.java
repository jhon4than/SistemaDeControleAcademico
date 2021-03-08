/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uniacademia.sca.telas;

import br.edu.uniacademia.sca.modelo.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author jhon4
 */
public class Login extends javax.swing.JFrame {
    

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
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

        jlMatricula = new javax.swing.JLabel();
        jlSenha = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        jbAcessar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jbSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login do Sistema");
        setResizable(false);
        getContentPane().setLayout(null);

        jlMatricula.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jlMatricula.setText("Digite sua Matricula:");
        getContentPane().add(jlMatricula);
        jlMatricula.setBounds(60, 20, 163, 22);

        jlSenha.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jlSenha.setText("Senha:");
        getContentPane().add(jlSenha);
        jlSenha.setBounds(60, 90, 57, 22);

        txtMatricula.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatriculaActionPerformed(evt);
            }
        });
        getContentPane().add(txtMatricula);
        txtMatricula.setBounds(50, 50, 206, 28);

        txtSenha.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(txtSenha);
        txtSenha.setBounds(50, 120, 206, 28);

        jbAcessar.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jbAcessar.setIcon(new javax.swing.ImageIcon("C:\\Users\\jhon4\\OneDrive\\Área de Trabalho\\Interface com Usuário\\SCA\\src\\main\\java\\br\\edu\\uniacademia\\sca\\telas\\icone\\stock_not-spam.png")); // NOI18N
        jbAcessar.setText("Acessar");
        jbAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAcessarActionPerformed(evt);
            }
        });
        getContentPane().add(jbAcessar);
        jbAcessar.setBounds(350, 30, 140, 33);

        jbCancelar.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jbCancelar.setIcon(new javax.swing.ImageIcon("C:\\Users\\jhon4\\OneDrive\\Área de Trabalho\\Interface com Usuário\\SCA\\src\\main\\java\\br\\edu\\uniacademia\\sca\\telas\\icone\\stock_refresh.png")); // NOI18N
        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jbCancelar);
        jbCancelar.setBounds(350, 80, 140, 33);

        jbSair.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jbSair.setIcon(new javax.swing.ImageIcon("C:\\Users\\jhon4\\OneDrive\\Área de Trabalho\\Interface com Usuário\\SCA\\src\\main\\java\\br\\edu\\uniacademia\\sca\\telas\\icone\\stock_spam.png")); // NOI18N
        jbSair.setText("Sair");
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });
        getContentPane().add(jbSair);
        jbSair.setBounds(350, 130, 140, 33);

        setBounds(0, 0, 551, 238);
    }// </editor-fold>//GEN-END:initComponents

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        //Fechando a aplicação sem erros;
        System.exit(0);
        
    }//GEN-LAST:event_jbSairActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
       //Limpando os campos de login;
        txtMatricula.setText("");
        txtSenha.setText("");
        txtMatricula.requestFocus();
        
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAcessarActionPerformed
        
        
        String Mat = txtMatricula.getText().toString();
        String Sen = txtSenha.getText().toString();
        
        Usuario usu = new Usuario();
        //Fazendo verificação e validanddo a classe;
        if(usu.validarMatricula(Mat)){
            if (usu.validarSenha(Sen)){
                if (usu.validarLogin(Mat, Sen)){
                    Principal principal = new Principal();
                    principal.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Login está incorreto!");    
                }
            } else {
                JOptionPane.showMessageDialog(null, "Senha não satisfaz as regras");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Matricula não satisfaz as regras");
        }
        
        
        
    }//GEN-LAST:event_jbAcessarActionPerformed

    private void txtMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatriculaActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbAcessar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbSair;
    private javax.swing.JLabel jlMatricula;
    private javax.swing.JLabel jlSenha;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
