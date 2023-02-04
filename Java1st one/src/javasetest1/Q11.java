package javasetest1;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {

        int a[]=new int [5];

        a[0]=1;
        a[1]=2;
        a[2]=3;
        a[3]=4;
        a[4]=5;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Array Element:");
        int value=scanner.nextInt();

        Scanner scn=new Scanner(System.in);
        System.out.println("Enter Your Value:");
        int value1=scn.nextInt();

        int result1=value-value1;

        System.out.println(result1);




    }
}
