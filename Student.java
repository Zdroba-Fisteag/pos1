public class Student {
    private String name;
    private double kg;
    private int cm;
    
    //setter für name
    public void setName(String name) {
        this.name = name;
    }
    // Try this yourself
    /*public double bmi() {
        this.kg = kg;
        this.cm = cm;
        return kg/((cm*cm)*(100*100));
    }*/
    public void setKg (double kilogramm) {
        this.kg = kilogramm;
    }
    public void setCm (int cm) {
        this.cm = cm;
    }
    //Constructor
    public Student (String name, double kg, int cm) {
        this.setName(name);
        this.setKg(kg);
        this.setCm(cm);
    }
    public double bmi() {
        return this.kg/((this.cm/100.0)*(this.cm/100.0));
    }
}