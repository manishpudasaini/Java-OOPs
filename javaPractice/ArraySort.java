package javaPractice;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        int[] array;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array::");
        int size = sc.nextInt();

        array = new int[size];

        System.out.println("Enter the element of an array::");
        for(int i=0;i< size;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Array element are = "+ Arrays.toString(array));

        //sorting the array element
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                int temp=0;
                if(array[j] < array[i]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
            System.out.println(array[i]);
        }
    }
}
