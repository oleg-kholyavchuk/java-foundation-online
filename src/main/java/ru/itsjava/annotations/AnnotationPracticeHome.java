package ru.itsjava.annotations;

import lombok.SneakyThrows;

public class AnnotationPracticeHome {

    @SneakyThrows
    public static void main(String[] args) {

        MathStudent student1 = new MathStudent("Oleg", "Holyavchuk", 1);
        System.out.println("student1 = " + student1);
        BiologyStudent student2 = new BiologyStudent("Vasy", "Paramkin", 3);

        Class<? extends MathStudent> studentMath = student1.getClass();
        System.out.println("studentMath.getSimpleName() = " + studentMath.getSimpleName());

        Class<?> studentClass = Class.forName("ru.itsjava.annotations.MathStudent");
        Object studentNoStandard = studentClass.getConstructor(String.class, String.class, int.class).newInstance("Vanya", "Pypkin", 10);

        System.out.println("studentNoStandard = " + studentNoStandard);

        Class<? extends BiologyStudent> studentBiology = student2.getClass();
        System.out.println("studentBiology.getSimpleName() = " + studentBiology.getSimpleName());


    }
}
