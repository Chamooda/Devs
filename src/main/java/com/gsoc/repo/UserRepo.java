package com.gsoc.repo;

import com.gsoc.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {
    public User findByEmail(String email);


}
