package com.fancy.service;

import com.fancy.po.User;

public interface UserService {
    User checkUser(String username,String password);
}
