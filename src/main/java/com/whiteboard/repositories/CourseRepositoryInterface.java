package com.whiteboard.repositories;

import com.whiteboard.models.Course;
import java.util.List;
import java.util.Map;

public interface CourseRepositoryInterface {

    Course getById(int id);

    List<Course> getAll();

    Course updateById(int id, Map<String, String> data);

    Course create(Map<String, String> data);

    void deleteById(int id);

}
