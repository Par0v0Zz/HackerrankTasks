package Strings;

import java.util.Scanner;

/**
 *
 */
public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        s = s.trim();

        if (s.length() == 0) {
            System.out.print(0);
            return;
        }

        String[] tokens = s.split("[ !,?._'@]+");
            System.out.println(tokens.length);
            for (String t : tokens) {
                System.out.println(t);
            }
    }
}
