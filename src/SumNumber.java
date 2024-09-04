import java.util.Scanner;

public class SumNumber {

    public int getSumNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many numbers you want to sum: ");
        int count = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= count; i++) {
            System.out.print("Enter number " + i + ": ");
            int number = scanner.nextInt();
            sum += number;
        }

        System.out.println("The sum of the numbers is: " + sum);



        return sum;
    }
}