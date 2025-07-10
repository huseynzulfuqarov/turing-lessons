package org.example.Course.TaskLesson2;

public class Store {
    String storeName;
    String storeAddress;
    Products[] storeProducts;

    public Store(String storeName, String storeAddress, Products[] storeProducts) {
        this.storeName = storeName;
        this.storeAddress = storeAddress;
        this.storeProducts = storeProducts;
    }

    public void printAllProducts() {
        for (Products p : storeProducts) {
            System.out.println(p.toString());
        }
    }

    public void printExpensiveProducts(double limit) {
        boolean check = true;
        for (Products p : storeProducts) {
            if (p.isInStock()) {     // product3 will not be shown because it's out of stock.
                if (p.productPrice > limit) {
                    check = false;
                    System.out.println(p.toString());
                }
            }
        }
        if (check) System.out.println("No products match your filter.");
    }

    public void applyDiscountToAll(double percent) {
        for (Products p : storeProducts) {
            p.productPrice = p.discountPrice(percent);
            System.out.println(p.toString());
        }
    }
}


