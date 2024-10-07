package com.example.example_hexagonal.courses.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Course {

    private String id;
    private String name;
    private String duration;

}
