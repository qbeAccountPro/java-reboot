package fr.quentin.model;

public class Recipe {

    private String name;
    private double price;
    private int calories;

    public Recipe(String name, double price, int calories ) {
        this.price = price;
        this.calories = calories;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return """
           ========= RECIPE =========

           Name : %s
           Price : %.2f €
           Calories : %d kcal

           ==========================
           """
                .formatted(name, price, calories);
    }
}
