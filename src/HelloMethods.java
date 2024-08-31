import java.util.Scanner;

public class HelloMethods {
    static Scanner sc = new Scanner(System.in);

    static String[] coffeeMenu = {"cappuccino", "v60", "latte", "espresso", "aeropress"};

    public static void main(String[] args) {
        greet();
        sleepQualityCheck();
        int coffeeAnswerSelection = askUserForCoffee();

        if (coffeeAnswerSelection == 1) {
            provideCoffeeMenu();
        }
        System.out.println("Goodbye! ;)");

    }
//    (SIGNATURE) return type - name - parameters {
//    the method code
//    (optionally we have a return)
//    }
//    void - means we don't return anything
//    other return types can be int, String ... any type / object

    static void greet() {
        System.out.println("Buongiorno");
    }

    static void sleepQualityCheck() {
        System.out.println("How did you sleep last night?");
        String sleepAnswer = sc.nextLine();
        System.out.println("Oh I see that you slept: " + sleepAnswer);
    }

    static int askUserForCoffee() {
        System.out.println("Do you want me to prepare a coffee for you?");
        System.out.println("1 - Yes");
        System.out.println("2 - No");
        String coffeeAnswer = sc.nextLine();
        return Integer.parseInt(coffeeAnswer);
    }

    static void provideCoffeeMenu() {
        String coffeeType = getCoffeeChoice();
        boolean isCoffeeChoiceValid = prepareCoffeeRoutine(coffeeType);
        if (isCoffeeChoiceValid) {
            serveCoffee();
        }
    }

    private static void serveCoffee() {
        System.out.println("Here is your coffee! Enjoy ;) ");
    }

    static String getCoffeeChoice() {
        System.out.println("""
                What type of coffee you want today?
                =====
                """);
        for (String coffee : coffeeMenu) {
            System.out.println("- " + coffee);
        }
        return sc.nextLine().toLowerCase();
    }

    static boolean prepareCoffeeRoutine(String coffeeType) {

        for (String coffee : coffeeMenu) {
            if (coffee.equals(coffeeType)) {
                prepareCoffee(coffeeType);
                return true;
            }
        }
        return false;
    }

    private static void prepareCoffee(String coffeeType) {
        System.out.println("Preparing " + coffeeType);
    }
}