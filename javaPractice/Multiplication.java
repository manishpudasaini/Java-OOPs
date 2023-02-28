package javaPractice;

public class Multiplication {
    int k;
    int m; //start
    int n; //end

    public Multiplication(int k, int m, int n) {
        this.k = k;
        this.m = m;
        this.n = n;
    }

    public void multiplication(){
        for(int i=m;i<n;i++ ){
           int multiply = k*i;
            System.out.println("Multiplication of"+ k +" * "+ i+" ="+ multiply);
        }
    }
}
