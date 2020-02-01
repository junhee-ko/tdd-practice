import java.math.BigDecimal;

public abstract class BinaryOperation implements Operation{

    @Override
    public void apply(OperandStack values) {
        BigDecimal value01 = values.peek();
        values.pop();
        BigDecimal value02 = values.peek();
        values.replaceTop(calculate(value01, value02));
    }

    protected abstract BigDecimal calculate(BigDecimal value01,BigDecimal value02);
}
