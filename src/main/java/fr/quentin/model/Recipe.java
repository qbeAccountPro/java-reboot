package fr.quentin.model;

public class Recipe {

    private String name;
    private double price;
    private int calories;

    public Recipe(double price, int calories, String name) {
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
        return "Recipe{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", calories=" + calories +
                '}';
    }

    public String displayRecipe(){
        return ("========== RECIPE ==========\n\n" +
                "Name : " + name + "\n" +
                "Price : " + price + " €\n" +
                "Calories : " + calories + " Kcal\n" +
                "\n" +
                "============================");
    }
}
