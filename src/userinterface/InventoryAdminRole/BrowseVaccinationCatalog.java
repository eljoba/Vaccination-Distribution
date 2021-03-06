/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.InventoryAdminRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Enterprise.SupplierEnterprise;
import Business.Network.Network;
import Business.Order.Order;
import Business.Order.OrderItem;
import Business.OrderInventory.OrderInventory;
import Business.Organization.InventoryAdminOrganization;
import Business.Organization.Organization;
import Business.Organization.SupplierAdminOrganization;
import Business.Person.Person;
import Business.Supplier.Supplier;
import Business.Supplier.SupplierDirectory;
import Business.UserAccount.UserAccount;
import Business.Vaccination.Vaccination;
import Business.WorkQueue.SupplierAdminWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Elena
 */
public class BrowseVaccinationCatalog extends javax.swing.JPanel {

    /**
     * Creates new form BrowseVaccinationCatalog
     */
    private JPanel upc;
    private SupplierDirectory supplierDir;
    //private OrderInventory ori;
    private Order order;
   // private Order tableOrder;
    private Vaccination v;
    private boolean isCheckedOut = false;
    private UserAccount userAccount;
    //private Enterprise enterprise;
    private OrderInventory oi;
    private SupplierEnterprise supplierEnterprise;
    private InventoryAdminOrganization organization;
    private HospitalEnterprise hospitalEnterprise;
    private EcoSystem business;
    boolean flag;

    public BrowseVaccinationCatalog(JPanel upc, UserAccount userAccount, OrderInventory oi, InventoryAdminOrganization organization, EcoSystem business,HospitalEnterprise hospitalEnterprise) {
        initComponents();
        flag = false;
        this.userAccount = userAccount;
        this.business = business;
        this.hospitalEnterprise = hospitalEnterprise;
        this.upc = upc;
        this.organization = organization;
        //this.supplierDir = supplierDir;
        this.oi = oi;
        populateNetworkCombo();
        if (!isCheckedOut) {
            order = new Order();
            //tableOrder=new Order();
        }
    }

    public void populateNetworkCombo() {

        networkComboBox.removeAllItems();
        //suppComboBox.removeAllItems();
        for (Network n : business.getNetworkList()) {
            networkComboBox.addItem(n);
        }
        flag = true;
    }

    public void populateTable() {

        DefaultTableModel model = (DefaultTableModel) vaccinationTable.getModel();
        //Supplier supplier = (Supplier) suppComboBox1.getSelectedItem();
        supplierEnterprise = (SupplierEnterprise) suppComboBox.getSelectedItem();
        model.setRowCount(0);
        for (Vaccination v : supplierEnterprise.getVaccinationCatalog().getVaccinationCatalog()) {
            Object row[] = new Object[4];
            row[0] = v;
            row[1] = v.getVaccineID();
            row[2] = v.getPrice();
            row[3] = v.getAvailability();
            model.addRow(row);
        }
    }

