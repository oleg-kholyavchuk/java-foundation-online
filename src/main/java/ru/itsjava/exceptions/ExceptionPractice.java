package ru.itsjava.exceptions;

import java.util.Scanner;

public class ExceptionPractice {

    public static void main(String[] args) throws Exception {

//        throw new RuntimeException("My runtime ");

//        try {
//            throw new Exception();
//        } catch (Exception e) {
//            System.out.println("!!!!!! Exception. Be careful");
//            //e.printStackTrace();
//        }
//        try {
//            System.out.println("Begin");
//            throw new Exception();
//        } catch (Exception e) {
//            System.out.println("Catch");
//            //e.printStackTrace();
//        } finally {
//            System.out.println("Finally");
//
//        }
//        System.out.println("End");
//
//        try {
//            throw new RuntimeException();
//        } catch (RuntimeException runtimeException) {
//            System.out.println("RuntimeException");
//        } catch (Throwable throwable) {
//            System.out.println("Throwable");
//        }
//
//        Calculator calculator = new Calculator();
//        System.out.println("calculator.division(5,3) = " + calculator.division(5, 3));
//        try {
//            System.out.println("calculator.division(5,0) = " + calculator.division(5, 0));
//        } catch (CalculatorException ce) {
//            System.out.println("Error");
//            ce.printStackTrace();
//        }

        Scanner temp = new Scanner(System.in);

        String name = temp.nextLine();
        int age = temp.nextInt();

        Person manName = new Person(name, age);

        try {
            System.out.println(manName.ageThrow());
        } catch (PersonException se) {
            se.printStackTrace();
        }
    }
}
