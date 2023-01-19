package collections.exercises.product;

import java.util.HashSet;

public class ProductInventory {
    public static void main(String[] args) {
        HashSet<Product> products = new HashSet<>();

        products.add(new Product("Apple", 0.5, 10));
        products.add(new Product("Banana", 0.25, 20));
        products.add(new Product("Orange", 0.75, 15));
        products.add(new Product("Apple", 0.5, 10));

        double totalValue = 0;
        for (Product product : products) {
            totalValue += product.getPrice() * product.getQuantity();
        }

        System.out.println("Total value of all products: $" + totalValue);
    }

}