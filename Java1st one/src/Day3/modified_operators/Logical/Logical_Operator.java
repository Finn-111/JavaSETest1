package Day3.modified_operators.Logical;

public class Logical_Operator {
    public static void main(String[] args) {
        int a=12;
        int b=23;
        int c=34;

        System.out.println(a<b&&a>c);
        System.out.println(a<b||a>c);
        System.out.println(!(a<b||a>c));
    }
}
