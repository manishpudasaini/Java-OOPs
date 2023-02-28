package ClassObect.StaticKeyword;

public class Exampleprogram {
    public static void main(String[] args) {
//        System.out.println(Example.number());
        Example ex= new Example(3);
        System.out.println(ex.a);  //ans=3
        Example ex1= new Example(4);
        System.out.println(ex.a);  //ans=4
    }
}
