package ru.itsjava.annotations;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@MyAnnotationDepartments(nameDepartment = "Biology")
public class BiologyStudent {
    private final String name, surname;
    private int course;
}
