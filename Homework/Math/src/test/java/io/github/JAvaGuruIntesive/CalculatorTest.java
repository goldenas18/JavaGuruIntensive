package io.github.JAvaGuruIntesive;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    int x = 20;
    int y = 10;
    public static int add(int x, int y) {
        return x + y;
    }
    public static int sub(int x, int y) {
        return x - y;
    }
    public static int div(int x, int y) {
        return x / y;
    }
    public static int mul(int x, int y) {
        return x * y;
    }



    @Test
    void add() {
        assertEquals(30, add(x, y));
    }
    @Test
    void sub() {
        assertEquals(10, sub(x, y));
    }
    @Test
    void div() {
        assertEquals(2, div(x, y));
    }
    @Test
    void mul() {
        assertEquals(200, mul(x, y));
    }
}