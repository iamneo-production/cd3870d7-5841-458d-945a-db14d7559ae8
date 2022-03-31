package com.examly.springapp.repo;



import com.examly.springapp.model.ServiceCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
//import java.util.ArrayList;

@Repository
public interface ServiceCenterRepository extends JpaRepository <ServiceCenter,Long> {

//	ArrayList<UserModel> findByUserType(String userType);
}
