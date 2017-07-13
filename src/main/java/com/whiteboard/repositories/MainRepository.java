package com.whiteboard.repositories;

import com.whiteboard.config.HibernateUtil;
import com.whiteboard.models.*;
import java.util.*;

public class MainRepository {

    public MainRepository() {
    }

    public static void main(String args[]) {
        //UserRepository userRepository = new UserRepository();

        HibernateUtil.shutdown();
        System.exit(0);
    }
}
