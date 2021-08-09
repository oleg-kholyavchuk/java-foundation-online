package ru.itsjava.jdbc.dao;

import java.sql.*;

public class EmployerJdbcImpl implements EmployerDao {
    public static final String DB_URL = "jdbc:MySql://localhost:3306/schema_online?serverTimezone=UTC";
    public static final String DB_LOGIN = "root";
    public static final String DB_PASSWORD = "My429sql!";

//    @Override
//    public int findAgeByName(String name) {
//        try (Connection connection = DriverManager.getConnection(DB_URL, DB_LOGIN, DB_PASSWORD);
//             Statement statement = connection.createStatement()
//        ) {
//            ResultSet resultSet = statement.executeQuery("select age from schema_online.employers " +  "where name = '" + name + "'");
//            resultSet.next();
//
////            System.out.println("resultSet.getInt(\"age\") = " + resultSet.getInt("age"));
////            while (resultSet.next()) {
////                System.out.println("resultSet.getString(\"name\") + \":\" + resultSet.getInt(\"age\") = " + resultSet.getString("name") + ":" + resultSet.getInt("age"));
////            }
//            return resultSet.getInt("age");
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//        return -1;
//    }

    @Override
    public int findAgeByName(String name) {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_LOGIN, DB_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement("select age from schema_online.employers where name = ?")
        ) {
            preparedStatement.setString(1, "Tanya"); //setString(1, "Tanya")
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            return resultSet.getInt("age");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return -1;
    }

//    @Override
//    public int findAgeByName(String name) {
//        try (Connection connection = DriverManager.getConnection(DB_URL, DB_LOGIN, DB_PASSWORD);
//             PreparedStatement preparedStatement = connection.prepareStatement("select * from employers;")
//        ) {
//
//            preparedStatement.setString(1, "");
//            ResultSet resultSet = preparedStatement.executeQuery();
//
//            while (resultSet.next()) {
//                return resultSet.getInt("age");
//            }
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//        return -1;
//    }



}


