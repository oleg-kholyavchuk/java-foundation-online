package ru.itsjava.annotations.junit;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class MyJUnit {
    private final Object objectTestClass;
    private int passedTest = 0;
    private int failedTest = 0;
    private final List<Method> beforeAllMethods = new ArrayList<>();
    private final List<Method> beforeMethods = new ArrayList<>();
    private final List<Method> testsAllMethods = new ArrayList<>();
    private final List<Method> afterAllMethods = new ArrayList<>();
    private final List<Method> afterMethods = new ArrayList<>();
    private final List<Method> displayNameMethods = new ArrayList<>();
    private DisplayName displayName ;

    @SneakyThrows
    public void start() {
        fillAllMethodsGroup();

        for (Method method : beforeAllMethods) {
            method.invoke(objectTestClass);
        }

        for (Method method : displayNameMethods) {
            displayName = method.getAnnotation(DisplayName.class);
            System.out.println("displayName.message() = " + displayName.message());
            System.out.println("method.getName() = " + method.getName());
        }

        for (Method method : testsAllMethods) {
            try {
                    for (Method methodBefore : beforeMethods) {
                        methodBefore.invoke(objectTestClass);
                    }
                method.invoke(objectTestClass);
                System.out.println(method.getName() + " " + "PASSED!");
                passedTest++;
                for (Method methodAfter : afterMethods) {
                    methodAfter.invoke(objectTestClass);
                }
            } catch (InvocationTargetException invocationTargetException) {
                System.err.println(method.getName() + " " + "FAILED!");
                failedTest++;
            }
        }

        for (Method method : afterAllMethods) {
            method.invoke(objectTestClass);
        }

        printResults();
    }

    private void fillAllMethodsGroup() {
        for (Method method : objectTestClass.getClass().getDeclaredMethods()) {
            if (method.isAnnotationPresent(BeforeAll.class)) {
                beforeAllMethods.add(method);
            } else if (method.isAnnotationPresent(Test.class)) {
                testsAllMethods.add(method);
            } else if (method.isAnnotationPresent(AfterAll.class)) {
                afterAllMethods.add(method);
            } else if (method.isAnnotationPresent(After.class)) {
                afterMethods.add(method);
            } else if (method.isAnnotationPresent(Before.class)) {
                beforeMethods.add(method);
            } else if (method.isAnnotationPresent(DisplayName .class)) {
                displayNameMethods.add(method);
            }
        }
    }

    private void printResults() {
        System.out.println();
        System.out.println("Number of tests passed" + " " + passedTest);
        System.out.println("Number of dropped tests" + " " + failedTest);
    }
}

