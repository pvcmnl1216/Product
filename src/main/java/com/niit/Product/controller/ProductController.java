/*
 * Author Name: Philip Meshach
 * Date: 27-12-2022
 * Praise The Lord
 */
package com.niit.Product.controller;

import com.niit.Product.domain.Product;
import com.niit.Product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class ProductController {

    @Autowired
    ProductService productService;
   @PostMapping
    public ResponseEntity<?> saveAll(@RequestBody Product product){
        return new ResponseEntity<>(productService.save(product), HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<?> getALl(){
        return new ResponseEntity<>(productService.getAll(),HttpStatus.OK);
    }
    @DeleteMapping("/product/{productId}")
    public ResponseEntity<?> deleteProduct(@PathVariable Integer productId){
        return new ResponseEntity<>(productService.delete(productId),HttpStatus.OK);
    }
    @GetMapping("/product/{productId}")
    public ResponseEntity<?> getProductById(@PathVariable Integer productId){
        return new ResponseEntity<>(productService.getById(productId),HttpStatus.OK);
    }
}
