package hw.homework11;

class Animal {
    protected static String name;
    protected static int runningSpeed;
    protected static int swimmingSpeed;
    protected static int endurance;

    public Animal(String name, int runningSpeed, int swimmingSpeed, int endurance) {
        this.name = name;
        this.runningSpeed = runningSpeed;
        this.swimmingSpeed = swimmingSpeed;
        this.endurance = endurance;
    }
}
