package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDemo {

    @Test
    public void Addition_test() {
        int a = 5, b = 8;
        assertEquals(13, (a + b));
    }

    @Test
    public void Subtraction_test() {
        int a = 5, b = 8;
        assertEquals(3, (b - a));
    }

    @Test
    public void Multiplication_test() {
        int a = 5, b = 8;
        assertEquals(40, (a * b));
    }

    @Test
    public void Division_test() {
        int a = 5, b = 8;
        assertEquals(1, (b / a));
    }

    @Test
    public void Modulo_test() {
        int a = 5, b = 8;
        assertEquals(3, (b % a));
    }
}
