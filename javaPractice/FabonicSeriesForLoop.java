package javaPractice;

import java.util.Arrays;
import java.util.Scanner;

public class FabonicSeriesForLoop {
    public static void main(String[] args) {
        int array[];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array::");
        int size=sc.nextInt();
        array = new int[size];
        array[0]=0;
        array[1]=1;

        for(int i=2;i< array.length;i++){
            array[i]=array[i-1]+array[i-2];
        }
        System.out.println("fabbonicc series = "+ Arrays.toString(array));
    }
}
