package lv.rvt;

import java.util.ArrayList;

public class Box implements Packable {
    private double maxWeight;
    private ArrayList<Packable> contents;
    
    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.contents = new ArrayList<>();
    }
    
    public void add(Packable item) {
        if (this.maxWeight > item.weight() + this.weight()) {
            this.contents.add(item);
        }
    }
    
    @Override
    public double weight() {
        if (contents.size() == 0) {
            return 0.0;
        }
        double totalWeight = 0;
        for (Packable item : contents) {
            totalWeight += item.weight();
        }
        return totalWeight;
    }
    
    @Override
    public String toString() {
        return "Box: " + contents.size() + " items, total weight " + this.weight() + " kg";
    }
}