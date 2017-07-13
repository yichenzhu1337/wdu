package com.whiteboard.repositories;

import com.whiteboard.config.HibernateUtil;
import com.whiteboard.models.*;
import org.hibernate.Session;

import java.util.Date;
import java.util.Map;

public class UserRepository {

    public void createUserByPermission(String permissionType, Map<String, String> data) {
        switch (permissionType) {
            case "professor": {
                createProfessor(data);
            }
            case "student": {
                createStudent();
            }
            default: {

            }
        }
    }

    private User createProfessor(Map<String, String> data) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        User user = new User();

        // users table
        user.setEmail(data.get("email"));
        user.setPassword(data.get("password"));
        user.setPermission(data.get("permission"));

        // accounts table

        // profiles table

        user.setCreatedAt(new Date());
        user.setUpdatedAt(new Date());
        session.save(user);

        session.getTransaction().commit();
        session.close();

        return user;
    }

    private void createStudent() {

/*                insert into tables:
                - users
                - accounts
                - profiles*/

    }

    public User getUserById(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        User user = session.get(User.class, id);

        session.getTransaction().commit();
        session.close();

        return user;
    }
}
