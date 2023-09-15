package loops;

public class LoopsExercise2 {
    public static void main(String[] args) {
        // task 1
        int x = 10;
        while (x > 0) {
            System.out.println(x--);
        }
        System.out.println("We have lift off!");

        // task 2
        x = 10;
        while (x > 0) {
            System.out.println("x is " + x);
            x--;
        }

        // task 3
        int sum = 0;
        for (int i = 0; i < 10; sum += i++) {
            System.out.println("Sum is " + sum);
        }
    }
}
