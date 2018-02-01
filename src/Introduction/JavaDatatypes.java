package Introduction;

import java.util.Scanner;

/**
 * Java has 8 primitive data types; char, boolean, byte, short, int, long, float, and double.
 * For this exercise, we'll work with the primitives used to hold integer values (byte, short, int, and long):

 A byte is an 8-bit signed integer.
 A short is a 16-bit signed integer.
 An int is a 32-bit signed integer.
 A long is a 64-bit signed integer.
 Given an input integer, you must determine which primitive data types are capable of properly storing that input.

 To get you started, a portion of the solution is provided for you in the editor.
 */
public class JavaDatatypes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            try {
                long x = scan.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }
            } catch (Exception e) {
                System.out.println(scan.next() + " can't be fitted anywhere.");
            }
        }
        scan.close();
    }
}
