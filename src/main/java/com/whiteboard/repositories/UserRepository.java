package com.whiteboard.repositories;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import com.whiteboard.config.HibernateUtil;
import com.whiteboard.models.*;
import org.hibernate.Session;

import java.util.Date;
import java.util.Map;

public class UserRepository {

    public User createUser(String permissionType, Map<String, String> data)
            throws MySQLIntegrityConstraintViolationException {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        User user = new User();

        user.setEmail(data.get("email"));
        user.setPassword(data.get("password"));
        user.setPermission(permissionType);
        user.getAccount().setFirstName(data.get("firstName"));
        user.getAccount().setLastName(data.get("lastName"));
        user.getAccount().setPhoneNumber(data.get("phoneNumber"));
        user.setCreatedAt(new Date());
        user.setUpdatedAt(new Date());
        session.save(user);

        session.getTransaction().commit();
        session.close();

        return user;
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
