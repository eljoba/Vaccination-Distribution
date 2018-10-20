/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Person.Person;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class UserAccountDirectory {

    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList<>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }

    public UserAccount authenticateUser(String username, String password) {
        for (UserAccount ua : userAccountList) {
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }

    public UserAccount createUserAccount(String username, String password, Person employee, Role role) {

        boolean flag = false;

        for (UserAccount ua : userAccountList) {
            if (ua.getRole().equals(role)) {
                if (ua.getPerson().getName().toString().equals(employee.toString())) {
                    flag = true;
                    break;
                }
            }
            

        }
        if (!flag) {
            UserAccount userAccount = new UserAccount();

            userAccount.setUsername(username);
            userAccount.setPassword(password);
            userAccount.setPerson(employee);
            userAccount.setRole(role);
            userAccountList.add(userAccount);
            return userAccount;
        }
        else
        {
           return null; 
        }
        
    }

    public boolean checkIfUsernameExists(String username) {
        for (UserAccount ua : userAccountList) {
            if (ua.getUsername().trim().equalsIgnoreCase(username)) {
                return true;
            }
        }
        return false;
    }

    

}
