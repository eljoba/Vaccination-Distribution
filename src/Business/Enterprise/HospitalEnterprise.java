/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;
import Business.OrderInventory.OrderInventory;
/**
 *
 * @author raunak
 */
public class HospitalEnterprise extends Enterprise{

    //added by elton
    private OrderInventory orderInventory;

    public OrderInventory getOrderInventory() {
        return orderInventory;
    }

    public void setOrderInventory(OrderInventory orderInventory) {
        this.orderInventory = orderInventory;
    }
    //added by elton
    
    public HospitalEnterprise(String name) {
        super(name, EnterpriseType.Hospital);
        orderInventory=new OrderInventory();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
