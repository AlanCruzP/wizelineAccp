package com.example.wizeline.mvn.WizelineMvn.service;

import com.example.wizeline.mvn.WizelineMvn.model.ResponseDTO;

public interface UserService {

    ResponseDTO createUser(String user, String password);

    ResponseDTO login(String user, String password);

}