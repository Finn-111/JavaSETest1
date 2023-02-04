package day8;

public class M3 {

    static String name(String firstname,String lastname){
        return firstname+"  "+lastname;
    }
   static int sum(){
        int a = 45;
        int b=1;
        int c=a+b;
        return c;
    }
   static void sum1(){
        int a = 1;
        int b=9;
        int c=a+b;
       System.out.println(c);
    }

    public static void main(String[] args) {
        System.out.println(sum());
        sum1();
        System.out.println(name("Mg Kg", "Kg")); //
    }
}
