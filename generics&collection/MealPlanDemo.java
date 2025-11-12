import java.util.*;

public class MealPlanDemo {
    interface MealPlan { String description(); }
    static class VegetarianMeal implements MealPlan { public String description(){ return "Vegetarian"; } }
    static class VeganMeal implements MealPlan { public String description(){ return "Vegan"; } }
    static class KetoMeal implements MealPlan { public String description(){ return "Keto"; } }

    public static class Meal<T extends MealPlan> {
        private final T plan;
        public Meal(T plan){ this.plan = plan; }
        public T getPlan(){ return plan; }
    }

    public static <T extends MealPlan> boolean validateAndGenerate(T plan, String userPref) {
        // Very simple rule: check if preference string contained in description
        return plan.description().toLowerCase().contains(userPref.toLowerCase());
    }

    public static void main(String[] args) {
        Meal<VegetarianMeal> m1 = new Meal<>(new VegetarianMeal());
        Meal<KetoMeal> m2 = new Meal<>(new KetoMeal());

        System.out.println("Meal1: " + m1.getPlan().description());
        System.out.println("Meal2: " + m2.getPlan().description());

        System.out.println("Valid vegetarian for 'veg' preference: " + validateAndGenerate(m1.getPlan(), "veg"));
        System.out.println("Valid keto for 'veg' preference: " + validateAndGenerate(m2.getPlan(), "veg"));
    }
}
