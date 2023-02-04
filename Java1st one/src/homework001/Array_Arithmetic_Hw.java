package homework001;

import java.util.Scanner;

public class Array_Arithmetic_Hw {
    public static void main(String[] args) {

        int number1,number2,result;
        String num1="operator";

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your first number:");
        number1=scanner.nextInt();

        System.out.println("Enter your second number:");
        number2=scanner.nextInt();

        System.out.println("Enter your operator:");
        num1=scanner.next();

        switch(num1){

            case"+":

                System.out.println("The result is " );
                result=number1+number2;
                System.out.println(result);
                break;

            case"-":
                    System.out.println("The result is");
                    result=number1-number2;
                    System.out.println(result);
                    break;

            case"*":
                        System.out.println("The result is");
                        result=number1*number2;
                        System.out.println(result);
                        break;

            case"/":
                            System.out.println("The result is");
                        result=number1/number2;
                            System.out.println(result);
                            break;

            case"%":

                result=number1%number2;
                if(result==0){
                    System.out.println("The module is 0.");
                }else{
                    System.out.print("The result is\t");
                    System.out.println(result);
                }
            default:
                System.out.println("There is no number.");
       }
}}