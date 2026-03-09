import java.time.Year;

public abstract class Messstation {
    private String standort;
    private Year installationsJahr;
    private double messWert;

    public Messstation(String standort, double messWert, Year installationsJahr) {
        this.standort = standort;
        this.messWert = messWert;
        this.installationsJahr = installationsJahr;
    }

    protected Messstation() {
    }

    public String getStandort() {
        return standort;
    }

    public void setStandort(String standort) {
        this.standort = standort;
    }

    public double getMessWert() {
        return messWert;
    }

    public void setMessWert(double messWert) {
        this.messWert = messWert;
    }

    public Year getInstallationsJahr() {
        return installationsJahr;
    }

    public void setInstallationsJahr(Year installationsJahr) {
        this.installationsJahr = installationsJahr;
    }

    public abstract double berechneUmweltIndex();

    public abstract String getStationTyp();

    public double compareTo(Messstation a) {
        return Double.compare(getMessWert(), a.getMessWert());
    }

    @Override
    public String toString() {
        return "Messstation{" +
                "standort='" + standort + '\'' +
                ", installationsJahr=" + installationsJahr +
                ", messWert=" + messWert +
                '}';
    }
}
