package com.example.example_hexagonal.courses.infrastructure.mapper;

import com.example.example_hexagonal.courses.application.creator.CourseRequest;
import com.example.example_hexagonal.courses.domain.Course;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface CourseMapper {

    //@Mapping(target = "", source = ) //Esto puede usarse cuando lo único que cambia es el nombre.
    public Course requestToCourse(CourseRequest courseRequest); //Esto sería suficiente si ambas clases tienen exactamente los mismos atributos.

}
