package com.example.wizeline.mvn.WizelineMvn.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.wizeline.mvn.WizelineMvn.model.ResponseDTO;
import com.example.wizeline.mvn.WizelineMvn.service.UserService;

/**
 * Class Description goes here.
 * Created by enrique.gutierrez on 26/09/22
 */

@Component
public class CommonServices {

    @Autowired
    UserService userService;

    public ResponseDTO login(String user, String password) {
        //UserService UserService = new UserServiceImpl();
        return userService.login(user, password);
    }

}