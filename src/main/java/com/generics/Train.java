package com.generics;

import java.util.Date;
import com.whiteboard.config.HibernateUtil;
import org.hibernate.Session;
import com.whiteboard.models.*;

public class Train {

    public static void main(String args[]) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        User user = new User();

        user.setUserId(0);
        user.setUsername("Mukesh22");
        user.setCreatedBy("Google22");
        user.setCreatedDate(new Date());

        session.save(user);
        session.getTransaction().commit();

        System.exit(0);
    }

    private String name;

    public Train(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
