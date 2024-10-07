package com.example.example_hexagonal.courses.application;

import com.example.example_hexagonal.courses.application.creator.CourseRequest;
import com.example.example_hexagonal.courses.domain.Course;
import com.example.example_hexagonal.courses.domain.CourseRepository;
import com.example.example_hexagonal.courses.domain.creator.CourseCreator;
import com.example.example_hexagonal.shared.domain.Service; //Es la que tengo en mi proyecto.
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CourseCreatorImpl implements CourseCreator {

    private final CourseRepository courseRepository;

    @Override
    public void create(CourseRequest courseRequest) {
        Course course = new Course (courseRequest.getId(), courseRequest.getName(), courseRequest.getDuration());
        courseRepository.save(course);
    }
}
