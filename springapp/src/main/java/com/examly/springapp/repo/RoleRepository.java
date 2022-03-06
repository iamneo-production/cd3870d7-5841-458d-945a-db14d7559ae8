//this repo to save role

package com.examly.springapp.repo;

import com.examly.springapp.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RoleRepository extends JpaRepository<Role,Long> {
}
