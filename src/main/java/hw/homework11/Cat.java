package hw.homework11;

class Cat extends Animal {
    public Cat(String name, int runningSpeed, int endurance) {
        super(name, runningSpeed, 0, endurance);
    }

    public static int run(int distance) {
        if (distance <= 0) {
            System.out.println("Недопустимое расстояние. Расстояние должно быть больше 0.");
            return -1;
        }

        if (endurance < distance) {
            System.out.println(name + " он устал и не может пробежать указанную дистанцию.");
            return -1;
        }

        int time = distance / runningSpeed;
        endurance -= distance;
        System.out.println(name + " бежал " + distance + " метров " + time + " секунд.");
        return time;
    }

    public static int swim(int distance) {
        System.out.println(name + " не может плавать.");
        return -1;
    }

    public static void info() {
        System.out.println("Имя: " + name);
        System.out.println("Скорость бега: " + runningSpeed + " m/s");
        System.out.println("Выносливость: " + endurance);
    }
}

