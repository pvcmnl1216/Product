package com.niit.Product.service;

import com.niit.Product.domain.Product;

import java.util.List;

public interface ProductService {

    public Product save(Product product);

    public List<Product> getAll();

    public int delete(Integer productId);

    public Product getById(Integer productId);
}
