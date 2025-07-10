package org.example.Course.TaskLesson2;

public class ProductsManagementApp {
    public static void main(String[] args) {

        Products product1 = new Products("AA", 1.2, "SS", 110);
        Products product2 = new Products("BB", 2.3, "FF", 220);
        Products product3 = new Products("CC", 69.1, "YY", 0);
        Products product4 = new Products("DD", 51.9, "UU", 440);

        Products products[] = {product1, product2, product3, product4};

        Store store1 = new Store("StoreAA", "Baku", products);

        System.out.println("\nAll products in " + store1.storeName + ":");
        store1.printAllProducts();

        System.out.println("\nPrice filter");
        store1.printExpensiveProducts(50);

        System.out.println("\nDiscount on all products");
        store1.applyDiscountToAll(10);
    }
}
