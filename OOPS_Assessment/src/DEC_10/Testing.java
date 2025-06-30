package DEC_10;
import java.util.Scanner;

abstract class Food {
    double proteins;
    double fats;
    double carbs;
    double tastyScore;

    public Food(double proteins, double fats, double carbs) {
        this.proteins = proteins;
        this.fats = fats;
        this.carbs = carbs;
    }

    abstract void getMacroNutrients();

    public void getTaste() {
        System.out.println("Taste: " + tastyScore);
    }

    public abstract void getType();
}

class Egg extends Food {
    String type = "non-vegetarian";

    public Egg(double proteins, double fats, double carbs) {
        super(proteins, fats, carbs);
        this.tastyScore = 7;
    }

    @Override
    void getMacroNutrients() {
        System.out.println("An egg has " + proteins + " gms of protein, " + fats + " gms of fats, and " + carbs + " gms of carbohydrates.");
    }

    @Override
    public void getType() {
        System.out.println("Egg is " + type);
    }
}

class Bread extends Food {
    String type = "vegetarian";

    public Bread(double proteins, double fats, double carbs) {
        super(proteins, fats, carbs);
        this.tastyScore = 8;
    }

    @Override
    void getMacroNutrients() {
        System.out.println("A slice of bread has " + proteins + " gms of protein, " + fats + " gms of fats, and " + carbs + " gms of carbohydrates.");
    }

    @Override
    public void getType() {
        System.out.println("Bread is " + type);
    }
}

public class Testing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of food items you want to analyze: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter the food name (Egg or Bread): ");
            String foodName = sc.nextLine().trim();

            Food food = null;
            if (foodName.equalsIgnoreCase("Egg")) {
                food = new Egg(6.0, 5.0, 0.6);
            } else if (foodName.equalsIgnoreCase("Bread")) {
                food = new Bread(4.0, 1.1, 13.8);
            } else {
                System.out.println("Invalid food item. Skipping to next.");
                continue;
            }

            System.out.println("Enter 3 methods to call (getType, getMacros, getTaste):");
            for (int j = 0; j < 3; j++) {
                System.out.print("Method " + (j + 1) + ": ");
                String method = sc.nextLine().trim();

                if (method.equalsIgnoreCase("getType")) {
                    food.getType();
                } else if (method.equalsIgnoreCase("getMacros")) {
                    food.getMacroNutrients();
                } else if (method.equalsIgnoreCase("getTaste")) {
                    food.getTaste();
                } else {
                    System.out.println("Invalid method. Please use getType, getMacros, or getTaste.");
                }
            }
        }

        sc.close();
    }
}
