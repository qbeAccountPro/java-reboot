package fr.quentin;

import fr.quentin.model.Recipe;
import fr.quentin.controller.menuController;

import java.util.Scanner;

public class Main {
    public static String main(String[] args) {
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
        try {
            Scanner scannerUserInfo = new Scanner(System.in);
            switch (scannerUserInfo.nextInt()) {
                case 1:
                    menuController.addRecipe();
                    break;
                case 2:
                    menuController.displayRecipe();
                    break;
                case 3:
                    menuController.searchRecipe();
                    break;
                case 4:
                    menuController.deleteRecipe();
                    break;
                case 5:
                    menuController.exitApp();
                    break;
                default:
                    System.out.println("Choice incorrect");
                    break;
            }

            String pizzaName = scannerUserInfo.nextLine();
            double pizzaPrice = scannerUserInfo.nextDouble();
            int pizzaCalories = scannerUserInfo.nextInt();
            Recipe pizza = new Recipe(pizzaName, pizzaPrice, pizzaCalories);
            System.out.println(pizza);

            // Interactive app to get Name Surename and Year //
         /*
            System.out.println("Hello and welcome!");
            System.out.println("What is your name :");
            String userName = scannerUserInfo.nextLine();
            System.out.println("What is your surname :");
            String userSurname = scannerUserInfo.nextLine();
            System.out.println("How old are you :");
            int userAge = scannerUserInfo.nextInt();
            int actualYear = Year.now().getValue();
            int yearOfBirth = actualYear - userAge;
            System.out.println("Welcome " + userName + " " + userSurname + "!");
            System.out.println("You were born around : \"" + yearOfBirth + "\"");*/
        } catch (Exception e) {
            e.printStackTrace();
        }


        return null;
    }
}