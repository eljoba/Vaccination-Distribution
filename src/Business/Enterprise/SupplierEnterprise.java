/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//added by elton
package Business.Enterprise;

import Business.Role.Role;
import Business.Vaccination.VaccinationCatalog;
import java.util.ArrayList;

/**
 *
 * @author Elena
 */
public class SupplierEnterprise extends Enterprise{
    private VaccinationCatalog vaccinationCatalog;

    public VaccinationCatalog getVaccinationCatalog() {
        return vaccinationCatalog;
    }

    public void setVaccinationCatalog(VaccinationCatalog vaccinationCatalog) {
        this.vaccinationCatalog = vaccinationCatalog;
    }
    
    public SupplierEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.Supplier);
        vaccinationCatalog=new VaccinationCatalog();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    

    @Override
    public String toString(){
        return this.getName();
    }
}
