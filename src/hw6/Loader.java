package hw6;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Loader {
    private Scanner scanner = new Scanner(System.in);

    public void inputFromConsole(Order order){
        order.setClientName(prompt("Имя клиента: "));
        order.setProduct(prompt("Продукт: "));
        order.setQnt(Integer.parseInt(prompt("Кол-во: ")));
        order.setPrice(Integer.parseInt(prompt("Цена: ")));
    }

    private String prompt(String message){
        System.out.println(message);
        return scanner.nextLine();
    }

    public String loadFromJson(File path, Order order){
        String[] arr = {"clientName", "product", "qnt", "price"};
        String[] elements = new String[arr.length];
        String data = getString(path);
        for (int i = 0; i < arr.length; i++){
            if (data.contains(arr[i].subSequence(0,arr[i].length()-1))){
                int temp = data.indexOf(arr[i]) + (arr[i].length() + 2);
                int index = data.indexOf(',', temp) != -1 ? data.indexOf(',', temp) : data.length()-1;
                elements[i] = data.substring(temp, index);
            }
        }
        order.setClientName(elements[0]);
        order.setProduct(elements[1]);
        order.setQnt(Integer.parseInt(elements[2]));
        order.setPrice(Integer.parseInt(elements[3]));
        return data;
    }

    private String getString(File path){
        try (Scanner scannerFile = new Scanner(path)){
            StringBuilder data = new StringBuilder();
            while (scannerFile.hasNext()){
                data.append(scannerFile.nextLine());
            }
            return data.toString();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
}
