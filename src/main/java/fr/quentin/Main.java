package fr.quentin;

import fr.quentin.model.Recipe;
import fr.quentin.controller.menuController;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Recipe> recipes = new ArrayList<>();
        System.out.println("""
                =========================
                      JAVA REBOOT
                =========================
                
                1 - Add recipe
                2 - Display recipes
                3 - Search recipe
                4 - Delete recipe
                5 - Exit
                """);

        Scanner scannerUserInfo = new Scanner(System.in);
        String choice = "";
        do {
             choice = scannerUserInfo.nextLine();
                switch (choice) {
                    case "1":
                        recipes = menuController.addRecipe(recipes, scannerUserInfo);
                        break;
                    case "2":
                        menuController.displayRecipe(recipes);
                        break;
                    case "3":
                        menuController.searchRecipe(recipes);
                        break;
                    case "4":
                        recipes = menuController.deleteRecipe(recipes);
                        break;
                    default:
                        System.out.println("Choice incorrect");
                        break;
                }
            System.out.println("fin 1");

        } while (!"5".equals(choice));
        System.out.println("test 1");

        menuController.exitApp();
    }
}
