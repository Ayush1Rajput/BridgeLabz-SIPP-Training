package Scenario_Based_Question.SupermarketBillingQueue;

import java.util.*;

class Item {
    String name;
    int price;
    int quantity;

    public Item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}

class ItemAtMarket {
    HashMap<String, Item> stockMap = new HashMap<>();

    public void addItem(String itemName, int price, int quantity) {
        stockMap.put(itemName, new Item(itemName, price, quantity));
    }

    public Item getItem(String itemName) {
        return stockMap.get(itemName);
    }

    public boolean isAvailable(String itemName, int requiredQty) {
        Item item = stockMap.get(itemName);
        return item != null && item.quantity >= requiredQty;
    }

    public void updateStock(String itemName, int purchasedQty) {
        Item item = stockMap.get(itemName);
        if (item != null && item.quantity >= purchasedQty) {
            item.quantity -= purchasedQty;
        }
    }

    public void printStock() {
        System.out.println("---- Remaining Stock ----");
        for (Item item : stockMap.values()) {
            System.out.println(item.name + ": " + item.quantity + " units");
        }
    }
}

class Customer {
    String name;
    List<Item> cart;

    public Customer(String name) {
        this.name = name;
        this.cart = new ArrayList<>();
    }

    public void addItemToCart(String itemName, int quantity) {
        cart.add(new Item(itemName, 0, quantity)); // price will be fetched at billing time
    }

    public void printCart() {
        System.out.println("Cart for " + name + ":");
        for (Item item : cart) {
            System.out.println(item.name + " x " + item.quantity);
        }
    }
}

class SupermarketQueue {
    Queue<Customer> queue = new LinkedList<>();
    ItemAtMarket inventory;

    public SupermarketQueue(ItemAtMarket inventory) {
        this.inventory = inventory;
    }

    public void addCustomer(Customer customer) {
        queue.offer(customer);
        System.out.println(customer.name + " added to queue.");
    }

    public void removeCustomer() {
        if (!queue.isEmpty()) {
            Customer customer = queue.poll();
            System.out.println("Processing " + customer.name + "'s bill:");
            generateBill(customer);
        } else {
            System.out.println("No customers in queue.");
        }
    }

    public void generateBill(Customer customer) {
        int total = 0;
        for (Item cartItem : customer.cart) {
            if (inventory.isAvailable(cartItem.name, cartItem.quantity)) {
                Item storeItem = inventory.getItem(cartItem.name);
                int price = storeItem.price;
                int subtotal = price * cartItem.quantity;
                total += subtotal;
                System.out.println(cartItem.name + " x " + cartItem.quantity + " = " + subtotal);
                inventory.updateStock(cartItem.name, cartItem.quantity);
            } else {
                System.out.println("Insufficient stock for " + cartItem.name + ". Skipped.");
            }
        }
        System.out.println("Total bill for " + customer.name + ": Rs. " + total + "\n");
    }

    public void processAllCustomers() {
        while (!queue.isEmpty()) {
            removeCustomer();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Initialize market
        ItemAtMarket market = new ItemAtMarket();
        market.addItem("Milk", 20, 25);
        market.addItem("Bread", 25, 45);
        market.addItem("Butter", 10, 13);
        market.addItem("Water", 20, 30);
        market.addItem("Soap", 15, 20);
        market.addItem("Honey", 50, 25);

        // Create customers
        Customer c1 = new Customer("Ayush");
        c1.addItemToCart("Milk", 2);
        c1.addItemToCart("Honey", 3);

        Customer c2 = new Customer("Karan");
        c2.addItemToCart("Bread", 4);
        c2.addItemToCart("Soap", 2);
        c2.addItemToCart("Butter", 5);

        Customer c3 = new Customer("Utkarsh");
        c3.addItemToCart("Water", 10);
        c3.addItemToCart("Milk", 30); // Should trigger stock warning

        // Create queue system
        SupermarketQueue billingQueue = new SupermarketQueue(market);

        billingQueue.addCustomer(c1);
        billingQueue.addCustomer(c2);
        billingQueue.addCustomer(c3);

        // Process all customers
        billingQueue.processAllCustomers();

        // Print remaining stock
        market.printStock();
    }
}
