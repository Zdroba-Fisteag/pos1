public class Student {
    private String name;
    private double kg;
    private int cm;
    private char gender;
    public static double x;
    private int werk;
    
    public void NewPers () {
        Student S1 = new Student("Franz Maier", 180, 62, 'm');
    }
    
    //setter für name
    public void setName(String name) {
        if (name.length() < 3 || name.length() > 50) {
            throw new IllegalArgumentException("Was das?");
        }
        this.name = name;
    }
    public int work (String t, int a) {
        return a * 4;
    }
    // Try this yourself
    /*public double bmi() {
        this.kg = kg;
        this.cm = cm;
        return kg/((cm*cm)*(100*100));
    }*/
    public void setKg (double kilogramm) {
        if (kilogramm < 2 || kilogramm > 635) {
            throw new IllegalArgumentException("Was du?");
        }
        this.kg = kilogramm;
    }
    public void setCm (int cm) {
        if (cm < 50 || cm > 250) {
            throw new IllegalArgumentException("Wie du?");
        }
        this.cm = cm;
    }
    public void setGender (char gen) {
        if (gen != 'm' && gen != 'w') {
            throw new IllegalArgumentException("Was du geni?");
        }
        this.gender = gen;
    }
    //Constructor
    public Student (String name, double kg, int cm, char gender) {
        this.setName(name);
        this.setKg(kg);
        this.setCm(cm);
        this.setGender(gender);
    }
    public double bmi() {
        x = this.kg/((this.cm/100.0)*(this.cm/100.0));
        return x;
    }
    public String mannOderFrau () {
        if (this.gender == 'm') {
            return "männlich";
        } else if (this.gender == 'w') {
            return "weiblich";
        } else {
            return "N/A";
        }
    }
    public String printStudent() {
        return "Name: " + this.name + " (" + this.mannOderFrau() + ")";
    }
    public String fatOrNot() { //Checkt, ob du übergewichtig bist oder nicht
        if(this.gender == 'w') {
            if (bmi() < 19) {
                return "Du bist untergewichtig!!!";
            } else if (bmi() >= 19 && bmi() < 24) {
                return "Standard";
            } else if (bmi() >= 24 && bmi() < 29) {
                return "Ein bisschen weniger Essen wäre gut.";
            } else if (bmi() > 29) {
                return "Wie viele Mc's hast du bisher gesammelt? :)";
            }
        } else if (this.gender == 'm') {
            if (bmi() < 20) {
                return "Du bist untergewichtig!!!";
            } else if (bmi() >= 20 && bmi() < 25) {
                return "Standard";
            } else if (bmi() >= 25 && bmi() < 30) {
                return "Ein bisschen weniger Essen wäre gut.";
            } else if (bmi() > 30) {
                return "Wie viele Mc's hast du bisher gesammelt? :)";
            }
        } else {
            return "Bitte geben Sie ein valides Geschlecht ein!";
        }
        return "Program works"; // Diesen return muss ich machen, ansonsten compilet es nicht
    }
}