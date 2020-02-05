package calculator;

import java.math.BigDecimal;

public class Calculator {
    private OperandStack values = new OperandStack();

    public BigDecimal getAccumulator() {
        return values.peek();
    }

    public void setAccumulator(BigDecimal value) {
        values.replaceTop(value);
    }

    public void enter() {
        values.push(getAccumulator());

    }

    public void drop() {
        values.pop();
    }

    public void execute(String op) {
        Operation operation = null;
        if ("+".equals(op)) {
            operation = new AddOperation();
        } else if ("-".equals(op)) {
            operation = new SubtractOperation();
        }

        operation.apply(values);
    }
}
