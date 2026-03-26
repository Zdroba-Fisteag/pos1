import java.util.Locale;

public class KeramikProbe extends Werkstoffprobe {
    public KeramikProbe(String id, String bez, double dichte, double masse) throws WersktoffException {
        super(id, bez, dichte, masse);
    }

    public double QualitaetsIndex() {
        return 2*getDichte();
    }

    @Override
    public String toString() {
        return String.format(Locale.ENGLISH, "KeramikProbe [%s, Volumen: %.2f, Materialwert: %.2f, Qualitätsindex: %.1f]",
                super.toString(), berechneVolumen(), berechneMaterialwert(), QualitaetsIndex());
    }
}
