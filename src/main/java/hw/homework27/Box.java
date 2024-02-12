package hw.homework27;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> fruits;

    public Box() {
        fruits = new ArrayList<>();
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public double weight() {
        double totalWeight = 0.0;
        for (T fruit : fruits) {
            totalWeight += fruit.getWeight();
        }
        return totalWeight;
    }

    public boolean compare(Box<?> otherBox) {
        return Math.abs(this.weight() - otherBox.weight()) < 0.0001;
    }

    public void transferFruits(Box<T> otherBox) {
        if (otherBox != null && otherBox != this) {
            otherBox.fruits.addAll(this.fruits);
            this.fruits.clear();
        }
    }
}