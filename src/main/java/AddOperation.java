import java.math.BigDecimal;

public class AddOperation extends BinaryOperation {

    @Override
    protected BigDecimal calculate(BigDecimal value01, BigDecimal value02) {
        return value01.add(value02);
    }
}
