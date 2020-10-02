package LectuteFive.Strategy;

import java.util.Arrays;

public class StrategyRun {
    public static void main(String[] args) {
        int arr[] = {5, 2, 1, 4, 9, 3, 11};
        Context context = new Context();
        context.setStrategy(new QuickSort());

        context.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
