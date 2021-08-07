package ru.itsjava.jdbc;

import ru.itsjava.jdbc.dao.EmployerDao;
import ru.itsjava.jdbc.dao.EmployerJdbcImpl;
import ru.itsjava.jdbc.dao.HomeDao;
import ru.itsjava.jdbc.dao.HomeJdbcImpl;

public class JdbcPractice {
    public static void main(String[] args) {
//        try (Connection connection = DriverManager.getConnection(DB_URL, DB_LOGIN, DB_PASSWORD);
//             Statement statement = connection.createStatement()
//        ) {
//            ResultSet resultSet = statement.executeQuery("select name, age from schema_online.employers");
//            while(resultSet.next()) {
//                System.out.println("resultSet.getString(\"name\") + \":\" + resultSet.getInt(\"age\") = " + resultSet.getString("name") + ":" + resultSet.getInt("age"));
//            }
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }

//        try (Connection connection = DriverManager.getConnection(DB_URL, DB_LOGIN, DB_PASSWORD);
//             PreparedStatement preparedStatement = connection.prepareStatement("select mes.messages, us.name from messagess mes, userss us \n" +
//                     "where mes.use_id = us.id and us.name = 'Vitalik'")
//        ) {
//            ResultSet resultSet = preparedStatement.executeQuery();
//            while (resultSet.next()) {
//                String messages = resultSet.getString(1);
//                String name = resultSet.getString(2);
//                System.out.println(messages + ": " + name);
//            }
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }

        EmployerDao dao = new EmployerJdbcImpl();

        System.out.println("dao.findAgeByName(\"Tanya\") = " + dao.findAgeByName(""));

        HomeDao homeDao = new HomeJdbcImpl();
        homeDao.getMessagesByUserName2();
        System.out.println("homeDao.getMessagesByUserName() = " + homeDao.getMessagesByUserName());
        System.out.println("homeDao.getAgeByUserName(\"Oleg\") = " + homeDao.getAgeByUserName("Oleg"));
    }
}
