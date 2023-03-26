package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
//        1234
        int fourth = number % 10;
        int third = (number % 100 - fourth) / 10;
        int second = (number % 1000 - third * 10 - fourth) / 100;
        int first = number / 1000;

        int sumOfDigits = first + second + third + fourth;
        System.out.println(sumOfDigits);
    }
}
