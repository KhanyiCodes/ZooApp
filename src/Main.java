import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int continueOuterLoop = 1;

        do {
            switch (animalChoiceMenu(keyboard)) {
                case 1: // Tiger
                    Tiger tiger = new Tiger("Tiger", 100, 60, 90);  // Example values
                    animalDetailsManipulationMenu(keyboard, tiger);
                    break;
                case 2: // Dolphin
                    Dolphin dolphin = new Dolphin("Dolphin", "Blue", 40);
                    animalDetailsManipulationMenu(keyboard, dolphin);
                    break;
                case 3: // Penguin
                    Penguin penguin = new Penguin("Penguin", 30);
                    animalDetailsManipulationMenu(keyboard, penguin);
                    break;
                default:
                    System.out.println("Sorry, no such animal available.");
            }

            System.out.println("Continue main Zoo menu? (Enter 1 for yes/ 2 for no):");
            continueOuterLoop = keyboard.nextInt();

        } while (continueOuterLoop == 1);
    }

    private static int animalChoiceMenu(Scanner keyboard) {
        System.out.println("******* ZOO ANIMAL choice menu ******");
        System.out.println("1. Tiger");
        System.out.println("2. Dolphin");
        System.out.println("3. Penguin");

        System.out.println("Enter choice of animal:");
        return keyboard.nextInt();
    }

    private static int animalDetailsManipulationMenu(Scanner keyboard, Animal animal) {
        int choiceGivenByUser;

        System.out.println("******* ANIMAL details menu for: " + animal.getNameOfAnimal() + " ******");
        System.out.println("1. Set properties");
        System.out.println("2. Display properties");
        System.out.println("3. Display movement");
        System.out.println("4. Display eating");

        System.out.println("Enter choice (1-4):");
        choiceGivenByUser = keyboard.nextInt();
        return choiceGivenByUser;
    }
}
