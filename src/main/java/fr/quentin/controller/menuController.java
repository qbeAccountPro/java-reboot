package fr.quentin.controller;

import fr.quentin.model.Recipe;

import java.util.List;
import java.util.Scanner;

public class menuController {
    public static List<Recipe> addRecipe(List<Recipe> recipes, Scanner scannerUserInfo){
        System.out.println("Pizza name :");
        String pizzaName = scannerUserInfo.nextLine();
        System.out.println("Pizza price :");
        double pizzaPrice = scannerUserInfo.nextDouble();
        System.out.println("Pizza calories :");
        int pizzaCalories = scannerUserInfo.nextInt();
        Recipe pizza = new Recipe(pizzaName, pizzaPrice, pizzaCalories);
        System.out.println(pizza);
        recipes.add(pizza);
//todo
        return recipes;
    }
    public static String displayRecipe(List<Recipe> recipes){
//todo
        System.out.println("displayRecipe :");

        return "";

    }
    public static String searchRecipe(List<Recipe> recipes){
//todo

        return "";

    }
    public static List<Recipe>  deleteRecipe(List<Recipe> recipes){
//todo

        return recipes;

    }
    public static String exitApp(){
//todo

        return "";

    }

}
