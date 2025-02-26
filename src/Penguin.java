public class Penguin extends Animal implements Walk, Swim {
    private int swimSpeed;
    private int walkSpeed;
    private boolean isSwimming;

    public Penguin(String nameOfAnimal, int swimSpeed) {
        super(nameOfAnimal);
        this.swimSpeed = swimSpeed;
        this.walkSpeed = walkSpeed;
        this.isSwimming = false; // default is not swimming
    }

    @Override
    public void walking() {
        System.out.println("Penguin: I am waddling at the speed of " + walkSpeed + " km/h.");
    }

    @Override
    public void swimming() {
        isSwimming = true;
        System.out.println("Penguin: I am swimming at the speed of " + swimSpeed + " km/h.");
    }

    // Getters and setters
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

    public boolean isSwimming() {
        return isSwimming;
    }

    public void setSwimming(boolean swimming) {
        isSwimming = swimming;
    }
}
