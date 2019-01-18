package com.okliu.springboot.service;


import java.util.List;

import com.github.pagehelper.Page;
import com.okliu.springboot.entity.User;

public interface UserService {

    int addUser(User user);

    List<User> findAllUser(int pageNum, int pageSize);
}
