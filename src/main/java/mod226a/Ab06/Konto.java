package mod226a.Ab06;

public class Konto {

    public double Saldo;
    public double Zins;
    public double zinssatz;
    public Kunde Inhaber;

    public Konto(double zinssatz, Kunde inhaber)
    {
        this.zinssatz = zinssatz;
        this.Inhaber = inhaber;
    }

    public double einzahlen(double cashIn)
    {
       Saldo = Saldo+ cashIn;
       return Saldo;
    }

    public double verzinsen(double days)
    {
        if (Saldo > 50000)
            zinssatz = zinssatz / 2;
        else if (Saldo > 500000)
            zinssatz = 0;
        Zins = Saldo * zinssatz * days/365;
        return Zins;
    }

    public double getSaldo()
    {
        return Saldo;
    }
}
