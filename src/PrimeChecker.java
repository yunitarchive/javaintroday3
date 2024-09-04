import java.util.Scanner;

public class PrimeChecker {
//    Scanner scannerPrime = new Scanner(System.in);
//
//    System.out.print("Enter the name you want to check: ");
//    int number = scannerPrime.nextInt();
//
//    public PrimeChecker(int number) {
//        this.number = number;
//    }

    private int number;
    private Scanner scanner;

    public PrimeChecker() {
        this.scanner = new Scanner(System.in);
    }

    public void inputNumber() {
        System.out.print("Enter the number to check the Prime Number: ");
        this.number = scanner.nextInt();
    }

    public boolean isPrime() {
        return number % number == 1 && number % 1 == number;
    }

    public boolean isNotPrime() {
        return number % number != 1 &&  number % 1 != number;
    }

    public void exhibitPrimeChecker() {
        if (isPrime()) {
            System.out.println("The " + number + " is Prime.");
        } else {
            System.out.println("The " + number + " is Not Prime.");
        }
    }

}
