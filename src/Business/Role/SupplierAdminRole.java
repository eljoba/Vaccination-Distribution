/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.SupplierAdminOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.SupplierAdminRole.SupplierWorkAreaJPanel;

/**
 *
 * @author kvs25
 */
public class SupplierAdminRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new SupplierWorkAreaJPanel(userProcessContainer,account,(SupplierAdminOrganization)organization,enterprise);
    }
    
    @Override
    public String toString() {
        return Role.RoleType.SupplierAdminrole.getValue();
    }
    
    
}
