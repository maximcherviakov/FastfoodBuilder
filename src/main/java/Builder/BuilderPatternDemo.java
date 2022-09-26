package Builder;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder builder = new MealBuilder();

        Meal vegMeal = builder.prepareVegMeal();
        System.out.println("Vegetarian meal:");
        vegMeal.showItems();
        System.out.println("Cost: " + vegMeal.getCost());

        Meal chickenMeal = builder.prepareNonVegMeal();
        System.out.println("\nNon vegetarian meal:");
        chickenMeal.showItems();
        System.out.println("Cost: " + chickenMeal.getCost());

        Meal customMeal = builder.prepareCustomMeal(new ChickenBurger(), new Coke());
        System.out.println("\nCustom meal:");
        customMeal.showItems();
        System.out.println("Cost: " + customMeal.getCost());
    }
}
