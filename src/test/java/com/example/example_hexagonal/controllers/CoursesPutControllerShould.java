package com.example.example_hexagonal.controllers;

import org.junit.jupiter.api.Test;

import java.util.UUID;

public class CoursesPutControllerShould extends RequestTestCase {

    @Test
    public void create() throws Exception {
        assertRequestWithBody("PUT",
                "/api/v1/courses/" + UUID.randomUUID().toString(),
                "{\"name\":\"The best course\", \"duration\":\"2 month\"}",
                201);
    }
}
