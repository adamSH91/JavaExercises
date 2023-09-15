package EndOfDayChallenge;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        // Simple Fizz Buzz
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Fizz Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
        }

        System.out.println("----");

        // Extended fizz buzz
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = scan.nextInt();
        if (num < 0) {
            for (int i = 0; i >= num; i--) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("Fizz Buzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
            }
        } else {
            for (int i = 0; i <= num; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("Fizz Buzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
            }
        }
    }
}
