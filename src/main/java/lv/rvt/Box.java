package lv.rvt;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double area() {
        return 2 * faceArea() + 2 * topArea() + 2 * sideArea();
    }

    private double faceArea() {
        return length * height;
    }

    private double topArea() {
        return length * width;
    }

    private double sideArea() {
        return width * height;
    }

    public double volume() {
        return length * width * height;
    }
}