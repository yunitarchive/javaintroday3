

public class PrimeChecker {

    private int number;




    public void inputNumber() {

        this.number = InputUser.getInt("Enter the number to check the Prime Number: ");
    }

    public boolean isPrime() {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;

    }



    public void exhibitPrimeChecker() {
        if (isPrime()) {
            System.out.println("The " + number + " is Prime.");
        } else {
            System.out.println("The " + number + " is Not Prime.");
        }
    }

}
