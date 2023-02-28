package ClassObect.ArgumentandParameter;
//call by reference
public class Parameter {
    int a;
    public int number(int a){

        return a;
    }
    public int number(Parameter p1){   //same pm.number
        p1.a=a+1;
        return p1.a;

    }


    public static void main(String[] args) {
       Parameter pm  = new Parameter();
       int a=2;
        System.out.println(pm.number(2));
        System.out.println(pm.a);   //ans=0
        System.out.println(pm.number(pm));  //ans=1(function call)
        System.out.println(pm.a); //same a=1 (same as function)
    }
}
