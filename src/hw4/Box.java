package hw4;

import java.util.ArrayList;

public class Box <T extends Fruit>{

    private static int count = 0;

    private int id = ++count;

    private ArrayList<T> fruits = new ArrayList<>();

    public void addFruit(T fruit){
        fruits.add(fruit);
    }

    public double getWeight(){
        double sum = 0;
        for (T fruit: fruits){
            sum += fruit.getWeight();
        }
        return sum;
    }

    public boolean compare(Box<? extends Fruit> box){
        if (this.getWeight() == box.getWeight()){
            System.out.println("The weight of boxes equal");
            return true;
        } else if (this.getWeight() > box.getWeight()){
            System.out.printf("The %s is heavier than the %s\n", this.toString(), box.toString());
            return false;
        } else {
            System.out.printf("The %s is heavier than the %s\n",box.toString(),this.toString());
            return false;
        }
    }

    public void sprinkleFruits(Box<T> box){
        this.fruits.addAll(box.fruits);
        box.fruits.clear();
        System.out.println("Fruits were spilled from " + box.toString() + " to " + this.toString());
    }

    public void showBox(){
        System.out.printf("In the %s %d fruits\n", this.toString(), fruits.size());
    }

    @Override
    public String toString() {
        return "Box" + id;
    }
}
