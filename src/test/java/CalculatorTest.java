import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void createCalculator(){
        calculator = new Calculator();
    }

    @Test
    public void testNewCalculatorHasAnAccumulatorOfZero() {
        assertEquals(BigDecimal.ZERO, calculator.getAccumulator());
    }

    @Test
    public void testSettingAccumulatorValue(){
        BigDecimal value = new BigDecimal(23);
        calculator.setAccumulator(value);
        assertEquals(value, calculator.getAccumulator());
    }

    @Test
    public void testEnteringAndDroppingValues(){
        BigDecimal value1 = new BigDecimal(1);
        BigDecimal value2 = new BigDecimal(2);
        BigDecimal value3 = new BigDecimal(3);

        calculator.setAccumulator(value1);
        calculator.enter();

        calculator.setAccumulator(value2);
        calculator.enter();

        calculator.setAccumulator(value3);

        assertEquals(value3, calculator.getAccumulator());

        calculator.drop();
        assertEquals(value2, calculator.getAccumulator());

        calculator.drop();
        assertEquals(value1, calculator.getAccumulator());
    }
}
