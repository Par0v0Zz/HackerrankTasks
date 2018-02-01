package Introduction;

import java.util.Scanner;

/**
 * The challenge here is to read  lines of input until you reach EOF, then number and print all  lines of content.
 */
public class JavaEndOfFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 1;
        while (scan.hasNextLine()) {
            System.out.println(i + " " + scan.nextLine());
            i++;
        }
        scan.close();
    }
}
