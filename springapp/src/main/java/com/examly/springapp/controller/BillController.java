package com.examly.springapp.controller;

import com.examly.springapp.model.Bill;
import com.examly.springapp.service.BillService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Bill")
@CrossOrigin("*")
public class BillController {
    @Autowired
    private BillService billService;

    @PostMapping("/addBill")
    public ResponseEntity<?> addBill(@RequestBody Bill bill){
        return ResponseEntity.ok( this.billService.addBill(bill));
    }
    @PostMapping("/updateBill")
    public ResponseEntity<?> updateBill(@RequestBody Bill bill){
        return ResponseEntity.ok(this.billService.updateBill(bill));
    }
    @GetMapping("/getBill/{Id}")
    public ResponseEntity<?> getBill(@PathVariable("Id") Long Id){
        return ResponseEntity.ok(this.billService.getBill(Id));
    }
    @GetMapping("/getBillbyProduct/{pId}")
    public ResponseEntity<?> getBillBypId(@PathVariable("pId") Long pId){
        return ResponseEntity.ok(this.billService.getBillBypId(pId));
    }
    @DeleteMapping("/delete/{Id}")
    public void deleteBill(@PathVariable("Id") Long Id){
        this.billService.deleteBill(Id);
    }
}
