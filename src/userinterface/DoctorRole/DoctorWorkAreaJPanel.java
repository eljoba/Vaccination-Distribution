/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Enterprise.SupplierEnterprise;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.Organization.InventoryAdminOrganization;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Business.Organization.SupplierAdminOrganization;
import Business.Person.Person;
import Business.Role.Role;
import Business.Supplier.Supplier;
import Business.UserAccount.UserAccount;
import Business.Vaccination.Vaccination;
import Business.WorkQueue.CreateAppointmentWorkRequest;
import Business.WorkQueue.CreateFollowUpWorkRequest;
import Business.WorkQueue.InventoryAdminWorkRequest;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class DoctorWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Organization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem business;
    private HospitalEnterprise hospitalEnterprise;

    /**
     * Creates new form DoctorWorkAreaJPanel
     *
     * @param userProcessContainer
     * @param account
     * @param organization
     * @param enterprise
     */
    public DoctorWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business = business;
        valueLabel.setText(enterprise.getName());
        populateRequestTable();
        populateLabAssistantComboBox();
        populateFollowUpTable();
        jDoctorLabel.setText(account.toString());
        populateVaccineComboBox();
        populateTable();
        //populateVaccineComboBox();

    }
    
    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel)vaccinationOrderInventory.getModel();
        int rowCount = vaccinationOrderInventory.getRowCount();
        if(enterprise instanceof HospitalEnterprise)
        {
        hospitalEnterprise=(HospitalEnterprise)enterprise;
        
        
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        
        for(Vaccination v : hospitalEnterprise.getOrderInventory().getVaccinationList()) {
            Object row[] = new Object[4];
            
            row[0] = v.getVaccineID();
            row[1] = v;
            row[2] = v.getPrice();
            row[3] = v.getAvailability();
            model.addRow(row);
        }
        }
        else
        {
            //int rowCount = vaccinationOrderInventory.getRowCount();
        
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        }
    }

    public void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
            if (!request.getStatus().equals("Follow-up")) {
                Object[] row = new Object[5];
                row[0] = request;
                row[1] = request.getReceiver();
                row[2] = request.getStatus();

                //String result = ((LabTestWorkRequest) request).getTestResult();
                // row[3] = result == null ? "Waiting" : result;
                row[4] = request.getSender();
                model.addRow(row);
            }

        }
    }

    public void populateLabAssistantComboBox() {
        jLabAssistantComboBox.removeAllItems();
        for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (o instanceof LabOrganization) {
                for (UserAccount ua : o.getUserAccountDirectory().getUserAccountList()) {
                    jLabAssistantComboBox.addItem(ua);
                }
            }
        }
    }

    //method left to complete
    public void populateVaccineComboBox() {
        // jVaccinationComboBox.removeAllItems();
        for (Network ne : business.getNetworkList()) {
            for (Enterprise e : ne.getEnterpriseDirectory().getEnterpriseList()) {
                if (e instanceof HospitalEnterprise) {
                    for (Vaccination v : ((HospitalEnterprise) e).getOrderInventory().getVaccinationList()) {
                        jVaccinationComboBox.addItem(v);
                    }
                }
            }
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ViewPatientDetailDialogForm = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jSickTextField = new javax.swing.JTextField();
        jAllergyTextField = new javax.swing.JTextField();
        jHealthProblemsTextField = new javax.swing.JTextField();
        jVaccineSignsTextField = new javax.swing.JTextField();
        jImmunityTextField = new javax.swing.JTextField();
        jReceiveVaccineTextField = new javax.swing.JTextField();
        jAgeTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        requestTestJButton = new javax.swing.JButton();
        refreshTestJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabAssistantComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jVaccinationComboBox = new javax.swing.JComboBox();
        btnBack = new javax.swing.JButton();
        btnViewForm = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jFollowUpTable = new javax.swing.JTable();
        btnPerformTest1 = new javax.swing.JButton();
        btnBack1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        vaccinationOrderInventory = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        vaccinationTxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jDoctorLabel = new javax.swing.JLabel();

        ViewPatientDetailDialogForm.setBackground(new java.awt.Color(255, 255, 255));
        ViewPatientDetailDialogForm.setBounds(new java.awt.Rectangle(400, 250, 550, 450));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(1);
        jTextArea1.setText("Is the child sick?");
        jTextArea1.setWrapStyleWord(true);
        jScrollPane2.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(1);
        jTextArea2.setText("Does the child have any allergy?");
        jScrollPane3.setViewportView(jTextArea2);

        jTextArea3.setEditable(false);
        jTextArea3.setColumns(20);
        jTextArea3.setLineWrap(true);
        jTextArea3.setRows(2);
        jTextArea3.setText("Has the child shown any reaction to vaccination earlier?");
        jScrollPane4.setViewportView(jTextArea3);

        jTextArea4.setEditable(false);
        jTextArea4.setColumns(20);
        jTextArea4.setLineWrap(true);
        jTextArea4.setRows(2);
        jTextArea4.setText("Does the child have any health problems?");
        jScrollPane5.setViewportView(jTextArea4);

        jTextArea5.setEditable(false);
        jTextArea5.setColumns(20);
        jTextArea5.setLineWrap(true);
        jTextArea5.setRows(2);
        jTextArea5.setText("Is the child suffering from Immunity problems?");
        jScrollPane6.setViewportView(jTextArea5);

        jTextArea6.setColumns(20);
        jTextArea6.setLineWrap(true);
        jTextArea6.setRows(2);
        jTextArea6.setText("Has the child received vaccination in the past one month?");
        jScrollPane7.setViewportView(jTextArea6);

        jSickTextField.setEditable(false);
        jSickTextField.setEnabled(false);

        jAllergyTextField.setEditable(false);
        jAllergyTextField.setEnabled(false);

        jHealthProblemsTextField.setEditable(false);
        jHealthProblemsTextField.setEnabled(false);

        jVaccineSignsTextField.setEditable(false);
        jVaccineSignsTextField.setEnabled(false);

        jImmunityTextField.setEditable(false);
        jImmunityTextField.setEnabled(false);

        jReceiveVaccineTextField.setEditable(false);
        jReceiveVaccineTextField.setEnabled(false);

        jAgeTextField.setEditable(false);
        jAgeTextField.setEnabled(false);

        jLabel8.setText("Age");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        jLabel3.setText("Checklist");

        javax.swing.GroupLayout ViewPatientDetailDialogFormLayout = new javax.swing.GroupLayout(ViewPatientDetailDialogForm.getContentPane());
        ViewPatientDetailDialogForm.getContentPane().setLayout(ViewPatientDetailDialogFormLayout);
        ViewPatientDetailDialogFormLayout.setHorizontalGroup(
            ViewPatientDetailDialogFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewPatientDetailDialogFormLayout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(ViewPatientDetailDialogFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ViewPatientDetailDialogFormLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jVaccineSignsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ViewPatientDetailDialogFormLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addComponent(jAllergyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ViewPatientDetailDialogFormLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jAgeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ViewPatientDetailDialogFormLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSickTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ViewPatientDetailDialogFormLayout.createSequentialGroup()
                        .addGroup(ViewPatientDetailDialogFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(ViewPatientDetailDialogFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jImmunityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jHealthProblemsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jReceiveVaccineTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(259, 259, 259))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewPatientDetailDialogFormLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(355, 355, 355))
        );
        ViewPatientDetailDialogFormLayout.setVerticalGroup(
            ViewPatientDetailDialogFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewPatientDetailDialogFormLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ViewPatientDetailDialogFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ViewPatientDetailDialogFormLayout.createSequentialGroup()
                        .addGroup(ViewPatientDetailDialogFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jAgeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSickTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(ViewPatientDetailDialogFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jAllergyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ViewPatientDetailDialogFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jVaccineSignsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(ViewPatientDetailDialogFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jHealthProblemsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(ViewPatientDetailDialogFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jImmunityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(ViewPatientDetailDialogFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jReceiveVaccineTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        setBackground(new java.awt.Color(255, 255, 255));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Enterprise :");

        valueLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        valueLabel.setText(" ");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Message", "Receiver", "Status", "Result", "Sender"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);
        if (workRequestJTable.getColumnModel().getColumnCount() > 0) {
            workRequestJTable.getColumnModel().getColumn(0).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(1).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(2).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(3).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(4).setResizable(false);
        }

        requestTestJButton.setText("Request Test");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });

        refreshTestJButton.setText("Refresh");
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Select a Lab Assistant");

        jLabAssistantComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLabAssistantComboBoxActionPerformed(evt);
            }
        });

        jLabel2.setText("Select a Vaccination:");

        jVaccinationComboBox.setToolTipText("");
        jVaccinationComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVaccinationComboBoxActionPerformed(evt);
            }
        });

        btnBack.setText("Back");

        btnViewForm.setText("View Form");
        btnViewForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewFormActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(refreshTestJButton)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnViewForm)
                            .addComponent(btnBack))))
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabAssistantComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jVaccinationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(requestTestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addGap(0, 443, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(refreshTestJButton)
                    .addComponent(jLabel1))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabAssistantComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jVaccinationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack)
                        .addGap(32, 32, 32))
                        //.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jVaccinationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(118, 118, 118)
                                .addComponent(requestTestJButton)
                                .addGap(51, 51, 51))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnBack)
                                .addGap(32, 32, 32))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(requestTestJButton)
                            .addComponent(btnViewForm))
                        //.addGap(0, 99, Short.MAX_VALUE)
                        )));
        //);

        jTabbedPane1.addTab("Vaccine Requests", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jFollowUpTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Message", "Status", "Result", "Sender"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane8.setViewportView(jFollowUpTable);
        if (jFollowUpTable.getColumnModel().getColumnCount() > 0) {
            jFollowUpTable.getColumnModel().getColumn(0).setResizable(false);
            jFollowUpTable.getColumnModel().getColumn(1).setResizable(false);
            jFollowUpTable.getColumnModel().getColumn(2).setResizable(false);
            jFollowUpTable.getColumnModel().getColumn(3).setResizable(false);
        }

        btnPerformTest1.setText("Perform Test");
        btnPerformTest1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerformTest1ActionPerformed(evt);
            }
        });

        btnBack1.setText("Back");
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(btnBack1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPerformTest1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(458, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPerformTest1)
                    .addComponent(btnBack1))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Follow-ups", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        vaccinationOrderInventory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaccination Id", "Vaccination Name", "Price", "Availability"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane9.setViewportView(vaccinationOrderInventory);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Hospital Order Inventory");

        jLabel5.setText("Vaccination Name:");

        jButton1.setText("Submit order request");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(36, 36, 36)
                        .addComponent(vaccinationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(580, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(vaccinationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(167, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Inventory", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1070, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 449, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Vaccine Info", jPanel4);

        jDoctorLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jDoctorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(268, 268, 268))
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDoctorLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed

        // do validation to avoid null value of vaccine and lab assistant
        boolean flag = false;
        String errorMessage = "";

        UserAccount ua = (UserAccount) jLabAssistantComboBox.getSelectedItem();
        if (ua == null) {
            flag = true;
            errorMessage += "No lab assistant has been selected";
        }

        Vaccination v = (Vaccination) jVaccinationComboBox.getSelectedItem();
        if (v == null) {
            flag = true;
            errorMessage += "No vaccination has been selected";
        }

        if (!flag) {
            int selectedRow = workRequestJTable.getSelectedRow();
            if (selectedRow >= 0) {
                if (v.getAvailability() <= 0) {
                    JOptionPane.showMessageDialog(null, "Vaccination not available");
                } else {
                    LabTestWorkRequest wr = new LabTestWorkRequest();
                    wr.setCr((CreateAppointmentWorkRequest) workRequestJTable.getValueAt(selectedRow, 0));
                    wr.setDoctor(userAccount);
                    wr.setReceiver(ua);

                    wr.setVaccination(v);

                    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                    userProcessContainer.add("RequestLabTestJPanel", new RequestLabTestJPanel(userProcessContainer, userAccount, enterprise, wr));
                    layout.next(userProcessContainer);
                }

            } else {
                JOptionPane.showMessageDialog(null, "No requests have been selected");

            }
        } else {
            JOptionPane.showMessageDialog(null, errorMessage);

        }


    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed

        populateRequestTable();

    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void jLabAssistantComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLabAssistantComboBoxActionPerformed
        // TODO add your handling code here:
/*
        for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (o instanceof LabOrganization) {
                for (UserAccount ua : o.getUserAccountDirectory().getUserAccountList()) {
                    jLabAssistantComboBox.addItem(ua.getPerson());
                }

            }
        }
         */
    }//GEN-LAST:event_jLabAssistantComboBoxActionPerformed

    private void btnViewFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewFormActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow >= 0) {
            CreateAppointmentWorkRequest request = (CreateAppointmentWorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
            ViewPatientDetailDialogForm.setVisible(true);
            jAgeTextField.setText(String.valueOf(request.getAge()));
            jSickTextField.setText(String.valueOf(request.isIsSick()));
            jAllergyTextField.setText(String.valueOf(request.isHasAllergy()));
            jHealthProblemsTextField.setText(String.valueOf(request.isHealthProblem()));
            jImmunityTextField.setText(String.valueOf(request.isImmuneSystemProblem()));
            jReceiveVaccineTextField.setText(String.valueOf(request.isReceivedVaccine()));
            jVaccineSignsTextField.setText(String.valueOf(request.isHasReactionToVaccine()));

        } else {
            JOptionPane.showMessageDialog(null, "Select a patient to view information");
        }
    }//GEN-LAST:event_btnViewFormActionPerformed

    private void jVaccinationComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVaccinationComboBoxActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jVaccinationComboBoxActionPerformed

    public void populateFollowUpTable() {
        DefaultTableModel model = (DefaultTableModel) jFollowUpTable.getModel();

        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
            //if (request.getStatus().equalsIgnoreCase("Follow-up")) 
            if(request instanceof CreateFollowUpWorkRequest)
            {
                Object[] row = new Object[5];
                row[0] = request;
                row[1] = request.getStatus();
                row[2] = ((CreateFollowUpWorkRequest) request).getTestResult();
                //String result = ((PerformWorkRequestJPanel) request).getTestResult();
                //row[3] = result == null ? "Waiting" : result;
                row[3] = request.getSender();
                model.addRow(row);
            }

        }
    }


    private void btnPerformTest1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerformTest1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = jFollowUpTable.getSelectedRow();

        if (selectedRow >= 0) {
            CreateFollowUpWorkRequest request = (CreateFollowUpWorkRequest) jFollowUpTable.getValueAt(selectedRow, 0);
            request.setStatus("Processing");
            PerformWorkRequestJPanel pwjp = new PerformWorkRequestJPanel(userProcessContainer, userAccount, (DoctorOrganization) organization, request, enterprise);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            userProcessContainer.add("PerformWorkRequestJPanel", pwjp);
            layout.next(userProcessContainer);

        } else {
            JOptionPane.showMessageDialog(null, "No lab tests selected for follow up");
        }

    }//GEN-LAST:event_btnPerformTest1ActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnBack1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        InventoryAdminWorkRequest orderRequest = new InventoryAdminWorkRequest();
        //request.setMessage(message);
        orderRequest.setSender(userAccount);
        orderRequest.setStatus("Pending");
        //orderRequest.setOrder(order);
        //request.setOi(oi);
        orderRequest.setMessage(vaccinationTxt.getText());
        //orderRequest.setMessage(request.getTestResult());
        //orderRequest.setHospitalEnterprise(hospitalEnterprise);
        

        Organization org = null;
        for (Organization organization : hospitalEnterprise.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof InventoryAdminOrganization) {
                org = organization;
                break;
            }
        }
        if (org != null) {
           org.getWorkQueue().getWorkRequestList().add(orderRequest);
            userAccount.getWorkQueue().getWorkRequestList().add(orderRequest);
            JOptionPane.showMessageDialog(null, "Request has been submitted successfully");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog ViewPatientDetailDialogForm;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnPerformTest1;
    private javax.swing.JButton btnViewForm;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JTextField jAgeTextField;
    private javax.swing.JTextField jAllergyTextField;
    private javax.swing.JLabel jDoctorLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JTable jFollowUpTable;
    private javax.swing.JTextField jHealthProblemsTextField;
    private javax.swing.JTextField jImmunityTextField;
    private javax.swing.JComboBox jLabAssistantComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jReceiveVaccineTextField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextField jSickTextField;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JComboBox jVaccinationComboBox;
    private javax.swing.JTextField jVaccineSignsTextField;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JTable vaccinationOrderInventory;
    private javax.swing.JTextField vaccinationTxt;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
