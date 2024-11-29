package lv.rvt;

public class HealthStation {
    private int totalWeighings;

    public HealthStation() {
        this.totalWeighings = 0;
    }

    public int weigh(Person person) {
        totalWeighings++;
        person.incrementWeighCount();
        return person.getWeight();
    }

    public int weighings() {
        return totalWeighings;
    }
}