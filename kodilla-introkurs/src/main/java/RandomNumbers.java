import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class RandomNumbers {
    public static final int RANGE = 31; // zakres losowania [0, 30]
    public static final int MAX_SUM = 5000;

    public Random random = new Random();

    public List<Integer> generateNumbers() {
        int sum = 0;
        List<Integer> numbers = new ArrayList<>();

        while (sum <= MAX_SUM) {
            int number = random.nextInt(RANGE);
            numbers.add(number);
            sum += number;
        }

        return numbers;
    }

    public int getMin(List<Integer> numbers) {
        int min = Integer.MAX_VALUE;

        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }

        return min;
    }

    public int getMax(List<Integer> numbers) {
        int max = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }

        return max;
    }


}
