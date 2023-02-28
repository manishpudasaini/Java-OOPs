package javaPractice;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
       int array[][];
       array = new int[2][2];
        Scanner sc = new Scanner(System.in);

       for(int i=0;i< array.length;i++){
           for(int j=0;j< array.length;j++){
               array[i][j]=sc.nextInt();
           }
       }


       for(int i=0;i< array.length;i++){
           for(int j=0;j< array.length;j++){

           }
       }


    }
}
