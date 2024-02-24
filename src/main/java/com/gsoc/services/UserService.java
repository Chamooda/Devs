package com.gsoc.services;

import com.gsoc.model.User;

public interface UserService {

    public User createUser(User user) throws Exception;
    public User getUser(String userName);
    public void deleteUser(Long UserId);
    public Object check(String password , User user);

}
