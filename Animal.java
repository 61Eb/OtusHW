package hw.homework11;

class Animal {
    protected String name;
    protected int runningSpeed;
    protected int swimmingSpeed;
    protected int stamina;

    public Animal(String name, int runningSpeed, int swimmingSpeed, int stamina) {
        this.name = name;
        this.runningSpeed = runningSpeed;
        this.swimmingSpeed = swimmingSpeed;
        this.stamina = stamina;
    }

    public int run(int distance) {
        if (stamina >= distance) {
            stamina -= distance;
            return distance / runningSpeed;
        } else {
            System.out.println(name + " устал.");
            return -1;
        }
    }

    public int swim(int distance) {
        int a=2;
        int b=4;
        if (this instanceof Cat) {
            System.out.println(name + " не может плавать.");
            return -1;
        } else if (this instanceof Dog) {
            if (stamina >= distance * a) {
                stamina -= distance * a;
                return distance / swimmingSpeed;
            } else {
                System.out.println(name + " устал.");
                return -1;
            }
        } else if (this instanceof Horse) {
            if (stamina >= distance * b) {
                stamina -= distance * b;
                return distance / swimmingSpeed;
            } else {
                System.out.println(name + " устал.");
                return -1;
            }
        } else {
            return -1;
        }
    }

    public void info() {
        System.out.println("Имя: " + name);
        System.out.println("Скорость бега: " + runningSpeed + " m/s");
        System.out.println("Скорость плавания: " + swimmingSpeed + " m/s");
        System.out.println("Выносливость: " + stamina);
    }
}
