package ru.itsjava.object;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Dog {
    private final String nickname;
    private final int pawsCount;
}
