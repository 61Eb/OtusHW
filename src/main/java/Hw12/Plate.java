package Hw12;

public class Plate {
    private int capacity;
    private int amount;

    public Plate(int capacity) {
        this.capacity = capacity;
        this.amount = capacity;
    }

    public void addFood(int food) {
        amount += food;
        if (amount > capacity) {
            amount = capacity;
        }
    }

    public boolean decreaseFood(int food) {
        if (amount >= food) {
            amount -= food;
            return true;
        } else {
            return false;
        }
    }

    public int getAmount() {
        return amount;
    }

}