package day7_oopbasic;

public class External {
    int a=1;

    public static void main(String[] args) {


        System.out.println(Example_1.c);
        System.out.println(Example_1.b);


        External obj=new External();
        System.out.println(obj.a);
        System.out.println(new External().a);
    }
}
