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
//added by elton
public class SupplierAdminWorkRequest extends WorkRequest {
    
    private String orderRequest;
    private Order order;
    private OrderInventory oi;
    private HospitalEnterprise hospitalEnterprise; 

    public HospitalEnterprise getHospitalEnterprise() {
        return hospitalEnterprise;
    }

    public void setHospitalEnterprise(HospitalEnterprise hospitalEnterprise) {
        this.hospitalEnterprise = hospitalEnterprise;
    }

    public String getOrderRequest() {
        return orderRequest;
    }

    public void setOrderRequest(String orderRequest) {
        this.orderRequest = orderRequest;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public OrderInventory getOi() {
        return oi;
    }

    public void setOi(OrderInventory oi) {
        this.oi = oi;
    }

    public String getTestResult() {
        return orderRequest;
    }

    public void setTestResult(String orderRequest) {
        this.orderRequest = orderRequest;
    }
    
}
