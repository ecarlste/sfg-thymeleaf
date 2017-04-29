package com.erikcarlsten.services;

import com.erikcarlsten.domain.Product;

import java.util.List;

public interface ProductService {

    Product getProduct(Integer id);

    List<Product> listProducts();
}