import ingredients.GlassOfJuice;
import blender.Blender;

import java.util.Scanner;

public class JuiceMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Blender blender = new Blender();

        while (true) {
            System.out.println("----------------------");
            System.out.println("1. Add oranges");
            System.out.println("2. Add apples");
            System.out.println("3. Add carrots");
            System.out.println("4. Make juice");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    blender.addOranges();
                    break;
                case 2:
                    blender.addApples();
                    break;
                case 3:
                    blender.addCarrots();
                    break;
                case 4:
                    if (blender.canMakeJuice()) {
                        GlassOfJuice juice = blender.makeJuice();
                        System.out.println("Juice made with " + juice.getFruitType() + " and " + juice.getPulpVolume() + " pulp volume");
                    } else {
                        System.out.println("Not enough ingredients");
                    }
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
