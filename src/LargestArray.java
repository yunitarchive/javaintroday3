public class LargestArray {

    public void findLargest() {
        int count = InputUser.getInt("Enter how many numbers you want to know the largest: ");


        if (count < 1) {
            System.out.println("You need to enter at least one number.");
            return;
        }

        int[] numbers = InputUser.getIntArray("Enter the numbers:", count);


        int largest = numbers[0];


        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("The largest number is: " + largest);
    }
}
