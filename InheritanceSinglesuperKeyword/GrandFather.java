package InheritanceSinglesuperKeyword;

import java.util.Scanner;

public class GrandFather {
    String name;
    String surname;
    String address;

    public void displayGrandfatherIfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter grandfather name;");
        name =sc.nextLine();
        System.out.println("Enter surname ::");
        surname=sc.nextLine();
        System.out.println("Enter address");
        address=sc.nextLine();
        System.out.println("GrandFather name= "+name+" "+surname);
        System.out.println("Address= "+address);

    }

}
