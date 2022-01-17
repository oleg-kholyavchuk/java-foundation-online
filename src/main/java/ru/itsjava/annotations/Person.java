package ru.itsjava.annotations;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@MyAnnotation(message = "I person number one", flag = true)
@ToString
public class Person {
    private final String name;
    private boolean isGood;
}
