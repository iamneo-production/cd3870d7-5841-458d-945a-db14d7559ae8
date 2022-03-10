package com.examly.springapp.service;

import antlr.StringUtils;


import com.examly.springapp.model.ServiceCenterModel;



import com.examly.springapp.model.ResponseModel;

import com.examly.springapp.repo.ServiceCenterRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.List;
import java.lang.String;

@Service
public class ServiceCenterService {


    @Autowired
    private ServiceCenterRepository serviceCenterRepository;
    
    public List<ServiceCenterModel> viewServiceCenter()
    {
    	return serviceCenterRepository.findAll();
	}

        
    public ResponseModel addServiceCenter(@RequestBody ServiceCenterModel serviceCenterModel, MultipartFile multipartFile)
    {
        String fileName = ServletUriComponentsBuilder.fromCurrentContextPath().
                path("/image/").path(multipartFile.getOriginalFilename()).toUriString();
        serviceCenterModel.setServiceCenterImageUrl(fileName);
        serviceCenterRepository.save(serviceCenterModel);
    	return new ResponseModel("new user "+serviceCenterModel.getServiceCenterName()+" added successfully!!!");
    }
//
//    public ResponseModel updateUser(ServiceCenterModel serviceCenterModel)
//    {
//    	serviceCenterRepository.save(serviceCenterModel);
//    	return new ResponseModel("user "+serviceCenterModel.getServiceCenterName()+" details updated successfully!!!");
//	}
    
    public ResponseModel deleteServiceCenter(String serviceCenterID)
    {
        serviceCenterRepository.deleteById(serviceCenterID);
    	return new ResponseModel("user details deleted successfully :(");	
    }
    
//   public ResponseModel editServiceCenter(String serviceCenterID , ServiceCenterModel serviceCenterModelModel,MultipartFile multipartFile) {
//
//       String fileName = ServletUriComponentsBuilder.fromCurrentContextPath().
//               path("/image/").path(multipartFile.getOriginalFilename()).toUriString();
//       serviceCenterModelModel.setServiceCenterImageUrl(fileName);
//       serviceCenterRepository.save(serviceCenterModelModel);
//	return new ResponseModel("User Updated Successfully");
//   }
public ResponseModel updateServiceCenter(@RequestBody ServiceCenterModel serviceCenterModel, MultipartFile multipartFile)
{
    String fileName = ServletUriComponentsBuilder.fromCurrentContextPath().
            path("/image/").path(multipartFile.getOriginalFilename()).toUriString();
    serviceCenterModel.setServiceCenterImageUrl(fileName);
    serviceCenterRepository.save(serviceCenterModel);
    return new ResponseModel("new user "+serviceCenterModel.getServiceCenterName()+" added successfully!!!");
}
    
}
