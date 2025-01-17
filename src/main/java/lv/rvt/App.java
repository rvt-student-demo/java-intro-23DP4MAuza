package lv.rvt;

import java.io.BufferedReader;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Box box = new Box(2.5, 5.0, 6.0);
        System.out.println("Original Box Area: " + box.area() + " volume: " + box.volume());
        System.out.println("Original Box Length: " + box.length() + " height: " + box.height() + " width: " + box.width());

        Box biggerBox = box.biggerBox(box);
        System.out.println("Bigger Box Area: " + biggerBox.area() + " volume: " + biggerBox.volume());
        System.out.println("Bigger Box Length: " + biggerBox.length() + " height: " + biggerBox.height() + " width: " + biggerBox.width());

        Box smallerBox = box.smallerBox(box);
        System.out.println("Smaller Box Area: " + smallerBox.area() + " volume: " + smallerBox.volume());
        System.out.println("Smaller Box Length: " + smallerBox.length() + " height: " + smallerBox.height() + " width: " + smallerBox.width());
    }
}