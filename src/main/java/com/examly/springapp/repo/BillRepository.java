package com.examly.springapp.repo;

import com.examly.springapp.model.Bill;
import com.examly.springapp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Bill,Long> {
    Bill findByproduct(Product product);
}
