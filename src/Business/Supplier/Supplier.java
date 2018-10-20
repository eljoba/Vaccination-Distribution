/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Supplier;

import Business.Person.Person;
import Business.Vaccination.VaccinationCatalog;

/**
 *
 * @author kvs25
 */
public class Supplier extends Person{
    
    private VaccinationCatalog vaccinationCatalog;
    private String supplierName;

    public Supplier() {
        vaccinationCatalog=new VaccinationCatalog();
        
    }

    public VaccinationCatalog getVaccinationCatalog() {
        return vaccinationCatalog;
    }

    public void setVaccinationCatalog(VaccinationCatalog vaccinationCatalog) {
        this.vaccinationCatalog = vaccinationCatalog;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }
    
    

    
    
}
