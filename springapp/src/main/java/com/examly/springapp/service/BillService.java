package com.examly.springapp.service;

import com.examly.springapp.model.Bill;

public interface BillService {
    Bill addBill(Bill bill);
    Bill updateBill(Bill bill);
    Bill getBill(Long Id);
    void deleteBill(Long Id);
    Bill getBillBypId(Long pId);
}