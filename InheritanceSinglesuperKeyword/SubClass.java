package InheritanceSinglesuperKeyword;

public class SubClass extends BaseClass {
    String subclass;
    SubClass(String subclass){
        super(); //it will display default constructor of Base class
        System.out.println("This is sub class constructor");
        this.subclass=subclass;
    }
    SubClass(){
        this("Manish"); //constructor call
        super.display();
        System.out.println("This is sub class default constructor");
    }
    public void display() {
        System.out.println("This is the display method of subclass");
        super.display(); //super keyword
        System.out.println(subclass);
        System.out.println(baseClass);
    }

    public static void main(String[] args) {

        SubClass dsc = new SubClass();//default constructor
        dsc.display();
        SubClass psc = new SubClass("This is subclass");
        dsc.baseClass="Baseclass variable use in subclass";


    }
}
