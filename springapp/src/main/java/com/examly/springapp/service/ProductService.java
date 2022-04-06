package com.examly.springapp.service;

import com.examly.springapp.model.Product;
import com.examly.springapp.model.ServiceCenterModel;
import com.examly.springapp.model.User;
import java.util.List;


public interface ProductService {
    Product addProduct(Product product);
    Product updateProduct(Product product);
    void deleteProduct(Long pId);
    Product getProduct(Long pId);
    List<Product> getProductOfServiceCenter(ServiceCenterModel serviceCenter);
    List<Product> getProductOfUser(User user);
    
}
