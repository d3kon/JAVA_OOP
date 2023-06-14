package hw2;

public class MainClass {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", 5);
        Plate plate = new Plate(40);
        plate.info();
        cat1.eat();
        plate.setFood(plate.getFood() - cat1.getAppetite());
        plate.info();

        Cat[] cats = {
            cat1,
            new Cat("Vasya", 10),
            new Cat("Musya", 4),
            new Cat("Sherik",8),
            new Cat("Kolobok",15),
            new Cat("Fluffy", 6)
        };

        for (Cat cat: cats) {
            if (plate.getFood() >= cat.getAppetite() && !cat.isSatiety()){
                cat.eat();
                plate.setFood(plate.getFood() - cat.getAppetite());
                plate.info();
            }
        }

        for (Cat cat: cats) {
            System.out.println(cat.getName() + ": " + cat.isSatiety());
        }

        plate.addFood(50);
        plate.info();
    }
}
