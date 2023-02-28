package Oop.Polymorphism;

//overloading example (compile time polymorphism)
public class MethodOverloadingExample {
    public int sum(int a,int b){
        return a;
    }
    public double sum(double a,double b){
        double add=a+b;
        return add;
    }
    public int sum(int a,int b, int c ){
        return b;
    }

    public static void main(String[] args) {
        MethodOverloadingExample mo = new MethodOverloadingExample();
        System.out.println(mo.sum(1,3,3)); //ans = 2
    }
}
