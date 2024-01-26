package hw.homework13;

public class Car extends Transport {
    private int fuel;

    public Car() {
        super("машина");
        this.fuel = 100;
    }

    @Override
    public boolean move(int distance, String terrain) {
        if (terrain.equals("густой лес") || terrain.equals("болото")) {
            System.out.println("Машина не может ездить по " + terrain);
            return false;
        }

        if (fuel <= 0) {
            System.out.println("Топливо кончилось");
            return false;
        }

        System.out.println("Ездил на машине по " + terrain + " на расстояние " + distance + " киллометров");
        fuel -= distance;
        return true;
    }
}