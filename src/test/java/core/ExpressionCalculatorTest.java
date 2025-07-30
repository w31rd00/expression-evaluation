package core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpressionCalculatorTest {

    @Test
    void calculate() {
        String expr = "(111+((2+3)*(4*5)))";
        ExpressionCalculator calc = new ExpressionCalculator();
        assertEquals(211, calc.calculate(expr));
    }
}