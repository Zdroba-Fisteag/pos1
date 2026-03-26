public class MetallProbe {
    public double zugfestigkeit;
    public double korrosionsWert;

    public MetallProbe(double zugfestigkeit, double korrosionsWert) {
        this.zugfestigkeit = zugfestigkeit;
        this.korrosionsWert = korrosionsWert;
    }

    public double getZugfestigkeit() {
        return zugfestigkeit;
    }

    public void setZugfestigkeit(double zugfestigkeit) {
        this.zugfestigkeit = zugfestigkeit;
    }

    public double getKorrosionsWert() {
        return korrosionsWert;
    }

    public void setKorrosionsWert(double korrosionsWert) {
        this.korrosionsWert = korrosionsWert;
    }

    public double berechneQualitaetsIndex() {
        return zugfestigkeit / korrosionsWert + 1;
    }

    @Override
    public String toString() {
        return "MetallProbe{" +
                "zugfestigkeit=" + zugfestigkeit +
                ", korrosionsWert=" + korrosionsWert +
                '}';
    }
}
