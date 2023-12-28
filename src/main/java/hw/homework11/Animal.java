package hw.homework11;

class Animal {
    protected static String name;
    protected static double runningSpeed;
    protected static double swimmingSpeed;
    protected static int endurance;

    public Animal(String name, double runningSpeed, double swimmingSpeed, int endurance) {
        this.name = name;
        this.runningSpeed = runningSpeed;
        this.swimmingSpeed = swimmingSpeed;
        this.endurance = endurance;
    }
}
