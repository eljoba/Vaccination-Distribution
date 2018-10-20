/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Vaccination;

/**
 *
 * @author kvs25
 */
public class Vaccination {
    private String name;
    private int vaccineID;
    private double price;
    private int availability;
    
    private static int count =0;

    @Override
    public String toString() {
        return name;
    }
    
    //private static int count=3245;

    public Vaccination() {
        
        count++;
        vaccineID = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVaccineID() {
        return vaccineID;
    }

    public void setVaccineID(int vaccineID) {
        this.vaccineID = vaccineID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }
    
    
    
    
}
