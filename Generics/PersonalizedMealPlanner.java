package Generics;

import java.util.ArrayList;
import java.util.List;

// Base interface for all meal plans
interface MealPlan {
    String getMealType();
    void showMeal();
}

// Vegetarian meal implementation
class VegetarianMeal implements MealPlan {
    private String dish;

    public VegetarianMeal(String dish) {
        this.dish = dish;
    }

    @Override
    public String getMealType() {
        return "Vegetarian";
    }

    @Override
    public void showMeal() {
        System.out.println("Vegetarian Meal: " + dish);
    }
}

// Vegan meal implementation
class VeganMeal implements MealPlan {
    private String dish;

    public VeganMeal(String dish) {
        this.dish = dish;
    }

    @Override
    public String getMealType() {
        return "Vegan";
    }

    @Override
    public void showMeal() {
        System.out.println("Vegan Meal: " + dish);
    }
}

// Keto meal implementation
class KetoMeal implements MealPlan {
    private String dish;

    public KetoMeal(String dish) {
        this.dish = dish;
    }

    @Override
    public String getMealType() {
        return "Keto";
    }

    @Override
    public void showMeal() {
        System.out.println("Keto Meal: " + dish);
    }
}

// High-Protein meal implementation
class HighProteinMeal implements MealPlan {
    private String dish;

    public HighProteinMeal(String dish) {
        this.dish = dish;
    }

    @Override
    public String getMealType() {
        return "High-Protein";
    }

    @Override
    public void showMeal() {
        System.out.println("High-Protein Meal: " + dish);
    }
}

// Generic Meal container
class Meal<T extends MealPlan> {
    private List<T> meals;

    public Meal() {
        meals = new ArrayList<>();
    }

    public void addMeal(T meal) {
        meals.add(meal);
        System.out.println("Meal added: " + meal.getMealType());
    }

    public List<T> getMeals() {
        return meals;
    }
}

// Utility class with generic method
class MealPlanGenerator {
    public static <T extends MealPlan> void generatePersonalizedPlan(Meal<T> mealContainer) {
        System.out.println("Generating Personalized Meal Plan:");
        for (T meal : mealContainer.getMeals()) {
            meal.showMeal();
        }
    }
}

// Main class
public class PersonalizedMealPlanner {
    public static void main(String[] args) {
        // Vegetarian Plan
        Meal<VegetarianMeal> vegPlan = new Meal<>();
        vegPlan.addMeal(new VegetarianMeal("Paneer Tikka"));
        vegPlan.addMeal(new VegetarianMeal("Mixed Veg Curry"));

        // Keto Plan
        Meal<KetoMeal> ketoPlan = new Meal<>();
        ketoPlan.addMeal(new KetoMeal("Grilled Chicken"));
        ketoPlan.addMeal(new KetoMeal("Avocado Salad"));

        // High Protein Plan
        Meal<HighProteinMeal> proteinPlan = new Meal<>();
        proteinPlan.addMeal(new HighProteinMeal("Boiled Eggs"));
        proteinPlan.addMeal(new HighProteinMeal("Protein Shake"));

        // Generate meal plans
        System.out.println();
        MealPlanGenerator.generatePersonalizedPlan(vegPlan);

        System.out.println();
        MealPlanGenerator.generatePersonalizedPlan(ketoPlan);

        System.out.println();
        MealPlanGenerator.generatePersonalizedPlan(proteinPlan);
    }
}
