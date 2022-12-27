/*
 * Author Name: Philip Meshach
 * Date: 27-12-2022
 * Praise The Lord
 */
package com.niit.Product.service;

import com.niit.Product.domain.Product;
import com.niit.Product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    ProductRepository productRepository;

    @Override
    public Product save(Product product) {
        if (productRepository.findById(product.getProductId()).isEmpty()) {
            return productRepository.save(product);
        }return null;
    }

    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public int delete(Integer productId) {
        if (productRepository.findById(productId).isEmpty()) {
         return Integer.parseInt("user does not exist");
        }
        productRepository.deleteById(productId);
        return Integer.parseInt("user delete successfully");
    }

    @Override
    public Product getById(Integer productId) {
        return productRepository.findById(productId).get();
    }
}
