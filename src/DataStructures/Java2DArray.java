package DataStructures;

import java.util.Scanner;

/**
 *
 */
public class Java2DArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        in.close();
        System.out.println(largestHourglass(arr));
    }

    public static int largestHourglass (int [][] arr) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                int sum = sum(arr, row, col);
                max = Math.max(max, sum);
            }
        }
        return max;
    }

    private static int sum(int [][] arr, int r, int c) {
        int sum = arr[r][c] + arr[r][c+1] + arr[r][c+2]
                + arr[r+1][c+1] +
                arr[r+2][c] + arr[r+2][c+1] + arr[r+2][c+2];
        return sum;
    }
}
