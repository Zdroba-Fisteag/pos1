public class Main {
    public static void main(String[] args) {
        try {
            KeramikProbe keramikProbe = new KeramikProbe("K-110-H", "Aluminiumoxid", 3.9, 6.2);
            System.out.println(keramikProbe);
            WerkstoffzentrumVerwaltung werkstoffzentrumVerwaltung = new WerkstoffzentrumVerwaltung();
            werkstoffzentrumVerwaltung.addProbe(keramikProbe);
            werkstoffzentrumVerwaltung.druckeStatistik();
        } catch (WersktoffException e) {
            System.out.println("Erwartete Exception: " + e.getMessage());
        }
    }
}
