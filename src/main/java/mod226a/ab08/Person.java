package mod226a.ab08;

/**
 * Reptäsentation einer Person.
 */


public class Person {

    private String firstName;
    private String lastName;

    /**
     * Erstellen einer neuen Person mit den gegebenen Attributen.
     *
     * @param firstName Vorname.
     * @param lastName Nachname.
     */
    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * liefert den aktuellen Vornamen der Person.
     *
     * @return Vornamen
     */

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
