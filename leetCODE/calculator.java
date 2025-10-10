import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        double num1 ;
        double num2 ;
        char operator ;
        double result =0 ;
        boolean valid = true;

        System.out.print("enter the first number: ");
        num1 = sc.nextInt();

        System.out.print("enter an operator: ");
        operator = sc.next().charAt(0);

        System.out.print("enter the second number: ");
        num2 = sc.nextInt();

        switch(operator){
            case '+' -> result = num1+num2;
            case '-' -> result = num1-num2;
            case '*' -> result = num1*num2;
            case '/' -> {
                if (num2==0){
                    System.out.println("cannot divide by zero");
                    valid = false;
                }
                else{
                    result = num1/num2;
                }
            }
            default -> {
                System.out.println("invalid operator");
                valid = false;
            }
        }

        if(valid){
            System.out.println(result);
        }

        sc.close();
    }
}