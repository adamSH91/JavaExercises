package conditionals;

public class ConditionalsExercise {
    public static void main(String[] args) {
        // Task 1
        /*
        int x = 3, y= 5;
        if (x >= 0) {
            if (y < x) {
                System.out.println("y is less than x");
            } else if (y > x){
                System.out.println("y is greater than x");
            } else {
                System.out.println("y and x are the same");
            }
        } else {
            System.out.println("x is negative");
        }
         */

        /*
        // Task 2
        int x = 7;
        if (x == 0) {
            System.out.println("x is zero");
        } else {
            System.out.println("x is not zero");
        }
         */

        // Task 3
        int x = 15, y = 24;
        if ( x % 2 == 0 && y % 2 == 0) {
            System.out.println("x and y are even numbers");
        } else if (x % 2 != 0 && y % 2 == 0) {
            System.out.println("x is odd and y is even");
        } else if (x % 2 == 0 && y % 2 != 0) {
            System.out.println("x is even and y is odd");
        } else {
            System.out.println("x and y are odd numbers");
        }
    }
}
