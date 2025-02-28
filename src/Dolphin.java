public class Dolphin extends Animal implements Eat, Swim {
    private String color;
    private int swimmingSpeed;

    // Constructor for Dolphin with weight, height, and age
    public Dolphin(String nameOfAnimal, int weight, int height, int age, String color, int swimmingSpeed) {
        super(nameOfAnimal, weight, height, age); // Passing weight, height, and age to the superclass
        this.color = color;
        this.swimmingSpeed = swimmingSpeed;
    }

    // Overriding methods from Eat interface
    @Override
    public void eatingFood() {
        System.out.println("The Dolphin " + getNameOfAnimal() + " is eating.");
    }

    @Override
    public void eatingCompleted() {
        System.out.println("The Dolphin " + getNameOfAnimal() + " has finished eating.");
    }

    // Overriding swimming method from Swim interface
    @Override
    public void swimming() {
        System.out.println("Dolphin: I am swimming at the speed of " + swimmingSpeed + " km/h.");
    }

    // Getter and Setter for swimmingSpeed
    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }
}
