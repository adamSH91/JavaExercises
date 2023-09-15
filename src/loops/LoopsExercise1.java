package loops;

public class LoopsExercise1 {
    public static void main(String[] args) {
        // while loop

        int i = 0;

        while (i < 10) {
            System.out.println("i = " + i);
            i++;
        }

        System.out.println("------");

        // do while
        i = 0;

        do {
            System.out.println("i = " + i);
            i++;
        } while (i < 10);

        System.out.println("------");

        // i and j example

        // while loop

        i = 0;
        int j = 10;

        while (i < j) {
            System.out.println("i = " + i);
            System.out.println("j = " + j);
            i++;
            j--;
        }

        System.out.println("------");

        // do while

        i = 0;
        j = 10;

        do {
            System.out.println("i = " + i);
            System.out.println("j = " + j);
            i++;
            j--;
        } while (i < j);

        System.out.println("------");

        // sum example

        // while loop

        i = 0;
        int sum = 0;

        while (i < 10) {
            sum += i;
            i++;
        }

        // do while

        i = 0;
        sum = 0;

        do {
            sum += i;
            i++;
        } while (i < 10);
    }
}
