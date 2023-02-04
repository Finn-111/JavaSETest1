package homework001;

public class ArrayHW {
    public static void main(String[] args) {
        int ar[][] = { {1, 2, 3, 4, 5},
                       {3, 4, 2},
                       {2, 6, 6, 2},
                       {6, 7, 9, 3, 5},
                       {7, 4, 3, 9}
                                        };

        for (int i=0; i<ar.length; i++) {
            for (int j = 0; j<ar[i].length; j++){
                System.out.print(ar[i][j]+"\t");
            }{
                System.out.println("");
            }
    }
}}
