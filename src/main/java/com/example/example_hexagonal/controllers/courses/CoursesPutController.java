package com.example.example_hexagonal.controllers.courses;

import com.example.example_hexagonal.courses.application.creator.CourseRequest;
import com.example.example_hexagonal.courses.domain.creator.CourseCreator;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class CoursesPutController {

    private final CourseCreator courseCreator;

    @PutMapping("/api/v1/courses/{id}")
    public ResponseEntity<HttpStatus> create(@PathVariable String id, @RequestBody Request course) {
        CourseRequest courseRequest = new CourseRequest (id, course.getName(), course.getDuration());
        courseCreator.create(courseRequest);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}

@Data
final class Request {
    private String name;
    private String duration;
}


