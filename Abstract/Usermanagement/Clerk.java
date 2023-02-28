package Abstract.Usermanagement;

import Abstract.AuthenticationManagement.Register;
import Abstract.UserInterface.User;

public class Clerk extends  Employee implements User {
    @Override
    void employeeDetail(Register rg) {
        System.out.println("User Name= "+rg.getUserName());
        System.out.println("Employee type = "+rg.getEmployeeType());
    }

    @Override
    public Register viewUser(Register usr) {
        return null;
    }
}
