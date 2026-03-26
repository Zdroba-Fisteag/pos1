import java.util.Comparator;

public class QualitaetsIndexComparator implements Comparator<Werkstoffprobe> {

    @Override
    public int compare(Werkstoffprobe o1, Werkstoffprobe o2) {
        return Double.compare(o1.QualitaetsIndex(), o2.QualitaetsIndex());
    }
}
