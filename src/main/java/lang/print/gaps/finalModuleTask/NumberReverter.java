package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int third = number % 10;
        int second = (number % 100 - third) / 10;
        int first = number / 100;
        int reverted = third * 100 + second * 10 + first;

        System.out.println(reverted);
    }
}
