import java.util.List;

public class RandomNumbersTry {

        public static void TryRandomNumbersMethod() {
            RandomNumbers randomNumbers = new RandomNumbers();
            List<Integer> numbers = randomNumbers.generateNumbers();

            System.out.println("Numbers: ");
            for (int number : numbers) {
                System.out.print(number + " ");
            }
            System.out.println();

            System.out.println("Min: " + randomNumbers.getMin(numbers));
            System.out.println("Max: " + randomNumbers.getMax(numbers));
        }

}
