package hw.homework13;

public abstract class Transport {
    protected String type;

    public Transport(String type) {
        this.type = type;
    }

    public abstract boolean move(int distance, String terrain);
}
