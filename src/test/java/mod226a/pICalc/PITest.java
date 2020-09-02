package mod226a.pICalc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PITest {

    @Test
    void calculate() {
        assertEquals(Math.PI,PI.calculate());
    }
}