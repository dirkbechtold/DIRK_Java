package Dirk2;

public class Auftrag {

    private Artikel artikel; //Speichert bestellten Artikel
    private int menge; //Speicher bestellte Menge

    public Auftrag(Artikel artikel, int menge) {
        this.artikel = artikel;
        this.menge = menge;
    }

    public Artikel getArtikel() {
        return artikel;
    }

    public void setArtikel(Artikel artikel) {
        this.artikel = artikel;
    }

    public int getMenge() {
        return menge;
    }

    public void setMenge(int menge) {
        this.menge = menge;
    }

    public double getAuftragswert() {
        return this.artikel.getPreis() * this.menge;
    }



    public String toString(){
        return  artikel + " Menge " + menge;
    }


}
