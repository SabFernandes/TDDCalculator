public class AverageCalculator {
    public static double calculate(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("A lista de números não pode ser vazia ou nula");
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        return (double) sum / numbers.length;
    }
}
