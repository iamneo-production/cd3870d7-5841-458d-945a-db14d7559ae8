//step 2 after model


package com.examly.springapp.repo;

import com.examly.springapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    //spring automatically give implmentation for this
    User findByUsername(String username);

}
