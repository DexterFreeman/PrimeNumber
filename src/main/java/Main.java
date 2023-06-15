import java.math.BigInteger;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);

    public static void primeNumberApplication(){
        System.out.println();
        System.out.println("Input a number to see if it is a prime number:");
        System.out.println("Or type quit to close the application.");
        String userInput = scanner.next();
        //To lower case so that the user input on "quit" isn't case sensitive.
        switch (userInput.toLowerCase(Locale.ROOT)){
            case "quit":
                System.out.println("Thank you for using the application.");
                break;
            default:
                try{
                    if (userInput.length() >= 10){
                        BigInteger strToBigInt = new BigInteger(userInput);
                        System.out.println(Math.isPrime(strToBigInt));
                    }
                    else {
                        int userInputToInteger = Integer.parseInt(userInput);
                        System.out.println(Math.isPrime(userInputToInteger));
                    }
                }
                catch (Exception e){
                    System.out.println("Error; input was not valid, make sure the input is either a number or quit");
                }
                primeNumberApplication();
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the prime number application! :)");
        primeNumberApplication();
    }
}
