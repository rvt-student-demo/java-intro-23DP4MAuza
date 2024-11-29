package lv.rvt;

public class App {
    private int totalWeighings;

    public App() {
        this.totalWeighings = 0;
    }

    public int weigh(Person person) {
        totalWeighings++;
        return person.getWeight();
    }

    public int weighings(Person person) {
        return person.getWeighCount();
    }

    public int getWeight(Person person) {
        return person.getWeight();
    }

    public int weighings() {
        return totalWeighings;
    }
    
        public static void main(String[] args) {
            HealthStation childrensHospital = new HealthStation();
        
            Person ethan = new Person("Ethan", 1, 110, 0);
            Person peter = new Person("Peter", 33, 176, 0);
        
            System.out.println("weighings performed: " + childrensHospital.weighings());
        
            childrensHospital.weigh(ethan);
            childrensHospital.weigh(peter);
        
            System.out.println("weighings performed: " + childrensHospital.weighings());
        
            childrensHospital.weigh(ethan);
            childrensHospital.weigh(ethan);
            childrensHospital.weigh(ethan);
            childrensHospital.weigh(ethan);
        
            System.out.println("weighings performed: " + childrensHospital.weighings());
        }
    }