public class square {
    public static void quadrat(int lim) {
        for (int ze = 1; ze <= lim; ze++) { // Zeilen
            for (int sp = 1; sp <= lim; sp++) { // Spalten
                if (ze == lim || sp == lim || ze == 1 || sp == 1) {
                    System.out.print("#");
                } else if (ze == sp) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
                // if (ze != sp) {
                // System.out.print(" ");
                // }
                // // else {
                // // System.out.print("#");
                // // }
            }
            System.out.println();
        }
    }
}
