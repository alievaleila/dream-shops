package com.dailycodework.dream_shops.service.product;

import com.dailycodework.dream_shops.model.Product;
import com.dailycodework.dream_shops.request.product.AddProductRequest;
import com.dailycodework.dream_shops.request.product.UpdateProductRequest;

import java.util.List;

public interface IProductService {

    Product addProduct(AddProductRequest request);

    List<Product> getAllProducts();

    Product getProductById(Long id);

    Product updateProductById(UpdateProductRequest request, Long productId);

    void deleteProductById(Long id);

    List<Product> getProductsByCategory(String category);

    List<Product> getProductsByBrand(String brand);

    List<Product> getProductsByCategoryAndBrand(String category, String brand);

    List<Product> getProductsByName(String name);

    List<Product> getProductsByBrandAndName(String brand, String name);

    Long countProductsByBrandAndName(String brand, String name);

}
