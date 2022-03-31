//step 3
package com.examly.springapp.service;

import com.examly.springapp.model.User;
import com.examly.springapp.model.UserRole;

import java.util.Set;

public interface UserService {
    //creating user
    //taking userRole in set mean ,it might possile if a single user is both admin,customer,pass to it
    User addUser(User user, Set<UserRole> userRoles) throws Exception;

}
