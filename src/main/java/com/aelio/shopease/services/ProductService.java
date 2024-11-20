package com.aelio.shopease.services;

import com.aelio.shopease.dtos.ProductDto;
import com.aelio.shopease.entities.Product;

import java.util.List;

public interface ProductService {

    public Product addProduct(ProductDto product);
    public List<Product> getAllProducts();
}
