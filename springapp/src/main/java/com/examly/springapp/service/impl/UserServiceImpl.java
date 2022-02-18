
package comexamly.springapp.service.impl;

import com.examly.springapp.model.User;
import com.examly.springapp.model.UserRole;
import com.examly.springapp.repo.RoleRepository;
import com.examly.springapp.repo.UserRepository;
import com.examly.springapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Override
    public User addUser(User user, Set<UserRole> userRoles) throws Exception {
        //we are creating a method findyUserName to check is the user already present in db
        User local = this.userRepository.findByUsername(user.getUsername());
        if(local !=null){
            System.out.println("User is already there!!");
            throw new Exception("User exits ");
        }
        else {
            //here we are taking role we recieved and saving in db if it not present
            for(UserRole ur :userRoles){
                roleRepository.save(ur.getRole());
            }
            //adding all role that is associated with user
            user.getUserRoles().addAll(userRoles);
            local = this.userRepository.save(user);
        }

        return local;
    }
}
