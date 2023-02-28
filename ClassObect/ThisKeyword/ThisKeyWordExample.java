package ClassObect.ThisKeyword;

public class ThisKeyWordExample {
    int a, b; // intance variables

    ThisKeyWordExample(int a) {
        /**
         * This constructor is called when creating the object
         * Using this keyword for calling another constructor must be the fist line in
         * the calling constructor
         * this refers to the ThisKeyWord class object
         */
        this(a, 5); // calling another constructor with parameter list as (int,int)
        this.a = a; // assigning parameter a's value to instance field a. Here this keyword is used
        // to refer to instance variable
    }

    ThisKeyWordExample(int a, int b) {
        // this constructor is called in another constructor using this keyword.
        this.b = a + b; // assigning the sum of parameters a and b to instance field b
    }

    public static void main(String[] args) {
        // creating instance of class ThisKeyWord using constructor with one parameter
        ThisKeyWordExample tkw = new ThisKeyWordExample(5);
        System.out.println("a = " + tkw.a + " , b = " + tkw.b);
    }
}
