package DataStructures;

import java.util.Scanner;

/**
 *
 */
public class Java1DArrayPart2 {
    public static boolean canWin(int leap, int[] game, int n) {
        if (n < 0 || game[n] == 1) {
            return false;
        } else if (n + 1 >= game.length || n + leap >= game.length) {
            return true;
        }

        game[n] = 1;

        return canWin(leap, game, n + leap) ||
                canWin(leap, game, n + 1) ||
                canWin(leap, game, n - 1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game, 0)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
