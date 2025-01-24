//Q.1 Input a value from user, check if it is a Prime number or not using class method and Object


import java.util.Scanner;

class PrimeChecker {
    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

public class PrimeTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();

        PrimeChecker checker = new PrimeChecker();

        if (checker.isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

        in.close();
    }
}
