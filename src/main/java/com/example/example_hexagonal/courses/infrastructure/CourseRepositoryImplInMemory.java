package com.example.example_hexagonal.courses.infrastructure;

import com.example.example_hexagonal.courses.domain.Course;
import com.example.example_hexagonal.courses.domain.CourseRepository;
import com.example.example_hexagonal.shared.domain.Repository;

import java.util.HashMap;

@Repository
public class CourseRepositoryImplInMemory implements CourseRepository {

    private HashMap<String, Course> courses = new HashMap<>();

    @Override
    public void save(Course course) {
        courses.put(course.getId(), course);
    }

}
