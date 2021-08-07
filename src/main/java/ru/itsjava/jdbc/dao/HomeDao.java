package ru.itsjava.jdbc.dao;

public interface HomeDao {
    int getAgeByUserName(String name);
    String getMessagesByUserName();
    void getMessagesByUserName2();
}
