/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Vaccination;

import java.util.ArrayList;

/**
 *
 * @author kvs25
 */
public class VaccinationCatalog {

    private ArrayList<Vaccination> vaccinationCatalog;

    public VaccinationCatalog() {
        vaccinationCatalog = new ArrayList<>();
    }

    public ArrayList<Vaccination> getVaccinationCatalog() {
        return vaccinationCatalog;
    }

    public Vaccination addVaccination() {
        Vaccination v = new Vaccination();
        vaccinationCatalog.add(v);
        return v;
    }

    public void removeVaccination(Vaccination v) {
        vaccinationCatalog.remove(v);

    }

    public Vaccination searchVaccination(String s) {
        for (Vaccination v : vaccinationCatalog) {
            if (s.equalsIgnoreCase(v.getName())) {
                return v;
            }

        }
        return null;
    }

}
