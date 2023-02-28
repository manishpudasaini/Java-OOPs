package javaPractice;

import java.util.Arrays;
import java.util.Scanner;

public class StringToCharacterArray {
    public static void main(String[] args) {
        String str;
        char[] charArr ;
        charArr = new char[3];
        Scanner sc  = new Scanner(System.in);
        str = sc.nextLine();
        System.out.println(str);
        for(int i=0;i< charArr.length;i++){
            charArr[i]=str.charAt(i);
        }
        System.out.println(Arrays.toString(charArr));
//        System.out.println(Arrays.toString(str[1].toCharArray()));
//        char[] name=str[1].toCharArray();
//        System.out.println(name[0]+name[4]);

//        System.out.println(Arrays.toString("Manish".toCharArray())); //string to char array
//        System.out.println(Arrays.toString(str[1].split("")));


    }
}
