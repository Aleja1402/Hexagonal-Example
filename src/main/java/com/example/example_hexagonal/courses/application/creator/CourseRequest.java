package com.example.example_hexagonal.courses.application.creator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public final class CourseRequest {

    private String id;
    private String name;
    private String duration;

}
