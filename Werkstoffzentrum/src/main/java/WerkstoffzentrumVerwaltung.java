import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class WerkstoffzentrumVerwaltung {
    LinkedList<Werkstoffprobe> proben;

    public WerkstoffzentrumVerwaltung() {
        this.proben = new LinkedList<>();
    }

    public WerkstoffzentrumVerwaltung(LinkedList<Werkstoffprobe> proben) {
        this.proben = proben;
    }

    public boolean addProbe(Werkstoffprobe probe) {
        if (proben.contains(probe) || proben == null) return false;
        return proben.add(probe);
    }

    public boolean removeProbeById(String id) {
        if (proben.isEmpty() || id == null) return false;
        Iterator<Werkstoffprobe> iter = proben.iterator();
        while (iter.hasNext()) {
            Werkstoffprobe w = iter.next();
            if (w.getId().equals(id)) {
                iter.remove();
                return true;
            }
        }
        return false;
    }

    public int removeAllByTyp(String typName) throws WersktoffException {
        if (proben.isEmpty() || typName == null) throw new WersktoffException("Fehler: name ist null oder probe ist leer");
        Iterator<Werkstoffprobe> iter = proben.iterator();
        int counter = 0;
        while (iter.hasNext()) {
            Werkstoffprobe w = iter.next();
            if (w.getClass().getSimpleName().equals(typName)) {
                iter.remove();
                counter++;
            }
        }
        return counter;
    }

    public int removeAllMitIndexUnter(double grenzwert) throws WersktoffException {
        if (proben.isEmpty() || grenzwert < 0) throw new WersktoffException("Fehler: name ist null oder probe ist leer");
        Iterator<Werkstoffprobe> iter = proben.iterator();
        int counter = 0;
        while (iter.hasNext()) {
            Werkstoffprobe w = iter.next();
            if (w.QualitaetsIndex() < grenzwert) {
                iter.remove();
                counter++;
            }
        }
        return counter;
    }

    public Werkstoffprobe findByID(String ID) throws WersktoffException {
        if (ID == null) throw new WersktoffException("Fehler: null");
        for (Werkstoffprobe werkstoffprobe : proben) {
            if (werkstoffprobe.getId().equals(ID)) {
                return werkstoffprobe;
            }
        }
        throw new WersktoffException("Zur ID " + ID + " gibt es keine Werkstoffprobe!");
    }

    @Override
    public String toString() {
        String header = "--- Werkstoffzentrumsstatistik ---\n";
        String h2 = "Durchschnittlicher Qualitätsindex\n";
        final StringBuilder sb = new StringBuilder(header);
        sb.append("Gesamtanzahl Proben: ").append(proben.size()).append("\n");
        sb.append("KeramikProben: ").append(keramikProben().size()).append("\n");
        sb.append("-".repeat(header.length())).append("\n");
        sb.append(h2);
        sb.append("Keramik: ").append(durchschnittlicherQualitaetsIndexKeramiken()).append("\n");
        sb.append("-".repeat(header.length()));
        return sb.toString();
    }

    public void druckeStatistik() {
        System.out.println(this);
    }

    private double durchschnittlicherQualitaetsIndexKeramiken() {
        double sum = 0.0;
        int countKeramiken = 0;
        for (Werkstoffprobe werkstoffprobe : proben) {
            if (werkstoffprobe instanceof KeramikProbe) {
                // KeramikProbe keramikProbe = (KeramikProbe) werkstoffprobe;
                sum += werkstoffprobe.QualitaetsIndex();
                countKeramiken++;
            }
        }
        return countKeramiken > 0 ? sum / countKeramiken : 0;
    }

    private LinkedList<KeramikProbe> keramikProben() {
        LinkedList<KeramikProbe> keramikProbenListe = new LinkedList<KeramikProbe>();
        for (Werkstoffprobe werkstoffprobe : proben) {
            if (werkstoffprobe instanceof KeramikProbe) {
                keramikProbenListe.add((KeramikProbe) werkstoffprobe);
            }
        }
        return keramikProbenListe;
    }

    public void sortiereStandard() {
        proben.sort(null); // Sort in natural order using  null (if no comparator is to be given)
    }

    public void sortiereNachQualitaetsIndex() {
        proben.sort(new QualitaetsIndexComparator().reversed()); // .reversed() -> reverse order
    }
}
