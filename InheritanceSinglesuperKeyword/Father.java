package InheritanceSinglesuperKeyword;

import java.util.Scanner;

public class Father extends GrandFather{
    String name;
//    public  String getName(){  //used to call grandfather name in son class name
//        return super.name;
//    }

    public void fatherInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Father name;");
        name =sc.nextLine();
        System.out.println("father name= "+name+" "+super.surname);
        System.out.println("Address= "+super.address);
    }
}
