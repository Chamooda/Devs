package com.gsoc.services.impl;

import com.gsoc.model.User;
import com.gsoc.repo.UserRepo;
import com.gsoc.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;


    @Override
    public User createUser(User user) throws Exception {
        User local=this.userRepo.findByEmail(user.getEmail());
        if(local!=null){
            throw new Exception("User Already exist");
        }
        else{
            local=this.userRepo.save(user);
        }
        return local;

    }

    @Override
    public User getUser(String userName) {
        return this.userRepo.findByEmail(userName);
    }

    @Override
    public void deleteUser(Long UserId) {
        this.userRepo.deleteById(UserId);
    }

    @Override
    public Object check(String password, User user) {
        if(user.getPassword()!=password){
            return new Exception("invalid credentials");
        }
        return user;
    }
}
