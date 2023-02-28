package javaPractice;

import java.util.Scanner;

public class ArrayExample {


    public char[] f(char[] a,int start, int len){
        char[] output = new char[len];
      if(len>a.length) {
          return null;
      }
      else{
          int count=0;
          for(int i=start;i<start+len;i++){
              if(i>=a.length){
                  return null;
              }else{
                  output[count++]=a[i];
              }
          }
      }
        return output;

    }
    public static void main(String[] args) {
        char[] array={'a','b','c'};
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the start value::");
        int start =sc.nextInt();
        System.out.println("Enter the length value::");
        int len = sc.nextInt();

        ArrayExample ae1 = new ArrayExample();
        System.out.println(ae1.f(array,start,len));
    }
}
