package Dirk2;

public class Artikel {
    private int nummer;
    private double preis;


    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public String toString(){
        return "Preis " + preis;}



}
