/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.OrderInventory;

import Business.Vaccination.Vaccination;
import java.util.ArrayList;

/**
 *
 * @author Elena
 */
public class OrderInventory {
    
    private ArrayList<Vaccination> vaccinationList;
    
    public OrderInventory()
    {
        vaccinationList= new ArrayList<>();
    }

    public ArrayList<Vaccination> getVaccinationList() {
        return vaccinationList;
    }

    public void setVaccinationList(ArrayList<Vaccination> vaccinationList) {
        this.vaccinationList = vaccinationList;
    }
    
    public Vaccination addVaccination(Vaccination v)
    {
        
        
        vaccinationList.add(v);
        
        return v;
        
    }
    
}
