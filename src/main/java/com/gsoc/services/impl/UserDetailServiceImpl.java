package com.gsoc.services.impl;

import com.gsoc.config.CustomerUserDetails;
import com.gsoc.model.User;
import com.gsoc.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailServiceImpl implements UserDetailsService {
    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user=this.userRepo.findByEmail(username);
        if(user==null){
            throw new UsernameNotFoundException("could not find user");
        }
        return new CustomerUserDetails(user);
    }
}
