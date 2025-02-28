import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner to read user input (we'll still need this for the menu)
        Scanner keyboard = new Scanner(System.in);
        int continueOuterLoop = 1;

        // Outer loop to continue the menu until user decides to exit
        do {
            // Show animal choice menu and handle input
            switch (animalChoiceMenu(keyboard)) {
                case 1: // Tiger
                    Tiger tiger = new Tiger("Tiger", 200, 80, 5, 30, 60);  // Example properties for Tiger
                    animalDetailsManipulationMenu(keyboard, tiger);
                    break;
                case 2: // Dolphin
                    Dolphin dolphin = new Dolphin("Dolphin", 300, 120, 7, "Blue", 40);  // Example properties for Dolphin
                    animalDetailsManipulationMenu(keyboard, dolphin);
                    break;
                case 3: // Penguin
                    Penguin penguin = new Penguin("Penguin", 40, 30, 3, 25);  // Example properties for Penguin
                    animalDetailsManipulationMenu(keyboard, penguin);
                    break;
                default:
                    System.out.println("Sorry, no such animal available.");
            }

            System.out.println("Continue main Zoo menu? (Enter 1 for yes/ 2 for no):");
            continueOuterLoop = keyboard.nextInt();

        } while (continueOuterLoop == 1);
    }

    // Menu for selecting animal
    private static int animalChoiceMenu(Scanner keyboard) {
        System.out.println("******* ZOO ANIMAL choice menu ******");
        System.out.println("1. Tiger");
        System.out.println("2. Dolphin");
        System.out.println("3. Penguin");

        System.out.println("Enter choice of animal:");
        return keyboard.nextInt();
    }

    // Menu for manipulating animal details
    private static void animalDetailsManipulationMenu(Scanner keyboard, Animal animal) {
        int choiceGivenByUser;

        System.out.println("******* ANIMAL details menu for: " + animal.getNameOfAnimal() + " ******");
        System.out.println("1. Set properties");
        System.out.println("2. Display properties");
        System.out.println("3. Display movement");
        System.out.println("4. Display eating");

        System.out.println("Enter choice (1-4):");
        choiceGivenByUser = keyboard.nextInt();

        // Handle user choice
        switch (choiceGivenByUser) {
            case 1: // Set properties
                System.out.println("Properties are already set when the animal is created.");
                break;
            case 2: // Display properties
                displayAnimalProperties(animal);
                break;
            case 3: // Display movement
                displayAnimalMovement(animal);
                break;
            case 4: // Display eating actions
                displayEatingActions(animal);
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    // Display properties of animal
    private static void displayAnimalProperties(Animal animal) {
        System.out.println("Animal Name: " + animal.getNameOfAnimal());
        System.out.println("Weight: " + animal.getWeight());
        System.out.println("Height: " + animal.getHeight());
        System.out.println("Age: " + animal.getAge());

        if (animal instanceof Tiger) {
            System.out.println("Number of Stripes: " + ((Tiger) animal).getNumberOfStripes());
            System.out.println("Speed: " + ((Tiger) animal).getSpeed());
        }

        if (animal instanceof Dolphin) {
            System.out.println("Swimming Speed: " + ((Dolphin) animal).getSwimmingSpeed());
        }

        if (animal instanceof Penguin) {
            System.out.println("Swimming Speed: " + ((Penguin) animal).getSwimSpeed());
        }
    }

    // Display animal movement
    private static void displayAnimalMovement(Animal animal) {
        if (animal instanceof Walk) {
            ((Walk) animal).walking();  // Casting to Walk interface to call walking
        }
        if (animal instanceof Swim) {
            ((Swim) animal).swimming();  // Casting to Swim interface to call swimming
        }
    }

    // Display eating actions of animal
    private static void displayEatingActions(Animal animal) {
        animal.eatingFood();
        animal.eatingCompleted();
    }
}
