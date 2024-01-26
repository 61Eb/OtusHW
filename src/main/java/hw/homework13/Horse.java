package hw.homework13;

public class Horse extends Transport {
    private int energy;

    public Horse() {
        super("лошадь");
        this.energy = 100;
    }

    @Override
    public boolean move(int distance, String terrain) {
        if (terrain.equals("болото")) {
            System.out.println("Лошадь не может двигаться по " + terrain);
            return false;
        }

        if (energy <= 0) {
            System.out.println("Лошадь устала");
            return false;
        }

        System.out.println("Катался на лошади по " + terrain + " на расстояние " + distance + " киллометров");
        energy -= distance;
        return true;
    }
}