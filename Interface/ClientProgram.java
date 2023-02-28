package Interface;

import java.util.Scanner;

class ClientProgram implements Client{
    String name;
    double salary;
    Scanner sc = new Scanner(System.in);

    public void input(){
        System.out.println("Enter name:");
        name= sc.nextLine();

        System.out.println("Enter salary:");
        salary = sc.nextDouble();
    }
    public void output(){
        System.out.println("Name::"+name);
        System.out.println("Salary:"+salary);
    }

    public static void main(String[] args) {
      Client c = new ClientProgram();
      c.input();
      c.output();
    }

}
