package com.whiteboard.repositories;

import java.util.*;

import com.whiteboard.config.HibernateUtil;
import com.whiteboard.models.Profile;
import com.whiteboard.models.User;
import org.hibernate.Session;

public class ProfileRepository {

    private Session session;

    public ProfileRepository() {
        startSession();
    }

    private void startSession() {
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
    }
    private void closeSession() {
        session.getTransaction().commit();
        session.close();
        HibernateUtil.getSessionFactory().close();
    }

    public User getById (int id) {
        User loadedUser = session.get(User.class, 1);
        return loadedUser;
    }

    public List<Profile> getProfilesAll () {
        List<Profile> profiles = new ArrayList<>();
        //profiles.add(new Profile);

        return profiles;
    }

    public void update(int id) {
        List<Profile> profiles = new ArrayList<>();
        //profiles.add(new Profile(1));
    }

    /**
     * Creates a new user in the db
     */
    public void create() {
        User user = new User();
        user.setUsername("Mukesh22");
        user.setCreatedBy("Google223" + (int)(Math.random() * 101));
        user.setCreatedDate(new Date());
        session.save(user);

        //closeSession();
    }

    public void deleteById(int id) {

    }

    public String toString() {
        return "1";
    }
}
