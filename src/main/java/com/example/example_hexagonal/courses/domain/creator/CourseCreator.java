package com.example.example_hexagonal.courses.domain.creator;

import com.example.example_hexagonal.courses.application.creator.CourseRequest;

public interface CourseCreator {

    void create(CourseRequest courseRequest);

}
