public class Main {
    public static void main(String[] args) {
        //No. 1
        SumNumber oneAttemptSum = new SumNumber();
        int resSumNumber = oneAttemptSum .getSumNumber();
        System.out.println("The result from SumNumber is: " + resSumNumber);

        // No.2
        PrimeChecker oneAttemptCheck = new PrimeChecker();
        oneAttemptCheck.inputNumber();
        oneAttemptCheck.exhibitPrimeChecker();
// No.3
        LargestArray findOne = new LargestArray();
        findOne.findLargest();
        // No.10
        SmallestArray find2small = new SmallestArray();
        find2small.findSmallestAndSecondSmallest();
    }
}
