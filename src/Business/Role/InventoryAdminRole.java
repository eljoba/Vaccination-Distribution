/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.InventoryAdminOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.InventoryAdminRole.InventoryAdminWorkAreaJPanel;


/**
 *
 * @author kvs25
 */
public class InventoryAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new InventoryAdminWorkAreaJPanel(userProcessContainer,account,(InventoryAdminOrganization)organization,enterprise,business);
    }
    
    @Override
    public String toString() {
        return Role.RoleType.InventoryAdminRole.getValue();
    }
    
    
}
