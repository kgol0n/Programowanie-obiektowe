package Zadanie4;

import java.util.Objects;

public class Product {
    private String productName;
    private String category;
    private double price;

    public Product(String productName, String category, double price) {
        setProductName(productName);
        setCategory(category);
        setPrice(price);
    }

    @Override
    public String toString() {
        return "Product: " + this.productName + ", Category: " + this.category + ", Price: " + this.price + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Product product)) return false;
        return price == product.price && Objects.equals(productName, product.productName) && Objects.equals(category, product.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, category, price);
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        if(productName == null || productName.isEmpty()){
            this.productName = "";
        } else{
            this.productName = productName;
        }
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        if(category == null || category.isEmpty()){
            this.category = "";
        } else{
            this.category = category;
        }
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price < 0){
            this.price = 0;
        } else{
            this.price = price;
        }
    }
}
