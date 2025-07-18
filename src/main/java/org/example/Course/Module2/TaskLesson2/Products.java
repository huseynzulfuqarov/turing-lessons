package org.example.Course.Module2.TaskLesson2;

public class Products {
    String productName;
    double productPrice;
    String productCategory;
    int productStock;

    public Products(String productName, double productPrice, String productCategory, int productStock) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productCategory = productCategory;
        this.productStock = productStock;
    }

    public String toString() {
        return "Products{ name = %s, price = %2.2f, category = %s, stock = %d}".formatted(this.productName, this.productPrice, this.productCategory, this.productStock);
    }

    public double discountPrice(double percent) {
        return productPrice * (1 - percent * 0.01);
    }

    public boolean isInStock() {
        return productStock > 0;
    }
}
