package com.examly.springapp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.examly.springapp.model.Product;
import com.examly.springapp.model.ServiceCenterModel;
import com.examly.springapp.model.User;
import com.examly.springapp.repo.ProductRepository;
import com.examly.springapp.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;


    @Override
    public Product addProduct(Product product) {
        return this.productRepository.save(product);
    }

    @Override
    public Product updateProduct(Product product) {
        return this.productRepository.save(product);
    }

    @Override
    public void deleteProduct(Long pId) {
        Product product = new Product();
        product.setpId(pId);
        this.productRepository.delete(product);
    }

    @Override
    public Product getProduct(Long pId) {
        return this.productRepository.findById(pId).get();
    }

    @Override
    public List<Product> getProductOfServiceCenter(ServiceCenterModel serviceCenter) {
        return this.productRepository.findByserviceCenter(serviceCenter);
    }

    @Override
    public List<Product> getProductOfUser(User user) {
        return this.productRepository.findByUser(user);
    }

}
