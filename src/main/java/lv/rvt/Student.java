package lv.rvt;
public class Student extends Person {
    private int credits;

    public Student(String name, String address) {
        super(name, address);
        this.credits = 0;
    }

    public int credits() {
        return credits;
    }

    public void study() {
        credits++;
    }
}