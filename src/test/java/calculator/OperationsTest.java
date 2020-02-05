package calculator;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class OperationsTest {
    private Calculator calculator;

    @Before
    public void createCalculatorWithTwoValues(){
        calculator = new Calculator();
        calculator.setAccumulator(new BigDecimal(40));
        calculator.enter();
        calculator.setAccumulator(new BigDecimal(20));
    }

    @Test
    public void testAddExecution(){
        calculator.execute("+");
        assertEquals(new BigDecimal(60), calculator.getAccumulator());
    }

    @Test
    public void testSubtractExecution(){
        calculator.execute("-");
        assertEquals(new BigDecimal(20), calculator.getAccumulator());
    }
}
