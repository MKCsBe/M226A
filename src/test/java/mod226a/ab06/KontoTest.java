package mod226a.ab06;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KontoTest {

    Konto konto;

    @BeforeEach
    void setUp() {
        Kunde kunde = new Kunde("M","K",1);
         konto = new Konto(0.01, kunde);
         konto.einzahlen(200);
    }

    @Test
    void einzahlen() {
        assertEquals(400, konto.einzahlen(200));
        assertEquals(600, konto.einzahlen(200));
        assertEquals(800, konto.einzahlen(200));

    }

    @Test
    void verzinsen() {
        assertEquals(2,konto.verzinsen(365));
    }
}