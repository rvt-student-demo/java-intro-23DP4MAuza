package lv.rvt;

public class Person {
    private String name;
    private int age;
    private int weight;
    private int weighCount;

    public Person(String name, int age, int weight, int weighCount) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.weighCount = weighCount;
    }

    public int getWeight() {
        return weight;
    }

    public int getWeighCount() {
        return weighCount;
    }

    public void incrementWeighCount() {
        this.weighCount++;
    }
}