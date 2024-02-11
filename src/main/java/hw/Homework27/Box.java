package hw.Homework27;

import java.util.ArrayList;

class Box<T extends Fruit> {
    private ArrayList<T> fruits;

    public Box() {
        fruits = new ArrayList<>();
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public double getWeight() {
        double weight = 0.0;
        for (T fruit : fruits) {

            weight += fruit.getWeight();
        }
        return weight;
    }

    public boolean compare(Box<?> otherBox) {
        return Math.abs(this.getWeight() - otherBox.getWeight()) < 0.0001;
    }

    public void transferFruits(Box<T> otherBox) {
        otherBox.fruits.addAll(this.fruits);
        this.fruits.clear();
    }
}