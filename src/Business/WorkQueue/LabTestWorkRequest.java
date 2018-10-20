/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import Business.Vaccination.Vaccination;

/**
 *
 * @author raunak
 */
public class LabTestWorkRequest extends WorkRequest{
    
    private String testResult;
    private Vaccination vaccination;
    private UserAccount doctor;
    private CreateAppointmentWorkRequest cr;

    public CreateAppointmentWorkRequest getCr() {
        return cr;
    }

    public void setCr(CreateAppointmentWorkRequest cr) {
        this.cr = cr;
    }

    
    
    
    public UserAccount getDoctor() {
        return doctor;
    }

    public void setDoctor(UserAccount doctor) {
        this.doctor = doctor;
    }
    
    

    public Vaccination getVaccination() {
        return vaccination;
    }

    public void setVaccination(Vaccination vaccination) {
        this.vaccination = vaccination;
    }
    
    

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }
    
    
}
