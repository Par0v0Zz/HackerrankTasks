package Introduction;

import java.util.Scanner;

/**
 * Given an integer, , print its first  multiples.
 * Each multiple  (where ) should be printed on a new line in the form: N x i = result.
 */
public class JavaLoops1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int multiplier = scan.nextInt();
        scan.close();
        for (int i = 1; i <= 10; i++) {
            System.out.format("%d x %d = %d%n", multiplier, i , i * multiplier);
        }
    }
}
