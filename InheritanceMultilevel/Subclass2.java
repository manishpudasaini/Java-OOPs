package InheritanceMultilevel;

public class Subclass2 extends Subclass1 {
    Subclass2(){
        System.out.println("Default constructor of subclass 2");
    }

    Subclass2(String name,String lastname){
        this.name=name;
        this.lastname=lastname;
    }
    public void display(){
        System.out.println(name);
        System.out.println(lastname);
    }

    public static void main(String[] args) {
        Subclass2 sc = new Subclass2();
        Subclass2 sc1 = new Subclass2("manish","Pudasaini");
        sc1.display();
        System.out.println(sc1.name);
    }
}
