package hw1;

import java.util.List;

public class VendingMachine {

    private List<Product> products;


    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public BottleOfWater getBottleOfWater(double volume){
        for (Product product : products){
            if (product instanceof BottleOfWater){
                if (((BottleOfWater)product).getVolume()  == volume){
                    return (BottleOfWater)product;
                }
            }
        }
        return null;
    }

    public Chocolate getChocolateBar(String name){
        for (Product product : products){
            if (product instanceof Chocolate){
                if (((Chocolate)product).getName().equals(name)){
                    return (Chocolate) product;
                }
            }
        }
        return null;
    }

    void showBuyingInfo (Product product){
        if (product != null){
            System.out.println("Вы купили: ");
            System.out.println(product.displayInfo());
        } else {
            System.out.println("Такого товара нет!");
        }
    }

}
