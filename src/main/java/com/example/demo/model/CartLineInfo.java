package com.example.demo.model;

public class CartLineInfo {
	  
    private ProductInfo productInfo;
    private int quantity;
  
    public CartLineInfo() {
        this.quantity = 0;
    }
  
    public ProductInfo getProductInfo() {
        return productInfo;
    }
  
    public void setProductInfo(ProductInfo productInfo) {
        this.productInfo = productInfo;
    }
  
    public int getQuantity() {
        return quantity;
    }
  
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
  
    public double getAmount() {
        return this.productInfo.getPrice() * this.quantity;
    }
     
}