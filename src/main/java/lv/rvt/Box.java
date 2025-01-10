package lv.rvt;

public class Box {
    private final double width;
    private final double height;
    private final double length;

    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Box(double side) {
        this(side, side, side); 
    }

    public double volume() {
        return width * height * length;
    }

    public double area() {
        return 2 * (width * height + height * length + length * width);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }
}