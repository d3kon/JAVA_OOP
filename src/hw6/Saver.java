package hw6;

import java.io.FileWriter;
import java.io.IOException;

public class Saver {

    public void saveToJson(Order order) {
        String fileName = "src/hw6/order.json";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\""+ order.getClientName() + "\",\n");
            writer.write("\"product\":\""+ order.getProduct() +"\",\n");
            writer.write("\"qnt\":"+ order.getQnt() +",\n");
            writer.write("\"price\":"+ order.getPrice() +"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void saveToXML (Order order){
        String fileName = "src/hw6/order.xml";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("<?xml version=\"1.0\"?>\n");
            writer.write("<order>\n");
            writer.write("  <clientName>" + order.getClientName() + "</clientName>\n");
            writer.write("  <product>" + order.getProduct() + "</product>\n");
            writer.write("  <qnt>" + order.getQnt() + "</qnt>\n");
            writer.write("  <price>" + order.getPrice() + "</price>\n");
            writer.write("</order>\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void saveToTxt (Order order){
        String fileName = "src/hw6/order.txt";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("clientName = " + order.getClientName() + "\n");
            writer.write("product = " + order.getProduct() + "\n");
            writer.write("qnt = " + order.getQnt() + "\n");
            writer.write("price = " + order.getPrice() + "\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
