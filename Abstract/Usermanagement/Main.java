package Abstract.Usermanagement;

import Abstract.AuthenticationManagement.Login;
import Abstract.AuthenticationManagement.Register;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Register rg = null;
        char run='y' ;

        while(run=='y'){
            System.out.println("1. Register");
            System.out.println("2. Login");
           Scanner sc = new Scanner(System.in);
            System.out.println("Enter your choice::");
            int choice=sc.nextInt();

            sc.nextLine();

            switch (choice){
                case 1:
                    System.out.println("Enter your username:");
                    String userName = sc.nextLine();

                    System.out.println("Enter your password::");
                    String password = sc.nextLine();

                    System.out.println("Enter employee Type:");
                    String employeeType = sc.nextLine();
                    rg = new Register(userName,password,employeeType);
                    break;

                case 2:
                    Login lg = new Login();
                    System.out.println("Enter your username:");
                    String Name = sc.nextLine();

                    System.out.println("Enter your password::");
                    String Password = sc.nextLine();


                    boolean isValidated = lg.validateUser(Name,Password,rg);
                    if(isValidated){
                        System.out.println("Login sucessful::");
                        if(rg.getEmployeeType().equals("Admin")){
                            System.out.println();
                            System.out.println("***Welcome Admin****");
                            Manager mg = new Manager();

                            char runloop='y';
                            do{
                                System.out.println("Enter 1. View user");
                                System.out.println("Enter 2. Remove user");
                                System.out.println("enter your choice::");
                                int mgchoice=sc.nextInt();

                                sc.nextLine();

                                switch (mgchoice){
                                    case 1:
                                        mg.employeeDetail(rg);
                                        break;

                                    case 2:
                                        mg.removeUser(rg);
                                        System.out.println("User removed");
                                        break;
                                }
                                System.out.println("Enter yes to continue no to break::");
                                choice=sc.nextLine().charAt(0);
                            }while (runloop=='y');
                        }else{
                            System.out.println();
                            System.out.println("**Welcome user***");
                            Clerk ck  = new Clerk();
                            ck.employeeDetail(rg);
                        }


                    }else {
                        System.out.println("Login failed.");
                    }
                    break;

                default:
                    System.out.println("Enter valid choice!!!");
            }

            System.out.println("Enter yes to continue no to break::");
            run = sc.nextLine().charAt(0);

        }
    }
}
