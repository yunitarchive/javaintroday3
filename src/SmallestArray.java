public class SmallestArray {

    public void findSmallestAndSecondSmallest() {
        int count = InputUser.getInt("Enter how many numbers you want to order: ");

        int[] numbers = InputUser.getIntArray("Enter the numbers:", count);


        int smallest, secondSmallest;

        if (numbers[0] < numbers[1]) {
            smallest = numbers[0];
            secondSmallest = numbers[1];
        } else {
            smallest = numbers[1];
            secondSmallest = numbers[0];
        }


        for (int i = 2; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                secondSmallest = smallest;
                smallest = numbers[i];
            } else if (numbers[i] < secondSmallest && numbers[i] != smallest) {
                secondSmallest = numbers[i];
            }
        }



            System.out.println("The smallest number is: " + smallest);
            System.out.println("The second smallest number is: " + secondSmallest);

    }
}
