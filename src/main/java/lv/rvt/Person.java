package lv.rvt;

public class Person {
    private String name;
    private int age;
    private int height; 
    private int weight; 
    private int feed;

    public Person(String name, int age, int height, int weight, int feed) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.feed = feed;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
    
    public int feed(){
        return feed;
    }
}