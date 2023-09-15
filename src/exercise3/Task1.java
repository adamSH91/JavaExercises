package exercise3;

import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Comparing two numbers
        System.out.println("Please enter a number:");
        int num1 = scan.nextInt();
        System.out.println("Please enter another number");
        int num2 = scan.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " is bigger");
        } else if (num2 > num1) {
            System.out.println(num2 + " is bigger");
        } else {
            System.out.println("Both numbers are the same");
        }

        // Even or odd
        System.out.println("Please enter another number");
        int num3 = scan.nextInt();

        if (num3 % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }

        // Traffic light
        System.out.println("Please enter a traffic light color in text:");
        String trafficLightColor = scan.next().toLowerCase();

        if (trafficLightColor.equals("red")) {
            System.out.println("Stop");
        } else if (trafficLightColor.equals("yellow")) {
            System.out.println("Warning");
        } else {
            System.out.println("Go");
        }
    }
}
