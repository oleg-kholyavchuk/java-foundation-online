package ru.itsjava.annotations;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
@MyAnnotationDepartments(nameDepartment = "Math")
public class MathStudent {
    private final String name, surname;
    private int course;
}
