
import javax.swing.JFrame;
import java.BufferedWriter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;


public class GUI_Login extends javax.swing.JFrame {

    
    public GUI_Login() {
        initComponents();
        setBounds(600, 300, 400, 250);
        setVisible(true);
       
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelusername = new javax.swing.JLabel();
        jTextFieldusername = new javax.swing.JTextField();
        jLabelpassword = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        jButtonLOGIN = new javax.swing.JButton();
        jButtonCANCEL = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(3, 2));

        jLabelusername.setText("username");
        getContentPane().add(jLabelusername);
        getContentPane().add(jTextFieldusername);

        jLabelpassword.setText("password");
        getContentPane().add(jLabelpassword);
        getContentPane().add(jPasswordField);

        jButtonLOGIN.setText("LOGIN");
        jButtonLOGIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLOGINActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLOGIN);

        jButtonCANCEL.setText("CANCEL");
        jButtonCANCEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCANCELActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCANCEL);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLOGINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLOGINActionPerformed
            String username = jTextFieldusername.getText();
            String password = new String (jPasswordField.getPassword());
            
            credits (username, password);
            
            JOptionPane.showMessageDialog(this, "Account Save Successfully",  "Save",JOptionPane.INFORMATION_MESSAGE );
    }//GEN-LAST:event_jButtonLOGINActionPerformed
    private void credits ( String username,String password ){
        try {
        File file = new File("C:\\Users\\User\\Documents\\userE.txt");

        BufferedWriter data = new BufferedWriter( new FileWriter( file, true));
        data.write(username + ", " + password);
        data.newLine();
        data.close();

            
        }catch (IOException e){
           JOptionPane.showMessageDialog(this, "Error Saving Account",  "Error",JOptionPane.ERROR_MESSAGE );

        }
    }
    
    private void jButtonCANCELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCANCELActionPerformed
       jTextFieldusername.setText("");
       jPasswordField.setText("");
       
    }//GEN-LAST:event_jButtonCANCELActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCANCEL;
    private javax.swing.JButton jButtonLOGIN;
    private javax.swing.JLabel jLabelpassword;
    private javax.swing.JLabel jLabelusername;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextFieldusername;
    // End of variables declaration//GEN-END:variables
}
