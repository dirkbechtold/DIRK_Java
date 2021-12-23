package Dirk2;

public class ArtikelMain {
    public static void main(String[] args) {

        Artikel articleOne = new Artikel();
        articleOne.setNummer(1);
        articleOne.setPreis(1.99);

        Artikel articleTwo = new Artikel();
        articleTwo.setNummer(2);
        articleTwo.setPreis(3.79);

        Artikel articleThree = new Artikel();
        articleThree.setNummer(3);
        articleThree.setPreis(4.99);

        Artikel articleFour = new Artikel();
        articleFour.setNummer(4);
        articleFour.setPreis(8.79);

        Artikel articleFive = new Artikel();
        articleFive.setNummer(5);
        articleFive.setPreis(12.99);

        //      Artikel artikel = new Artikel();
        //      System.out.println(artikel.nummer);  // Nummer ist in der Klasse Artikel auf "private" gesetzt, daher kann "nummer" hier nicht aufgerufen werden!!!

        System.out.print(articleOne.getNummer() + ": " + articleOne.getPreis());
        System.out.println();
        System.out.print(articleTwo.getNummer() + ": " + articleTwo.getPreis());
        System.out.println();
        System.out.print(articleThree.getNummer() + ": " + articleThree.getPreis());
        System.out.println();
        System.out.print(articleFour.getNummer() + ": " + articleFour.getPreis());
        System.out.println();
        System.out.println(articleFive.getNummer() + ": " + articleFive.getPreis());


        Auftrag auftragOne = new Auftrag(articleOne, 10);
        Auftrag auftragTwo = new Auftrag(articleTwo, 25);
        Auftrag auftragThree = new Auftrag(articleThree, 8);
        Auftrag auftragFour = new Auftrag(articleFour, 0);
        Auftrag auftragFive = new Auftrag(articleFive, 50);

        //System.out.println(auftragFive);

        RabattAuftrag rabattFive = new RabattAuftrag(articleFive, 5, 10);
        RabattAuftrag rabattFour = new RabattAuftrag(articleFour, 10, 5);

        Auftrag[] auftraege = {auftragOne, auftragTwo, auftragThree, rabattFour, rabattFive};

        double gesamtWert = getGesamtwert(auftraege);

        System.out.println(gesamtWert);


    }

    public static double getGesamtwert(Auftrag[] auftraege) {
        double sum = 0.0;
        for (int i = 0; i < auftraege.length; i++) {
            double wert = auftraege[i].getAuftragswert();
            sum = sum + wert;
        }
        return sum;
    }
}
