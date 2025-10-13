public class kxd {
    public boolean equals1(Object objec) {
        return true;
    }

    public static void den1() {
        kxd a = new kxd();
        kxd b = a;
        System.out.println(a == b);
        System.out.println(a.equals1(b));
    }

    public boolean equals2(Object objec) {
        return false;
    }

    public static void den2() {
        kxd a = new kxd();
        kxd b = new kxd();
        System.out.println(a == b);
        System.out.println(a.equals2(b));
    }

    public boolean equals3(Object objec) {
        return false;
    }

    public static void den3() {
        kxd a = new kxd();
        kxd b = a;
        System.out.println(a == b);
        System.out.println(a.equals3(b));
    }

    public boolean equals4(Object objec) {
        return true;
    }

    public static void den4() {
        kxd a = new kxd();
        kxd b = new kxd();
        System.out.println(a == b);
        System.out.println(a.equals4(b));
    }
}