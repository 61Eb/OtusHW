package hw.homework11;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", 10, 100);
        Dog dog = new Dog("Бобик", 15, 5, 200);
        Horse horse = new Horse("Верный", 20, 10, 500);

        Cat.info();
        Cat.run(50);
        Cat.swim(10);

        Dog.info();
        Dog.run(100);
        Dog.swim(20);

        Horse.info();
        Horse.run(200);
        Horse.swim(50);
    }
}