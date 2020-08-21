package mod226a.Ab08;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    private Person person;

    @BeforeEach
    void setUp() {
        person = new Person("Mor","itz");
    }

    @Test
    void getFirstName() {
        assertEquals("Mor",person.getFirstName());
    }

    @Test
    void getLastName() {
        assertEquals("itz",person.getLastName());
    }
}