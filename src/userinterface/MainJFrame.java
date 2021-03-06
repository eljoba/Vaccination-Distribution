/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import Business.EcoSystem;
import Business.DB4OUtil.DB4OUtil;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Person.Person;
import Business.Role.AdminRole;
import Business.Role.PatientRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Administrator
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    public MainJFrame() {
        initComponents();
        system = dB4OUtil.retrieveSystem();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JRegisterDialogForm = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        btnPatientRegister = new javax.swing.JButton();
        txtNameField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUserNameField = new javax.swing.JTextField();
        jPasswordField = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        loginJButton = new javax.swing.JButton();
        userNameJTextField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        loginJLabel = new javax.swing.JLabel();
        logoutJButton = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        container = new javax.swing.JPanel();

        JRegisterDialogForm.setBackground(new java.awt.Color(255, 255, 255));
        JRegisterDialogForm.setBounds(new java.awt.Rectangle(400, 250, 550, 450));
        JRegisterDialogForm.setPreferredSize(new java.awt.Dimension(500, 400));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel3.setText("Name:");

        btnPatientRegister.setBackground(new java.awt.Color(255, 255, 255));
        btnPatientRegister.setText("REGISTER");
        btnPatientRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientRegisterActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel4.setText("Username:");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel5.setText("Password");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 20)); // NOI18N
        jLabel6.setText("Patient Registration");

        javax.swing.GroupLayout JRegisterDialogFormLayout = new javax.swing.GroupLayout(JRegisterDialogForm.getContentPane());
        JRegisterDialogForm.getContentPane().setLayout(JRegisterDialogFormLayout);
        JRegisterDialogFormLayout.setHorizontalGroup(
            JRegisterDialogFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JRegisterDialogFormLayout.createSequentialGroup()
                .addGroup(JRegisterDialogFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JRegisterDialogFormLayout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addGroup(JRegisterDialogFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(63, 63, 63)
                        .addGroup(JRegisterDialogFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNameField)
                            .addComponent(txtUserNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                            .addComponent(jPasswordField)))
                    .addGroup(JRegisterDialogFormLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JRegisterDialogFormLayout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(btnPatientRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        JRegisterDialogFormLayout.setVerticalGroup(
            JRegisterDialogFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JRegisterDialogFormLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addGroup(JRegisterDialogFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(JRegisterDialogFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtUserNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(JRegisterDialogFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(btnPatientRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 102));

        loginJButton.setText("Login");
        loginJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel1.setText("User Name");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setText("Password");

        logoutJButton.setText("Logout");
        logoutJButton.setEnabled(false);
        logoutJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutJButtonActionPerformed(evt);
            }
        });

        btnRegister.setText("REGISTER NOW!");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(userNameJTextField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(logoutJButton, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                            .addGap(26, 26, 26)
                            .addComponent(loginJLabel)))
                    .addComponent(loginJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegister))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginJButton)
                .addGap(34, 34, 34)
                .addComponent(logoutJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginJLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        container.setBackground(new java.awt.Color(255, 255, 255));
        container.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(container);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginJButtonActionPerformed
        // Get user name
        String userName = userNameJTextField.getText();
        // Get Password

        char[] passwordCharArray = passwordField.getPassword();
        String password = String.valueOf(passwordCharArray);

        //Step1: Check in the system user account directory if you have the user
        UserAccount userAccount = system.getUserAccountDirectory().authenticateUser(userName, password);
        Enterprise inEnterprise = null;
        Organization inOrganization = null;
        if (userAccount == null) {
            //Step2: Go inside each network to check each enterprise
            for (Network network : system.getNetworkList()) {
                //Step 2-a: Check against each enterprise
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    userAccount = enterprise.getUserAccountDirectory().authenticateUser(userName, password);
                    if (userAccount == null) {
                        //Step3: Check against each organization inside that enterprise
                        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                            userAccount = organization.getUserAccountDirectory().authenticateUser(userName, password);
                            if (userAccount != null) {
                                inEnterprise = enterprise;
                                inOrganization = organization;
                                break;
                            }
                        }
                    } else {
                        inEnterprise = enterprise;
                        break;
                    }
                    if (inOrganization != null) {
                        break;
                    }
                }
                if (inEnterprise != null) {
                    break;
                }
            }
        }

        if (userAccount == null) {
            JOptionPane.showMessageDialog(null, "Invalid Credentials!");
            userNameJTextField.setText("");
            passwordField.setText("");
            return;
        } else {
            CardLayout layout = (CardLayout) container.getLayout();
            container.add(userAccount.getRole().toString() + "workArea", userAccount.getRole().createWorkArea(container, userAccount, inOrganization, inEnterprise, system));
            layout.next(container);
        }
        loginJButton.setEnabled(false);
        logoutJButton.setEnabled(true);
        userNameJTextField.setEnabled(false);
        passwordField.setEnabled(false);
        btnRegister.setEnabled(false);
        passwordField.setText("");
        
    }//GEN-LAST:event_loginJButtonActionPerformed

    private void logoutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutJButtonActionPerformed
        logoutJButton.setEnabled(false);
        userNameJTextField.setEnabled(true);
        passwordField.setEnabled(true);
        loginJButton.setEnabled(true);
        btnRegister.setEnabled(true);

        userNameJTextField.setText("");
        passwordField.setText("");

        container.removeAll();
        JPanel blankJP = new JPanel();
        container.add("blank", blankJP);
        CardLayout crdLyt = (CardLayout) container.getLayout();
        crdLyt.next(container);
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_logoutJButtonActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        JRegisterDialogForm.setVisible(true);


    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnPatientRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientRegisterActionPerformed
        // TODO add your handling code here:
        String name = txtNameField.getText();
        String userName = txtUserNameField.getText();
        char[] passwordCharArray = jPasswordField.getPassword();
        String password = String.valueOf(passwordCharArray);

        boolean error = false;
        String errorMessage = "";

        error = system.getUserAccountDirectory().checkIfUsernameExists(userName);
        if (error) {
            //error = true;
            errorMessage += "Username already exists. Please enter a new username \n";

        } else {

            if (!name.trim().matches("[a-zA-Z]+")) {
                error = true;
                errorMessage += "Admin name is not valid \n";
            }

            if (userName.trim().matches("[_+-.,!@#$%^&*();\\\\|<>\"'=?:/ ]+")) {
                error = true;
                errorMessage += "Username cannot contain special characters \n";
            }
            if (password.trim().equals("")) {
                error = true;
                errorMessage += "Password field cannot be blank\n";

            }
            if (password.contains(" ")) {
                error = true;
                errorMessage += "Password cannot contain spaces\n";
            }
        }

        if (!error) {
            Person p = system.getPersonDirectory().createPerson(name);

            UserAccount account = system.getUserAccountDirectory().createUserAccount(userName, password, p, new PatientRole());
            JOptionPane.showMessageDialog(null, "User has been registered successfully");
            txtNameField.setText("");
            txtUserNameField.setText("");
            jPasswordField.setText("");
            JRegisterDialogForm.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, errorMessage);
            txtNameField.setText("");
            txtUserNameField.setText("");
            jPasswordField.setText("");

        }


    }//GEN-LAST:event_btnPatientRegisterActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog JRegisterDialogForm;
    private javax.swing.JButton btnPatientRegister;
    private javax.swing.JButton btnRegister;
    private javax.swing.JPanel container;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton loginJButton;
    private javax.swing.JLabel loginJLabel;
    private javax.swing.JButton logoutJButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField txtNameField;
    private javax.swing.JTextField txtUserNameField;
    private javax.swing.JTextField userNameJTextField;
    // End of variables declaration//GEN-END:variables
}
