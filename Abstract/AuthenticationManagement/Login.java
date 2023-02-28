package Abstract.AuthenticationManagement;

import java.util.regex.Pattern;

public class Login {
    String usernamePattern = "[a-zA-Z0-9]+[@#$%^&][a-z]+\\.[a-z]+{5,40}";
    String passwordPattern = "[a-zA-Z0-9]+[@#$%^&*][]a-zA-Z0-9]+";
    public boolean validateUser(String name,String password ,Register usr){
    if(Pattern.matches(usernamePattern,name) && Pattern.matches(passwordPattern,password)){
        return true;
    }else{
        return false;
    }
    }
    public String[] getUser(Register usr){
        String userInfo[]=new String[2];
        userInfo[0]=usr.getUserName();
        userInfo[1]=usr.getEmployeeType();

        return userInfo;
    }
}


