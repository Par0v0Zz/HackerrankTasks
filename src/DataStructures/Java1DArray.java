package DataStructures;

import java.util.Scanner;

/**
 * The code in your editor does the following:

 Reads an integer from stdin and saves it to a variable, , denoting some number of integers.
 Reads  integers corresponding to  from stdin and saves each integer  to a variable, .
 Attempts to print each element of an array of integers named .
 Write the following code in the unlocked portion of your editor:

 Create an array, , capable of holding  integers.
 Modify the code in the loop so that it saves each sequential value to its corresponding
 location in the array. For example, the first value must be stored in , the second value must be stored in , and so on.
 */
public class Java1DArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] a = new int[n];
        for (int i = 0 ; i < n; i++) {
            a[i] = scan.nextInt();
        }
        scan.close();

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
