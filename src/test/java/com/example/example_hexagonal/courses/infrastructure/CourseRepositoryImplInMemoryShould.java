package com.example.example_hexagonal.courses.infrastructure;

import com.example.example_hexagonal.courses.domain.Course;
import com.example.example_hexagonal.courses.domain.CourseRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseRepositoryImplInMemoryShould {

    private CourseRepository courseRepository;

    @BeforeEach
    void setUp() {
        courseRepository = new CourseRepositoryImplInMemory();
    }

    @Test
    void save() throws Exception {
        courseRepository.save(new Course("course-id", "course-name", "course-duration"));
    }

    //TAREA
    @Test
    void findById () throws Exception {
    }

}
