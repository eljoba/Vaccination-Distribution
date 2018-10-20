/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Organization.Organization;

/**
 *
 * @author kvs25
 */
public class CreateAppointmentWorkRequest extends WorkRequest {
   private int age;
   private boolean isSick;
   private boolean hasAllergy;
   private boolean hasReactionToVaccine;
   private boolean healthProblem;
   private boolean receivedVaccine;
   private boolean immuneSystemProblem;
   //private Organization doctorOrg;
   
   
   

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
   

    public boolean isIsSick() {
        return isSick;
    }

    public void setIsSick(boolean isSick) {
        this.isSick = isSick;
    }

    public boolean isHasAllergy() {
        return hasAllergy;
    }

    public void setHasAllergy(boolean hasAllergy) {
        this.hasAllergy = hasAllergy;
    }

    public boolean isHasReactionToVaccine() {
        return hasReactionToVaccine;
    }

    public void setHasReactionToVaccine(boolean hasReactionToVaccine) {
        this.hasReactionToVaccine = hasReactionToVaccine;
    }

    public boolean isHealthProblem() {
        return healthProblem;
    }

    public void setHealthProblem(boolean healthProblem) {
        this.healthProblem = healthProblem;
    }

    public boolean isReceivedVaccine() {
        return receivedVaccine;
    }

    public void setReceivedVaccine(boolean receivedVaccine) {
        this.receivedVaccine = receivedVaccine;
    }

    public boolean isImmuneSystemProblem() {
        return immuneSystemProblem;
    }

    public void setImmuneSystemProblem(boolean immuneSystemProblem) {
        this.immuneSystemProblem = immuneSystemProblem;
    }
   
}
