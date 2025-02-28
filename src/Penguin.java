public class Penguin extends Animal implements Walk, Swim {
    private int swimSpeed;
    private int walkSpeed;

    // Constructor for Penguin with weight, height, and age
    public Penguin(String nameOfAnimal, int weight, int height, int age, int swimSpeed) {
        super(nameOfAnimal, weight, height, age); // Passing weight, height, and age to the superclass
        this.swimSpeed = swimSpeed;
        this.walkSpeed = 3; // Default walk speed for penguin
    }

    // Overriding methods from Walk and Swim interfaces
    @Override
    public void walking() {
        System.out.println("Penguin: I am waddling at the speed of " + walkSpeed + " km/h.");
    }

    @Override
    public void swimming() {
        System.out.println("Penguin: I am swimming at the speed of " + swimSpeed + " km/h.");
    }

    // Getters and setters for Penguin's properties
    public int getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(int swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    public int getWalkSpeed() {
        return walkSpeed;
    }

    public void setWalkSpeed(int walkSpeed) {
        this.walkSpeed = walkSpeed;
    }
}
