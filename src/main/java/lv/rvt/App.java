package lv.rvt;

public class App {

    public int weigh(Person person) {
        return person.getWeight();
    }
    public void feed(Person person){
        person.feed();
    }
    public static void main(String[] args) {
        App childrensHospital = new App();
        Person ethan = new Person("Ethan", 1, 110, 7);
        Person peter = new Person("Peter", 33, 176, 85);
        
        System.out.println(ethan.getName() + " weight: " + childrensHospital.weigh(ethan) + " kilos");
        System.out.println(peter.getName() + " weight: " + childrensHospital.weigh(peter) + " kilos");
    
    
        childrensHospital.feed(ethan);
        childrensHospital.feed(ethan);
        childrensHospital.feed(ethan);
    
        System.out.println("");
    
        System.out.println(ethan.getName() + " weight: " + childrensHospital.weigh(ethan) + " kilos");
        System.out.println(peter.getName() + " weight: " + childrensHospital.weigh(peter) + " kilos");
    }
}
