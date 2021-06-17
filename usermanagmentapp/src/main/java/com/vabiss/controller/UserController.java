package com.vabiss.controller;

import com.vabiss.dao.inter.UserTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserTableRepository userRepository;

    @Autowired
    private UserTableRepository userDaoInter;


}
