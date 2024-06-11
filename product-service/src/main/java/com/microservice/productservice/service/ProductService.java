package com.microservice.productservice.service;

import com.microservice.productservice.dto.ProductRequest;
import com.microservice.productservice.dto.ProductResponse;

import java.util.List;

public interface ProductService {

    void createOrder(ProductRequest productRequest);

    List<ProductResponse> getAllOrders();
}
