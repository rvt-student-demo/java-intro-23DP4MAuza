package lv.rvt;

public class App {
    private int value;

    public App(int startValue) {
        this.value = startValue;
    }

    public App() {
        this.value = 0;
    }

    public int value() {
        return this.value;
    }

    public void increase() {
        this.value++;
    }

    public void decrease() {
        this.value--;
    }

    public static void main(String[] args) {
        App counter1 = new App(10);

        System.out.println(counter1.value());
        
        counter1.increase();
        System.out.println(counter1.value());

        counter1.decrease();
        System.out.println(counter1.value());

       
       
        System.out.println();



        App counter2 = new App(5);

        System.out.println(counter2.value());

        counter2.increase();
        System.out.println(counter2.value());
        
        counter2.decrease();
        System.out.println(counter2.value()); 
    }
}
