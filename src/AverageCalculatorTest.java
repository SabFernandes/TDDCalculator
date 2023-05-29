import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AverageCalculatorTest {
    @Test
    public void testCalculateWithValidNumbers() {
        int[] numbers = {1, 2, 3, 4, 5};
        double expectedAverage = 3.0;

        double result = AverageCalculator.calculate(numbers);

        Assertions.assertEquals(expectedAverage, result);
    }

    @Test
    public void testCalculateWithEmptyArray() {
        int[] numbers = {};

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            AverageCalculator.calculate(numbers);
        });
    }

    @Test
    public void testCalculateWithNullArray() {
        int[] numbers = null;

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            AverageCalculator.calculate(numbers);
        });
    }
}
