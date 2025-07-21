package Generics;

import java.util.ArrayList;
import java.util.List;

// Base interface for categories
interface Category {
    String getCategoryName();
}

// Book category enum
enum BookCategory implements Category {
    FICTION, EDUCATION, HISTORY;

    @Override
    public String getCategoryName() {
        return this.name();
    }
}

// Clothing category enum
enum ClothingCategory implements Category {
    MENS, WOMENS, KIDS;

    @Override
    public String getCategoryName() {
        return this.name();
    }
}

// Gadget category enum
enum GadgetCategory implements Category {
    MOBILE, LAPTOP, ACCESSORY;

    @Override
    public String getCategoryName() {
        return this.name();
    }
}

// Generic Product class with bounded type parameter
class Product<T extends Category> {
    private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public void applyDiscount(double percentage) {
        double discountAmount = (price * percentage) / 100;
        price -= discountAmount;
    }

    public void showDetails() {
        System.out.println("Product: " + name + ", Price: ₹" + price + ", Category: " + category.getCategoryName());
    }

    public String getName() {
        return name;
    }

    public T getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }
}

// Utility class with generic method
class DiscountManager {
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        product.applyDiscount(percentage);
        System.out.println("Discount applied to: " + product.getName() + " (" + product.getCategory().getCategoryName() + ")");
    }
}

// Main class
public class OnlineMarketplace {
    public static void main(String[] args) {
        // Create catalog
        List<Product<? extends Category>> catalog = new ArrayList<>();

        // Create products
        Product<BookCategory> book = new Product<>("Java Programming", 500.0, BookCategory.EDUCATION);
        Product<ClothingCategory> shirt = new Product<>("Cotton Shirt", 800.0, ClothingCategory.MENS);
        Product<GadgetCategory> phone = new Product<>("Smartphone X", 15000.0, GadgetCategory.MOBILE);

        // Add to catalog
        catalog.add(book);
        catalog.add(shirt);
        catalog.add(phone);

        // Show catalog before discount
        System.out.println("Catalog Before Discount:");
        for (Product<? extends Category> product : catalog) {
            product.showDetails();
        }

        // Apply discounts
        DiscountManager.applyDiscount(book, 10);    // 10% off
        DiscountManager.applyDiscount(shirt, 15);   // 15% off
        DiscountManager.applyDiscount(phone, 5);    // 5% off

        // Show catalog after discount
        System.out.println("\nCatalog After Discount:");
        for (Product<? extends Category> product : catalog) {
            product.showDetails();
        }
    }
}
