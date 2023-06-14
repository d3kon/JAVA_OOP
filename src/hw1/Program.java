package hw1;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        Product product1 = new Product("ООО Лучшая вода", "Бу", -100.12);
        Product bottleOfWater1 = new BottleOfWater("ООО Чистый источник", "Бутылка с водой [1]", 115, 1);
        Product bottleOfWater2 = new BottleOfWater("ООО Чистый источник", "Бутылка с водой [2]", 215, 1.5);
        BottleOfWater bottleOfWater3 = new BottleOfWater("ООО Чистый источник", "Бутылка с водой [3]", 1115, 1.5);
        Product bottleOfWater4 = new BottleOfWater("ООО Чистый источник", "Бутылка с водой [4]", 55, 2);
        Product bottleOfMilk1 = new BottleOfMilk("ООО Чистый источник", "Бутылка с молоком", 115, 1.5, 10);

        List<Product> products = new ArrayList<>();
        products.add(bottleOfWater1);
        products.add(bottleOfWater2);
        products.add(bottleOfMilk1);
        products.add(bottleOfWater4);
        products.add(bottleOfWater3);

        VendingMachine vendingMachine = new VendingMachine(products);
        BottleOfWater bottleOfWaterResult = vendingMachine.getBottleOfWater(2);
        vendingMachine.showBuyingInfo(bottleOfWaterResult);

        System.out.println("-------------Домашняя работа-----------------");
        Chocolate chocolate1 = new Chocolate("Nestle","Snickers",59.99,500);
        Chocolate chocolate2 = new Chocolate("Milka","Milka with cookies",109.99,750.5);
        Chocolate chocolate3 = new Chocolate("Бабаевский завод","Бабаевский",39.99,250);

        System.out.println(chocolate1.displayInfo());
        System.out.println(chocolate2.displayInfo());
        System.out.println(chocolate3.displayInfo());

        products.add(chocolate1);
        products.add(chocolate2);
        products.add(chocolate3);

        Chocolate result = vendingMachine.getChocolateBar("Snickers");
        vendingMachine.showBuyingInfo(result);

    }

}
