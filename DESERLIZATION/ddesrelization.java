package DESERLIZATION;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Product implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String name;
    private String category;
    private double price;

    public Product(int id, String name, String category, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public void printDetails() {
        System.out.println("Product ID: " + id);
        System.out.println("Product Name: " + name);
        System.out.println("Product Category: " + category);
        System.out.println("Product Price: " + price);
    }
}

public class ddesrelization {
    public static void main(String[] args) {
        // Serialization
        Product product = new Product(1001, "Laptop", "Electronics", 1200.0);

        // Serialize the object
        try {
            FileOutputStream fileOut = new FileOutputStream("product.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(product);
            out.close();
            fileOut.close();
            System.out.println("Product object has been serialized");
        } catch (IOException i) {
            i.printStackTrace();
        }

        // Deserialization
        Product deserializedProduct = null;
        // Deserialize the object
        try {
            FileInputStream fileIn = new FileInputStream("product.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            deserializedProduct = (Product) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Product object has been deserialized");
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Product class not found");
            c.printStackTrace();
            return;
        }

        // Print details of deserialized object
        System.out.println("\nDeserialized Product Details:");
        deserializedProduct.printDetails();
    }
}
