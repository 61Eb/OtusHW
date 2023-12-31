package hw.homework11;

class Dog extends Animal {
    public Dog(String name, int runningSpeed, int swimmingSpeed, int endurance) {
        super(name, runningSpeed, swimmingSpeed, endurance);
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
        if (distance <= 0) {
            System.out.println("Недопустимое расстояние. Расстояние должно быть больше 0.");
            return -1;
        }

        if (endurance < distance * 2) {
            System.out.println(name + " устал и не может проплыть указанное расстояние.");
            return -1;
        }

        int time = distance / swimmingSpeed;
        endurance -= distance * 2;
        System.out.println(name + " плавал " + distance + " метров " + time + " секунд.");
        return time;
    }

    public static void info() {
        System.out.println("Имя: " + name);
        System.out.println("Скорость бега: " + runningSpeed + " m/s");
        System.out.println("Скорость плавания: " + swimmingSpeed + " m/s");
        System.out.println("Выносливость: " + endurance);
    }
}
