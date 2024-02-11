package hw.homework27;

import java.util.ArrayList;

class Box<T extends Fruit> {
    private ArrayList<T> fruits;

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
        otherBox.fruits.addAll(this.fruits);
        this.fruits.clear();
    }
}
