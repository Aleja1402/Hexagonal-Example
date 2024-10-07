package com.example.example_hexagonal.courses.domain;

import java.util.Optional;

public interface CourseRepository {
    void save(Course course);
    //TAREA
    //Optional<Course> findById(String Id);
}
