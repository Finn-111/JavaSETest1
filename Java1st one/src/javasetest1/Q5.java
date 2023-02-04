package javasetest1;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=30;

        int result = 50 ;

        System.out.println("What is the result when 30 is added by 20 ?");

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your result:");
        result=scanner.nextInt();


        switch (result) {
            case 10:
                System.out.println("It's the value of a.");
                break;

            case 20:
                System.out.println("It's the value of b.");
                break;

            case 30:
                System.out.println("It's the value of c.");
                break;

            case 50:
                System.out.println("Congratulations ! Your answer is right.");
                break;

            default:
                System.out.println("Your answer is wrong.");
        }

}
}
