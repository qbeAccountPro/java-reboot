package fr.quentin;

import java.time.Year;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scannerUserInfo = new Scanner(System.in);
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        System.out.println("What is your name :");
        String userName = scannerUserInfo.nextLine();
        System.out.println("What is your surname :");
        String userSurname = scannerUserInfo.nextLine();
        System.out.println("How old are you :");
        int userAge = scannerUserInfo.nextInt();
        int actualYear = Year.now().getValue();
        int yearOfBirth = actualYear - userAge;
        System.out.println("Welcome \""+userName +" "+userSurname+"\"");
        System.out.println("You was born in : \""+yearOfBirth+"\"");
        }
}