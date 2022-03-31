package com.examly.springapp.controller;
import com.examly.springapp.helper.FileUploadHelper;
import com.examly.springapp.model.ServiceCenter;
import com.examly.springapp.service.ServiceCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@CrossOrigin("*")
public class ServiceCenterController {

    @Autowired
    private ServiceCenterService serviceCenterService;
    @Autowired
    private FileUploadHelper fileUploadHelper;
    
    
    @GetMapping("/admin/getServiceCenter")
    public ResponseEntity<?> viewServiceCenter()
    {
    	return ResponseEntity.ok(serviceCenterService.viewServiceCenter());
	}

    @GetMapping("admin/getServiceCenter/{serviceCenterID}")
    public  ResponseEntity<?> ServiceCenter(@PathVariable("serviceCenterID") Long serviceCenterID){
        return ResponseEntity.ok(this.serviceCenterService.getServiceCenter(serviceCenterID));
    }


    @PostMapping("/admin/addServiceCenter")
    public ResponseEntity<?> addServiceCenter( ServiceCenter serviceCenter,
                                              @RequestParam("file") MultipartFile file)
    {


        try {

            if(file.isEmpty()){
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Request must contain file");
            }
            boolean f = fileUploadHelper.uploadFile(file);
            System.out.println(f);
            if(f){
              
            }

        }catch(Exception e){
            e.printStackTrace();
        }

       
        return ResponseEntity.ok(serviceCenterService.addServiceCenter(serviceCenter, file));

    }
    
  
    
    @DeleteMapping("/admin/deleteServiceCenter/{serviceCenterID}")
    public ResponseEntity<?> deleteServiceCenter(@PathVariable Long serviceCenterID)
    {
    	System.out.println(serviceCenterID);
    	return ResponseEntity.ok(serviceCenterService.deleteServiceCenter(serviceCenterID));
    }
    

    @PostMapping("admin/updateServiceCenter")
    public ResponseEntity<ServiceCenter> editServiceCenter(@RequestBody ServiceCenter serviceCenter){
        return ResponseEntity.ok(this.serviceCenterService.updateServiceCenter(serviceCenter));
    }
    
}
