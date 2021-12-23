package Dirk2;

public class RabattAuftrag extends Auftrag {

    private double rabattInProzent;

    public RabattAuftrag(Artikel artikel, int menge, double rabattInProzent) {
        super(artikel, menge);
        this.rabattInProzent = rabattInProzent;
    }

    public double getRabattInProzent() {
        return getRabattInProzent();
    }

    public void setRabattInProzent(double rabattInProzent) {
        this.rabattInProzent = rabattInProzent;
    }
}
