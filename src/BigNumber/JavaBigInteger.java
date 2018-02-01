package BigNumber;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * In this problem, you have to add and multiply huge numbers!
 * These numbers are so big that you can't contain them in any ordinary data types like a long integer.

 Use the power of Java's BigInteger class and solve this problem.
 */
public class JavaBigInteger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger a = new BigInteger(scan.next());
        BigInteger b = new BigInteger(scan.next());
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}
