import java.math.BigInteger;

public final class Math {
    public static boolean isPrime(final int candidate) {
        //If greater than 1.
        if (candidate <= 1){
            return false;
        }
        //If candidate has any remaining numbers after dividing, return false.
        for (int i = 2; i <= candidate / 2; i++) {
            if (candidate % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean isPrime(final BigInteger candidate) {

        //check via BigInteger.isProbablePrime(certainty)
        if (!candidate.isProbablePrime(5))
            return false;

        //check if even
        BigInteger two = new BigInteger("2");
        if (!two.equals(candidate) && BigInteger.ZERO.equals(candidate.mod(two)))
            return false;

        //find divisor if any from 3 to 'number'
        for (BigInteger i = new BigInteger("3"); i.multiply(i).compareTo(candidate) < 1; i = i.add(two)) { //start from 3, 5, etc. the odd number, and look for a divisor if any
            if (BigInteger.ZERO.equals(candidate.mod(i))) //check if 'i' is divisor of 'number'
                return false;
        }
        return true;
    }
}
