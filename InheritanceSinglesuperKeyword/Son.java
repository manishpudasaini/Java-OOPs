package InheritanceSinglesuperKeyword;

import java.util.Scanner;

public class Son extends Father{
    String name;
    public void sonInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter son name;");
        name =sc.nextLine();
        System.out.println("Son name= "+super.name+" "+super.surname);
        System.out.println("Address= "+super.address);
    }

    public static void main(String[] args) {
        Son son = new Son();
        son.displayGrandfatherIfo();
        son.fatherInfo();
        son.sonInfo();
    }
}
