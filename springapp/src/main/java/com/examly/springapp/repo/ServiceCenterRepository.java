package com.examly.springapp.repo;

import com.examly.springapp.model.ServiceCenterModel;






import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//import java.util.ArrayList;

@Repository
public interface ServiceCenterRepository extends JpaRepository <ServiceCenterModel,String> {

//	ArrayList<UserModel> findByUserType(String userType);
}
