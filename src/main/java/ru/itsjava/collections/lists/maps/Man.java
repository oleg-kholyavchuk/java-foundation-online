package ru.itsjava.collections.lists.maps;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@AllArgsConstructor
@Data
public class Man implements Serializable {
    private final String name;
}
