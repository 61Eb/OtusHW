package Hw12;


public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate(20);
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Барсик", 5);
        cats[1] = new Cat("Мурзик", 10);
        cats[2] = new Cat("Том", 15);

        for (Cat cat : cats) {
            cat.eat(plate);
        }

        for (Cat cat : cats) {
            System.out.println(cat.name + " " + (cat.isHungry() ? "голоден" : "не голоден"));
        }
    }
}
