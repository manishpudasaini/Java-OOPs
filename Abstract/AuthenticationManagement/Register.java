package Abstract.AuthenticationManagement;

public class Register {
    private String userName;
    private String password;
    private String employeeType;

    public Register(String userName, String password, String employeeType) {
        this.userName = userName;
        this.password = password;
        this.employeeType = employeeType;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getEmployeeType() {
        return employeeType;
    }
}
