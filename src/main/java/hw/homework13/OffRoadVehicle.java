package hw.homework13;

public class OffRoadVehicle extends Transport {
    public OffRoadVehicle() {
        super("Вездеход");
    }

    @Override
    public boolean move(int distance, String terrain) {
        System.out.println("Ездил на вездеходе по " + terrain + " на расстояние " + distance + " киллометров");
        return true;
    }
}
