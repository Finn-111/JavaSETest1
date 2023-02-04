package day6;

public class LargestNumberInArray_eg {
    public static void main(String[] args) {
        //Largest Number in Array

        int num[] = { 2,4,3,5,7,1 };

        int largest = 0;

        for (int i = 0; i < num.length; i++) {
            if (num[i] > largest) {
                largest = num[i];
            }

        }
        System.out.println(" The largest array is " + largest);
    }
} //ctrl +alt +l

