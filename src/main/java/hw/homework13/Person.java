package hw.homework13;

public class Person {
    private String name;
    private Transport currentTransport;

    public Person(String name) {
        this.name = name;
    }

    public void setCurrentTransport(Transport transport) {
        this.currentTransport = transport;
    }

    public void unsetCurrentTransport() {
        this.currentTransport = null;
    }

    public boolean move(int distance, String terrain) {
        if (currentTransport != null) {
            return currentTransport.move(distance, terrain);
        } else {
            System.out.println("Ходил пешком по " + terrain + " на расстояние " + distance + " киллометров");
            return true;
        }
    }

}