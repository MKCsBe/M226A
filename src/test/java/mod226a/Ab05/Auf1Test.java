package mod226a.Ab05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Auf1Test {

    @BeforeEach
    void setUp() {
        String op1 = "Operator1";
        String op2 = "Operator2";
        String op = "Operator";
    }

    @Test
    void calc() {
        assertEquals(5, Auf1.calc(10,2,4));
        assertEquals(12, Auf1.calc(10,2,1));
        assertEquals(-8, Auf1.calc(10,2,2));
        assertEquals(20, Auf1.calc(10,2,3));
        assertEquals(0, Auf1.calc(10,2,5));
        assertEquals(0, Auf1.calc(10,2,6));
    }

}