package javasetest1;

import java.util.Arrays;
import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {


        int ar[]={1,2,3,4,5,6};

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the position of the element you want to remove:");
        int position=scanner.nextInt();

        //int result = ar[]-position;
       // System.out.println(result);
        System.out.println(Arrays.toString(ar));

    }
}
