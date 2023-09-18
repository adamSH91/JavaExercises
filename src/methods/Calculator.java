package methods;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int numberOne = scan.nextInt();
        System.out.println("Please enter another number:");
        int numberTwo = scan.nextInt();
        System.out.println("Please enter an operation:");
        char operation = scan.next().charAt(0);

        System.out.println("The result is " + calculator(numberOne, numberTwo, operation));
    }
    private static double calculator(int numberOne, int numberTwo, char operation) {
        double result = 0.0;
        switch (operation) {
            case '-':
                result = numberOne - numberTwo;
                break;
            case '+':
                result = numberOne + numberTwo;
                break;
            case '/':
                result = (double) numberOne / numberTwo;
                break;
            case '*':
                result = numberOne * numberTwo;
                break;
            case '%':
                result = numberOne % numberTwo;
                break;
            case '^':
                result = Math.pow(numberOne, numberTwo);
                break;
            default:
                break;
        }

        return result;
    }
}
