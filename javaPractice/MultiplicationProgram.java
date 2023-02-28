package javaPractice;

import java.util.Scanner;

public class MultiplicationProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for multiplication::");
        int k = sc.nextInt();

        System.out.println("Enter the value from where you want to start multiply:");
        int m = sc.nextInt();

        System.out.println("Enter the value up-to which you want to multiply::");
        int n = sc.nextInt();

        Multiplication mp = new Multiplication(k,m,n);
        mp.multiplication();
    }

}
