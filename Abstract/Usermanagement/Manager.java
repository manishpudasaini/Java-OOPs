package Abstract.Usermanagement;

import Abstract.AuthenticationManagement.Register;
import Abstract.UserInterface.Admin;
import Abstract.UserInterface.User;

public class Manager extends Employee implements Admin {

    @Override
    void employeeDetail(Register rg) {
        System.out.println("user name= "+rg.getUserName());
        System.out.println("User type= "+rg.getEmployeeType());
    }

    @Override
    public void removeUser(Register usr) {
        usr=null;
    }
}
