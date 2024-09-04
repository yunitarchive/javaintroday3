

public class SumNumber {

    public int getSumNumber() {

        int count = InputUser.getInt("How many numbers you want to sum?");

        int sum = 0;
        for (int i = 1; i <= count; i++) {

            int number = InputUser.getInt("Enter number " + i + ": ");
            sum += number;
        }

        System.out.println("The sum of the numbers is: " + sum);



        return sum;
    }
}