package BigNumber;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * A prime number is a natural number greater than  whose only positive divisors are  and itself.
 * For example, the first six prime numbers are , , , , , and .

 Given a large integer, , use the Java BigInteger class' isProbablePrime method to determine and print
 whether it's prime or not prime.
 */
public class JavaPrimalityTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger n = scan.nextBigInteger();
        scan.close();
        System.out.println(n.isProbablePrime(1) ? "prime" : "not prime");
    }
}
