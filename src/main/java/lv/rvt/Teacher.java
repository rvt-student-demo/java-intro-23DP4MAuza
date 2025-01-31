package lv.rvt;

public class Teacher extends Person {
    private double salary;
    private int studyCredits;

    public Teacher(String name, String address, double salary) {
        super(name, address);
        this.salary = salary;
        this.studyCredits = 0;
    }

    public void study() {
        this.studyCredits++;
    }

    @Override
    public String toString() {
        if (this.salary == 0) {
            return super.toString() + "\nstudy credits " + studyCredits;
        } else {
            return super.toString() + "\nsalary " + salary + " euro/month";
        }
    }

    public static void main(String[] args) {
        Teacher ada = new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200);
        System.out.println(ada.toString());

        Teacher esko = new Teacher("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki", 5400);
        System.out.println(esko.toString());

        Teacher ollie = new Teacher("Ollie", "6381 Hollywood Blvd. Los Angeles 90028", 0);
        int i = 0;
        while (i < 25) {
            ollie.study();
            i = i + 1;
        }
        System.out.println(ollie);
    }
}