package exercise3;

import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number");
        int num1 = scan.nextInt();
        System.out.println("Please enter another number");
        int num2 = scan.nextInt();
        double result;

        System.out.println("Please choose an operator from +,-,/,*");
        String operator = scan.next();

        switch (operator) {
            case "+":
                result = num1 + num2;
                System.out.println(result);
                break;
            case "-":
                result = num1 - num2;
                System.out.println(result);
                break;
            case "/":
                result = (double) num1 / num2;
                System.out.println(result);
                break;
            case "*":
                result = num1 * num2;
                System.out.println(result);
                break;
            default:
                System.out.println("Not a valid operator");
                break;
        }
    }
}
