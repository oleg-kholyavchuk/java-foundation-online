package ru.itsjava.jdbc.dao;

import java.sql.*;

public class HomeJdbcImpl implements HomeDao {
    public static final String DB_URL = "jdbc:MySql://localhost:3306/schema_online?serverTimezone=UTC";
    public static final String DB_LOGIN = "";
    public static final String DB_PASSWORD = "";


    @Override
    public int getAgeByUserName(String name) {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_LOGIN, DB_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement("select age from schema_online.userss where name = ?")
        ) {
            preparedStatement.setString(1, "Oleg");
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            return resultSet.getInt("age");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return -1;
    }

    @Override
    public String getMessagesByUserName() {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_LOGIN, DB_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement("select mes.messages, us.name from messagess mes, userss us \n" +
                     "where mes.use_id = us.id and us.name = 'Vitalik'")
        ) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String messages = resultSet.getString(1);
                String name = resultSet.getString(2);
                return (messages + ": " + name);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    @Override
    public void getMessagesByUserName2() {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_LOGIN, DB_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement("select mes.messages, us.name from messagess mes, userss us \n" +
                     "where mes.use_id = us.id and us.name = 'Vitalik'")
        ) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String messages = resultSet.getString(1);
                String name = resultSet.getString(2);
                System.out.println(messages + ": " + name);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
