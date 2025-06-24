package com.lightpharma.tms.repositories ;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lightpharma.tms.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
