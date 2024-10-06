package com.example.example_hexagonal.controllers.courses;

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

    @PutMapping("/api/v1/courses/{id}")
    public ResponseEntity<HttpStatus> create(@PathVariable String id, @RequestBody Request course) {
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}

@Data
final class Request {
    private String name;
    private String duration;
}


