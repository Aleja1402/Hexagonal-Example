package com.example.example_hexagonal.courses.application;

import com.example.example_hexagonal.courses.application.creator.CourseRequest;
import com.example.example_hexagonal.courses.domain.CourseRepository;
import com.example.example_hexagonal.courses.domain.creator.CourseCreator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;

class CourseCreatorImplShould {

    @BeforeEach
    void setUp() {
    }

    @Test
    void create() {
        CourseRepository courseRepository = mock(CourseRepository.class);
        CourseCreator courseCreator = new CourseCreatorImpl(courseRepository);
        //CourseCreator courseCreator = new CourseCreatorImpl(); //Cuando no teniamos repository.
        CourseRequest courseRequest = new CourseRequest("course-id", "course-name", "course-duration");
        courseCreator.create(courseRequest);
    }

}
