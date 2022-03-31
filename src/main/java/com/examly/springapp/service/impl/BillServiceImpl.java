package com.examly.springapp.service.impl;

import com.examly.springapp.model.Bill;
import com.examly.springapp.model.Product;
import com.examly.springapp.repo.BillRepository;
import com.examly.springapp.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillServiceImpl implements BillService {
    @Autowired
    private BillRepository billRepository;
    @Override
    public Bill addBill(Bill bill) {
        return this.billRepository.save(bill);
    }

    @Override
    public Bill updateBill(Bill bill) {
        return this.billRepository.save(bill);
    }

    @Override
    public Bill getBill(Long Id) {
        return this.billRepository.findById(Id).get();
    }

    @Override
    public void deleteBill(Long Id) {
        Bill bill = new Bill();
        bill.setId(Id);
        this.billRepository.delete(bill);

    }

    @Override
    public Bill getBillBypId(Long pId) {
        Product product = new Product();
        product.setpId(pId);
        return this.billRepository.findByproduct(product);
    }
}
