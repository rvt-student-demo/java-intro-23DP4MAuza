package lv.rvt;

public class Student extends Person {
    private int studyCredits;

    public Student(String name, String address, int studyCredits) {
        super(name, address);
        this.studyCredits = studyCredits;
    }

    @Override
    public String toString() {
        return super.toString() + "\nStudy credits " + studyCredits;
    }

    public static void main(String[] args) {
        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028", 0);
        System.out.println(ollie.toString());

        ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028", 1);
        System.out.println(ollie.toString());
    }
}