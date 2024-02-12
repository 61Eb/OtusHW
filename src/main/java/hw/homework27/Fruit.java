package hw.homework27;

public class Fruit {
    private double weight;

    public Fruit(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public static class Apple extends Fruit {
        public Apple(double weight) {
            super(weight);
        }
    }

    public static class Orange extends Fruit {
        public Orange(double weight) {
            super(weight);
        }
    }
}


