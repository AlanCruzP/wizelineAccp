package com.example.wizeline.mvn.WizelineMvn.service;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.example.wizeline.mvn.WizelineMvn.model.ErrorDTO;
import com.example.wizeline.mvn.WizelineMvn.model.ResponseDTO;
import com.example.wizeline.mvn.WizelineMvn.repository.UserRepository;
import com.example.wizeline.mvn.WizelineMvn.repository.UserRepositoryImpl;
import com.example.wizeline.mvn.WizelineMvn.utils.Utils;

@Service
public class UserServiceImpl implements UserService {

    @Autowired UserRepository userRepository;
    private static final Logger LOGGER = Logger.getLogger(UserServiceImpl.class.getName());

    @Bean
    public static UserRepository userRepository() {
        return new UserRepositoryImpl();
    }

    @Override
    public ResponseDTO createUser(String user, String password) {
        LOGGER.info("Inicia procesamiento en capa de negocio");
        ResponseDTO response = new ResponseDTO();
        String result = "fail";
        if (Utils.validateNullValue(user) && Utils.validateNullValue(password)) {
            UserRepository userDao = userRepository();
            result = userDao.createUser(user, password);
            response.setCode("OK000");
            response.setStatus(result);
        }else {
            response.setCode("OK000");
            response.setStatus(result);
            response.setErrors(new ErrorDTO("ER001","Error al crear usuario"));
        }
        return response;
    }

    @Override
    public ResponseDTO login(String user, String password) {
        LOGGER.info("Inicia procesamiento en capa de negocio");
        ResponseDTO response = new ResponseDTO();
        String result = "";
        if (Utils.validateNullValue(user) && Utils.validateNullValue(password)) {
            UserRepository userDao = userRepository();
            result = userDao.login(user, password);
        }
        if("success".equals(result)) {
            response.setCode("OK000");
            response.setStatus(result);
        } else {
            response.setCode("ER001");
            response.setErrors(new ErrorDTO("ER001",result));
            response.setStatus("fail");
        }
        return response;
    }

}