package day6;

import java.util.Scanner;

public class Even_Ex {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Number:");
        int a = scanner.nextInt();

        if(a%2==0)
        {
        System.out.println("The number is an even number.");
        }
        else {
            System.out.println("The number is an odd number.");
        }
}}
