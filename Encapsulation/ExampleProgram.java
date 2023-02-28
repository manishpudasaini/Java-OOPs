package Encapsulation;

import java.util.Scanner;

public class ExampleProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name;:");
        String firstName = sc.nextLine();
        System.out.println("Enter lastname;:");
        String lastName = sc.nextLine();
        System.out.println("Enter id;:");
        int id = sc.nextInt();

        Example ex= new Example();
        ex.setFirstName(firstName);
        ex.setLastName(lastName);
        ex.setId(id);

        System.out.println("Name= "+ex.getFirstName());
        System.out.println("Last name= "+ex.getLastName());
        System.out.println("Id= "+ex.getId());

        ex.display();

    }


}
