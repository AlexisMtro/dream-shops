package com.dailycodework.dreamshops.service.product;

import com.dailycodework.dreamshops.model.Product;

import java.util.List;

public interface IProductSerivce {
    Product addProduct(Product product);

    Product getProductById(Long id);
    Product updateProduct(Product product, Long productId);
    void deleteProduct(Long id);

    List<Product> getProducts();
    List<Product> getProductsByCategory(String category);
    List<Product> getProductsByBrand(String brand);
    List<Product> getProductsByCategoryAndBrand(String category, String brand);
    List<Product> getProductsByName(String name);
    List<Product> getProductsByBrandAndName(String brand, String name);
    Long countProductsByBrandAndName(String brand, String name);
}
