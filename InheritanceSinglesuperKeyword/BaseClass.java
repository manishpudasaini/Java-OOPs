package InheritanceSinglesuperKeyword;

public class BaseClass {
    String baseClass="Baseclass variable";
    public BaseClass(){
        System.out.println("Baseclass default constructor"); //default constructor
    }

    public BaseClass(String name){
        System.out.println("This is baseclass constructor");
        this.baseClass=name;
    }


    public void display(){
        System.out.println("This is the display method of BaseClass");
        System.out.println(baseClass);
    }
}
