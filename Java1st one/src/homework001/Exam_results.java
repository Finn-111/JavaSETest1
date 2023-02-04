package homework001;

public class Exam_results {
    public static void main(String[] args) {

        int Mya = 40;
        int Eng = 40;
        int Maths = 60;

        if ((Mya >= 40) && (Eng >= 40) && (Maths >= 40)) {
            if (Mya >= 80 || Eng >= 80 || Maths >= 80) {
                System.out.println(" D ");
            } else {
                System.out.println(" You passed the exam. ");
            }
        } else {
            System.out.println(" You failed the exam. ");
        }
    }
}