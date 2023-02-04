package homework001;

import java.util.Arrays;
import java.util.Scanner;

import java.util.Scanner;
public class FibonaccinumberHw_001{
    public static void main(String[] args)
        {

         //0,1,2,3,4,5,6;
         //0,1,1,2,3,5,8;

        int num1=0, num2=1;
        System.out.println(num1);
        System.out.println(num2);

        int num3;

        for(int i=2;i<7;i++){
            num3=num1+num2;
        System.out.println(num3);
        num1=num2;
        num2=num3;
    }
}}

  //  String name[][] = {{"*****,*****,*****,*****,*****" }};

  //      for (int i = 0; i < name.length; i++) {
   //     for (int j = 0; j < name[i].length; j++) {
   //     System.out.print(name[i][j]+"\n");
    //    }
    //    }