package ru.itsjava.interfaces.cloneable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Girl implements Cloneable {
    private final String name;
    private final double high;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String toString(){ // Определение метода toString
        return "Girl {" + name + ", " + high + "}";
    }
}
