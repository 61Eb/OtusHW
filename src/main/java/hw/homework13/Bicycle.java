package hw.homework13;

public class Bicycle extends Transport {
    public Bicycle() {
        super("Велосипед");
    }

    @Override
    public boolean move(int distance, String terrain) {
        if (terrain.equals("болото")) {
            System.out.println("Велосипед не может ездить по " + terrain);
            return false;
        }

        System.out.println("Ездил на велосипеде по " + terrain + " на расстояние " + distance + " киллометров");
        return true;
    }
}

