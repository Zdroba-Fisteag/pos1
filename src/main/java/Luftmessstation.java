import java.time.Year;

public abstract class Luftmessstation extends Messstation {
    private double feinstaubGrenzWert;

    public Luftmessstation(String standort, double messWert, Year installationsJahr, double feinstaubGrenzWert) {
        super(standort, messWert, installationsJahr);
        this.feinstaubGrenzWert = feinstaubGrenzWert;
    }

    public double getFeinstaubGrenzWert() {
        return feinstaubGrenzWert;
    }

    public void setFeinstaubGrenzWert(double feinstaubGrenzWert) {
        this.feinstaubGrenzWert = feinstaubGrenzWert;
    }

    public double berechneUmweltIndex() {
        return getMessWert() / feinstaubGrenzWert;
    }

    public String getStationTyp() {
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return "Luftmessstation{" +
                "feinstaubGrenzWert=" + feinstaubGrenzWert +
                "} " + super.toString();
    }
}
