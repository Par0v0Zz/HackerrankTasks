package Strings;

import java.util.Scanner;

/**
 * Given a string , print Yes if it is a palindrome, print No otherwise.
 */
public class JavaStringReverse {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        sc.close();

        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(str.equals(reversed) ? "Yes" : "No");

    }
}
