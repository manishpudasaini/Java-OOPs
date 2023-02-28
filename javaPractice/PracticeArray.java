package javaPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class PracticeArray {
    public static void main(String[] args) {
        int[] array = new int[7];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<array.length;i++){
            System.out.println("Enter the element of an array::");
            array[i]=sc.nextInt();
        }
        ArrayList evenNumber = new ArrayList();
        ArrayList oddNumber = new ArrayList();
        for(int newArray:array){
            if(newArray%2==0){
                evenNumber.add(newArray);
            }else{
                oddNumber.add(newArray);
            }
        }
        System.out.println("Even number are: "+evenNumber);
        System.out.println("Odd number are : "+oddNumber);



    }
}
