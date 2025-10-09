public class square {
    public static void quadrat(int r) {
        for (int i = 1; i <= r; i++) {  // Zeilen
            for (int j = 1; j <= r; j++) {   // Spalten
                if (i != j) {
                    System.out.print("");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
}
