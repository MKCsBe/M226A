package mod226a.ab06;

public class Kunde {

    public String Name;
    public String Vorname;
    public int Kundennummer;

    public Kunde(String name, String vorName, int kundennummer)
    {
        this.Name = name;
        this.Vorname = vorName;
        this.Kundennummer = kundennummer;
    }

    public String getKunde()
    {
        return Name;
    }
}
