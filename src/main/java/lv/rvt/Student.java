package lv.rvt;

public class Student extends Person {
    private int studyCredits;

    public Student(String name, String address) {
        super(name, address);
        this.studyCredits = 0;
    }

    public int getStudyCredits() {
        return studyCredits;
    }

    public void setStudyCredits(int studyCredits) {
        this.studyCredits = studyCredits;
    }

    @Override
    public String toString() {
        return super.toString() + "\nStudy Credits: " + studyCredits;
    }
}