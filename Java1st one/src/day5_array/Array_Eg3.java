package day5_array;

import java.util.Arrays;

public class Array_Eg3 {
    public static void main(String[] args) {
       //for looping
        int a[]={1,2,3,4,5,6,7,8,9,10};


        for (int i : a)
        {
            System.out.println(i);}{
            System.out.println("\n");
        }

                for(int i=0;i<a.length;i++){
                    System.out.println(a[i]);
                }{
            System.out.println("\n");}

                // back to front
        int b[]={1,2,3,4,5,6,7,8,9,10};
                for( int c=b.length-1;c>=0;c--){
                    System.out.println(b[c]);
                }     //Column //Index
                int ar[][]={{1,2,3,4},
                            {2,3,4,5},
                            {3,4,5},
                            {2,4,1,4}};
            System.out.println(ar[1][1]);
    }
}
