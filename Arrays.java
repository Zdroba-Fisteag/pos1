public class Arrays {
    public static void scholar() {
        Student[] students = new Student[10];
        Student anna = new Student("Anna", 75, 170, 'w');
        students[0] = anna;
        Student tmp;
        tmp = students[0];
        if (tmp == anna) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}