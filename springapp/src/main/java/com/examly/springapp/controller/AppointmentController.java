package com.examly.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.examly.springapp.model.Product;
import com.examly.springapp.model.ServiceCenterModel;
import com.examly.springapp.service.ProductService;
import com.examly.springapp.model.User;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class AppointmentController {
    @Autowired
    private ProductService productService;

    @PostMapping("/appointment")
    public ResponseEntity<?> addProduct(@RequestBody Product product){
        return ResponseEntity.ok(this.productService.addProduct(product));
    }

    @PutMapping("/appointment/update")
    public ResponseEntity<?> updateProduct(@RequestBody Product product){
        return ResponseEntity.ok(this.productService.updateProduct(product));
    }

    @GetMapping("/getAppointmentpid/{pId}")
    public Product getProductBypId(@PathVariable("pId") Long pId){
        return this.productService.getProduct(pId);
    }
    @GetMapping("/getAppointment/{serviceCenterID}")
    public <ServiceCenter> List<Product> getProductOfServiceCenter(@PathVariable("serviceCenterID") Long serviceCenterID){
        ServiceCenterModel serviceCenter = new ServiceCenterModel();
        serviceCenter.setServiceCenterID(serviceCenterID);
        return this.productService.getProductOfServiceCenter(serviceCenter);
    }

    @GetMapping("/getAppointmentByUser/{Id}")
    public List<Product> getProductOfUser(@PathVariable("Id") Long Id){
        User user = new User();
        user.setId(Id);
        return this.productService.getProductOfUser(user);
    }
    @DeleteMapping("/cancelappointment/{pId}")
    public void deleteAppointment(@PathVariable("pId") Long pId){
        this.productService.deleteProduct(pId);
    }

    
}
