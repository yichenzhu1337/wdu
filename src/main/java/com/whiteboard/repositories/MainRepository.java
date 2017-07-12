package com.whiteboard.repositories;

import com.whiteboard.config.HibernateUtil;
import com.whiteboard.models.*;
import java.util.*;

public class MainRepository {

    public MainRepository() {
    }

    public static void main(String args[]) {
/*      ProfileRepository profileRepository = new ProfileRepository();
        profileRepository.create();
        System.out.println(profileRepository.getById(2).getFirstName());*/

        CourseRepositoryInterface courseRepository = new CourseRepository();
        //courseRepository.create();
        //System.out.println(courseRepository.getById(2).getTitle());
        //courseRepository.updateById(1);

        List<Course> courses = courseRepository.getAll();
        for (Course course : courses) {
            System.out.println(course.getTitle());
        }

        HibernateUtil.shutdown();
        System.exit(0);
    }
}
