package io.github.javaGruIntensive;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
class CalculatorTest {
    int x = 20;
    int y = 10;
    @Test
    void add() {
        assertEquals(30, Calculator.add(x, y));
    }

    @Test
    void sub() {
        assertEquals(10, Calculator.sub(x, y));
    }

    @Test
    void div() {
        assertEquals(2, Calculator.div(x, y));
    }

    @Test
    void mul() {
        assertEquals(200, Calculator.mul(x, y));
    }
}