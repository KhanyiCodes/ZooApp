public class Tiger extends Animal implements Eat, Walk {
    private int numberOfStripes;
    private int speed;
    private int soundLevel;

    public Tiger(String nameOfAnimal, int numberOfStripes, int speed, int soundLevel) {
        super(nameOfAnimal);
        this.numberOfStripes = numberOfStripes;
        this.speed = speed;
        this.soundLevel = soundLevel;
    }

    @Override
    public void eatingFood() {
        System.out.println("The Tiger " + getNameOfAnimal() + " is eating.");
    }

    @Override
    public void eatingCompleted() {
        System.out.println("The Tiger " + getNameOfAnimal() + " has finished eating.");
    }

    @Override
    public void walking() {
        System.out.println("Tiger: I am walking at the speed of " + speed + " km/h.");
    }

    // Getters and setters
    public int getNumberOfStripes() {
        return numberOfStripes;
    }

    public void setNumberOfStripes(int numberOfStripes) {
        this.numberOfStripes = numberOfStripes;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSoundLevel() {
        return soundLevel;
    }

    public void setSoundLevel(int soundLevel) {
        this.soundLevel = soundLevel;
    }
}
