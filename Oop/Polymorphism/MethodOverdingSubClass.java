package Oop.Polymorphism;

public class MethodOverdingSubClass extends MethodOveridingBaseClass{
    public void display(){
        System.out.println("Subclass display");
   }

    public static void main(String[] args) {
        MethodOverdingSubClass mo2 = new MethodOverdingSubClass();
        MethodOveridingBaseClass mo1=new MethodOveridingBaseClass();
        mo1.display();

        mo1 = mo2;

        mo1.display();

    }



}
