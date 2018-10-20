/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Vaccination.Vaccination;

/**
 *
 * @author kvs25
 */
public class OrderItem {
    private Vaccination vaccination;
    private int quantity;
    private double salesPrice; // changed by elton

    @Override
    public String toString() {
        return vaccination.getName();
    }

    public OrderItem() {
    }
    
    

    public Vaccination getVaccination() {
        return vaccination;
    }

    public void setVaccination(Vaccination vaccination) {
        this.vaccination = vaccination;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(double salesPrice) {
        this.salesPrice = salesPrice;
    }
    
    
    
    
    
}
