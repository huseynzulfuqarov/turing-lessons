package org.example.Course.TaskLesson2;

public class ProductsManamentAPP {
    public static void main(String[] args) {

        Products product1 = new Products("AA", 1.2, "SS", 110);
        Products product2 = new Products("BB", 2.3, "FF", 220);
        Products product3 = new Products("CC", 3.4, "YY", 330);
        Products product4 = new Products("DD", 51.9, "UU", 440);

        Products products[] = {product1, product2, product3, product4};

        Store store1 = new Store("StoreXX", "Baku", products);

        System.out.println("\nAll products in store1:");
        store1.printAllProducts();

        System.out.println("\nPrice filter");
        store1.printExpensiveProducts(50);

        System.out.println("\nDiscount to all products");
        store1.applyDiscountToAll(10);
    }
}
