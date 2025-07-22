package Generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Abstract base class
abstract class WarehouseItem {
    protected String name;

    public WarehouseItem(String name) {
        this.name = name;
    }

    public abstract void displayDetails();
}

// Electronics class
class Electronics extends WarehouseItem {
    private int warrantyYears;

    public Electronics(String name, int warrantyYears) {
        super(name);
        this.warrantyYears = warrantyYears;
    }

    @Override
    public void displayDetails() {
        System.out.println("Electronics Item: " + name + ", Warranty: " + warrantyYears + " year(s)");
    }
}

// Groceries class
class Groceries extends WarehouseItem {
    private String expiryDate;

    public Groceries(String name, String expiryDate) {
        super(name);
        this.expiryDate = expiryDate;
    }

    @Override
    public void displayDetails() {
        System.out.println("Grocery Item: " + name + ", Expiry Date: " + expiryDate);
    }
}

// Furniture class
class Furniture extends WarehouseItem {
    private String material;

    public Furniture(String name, String material) {
        super(name);
        this.material = material;
    }

    @Override
    public void displayDetails() {
        System.out.println("Furniture Item: " + name + ", Material: " + material);
    }
}

// Generic storage class
class Storage<T extends WarehouseItem> {
    private List<T> items;

    public Storage() {
        items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
        System.out.println("Item added: " + item.name);
    }

    public List<T> getItems() {
        return items;
    }
}

// Utility class to display any type of WarehouseItem
class DisplayUtility {
    public static void displayAllItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            item.displayDetails();
        }
    }
}

// Main class
public class SmartWarehouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating storage for each type
        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Groceries> groceriesStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();

        // Adding items
        electronicsStorage.addItem(new Electronics("Laptop", 2));
        electronicsStorage.addItem(new Electronics("Smartphone", 1));

        groceriesStorage.addItem(new Groceries("Apples", "2025-08-01"));
        groceriesStorage.addItem(new Groceries("Milk", "2025-07-22"));

        furnitureStorage.addItem(new Furniture("Chair", "Wood"));
        furnitureStorage.addItem(new Furniture("Table", "Steel"));

        // Display all items using wildcard method
        System.out.println("\nElectronics Items:");
        DisplayUtility.displayAllItems(electronicsStorage.getItems());

        System.out.println("\nGrocery Items:");
        DisplayUtility.displayAllItems(groceriesStorage.getItems());

        System.out.println("\nFurniture Items:");
        DisplayUtility.displayAllItems(furnitureStorage.getItems());

        scanner.close();
    }
}
