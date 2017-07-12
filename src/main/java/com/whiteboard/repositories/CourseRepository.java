package com.whiteboard.repositories;

import com.whiteboard.config.HibernateUtil;
import com.whiteboard.models.Course;
import org.hibernate.Criteria;
import org.hibernate.Session;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class CourseRepository implements CourseRepositoryInterface {

    /**
     *
     * @param id
     * @return
     */
    public Course getById (int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Course course = session.get(Course.class, id);

        session.getTransaction().commit();
        session.close();

        return course;
    }

    /**
     *
     * @return
     */
    public List<Course> getAll () {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Criteria criteria = session.createCriteria(Course.class);
        List<Course> Courses = criteria.list();

        return Courses;
    }

    public Course updateById(int id, Map<String, String> data) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Course course = new Course();
        course.setId(id);
        course.setTitle(data.get("title"));
        course.setCode(data.get("code"));
        course.setCreatedAt(new Date());
        course.setUpdatedAt(new Date());
        session.update(course);

        session.getTransaction().commit();
        session.close();

        return course;
    }

    /**
     * Creates a new user in the db
     */
    public Course create(Map<String, String> data) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Course course = new Course();
        course.setTitle(data.get("title"));
        course.setCode(data.get("code"));
        course.setCreatedAt(new Date());
        course.setUpdatedAt(new Date());
        session.save(course);

        session.getTransaction().commit();
        session.close();

        return course;
    }

    public void deleteById(int id) {

    }

    public String toString() {
        return this.getClass().getSimpleName();
    }

    public void logout() {

    }
}
