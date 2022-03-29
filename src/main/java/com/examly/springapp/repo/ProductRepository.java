package com.examly.springapp.repo;

import com.examly.springapp.model.Product;
import com.examly.springapp.model.ServiceCenter;
import com.examly.springapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {
    List<Product> findByserviceCenter(ServiceCenter serviceCenter);
    List<Product> findByUser(User user);
}
