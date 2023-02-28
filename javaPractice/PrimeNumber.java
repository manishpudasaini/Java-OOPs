package javaPractice;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner dc = new Scanner(System.in);
        System.out.println("Enter any number::");
        int num = dc.nextInt();

        int count=0;

        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("Prime number");
        }else{
            System.out.println("Not prime number");
        }
    }
}
