/*
╔══════════════════════════════════════════════════════╗
║                 JAVA ASSIGNMENT                      ║
╠══════════════════════════════════════════════════════╣

Instructor:
Okan Acikel

Course:
Java Software Development

Topic:
Simple Shop System

Difficulty:
Intermediate to Advanced

Year:
2026

╠══════════════════════════════════════════════════════╣

OBJECTIVE:

Implement a simple shop system with products, a shopping
cart and checkout functionality.

╠══════════════════════════════════════════════════════╣

INSTRUCTIONS:

• Implement all TODO sections
• Do not modify method signatures
• Write clean and readable code
• Validate input data

╠══════════════════════════════════════════════════════╣

REQUIREMENTS:

Create the following components:

1. class Product
   Attributes:
   - name
   - price
   - stock

   Methods:
   - constructor
   - getters
   - reduceStock(int amount)
   - increaseStock(int amount)

2. class Cart
   Attributes:
   - Map<Product, Integer> items

   Methods:
   - addProduct(Product p, int amount)
   - removeProduct(Product p)
   - calculateTotal()
   - checkout()

3. class Shop
   Attributes:
   - List<Product> products

   Methods:
   - addProduct(Product product)
   - printProducts()
   - findProductByName(String name)

╠══════════════════════════════════════════════════════╣

RULES:

• Product name must not be empty
• Price must be positive
• Stock must not be negative
• Cart amount must be positive
• Stock must never go below zero

╠══════════════════════════════════════════════════════╣

BONUS:

• discount system
• tax calculation
• receipt printing
• product search by price range
• cart quantity updates

╠══════════════════════════════════════════════════════╣

TEST IDEA:

Create several products.
Add them to a shop.
Add products to a cart.
Calculate total.
Run checkout.
Verify that stock values were updated.

╠══════════════════════════════════════════════════════╣

Instructor:
Okan Acikel

Java Programming Course

╚══════════════════════════════════════════════════════╝
*/

import java.util.Map;

class Product {

    // TODO:
    // Define all required attributes

    public Product(String name, double price, int stock) {
        // TODO:
        // Validate input
        // Initialize attributes
    }

    public String getName() {
        // TODO:
        return null;
    }

    public double getPrice() {
        // TODO:
        return 0;
    }

    public int getStock() {
        // TODO:
        return 0;
    }

    public void reduceStock(int amount) {
        // TODO:
        // Reduce stock if possible
    }

    public void increaseStock(int amount) {
        // TODO:
        // Increase stock
    }
}

class Cart {

    // TODO:
    // Define the cart map

    public void addProduct(Product p, int amount) {
        // TODO:
        // Add product and amount to cart
    }

    public void removeProduct(Product p) {
        // TODO:
        // Remove product from cart
    }

    public double calculateTotal() {
        // TODO:
        // Calculate total cart value
        return 0;
    }

    public void checkout() {
        // TODO:
        // Reduce stock for all products
        // Clear cart after checkout
    }
}

class Shop {

    // TODO:
    // Define the product list

    public void addProduct(Product product) {
        // TODO:
        // Add product to shop
    }

    public void printProducts() {
        // TODO:
        // Print all available products
    }

    public Product findProductByName(String name) {
        // TODO:
        // Find and return a product by name
        return null;
    }
}

public class Main {
    public static void main(String[] args) {

        /*
        TODO:
        1. Create a Shop object
        2. Add multiple products
        3. Print all products
        4. Create a Cart
        5. Add products to the cart
        6. Print the total price
        7. Run checkout
        8. Print products again to verify stock updates
        */
    }
}
