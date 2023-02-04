package day6;

import java.util.Arrays;
import java.util.Scanner;

public class Array_User {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Your Array Index:");
        int ArrayNumber=scanner.nextInt();

        int number[]=new int[ArrayNumber];
        System.out.println("Enter Your Array Number:");

        for(int i=0;i<number.length;i++){
            int data=scanner.nextInt();
            number[i]=data;
        }
        System.out.println(Arrays.toString(number));

    }
}
