public class Main {
    public static void main(String[] args) {
        System.out.println("Java is doing its job");
        // TDOC first = new TDOC();
        // System.out.println(first.song());
        square quad = new square();
        quad.quadrat(20);
        // fizzbuzz();
        kxd fx = new kxd();
        fx.den1();
        System.out.println("----");
        fx.den2();
        System.out.println("----");
        fx.den3();
        System.out.println("----");
        fx.den4(); // Ik, very repetitive
    }

    public static void fizzbuzz() {
        for (int i = 1; true; i++) {
            String printString = "";
            if (i % 3 == 0) {
                printString = printString + "Fizz";
                System.out.println(printString);
            }
            if (i % 5 == 0) {
                printString = printString + "Buzz";
                System.out.println(printString);
            }
            if (i % 7 == 0) {
                printString = printString + "Whizz";
                System.out.println(printString);
            }
            if (i % 11 == 0) {
                printString = printString + "Bang";
                System.out.println(printString);
            }
            if (printString.isEmpty()) {
                System.out.println(i);
            }
            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0 && i % 11 == 0) {
                break;
            }
        }
    }
}