package hw1;

public class Chocolate extends Product{
    private double calories;

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public Chocolate(String brand, String name, double price, double calories) {
        super(brand, name, price);
        if (calories >= 0){
            this.calories = calories;
        }
        else{
            this.calories = 100;
        }
    }

    @Override
    public String displayInfo() {
        return String.format("Название: %s, калории: %.2f, цена: %.2f\nБренд: %s",
                name, calories, price, brand);
    }
}
