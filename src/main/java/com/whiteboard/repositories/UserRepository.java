package com.whiteboard.repositories;

import com.whiteboard.config.HibernateUtil;
import com.whiteboard.models.Profile;
import com.whiteboard.models.User;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserRepository {

    public int getProfileById (int id) {
        //return new Profile(id);

        return id;
    }

    public List<Profile> getProfilesAll () {
        List<Profile> profiles = new ArrayList<>();
        //profiles.add(new Profile);

        return profiles;
    }

    public void updateProfileById (int id) {
        List<Profile> profiles = new ArrayList<>();
        //profiles.add(new Profile(1));
    }

    public void createUser() {

    }

    public void deleteProfileById(int id) {

    }
}
