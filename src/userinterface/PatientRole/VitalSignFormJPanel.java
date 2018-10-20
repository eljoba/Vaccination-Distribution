/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PatientRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.Organization.PatientOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.CreateAppointmentWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author kvs25
 */
public class VitalSignFormJPanel extends javax.swing.JPanel {

    /**
     * Creates new form VitalSignFormJPanel
     */
    JPanel userProcessContainer;
    UserAccount account;

    CreateAppointmentWorkRequest request;
    Enterprise enterprise;

    VitalSignFormJPanel(JPanel userProcessContainer, UserAccount account, CreateAppointmentWorkRequest request, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.enterprise = enterprise;
        this.request = request;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        btnYes1 = new javax.swing.JRadioButton();
        btnNo1 = new javax.swing.JRadioButton();
        btnYes2 = new javax.swing.JRadioButton();
        btnNo2 = new javax.swing.JRadioButton();
        btnYes3 = new javax.swing.JRadioButton();
        btnNo3 = new javax.swing.JRadioButton();
        btnYes4 = new javax.swing.JRadioButton();
        btnNo4 = new javax.swing.JRadioButton();
        btnYes5 = new javax.swing.JRadioButton();
        btnNo5 = new javax.swing.JRadioButton();
        btnYes6 = new javax.swing.JRadioButton();
        btnNo6 = new javax.swing.JRadioButton();
        btnSubmit = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jAgeTextField = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        jLabel1.setText("Checklist for conducting Vaccinations");

        buttonGroup1.add(btnYes1);
        btnYes1.setText("Yes");

        buttonGroup1.add(btnNo1);
        btnNo1.setSelected(true);
        btnNo1.setText("No");

        buttonGroup2.add(btnYes2);
        btnYes2.setText("Yes");

        buttonGroup2.add(btnNo2);
        btnNo2.setSelected(true);
        btnNo2.setText("No");

        buttonGroup3.add(btnYes3);
        btnYes3.setText("Yes");

        buttonGroup3.add(btnNo3);
        btnNo3.setSelected(true);
        btnNo3.setText("No");

        buttonGroup4.add(btnYes4);
        btnYes4.setText("Yes");

        buttonGroup4.add(btnNo4);
        btnNo4.setSelected(true);
        btnNo4.setText("No");

        buttonGroup5.add(btnYes5);
        btnYes5.setText("Yes");

        buttonGroup5.add(btnNo5);
        btnNo5.setSelected(true);
        btnNo5.setText("No");
        btnNo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNo5ActionPerformed(evt);
            }
        });

        buttonGroup6.add(btnYes6);
        btnYes6.setText("Yes");

        buttonGroup6.add(btnNo6);
        btnNo6.setSelected(true);
        btnNo6.setText("No");

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(1);
        jTextArea1.setText("Is the child sick?");
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(1);
        jTextArea2.setText("Does the child have any allergy?");
        jScrollPane2.setViewportView(jTextArea2);

        jTextArea3.setEditable(false);
        jTextArea3.setColumns(20);
        jTextArea3.setLineWrap(true);
        jTextArea3.setRows(2);
        jTextArea3.setText("Has the child shown any reaction to vaccination earlier?");
        jScrollPane3.setViewportView(jTextArea3);

        jTextArea4.setEditable(false);
        jTextArea4.setColumns(20);
        jTextArea4.setLineWrap(true);
        jTextArea4.setRows(2);
        jTextArea4.setText("Does the child have any health problems?");
        jScrollPane4.setViewportView(jTextArea4);

        jLabel8.setText("Age");

        jTextArea5.setEditable(false);
        jTextArea5.setColumns(20);
        jTextArea5.setLineWrap(true);
        jTextArea5.setRows(2);
        jTextArea5.setText("Is the child suffering from Immunity problems?");
        jScrollPane5.setViewportView(jTextArea5);

        jTextArea6.setColumns(20);
        jTextArea6.setLineWrap(true);
        jTextArea6.setRows(2);
        jTextArea6.setText("Has the child received vaccination in the past one month?");
        jScrollPane6.setViewportView(jTextArea6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(390, 390, 390)
                        .addComponent(jAgeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnYes2))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(171, 171, 171)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnYes3)
                                        .addComponent(btnYes1)
                                        .addComponent(btnYes4)
                                        .addComponent(btnYes5)
                                        .addComponent(btnYes6))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addComponent(btnBack))
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNo1)
                            .addComponent(btnNo2)
                            .addComponent(btnNo3)
                            .addComponent(btnNo6)
                            .addComponent(btnSubmit)
                            .addComponent(btnNo4)
                            .addComponent(btnNo5))))
                .addContainerGap(539, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jAgeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnYes2)
                        .addComponent(btnNo2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnYes1)
                            .addComponent(btnNo1))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnYes3)
                            .addComponent(btnNo3))
                        .addGap(39, 39, 39))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnYes5)
                        .addComponent(btnNo5)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnYes4)
                        .addComponent(btnNo4))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnYes6)
                        .addComponent(btnNo6))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnSubmit))
                .addGap(52, 52, 52))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        
        /*if (!jAgeTextField.getText().trim().matches("[0-9 ]{2}")) {
            JOptionPane.showMessageDialog(null, "");
            
        }*/

        boolean error = false;
        if (!jAgeTextField.getText().matches("\\d+")) {
            error = true;
            JOptionPane.showMessageDialog(null, "Age value entered in invalid format");

        }
        int age = Integer.parseInt(jAgeTextField.getText());

        if (age < 0) {
            error = true;
            JOptionPane.showMessageDialog(null, "Age cannot be less than zero");
        } else if (age > 20) {
            error = true;
            JOptionPane.showMessageDialog(null, "Only for children below the age of 20");
        } else if (age > 0 && age < 20) {
            error = false;
            request.setAge(age);
        } else {
            error = true;
            JOptionPane.showMessageDialog(null, "Invalid age value entered");
        }

        if (!error) {
            request.setStatus("New");
            request.setSender(account);
            request.setRequestDate(new Date());
            request.setMessage("Vaccination appointment");
            if (btnYes1.isSelected()) {
                request.setIsSick(true);
            } else {
                request.setIsSick(false);
            }
            if (btnYes2.isSelected()) {
                request.setHasAllergy(true);
            } else {
                request.setHasAllergy(false);
            }
            if (btnYes3.isSelected()) {
                request.setHasReactionToVaccine(true);
            } else {
                request.setHasReactionToVaccine(false);
            }
            if (btnYes4.isSelected()) {
                request.setHealthProblem(true);
            } else {
                request.setHealthProblem(false);
            }
            if (btnYes5.isSelected()) {
                request.setImmuneSystemProblem(true);
            } else {
                request.setImmuneSystemProblem(false);
            }
            if (btnYes6.isSelected()) {
                request.setReceivedVaccine(true);
            } else {
                request.setReceivedVaccine(false);
            }

            //account.getWorkQueue().getWorkRequestList().add(request);
            //request.getReceiver().getWorkQueue().getWorkRequestList().add(request);
            //JOptionPane.showMessageDialog(null, "Request has successfully been submitted");
            //jAgeTextField.setText("");
            Organization org = null;
            Organization org1 = null;

            for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
                if (o instanceof DoctorOrganization) {
                    org = o;
                    break;
                }
            }
            for (Organization organization1 : enterprise.getOrganizationDirectory().getOrganizationList()) {
                if (organization1 instanceof PatientOrganization) {
                    org1 = organization1;
                    break;
                }
            }
            if (org != null) {
                org.getWorkQueue().getWorkRequestList().add(request);
                System.out.println("added to doctor org");
                account.getWorkQueue().getWorkRequestList().add(request);
                if (org1 != null) {
                    System.out.println("added to patient org");
                    org1.getWorkQueue().getWorkRequestList().add(request);
                    org1.getPersonDirectory().getPersonList().add(account.getPerson());
                }
                request.getReceiver().getWorkQueue().getWorkRequestList().add(request);
                JOptionPane.showMessageDialog(null, "Request has successfully been submitted");
                jAgeTextField.setText("");

            }

        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        /* Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 2];
        PatientWorkAreaJPanel pwajp = (PatientWorkAreaJPanel) component;
        pwajp.populateTable();*/
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnNo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNo5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNo5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JRadioButton btnNo1;
    private javax.swing.JRadioButton btnNo2;
    private javax.swing.JRadioButton btnNo3;
    private javax.swing.JRadioButton btnNo4;
    private javax.swing.JRadioButton btnNo5;
    private javax.swing.JRadioButton btnNo6;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JRadioButton btnYes1;
    private javax.swing.JRadioButton btnYes2;
    private javax.swing.JRadioButton btnYes3;
    private javax.swing.JRadioButton btnYes4;
    private javax.swing.JRadioButton btnYes5;
    private javax.swing.JRadioButton btnYes6;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.JTextField jAgeTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    // End of variables declaration//GEN-END:variables
}
