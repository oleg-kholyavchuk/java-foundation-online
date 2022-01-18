package ru.itsjava.annotations.junit;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class JUnitRunner {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        MyFavoriteTest myFavoriteTest = new MyFavoriteTest();
        Method[] methodsMyFavoriteTest = MyFavoriteTest.class.getDeclaredMethods();

//        System.out.println("Arrays.toString(methodsMyFavoriteTest) = " + Arrays.toString(methodsMyFavoriteTest));

        int passedTest = 0;
        int failedTest = 0;
        for (Method method: methodsMyFavoriteTest) {
            if(method.isAnnotationPresent(Test.class)) {
                try {
                    method.invoke(myFavoriteTest);
                    System.out.println(method.getName() + " " + "PASSED!");
                    passedTest++;
                } catch (InvocationTargetException invocationTargetException) {
                    System.err.println(method.getName() + " " + "FAILED!");
                    failedTest++;
                }
            }
        }
        System.out.println("Number of tests passed" + " " + passedTest);
        System.out.println("Number of dropped tests" + " " + failedTest);
    }
}
