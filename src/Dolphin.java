public class Dolphin extends Animal implements Eat, Swim {

    private String color;
    private int swimmingSpeed;

    public Dolphin(String nameOfAnimal, String color, int swimmingSpeed) {
        super(nameOfAnimal);
        this.color = color;
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public void eatingFood() {
        System.out.println("The Dolphin " + getNameOfAnimal() + " is eating.");
    }

    @Override
    public void eatingCompleted() {
        System.out.println("The Dolphin " + getNameOfAnimal() + " has finished eating.");
    }

    @Override
    public void swimming() {
        System.out.println("Dolphin: I am swimming at the speed of " + swimmingSpeed + " km/h.");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }
}