    public void refreshOrderTable() {
        DefaultTableModel model = (DefaultTableModel) orderTable.getModel();
        model.setRowCount(0);
        for (OrderItem s : order.getOrderList()) {

            Object row[] = new Object[4];
            row[0] = s;
            row[1] = s.getSalesPrice();
            row[2] = s.getQuantity();
            row[3] = s.getSalesPrice() * s.getQuantity();
            model.addRow(row);

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

        networkComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        vaccinationTable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtSalesPrice = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        quantitySpinner = new javax.swing.JSpinner();
        addtoCartButton6 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        txtNewQuantity = new javax.swing.JTextField();
        btnModifyQuantity = new javax.swing.JButton();
        btnCheckOut = new javax.swing.JButton();
        btnRemoveOrderItem = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        suppComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        networkComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkComboBoxActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Network:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Supplier Vaccination Catalog");

        vaccinationTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        vaccinationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Vaccination Name", "Vaccination Id", "Price", "Availibility"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(vaccinationTable);

        jLabel6.setText("Sales Price");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Quantity:");

        quantitySpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        addtoCartButton6.setText("ADD TO CART");
        addtoCartButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addtoCartButton6ActionPerformed(evt);
            }
        });

        jLabel7.setText("Items in cart:");

        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Item Name", "Price", "Quantity", "Total Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(orderTable);

        btnModifyQuantity.setText("Modify Quantity");
        btnModifyQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyQuantityActionPerformed(evt);
            }
        });

        btnCheckOut.setText("Check out");
        btnCheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckOutActionPerformed(evt);
            }
        });

        btnRemoveOrderItem.setText("Remove");
        btnRemoveOrderItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveOrderItemActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Supplier:");

        suppComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suppComboBoxActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Place vaccination order");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txtSalesPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(94, 94, 94)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(quantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(408, 408, 408)
                                .addComponent(txtNewQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(btnModifyQuantity)
                                .addGap(40, 40, 40)
                                .addComponent(btnCheckOut)))
                        .addGap(18, 18, 18)
                        .addComponent(btnRemoveOrderItem)))
                .addContainerGap(130, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 681, Short.MAX_VALUE)
                        .addComponent(addtoCartButton6)
                        .addGap(75, 75, 75))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(networkComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(suppComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(118, 118, 118)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(428, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(networkComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(suppComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(126, 126, 126)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addtoCartButton6)
                    .addComponent(quantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(txtSalesPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemoveOrderItem)
                    .addComponent(btnCheckOut)
                    .addComponent(btnModifyQuantity)
                    .addComponent(txtNewQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBack)
                .addGap(32, 32, 32))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(180, 180, 180)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(256, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

   /* public void refreshProductTable(String keyword) {
        DefaultTableModel model = (DefaultTableModel) vaccinationTable.getModel();
        model.setRowCount(0);
        //for (Person p : supplierEnterprise.getPersonDirectory().getPersonList()) {
            //Supplier s = (Supplier) p;
            for (Vaccination v : supplierEnterprise.getVaccinationCatalog().getVaccinationCatalog()) {
                if (v.getName().equalsIgnoreCase(keyword));
                {
                    Object row[] = new Object[4];
                    row[0] = v;
                    row[1] = v.getVaccineID();
                    row[2] = v.getPrice();
                    row[3] = v.getAvailability();
                    model.addRow(row);
               // }

            }
        }
    }*/

    private void networkComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkComboBoxActionPerformed
        // TODO add your handling code here:
        //if (flag) {
            Network network = (Network) networkComboBox.getSelectedItem();
                if (network != null) {
                populateEnterpriseComboBox(network);
            }
        //}
    }//GEN-LAST:event_networkComboBoxActionPerformed

    private void populateEnterpriseComboBox(Network network) {
        suppComboBox.removeAllItems();

        for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {

            if (e instanceof SupplierEnterprise) {
                supplierEnterprise=(SupplierEnterprise)e;
                suppComboBox.addItem(e);
            }

        }

    }

    private void addtoCartButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addtoCartButton6ActionPerformed

        int selectedRow = vaccinationTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Pls select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Vaccination selectedVaccination = (Vaccination) vaccinationTable.getValueAt(selectedRow, 0);
        Vaccination vac = new Vaccination();
        int fetchQuantity = (Integer) quantitySpinner.getValue();
        if (fetchQuantity <= 0) {
            JOptionPane.showMessageDialog(null, "Quantity cannot be zero or less than zero", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            double salesPrice = Double.parseDouble(txtSalesPrice.getText());
            if (salesPrice < selectedVaccination.getPrice()) {
                JOptionPane.showMessageDialog(null, "Sales price cannot be less than actual price");
                return;
            }
            if (fetchQuantity <= selectedVaccination.getAvailability()) {
                boolean alreadyPresent = false;
                for (OrderItem oi : order.getOrderList()) {
                    if (oi.getVaccination() == selectedVaccination) {
                        int oldAvail = selectedVaccination.getAvailability();
                        int newAvail = oldAvail - fetchQuantity;
                        selectedVaccination.setAvailability(newAvail);
                        oi.setQuantity(fetchQuantity + oi.getQuantity());
                        alreadyPresent = true;
                        populateTable();
                        refreshOrderTable();
                        break;
                    }
                }
                if (!alreadyPresent) {
                    int oldAvail = selectedVaccination.getAvailability();
                    int newAvail = oldAvail - fetchQuantity;
                    selectedVaccination.setAvailability(newAvail);
                    //Vaccination vac = new Vaccination();
                    vac.setVaccineID(selectedVaccination.getVaccineID());
                    vac.setName(selectedVaccination.getName());
                    vac.setPrice(selectedVaccination.getPrice());
                    vac.setAvailability(fetchQuantity);
                    //tableOrder.addOrder(newAvail, salesPrice, selectedVaccination);
                    order.addOrder(fetchQuantity, salesPrice, vac);
                    populateTable();
                    refreshOrderTable();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Quantity is more than availability");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid Amount");
            return;
        }        // TODO add your handling code here:

    }//GEN-LAST:event_addtoCartButton6ActionPerformed

    private void btnModifyQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyQuantityActionPerformed
        //int selectedRow1 = vaccinationTable.getSelectedRow();
        //Vaccination selectedVaccination1 = (Vaccination) vaccinationTable.getValueAt(selectedRow1, 0);
        String regex= "\\d+";
        int selectedRow = orderTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Pls select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        OrderItem ori = (OrderItem) orderTable.getValueAt(selectedRow, 0);
        int currentAvail = ori.getVaccination().getAvailability();
        int oldQty = ori.getQuantity();
        int newQty;
        String quantity=txtNewQuantity.getText();
        if(!quantity.matches(regex))
        {
            JOptionPane.showMessageDialog(null,"Please enter a valid quantity","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else
        {
        newQty = Integer.parseInt(quantity);
        
        if (newQty > oldQty + currentAvail) {
            JOptionPane.showMessageDialog(null, "Invalid Quantity entered");
        } else if (newQty <= 0) {
            JOptionPane.showMessageDialog(null, "Quantity should be greater than zero");
        } else {
            ori.setQuantity(newQty);
            ori.getVaccination().setAvailability(currentAvail + (oldQty - newQty));
            //selectedVaccination1.setAvailability(currentAvail + (oldQty - newQty));
            refreshOrderTable();
            populateTable();
        }  }      // TODO add your handling code here:

    }//GEN-LAST:event_btnModifyQuantityActionPerformed

    private void btnCheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckOutActionPerformed

        if (order.getOrderList().size() > 0) {
            //ori.addOrder(order);
            /* for (OrderItem s : order.getOrderList())
            {
                for(Vaccination v: ori.getVaccinationList())
                {
                    if(s.getVaccination().getName().equalsIgnoreCase(v.getName())){
                        v.setAvailability(s.getQuantity());

                    }
                    else
                    {
                        v=new Vaccination();
                        v.setName(s.getVaccination().getName());
                        v.setPrice(s.getSalesPrice());
                        v.setAvailability(s.getQuantity());
                        ori.addVaccination(v);
                    }
                }
            }*/
            JOptionPane.showMessageDialog(null, "Order has been placed successfully");
            //order = new Order();
            //refreshOrderTable();
            populateTable();
            isCheckedOut = true;
            
            String message = "Order Request";

        SupplierAdminWorkRequest request = new SupplierAdminWorkRequest();
        request.setMessage(message);
        request.setSender(userAccount);
        request.setStatus("Sent");
        request.setOrder(order);
        request.setOi(oi);
        request.setOrderRequest("order requested");
        request.setHospitalEnterprise(hospitalEnterprise);
        

        Organization org = null;
        for (Organization organization : supplierEnterprise.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof SupplierAdminOrganization) {
                org = organization;
                break;
            }
        }
        if (org != null) {
            org.getWorkQueue().getWorkRequestList().add(request);
            userAccount.getWorkQueue().getWorkRequestList().add(request);
        }
        
        
        
        order = new Order();
        //tableOrder=new Order();
        refreshOrderTable();
        } else {
            JOptionPane.showMessageDialog(null, "cart is empty");
        }        // TODO add your handling code here:

        

    }//GEN-LAST:event_btnCheckOutActionPerformed

    private void btnRemoveOrderItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveOrderItemActionPerformed
        
        int row = orderTable.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Pls select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }

        OrderItem oi = (OrderItem) orderTable.getValueAt(row, 0);
        int oldAvail = oi.getVaccination().getAvailability();
        int oldQty = oi.getQuantity();
        int newQty = oldAvail + oldQty;
        oi.getVaccination().setAvailability(newQty);
        order.removeOrder(oi);
        //tableOrder.removeOrder(oi);
        
        int rowCount = orderTable.getRowCount();
                DefaultTableModel model = (DefaultTableModel)orderTable.getModel();
                for(int i=rowCount-1;i>=0;i--) {
                    model.removeRow(i);
                }
        
        JOptionPane.showMessageDialog(null, "Order has been removed");
        populateTable();
        

    }//GEN-LAST:event_btnRemoveOrderItemActionPerformed

    private void suppComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppComboBoxActionPerformed
        SupplierEnterprise s=(SupplierEnterprise)suppComboBox.getSelectedItem();
        //Network network = (Network) networkComboBox.getSelectedItem();
            if (s != null) {
                populateTable(); 
            }
              // TODO add your handling code here:
    }//GEN-LAST:event_suppComboBoxActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        upc.remove(this);
        CardLayout cardLayout = (CardLayout) upc.getLayout();
        cardLayout.previous(upc);// TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addtoCartButton6;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCheckOut;
    private javax.swing.JButton btnModifyQuantity;
    private javax.swing.JButton btnRemoveOrderItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox networkComboBox;
    private javax.swing.JTable orderTable;
    private javax.swing.JSpinner quantitySpinner;
    private javax.swing.JComboBox suppComboBox;
    private javax.swing.JTextField txtNewQuantity;
    private javax.swing.JTextField txtSalesPrice;
    private javax.swing.JTable vaccinationTable;
    // End of variables declaration//GEN-END:variables
}
