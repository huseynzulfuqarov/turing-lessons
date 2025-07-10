package org.example.Course.TaskLesson2;

public class Products {
    String productName;
    double productPrice;
    String productCategory;
    int productStock;

    public Products(String productName, double productPrice, String productCategory, int productStock) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productCategory = productCategory;
    }

    public String toString() {
        return "Products{name=%s, price=%s, category=%s, stock=%d}".formatted(this.productName, this.productPrice, this.productCategory, this.productStock);
    }

    public double discountPrice(double percent) {
        return productPrice - percent * productPrice * 0.01;
    }

    public boolean isInStock() {
        return productStock > 0;
    }
}
