public class TDOC {
    public static String song() {
        String[] ftt = { "first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth",
                "eleventh", "twelfth" };
        String[] goodluck = {
                "A partridge in a pear tree.",
                "Two turtle doves and",
                "Three french hens",
                "Four calling birds",
                "Five golden rings",
                "Six geese a-laying",
                "Seven swans a-swimming",
                "Eight maids a-milking",
                "Nine ladies dancing",
                "Ten lords a-leaping",
                "Eleven pipers piping",
                "Twelve drummers drumming"
        };
        for (int i = 0; i <= ftt.length - 1; i++) {
            System.out.println("On the " + ftt[i] + " day of Christmas");
            System.out.println("My true love sent to me:");
            for (int j = i; j <= goodluck.length - 1; j++) {
                String strang = "";
                strang = strang + goodluck[j] + "\n";
                System.out.print(strang);
            }
            System.out.println();
        }
        return "Hello World";
    }
}