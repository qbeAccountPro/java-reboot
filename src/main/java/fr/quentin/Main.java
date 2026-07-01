package fr.quentin;

import fr.quentin.model.Recipe;

import java.time.Year;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("=========================\n" +
                " JAVA REBOOT\n" +
                "=========================");
        try {
            Scanner scannerUserInfo = new Scanner(System.in);
            System.out.println("Hello and welcome!");
            System.out.println("What is the name of your new pizza :");
            String pizzaName = scannerUserInfo.nextLine();
            System.out.println("What is the price of " + pizzaName);
            Double pizzaPrice = scannerUserInfo.nextDouble();
            System.out.println("What is the amout of calories inside the " + pizzaName);
            int pizzaCalories = scannerUserInfo.nextInt();
            Recipe pizza = new Recipe(pizzaPrice, pizzaCalories, pizzaName);
            System.out.println("To recap, here is the pizza :");
            System.out.println(pizza.displayRecipe());

            // Interactive app for Name Surename and Year //
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
            System.out.println("An error occurred.");
        }


    }
}