package com.robotdreams;

import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class LocalDB {
    public static void main(String[] args) {

        //jdbc:postgresql://localhost:5432/postgres

        String url = "jdbc:postgresql://localhost:5432/postgres";
        String kullaniciAdi = "postgres";
        String sifre = "123456";

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection(url, kullaniciAdi, sifre);
// Kullanıcıdan alınan girişler
            String firstName = "John";
            String lastName = "Doe";
            String sqlSorgusu = "SELECT * FROM customers WHERE firstname = ? AND lastname = ?";
            preparedStatement = connection.prepareStatement(sqlSorgusu);
// Parametreler atanıyor
            preparedStatement.setString(1, firstName);
            preparedStatement.setString(2, lastName);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("firstname");
                String surName = resultSet.getString("lastname");
// Diğer sütunların alınması
                System.out.println("ID: " + id + ", Username: " + name + ", Surname: " + surName);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}