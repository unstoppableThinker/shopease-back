package com.aelio.shopease.services;

import com.aelio.shopease.entities.Product;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProductService {

    public Product addProduct(Product product);
    public List<Product> getAllProducts();
}
