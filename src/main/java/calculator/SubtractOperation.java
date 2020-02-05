package calculator;

import java.math.BigDecimal;

public class SubtractOperation extends BinaryOperation{

    @Override
    protected BigDecimal calculate(BigDecimal value01, BigDecimal value02) {
        return value02.subtract(value01);
    }
}
