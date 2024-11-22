package lv.rvt;

public class App {
    private int seconds;
    private int hundredths;

    public App() {
        this.seconds = 0;
        this.hundredths = 0;
    }

    public String toString() {
        return String.format("%02d:%02d", seconds, hundredths);
    }

    public void advance() {
        hundredths++;
        
        if (hundredths == 100) {
            hundredths = 0;
            seconds++;
        }

        if (seconds == 60) {
            seconds = 0;
        }
    }

    public static void main(String[] args) {
        App timer = new App();
        
        for (int i = 0; i < 150; i++) {
            System.out.println(timer);
            timer.advance();
        }
    }
}