package lv.rvt;

public class Box {
    private double length;
    private double height;
    private double width;

    public Box(double length, double height, double width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    public Box(Box oldBox) {
        this.length = oldBox.length();
        this.height = oldBox.height();
        this.width = oldBox.width();
    }

    public double length() {
        return this.length;
    }

    public double height() {
        return this.height;
    }

    public double width() {
        return this.width;
    }

    public double area() {
        return 2 * (length * height + height * width + length * width);
    }

    public double volume() {
        return length * height * width;
    }
}