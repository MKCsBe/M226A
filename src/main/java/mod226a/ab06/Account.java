package mod226a.ab06;

public class Account {


    // Antwort zu Aufgabe 5 a == b ist falsch sie verweisen auf unterschiedliche Orte, a.equals(b) stimmt.

    public static void main(String[] args) {

        Kunde eins = new Kunde("koeksal", "moritz", 1);
        Kunde zwei = new Kunde("f","f",2);

        Konto konto1 = new Konto(0.01, eins);
        Konto konto2 = new Konto(0.01, zwei);

        konto1.einzahlen(500.75);
        konto1.verzinsen(365);
        konto2.einzahlen(720.50);
        konto2.verzinsen(750);
        System.out.println("Saldo: " + konto2.getSaldo() + " Kunde: " + zwei.getKunde());
        konto2.einzahlen(20);
        System.out.println("Saldo: " + konto2.getSaldo() + " Kunde: " + zwei.getKunde());
    }
}
