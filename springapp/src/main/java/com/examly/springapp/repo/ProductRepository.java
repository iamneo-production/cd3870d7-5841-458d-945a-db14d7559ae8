package com.examly.springapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import com.examly.springapp.model.Product;
import com.examly.springapp.model.ServiceCenterModel;
import com.examly.springapp.model.User;

public interface ProductRepository extends JpaRepository<Product,Long> {
    List<Product> findByserviceCenter(ServiceCenterModel serviceCenter);
    List<Product> findByUser(User user);
}
