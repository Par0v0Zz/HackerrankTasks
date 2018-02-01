package Introduction;

import java.util.Scanner;

/**
 * We use the integers , , and  to create the following series:

 You are given  queries in the form of , , and . For each query, print the series corresponding to the given
 , , and  values as a single line of  space-separated integers.
 */
public class JavaLoops2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();
            for (int j = 0; j < n; j++) {
                a += b * (int) Math.pow(2, j);
                System.out.print(a + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}
