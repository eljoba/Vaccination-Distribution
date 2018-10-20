/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Enterprise.HospitalEnterprise;
import Business.Order.Order;
import Business.OrderInventory.OrderInventory;

/**
 *
 * @author Elena
 */
public class InventoryAdminWorkRequest extends WorkRequest {
    
    private String orderStatus;
    //private Order order;
    //private OrderInventory oi;
    //private HospitalEnterprise hospitalEnterprise; 

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

   
}
