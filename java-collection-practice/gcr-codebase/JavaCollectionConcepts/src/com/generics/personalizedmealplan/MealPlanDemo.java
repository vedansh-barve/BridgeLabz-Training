package com.generics.personalizedmealplan;

public class MealPlanDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Meal<VegetarianMeal> vegMeal = MealGenerator.generateMealPlan(new VegetarianMeal());

        Meal<KetoMeal> ketoMeal = MealGenerator.generateMealPlan(new KetoMeal());

        Meal<VeganMeal> veganMeal = MealGenerator.generateMealPlan(new VeganMeal());
        
        Meal<HighProteinMeal> highProteinMeal = MealGenerator.generateMealPlan(new HighProteinMeal());

        System.out.println(vegMeal);
        System.out.println(ketoMeal);
        System.out.println(veganMeal);
        System.out.println(highProteinMeal);
	}

}
