package com.whiteboard.repositories;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import com.whiteboard.config.HibernateUtil;
import com.whiteboard.models.*;
import java.util.*;

public class MainRepository {

    public MainRepository() {
    }

    public static void main(String args[]) throws MySQLIntegrityConstraintViolationException {
        UserRepository userRepository = new UserRepository();
        Map<String, String> data = new HashMap<>();
        data.put("email", "email@email.com");
        data.put("password", "123123");
        data.put("firstName", "Yichen");
        data.put("lastName", "Zhu");
        data.put("phoneNumber", "123123123");
        //userRepository.createUser("professor", data);

        try {
            userRepository.createUser("student", data);
        }
        catch (Exception e) {
            System.out.println("--- " +  e.getMessage());
        }

        HibernateUtil.shutdown();
        System.exit(0);
    }
}
