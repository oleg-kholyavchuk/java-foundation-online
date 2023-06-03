package ru.itsjava.annotations;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class AnnotationPractice {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {

//        Person person = new Person("Oleg", true);
//        System.out.println(person);
//
//        Class<? extends Person> aClass = person.getClass();
//
//        System.out.println("aClass.getName() = " + aClass.getName());
//        System.out.println("aClass.getSimpleName() = " + aClass.getSimpleName());

//        Class<?> aClass = Class.forName("ru.itsjava.annotations.Person");
//        System.out.println("aClass.getSimpleName() = " + aClass.getSimpleName());
//        System.out.println("aClass.getName() = " + aClass.getName());
//        Object vanya = (Person) aClass.getConstructors()[0]
////                (String.class, Boolean.class)
//        .newInstance("Vanya", true);
//        System.out.println("vanya = " + vanya);

        Class<?> aClass = Class.forName("ru.itsjava.annotations.Person");
        System.out.println("aClass.getSimpleName() = " + aClass.getSimpleName());
        System.out.println("aClass.getName() = " + aClass.getName());
        Object vanya = aClass.getConstructor(String.class, Boolean.TYPE).newInstance("Vanya", true);
        System.out.println("vanya = " + vanya);
        System.out.println("aClass.getAnnotations()[0] = " + aClass.getAnnotations()[0]);

        Field isGood = aClass.getDeclaredField("isGood");
        isGood.setAccessible(true);
        isGood.set(vanya, false);

        System.out.println("vanya = " + vanya);
    }
}
