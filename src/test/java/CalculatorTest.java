import org.example.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator calculatorTest = new Calculator();

    @Test
    void toSquare() {
        assertEquals(4, calculatorTest.toSquare(2));
    }
    @Test
    void additional() {
        assertEquals(3, calculatorTest.add(1, 2));
    }

    @Test
    void division() {
        assertEquals(3, calculatorTest.div(6, 2));
    }

    @Test
    void multiplication() {
        assertEquals(6, calculatorTest.multiply(3, 2));
    }

    @Test
    void subtract() {
        assertEquals(2, calculatorTest.sub(5, 3));
    }

}
