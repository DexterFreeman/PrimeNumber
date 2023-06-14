import org.junit.*;

import java.math.BigInteger;

import static org.junit.Assert.*;
public class UnitTests {

    @Test
    public void nonPrimeNumbersReturnsFalse(){
        assertEquals("1 Results in false", false, Math.isPrime(0));
        assertEquals("10 Results in false", false, Math.isPrime(10));
        assertEquals("22 Results in false", false, Math.isPrime(22));
        assertEquals("58 Results in false", false, Math.isPrime(50));
        assertEquals("122 Results in false", false, Math.isPrime(122));

    }
    @Test
    public void primeNumbersReturnsTrue(){
        assertEquals("11 Results in true", true, Math.isPrime(11));
        assertEquals("23 Results in true", true, Math.isPrime(23));
        assertEquals("643 Results in true", true, Math.isPrime(643));
        assertEquals("17 Results in true", true, Math.isPrime(17));
        assertEquals("233 Results in true", true, Math.isPrime(233));
    }
    @Test
    public void negativeNumbersReturnFalse(){
        assertEquals("-100 Results in false", false, Math.isPrime(-100));
        assertEquals("-23 Results in false", false, Math.isPrime(-23));
    }

    @Test
    public void testingLongInput(){
        BigInteger bInt = new BigInteger("4000006800001");
        BigInteger bIntTwo = new BigInteger("100000000");
        assertEquals("12345678912345L Results in false", true, Math.isPrime(bInt));
        assertEquals("Large number works correctly", false, bIntTwo.isProbablePrime(1));
    }
}
