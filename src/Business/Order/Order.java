/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Vaccination.Vaccination;
import java.util.ArrayList;

/**
 *
 * @author kvs25
 */
public class Order {
    
    private ArrayList<OrderItem> orderList;
    private int orderID;
    private static int count=5241;

    public Order() {
        count=orderID;
        count++;
        orderList = new ArrayList<>();
    }

    public ArrayList<OrderItem> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<OrderItem> orderList) {
        this.orderList = orderList;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }
    
    public OrderItem addOrder(int quantity, double price, Vaccination vaccination)
    {
        OrderItem oi = new OrderItem();
        oi.setQuantity(quantity);
        oi.setSalesPrice(price);
        oi.setVaccination(vaccination);
        orderList.add(oi);
        return oi;
    }
    
    
    public void removeOrder(OrderItem oi)
    {
        orderList.remove(oi);
    }
    
    
    
}
