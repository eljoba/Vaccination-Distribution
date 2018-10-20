/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author kvs25
 */
public class CreateFollowUpWorkRequest extends WorkRequest{
    
    private CreateAppointmentWorkRequest cawr;
    private String testResult;

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }
    

    public CreateAppointmentWorkRequest getCawr() {
        return cawr;
    }

    public void setCawr(CreateAppointmentWorkRequest cawr) {
        this.cawr = cawr;
    }
    
    
}
