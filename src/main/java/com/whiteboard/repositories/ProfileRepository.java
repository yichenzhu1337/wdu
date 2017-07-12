package com.whiteboard.repositories;

import java.util.*;

import com.whiteboard.config.HibernateUtil;
import com.whiteboard.models.Profile;
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

    public Profile getById (int id) {
        Profile loadedUser = session.get(Profile.class, 1);

        closeSession();
        return loadedUser;
    }

    public List<Profile> getProfilesAll () {
        List<Profile> profiles = new ArrayList<>();
        profiles.add(new Profile());

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
        Profile profile = new Profile();
        profile.setFirstName("Yi Chen");
        profile.setLastName("Zhu");
        profile.setPhoneNumber("1234567890");
        profile.setCreatedAt(new Date());
        profile.setUpdatedAt(new Date());
        session.save(profile);

        //closeSession();
    }

    public void deleteById(int id) {

    }

    public String toString() {
        return "1";
    }
}
