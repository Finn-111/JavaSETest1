package javasetest1;

public class Q3 {
    public static void main(String[] args) {

        int num[] = { 23,24,12,78,62 };

        int largest = 0;

        for (int i = 0; i < num.length; i++) {
            if (num[i] > largest) {
                largest = num[i];
            }

        }
        System.out.println(" The largest array is " + largest);
    }
}

