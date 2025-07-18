package org.example.Course.Module2.TaskLesson2;

public class ProductsManagementApp {
    public static void main(String[] args) {

        Products product1 = new Products("Water", 1.5, "Drinks", 110);
        Products product2 = new Products("Bread", 1.1, "Food", 220);
        Products product3 = new Products("Headphones", 60.9, "Electronics", 0);
        Products product4 = new Products("Keyboard", 91.2, "Electronics", 440);

        Products[] products = {product1, product2, product3, product4};

        Store store1 = new Store("MarketOne", "Baku", products);

        System.out.println("\nAll products in " + store1.storeName + ":");
        store1.printAllProducts();

        System.out.println("\nPrice filter");
        store1.printExpensiveProducts(50);

        System.out.println("\nDiscount on all products");
        store1.applyDiscountToAll(10);
    }
}
