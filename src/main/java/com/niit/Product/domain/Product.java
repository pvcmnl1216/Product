/*
 * Author Name: Philip Meshach
 * Date: 27-12-2022
 * Praise The Lord
 */
package com.niit.Product.domain;

public class Product {
    private int productId;
    private String productName;
    private String productDescription;
    private String amountInStock;

    public Product() {
    }

    public Product(int productId, String productName, String productDescription, String amountInStock) {
        this.productId = productId;
        this.productName = productName;
        this.productDescription = productDescription;
        this.amountInStock = amountInStock;
    }
}
