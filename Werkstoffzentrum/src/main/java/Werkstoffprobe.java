import java.util.Locale;
import java.util.Objects;

public abstract class Werkstoffprobe implements Comparable<Werkstoffprobe> {
    private String id;
    private String bez;
    private double dichte;
    private double masse;

    public Werkstoffprobe(String id, String bez, double dichte, double masse) throws WersktoffException {
        setId(id);
        setBez(bez);
        setDichte(dichte);
        setMasse(masse);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) throws WersktoffException {
        if (id == null || id.isBlank()) throw new WersktoffException("Fehler: id ist null oder blank");
        this.id = id;
    }

    public String getBez() {
        return bez;
    }

    public void setBez(String bez) throws WersktoffException {
        if (bez == null || bez.isBlank()) throw new WersktoffException("Fehler: Bezeichnung ist null oder blank");
        this.bez = bez;
    }

    public double getDichte() {
        return dichte;
    }

    public void setDichte(double dichte) throws WersktoffException {
        if (dichte < 0) throw new WersktoffException("Was machst du denn?");
        this.dichte = dichte;
    }

    public double getMasse() {
        return masse;
    }

    public void setMasse(double masse) throws WersktoffException {
        if (masse < 0) throw new WersktoffException("Was machst du denn?");
        this.masse = masse;
    }

    public abstract double QualitaetsIndex();

    public double berechneVolumen() {
        return masse / dichte;
    }

    public double berechneMaterialwert() {
        return masse * dichte;
    }

    @Override
    public int compareTo(Werkstoffprobe o) {
        // return bez.compareTo(o.bez); -- nur nach einem Kriterium
        if (bez.compareTo(o.bez) == 0) return id.compareTo(o.id);
        else return bez.compareTo(o.bez);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Werkstoffprobe that = (Werkstoffprobe) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return String.format(Locale.ENGLISH, "Werkstoffprobe [ID=%s, Bezeichnung=%s, Dichte=%.2f g/cm3, Masse=%.1f kg]",
                id, bez, dichte, masse);
    }
}
