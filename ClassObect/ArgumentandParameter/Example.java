package ClassObect.ArgumentandParameter;

public class Example {
    int a;
    int b;

    //method overloading
    public int number(Example ex1){  //call-by-Reference (parameter)
        ex1.a=a+2;
        return ex1.a;
    }
    public int number(int b){    //call-by-value
        return b;
    }

    public static void main(String[] args) {
        Example ex = new Example();
        System.out.println(ex.a); //argument pass

        System.out.println(ex.number(ex)); //call-by-reference ans=2
        System.out.println(ex.a);//ans=2

        System.out.println(ex.b); //ans=0
        System.out.println(ex.number(3)); //call-by-value ans=3
        System.out.println(ex.b); //ans=0
    }

}
