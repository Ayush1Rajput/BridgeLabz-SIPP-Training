package Scenarios_Questions;

import java.util.*;

class Item {
 private String itemName;
 private int quantity;
 private double pricePerUnit;

 public Item(String itemName, int quantity, double pricePerUnit) {
     this.itemName = itemName;
     this.quantity = quantity;
     this.pricePerUnit = pricePerUnit;
 }

 public String getItemName() {
     return itemName;
 }

 public int getQuantity() {
     return quantity;
 }

 public double getPricePerUnit() {
     return pricePerUnit;
 }

 public double getTotalPrice() {
     return quantity * pricePerUnit;
 }

 @Override
 public boolean equals(Object o) {
     if (this == o) return true;
     if (!(o instanceof Item)) return false;
     Item item = (Item) o;
     return itemName.equalsIgnoreCase(item.itemName);
 }

 @Override
 public int hashCode() {
     return itemName.toLowerCase().hashCode();
 }

 @Override
 public String toString() {
     return itemName + " - Qty: " + quantity + ", Price per unit: $" + pricePerUnit;
 }
}

//Generic Cart Manager
class ShoppingCart<T extends Item> {
 private Set<T> itemSet;     
 private List<T> itemList;   

 public ShoppingCart() {
     itemSet = new HashSet<>();
     itemList = new ArrayList<>();
 }

 public void addItem(T item) {
     if (itemSet.contains(item)) {
         System.out.println("Item already in cart: " + item.getItemName());
     } else {
         itemSet.add(item);
         itemList.add(item);
         System.out.println("Added: " + item);
     }
 }

 public double calculateTotalCost() {
     double total = 0;
     for (T item : itemList) {
         total += item.getTotalPrice();
     }
     return total;
 }

 public void showCartItems() {
     if (itemList.isEmpty()) {
         System.out.println("Cart is empty.");
     } else {
         System.out.println("Items in cart:");
         for (T item : itemList) {
             System.out.println(item);
         }
     }
 }
}

public class SupermarketBillingSystem {
 public static void main(String[] args) {
     // Create a cart for grocery items
     ShoppingCart<Item> groceryCart = new ShoppingCart<>();

     groceryCart.addItem(new Item("Milk", 2, 1.5));
     groceryCart.addItem(new Item("Bread", 1, 2.0));
     groceryCart.addItem(new Item("Milk", 1, 1.5));  

     System.out.println();

     groceryCart.showCartItems();

     System.out.println("\nTotal Cost: $" + groceryCart.calculateTotalCost());
 }
}
