package mod226a.objMastermin;

public class Mastermind {

    /**
     * Initialisiereung und deklarierung eines Obejkts der Klasse Play
     */

    static Play player = new Play();

    /**
     * Main methode die Play.game aufruft und das Spiel damit startet.
     * @param args
     */

    public static void main(String[] args) {
       player.game();
    }
}
