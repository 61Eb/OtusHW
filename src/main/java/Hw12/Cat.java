package Hw12;

public class Cat {
    public String name;
    private int appetite;
    private boolean isHungry;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isHungry = true;
    }

    public void eat(Plate plate) {
        if (plate.decreaseFood(appetite)) {
            isHungry = false;
            System.out.println(name + " сьел " + appetite + "ед. еды из тарелки");
        } else {
            System.out.println(name + " не смог поесть из тарелки, еды мало");
        }

    }

    public boolean isHungry() {
        return isHungry;
    }

}
