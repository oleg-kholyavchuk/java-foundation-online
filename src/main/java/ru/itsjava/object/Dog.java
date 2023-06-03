package ru.itsjava.object;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Objects;

@Data
@AllArgsConstructor
public class Dog {
    private final String nickname;
    private final int pawsCount;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;
        Dog dog = (Dog) o;
        return pawsCount == dog.pawsCount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pawsCount);
    }
}
