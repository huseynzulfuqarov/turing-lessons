package org.example.Course.TaskLesson2;

public class Store {
    String name;
    String adderss;
    Products[] products;

    public Store(String name, String adderss, Products[] products) {
        this.name = name;
        this.adderss = adderss;
        this.products = products;
    }

    public void printAllProducts() {
        for (Products p : products) {
            System.out.println(p.productName + " " + p.productPrice);
        }
    }

    public void printExpensiveProducts(double limit) {
        boolean check = true;
        for (Products p : products) {
            if (p.productPrice > limit) {
                check = false;
                System.out.println(p.productName + " " + p.productPrice);
            }
        }
        if (check) System.out.println("No product to your filter");
    }

    public void applyDiscountToAll(double percent) {
        for (Products p : products) {
            p.productPrice = p.productPrice - p.productPrice * percent * 0.01;
            System.out.println(p.productName + " " + p.productPrice);
        }
    }


}
