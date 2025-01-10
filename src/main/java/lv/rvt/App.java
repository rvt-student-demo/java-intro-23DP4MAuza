package lv.rvt;

import java.io.BufferedReader;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Box box = new Box(2.5, 5.0, 6.0);

        System.out.println("Area: " + box.area() + " Volume: " + box.volume());

        System.out.println("Length: " + box.getLength() + 
                           " Height: " + box.getHeight() + 
                           " Width: " + box.getWidth());
    }
}