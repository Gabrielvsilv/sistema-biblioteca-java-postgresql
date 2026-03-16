package com.gabriel.biblioteca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String URL = System.getenv("DB_URL");
    private static final String USER = System.getenv("DB_USER");
    private static final String PASSWORD = System.getenv("DB_PASSWORD");

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void main(String[] args) {

        try (Connection conn = getConnection()) {

            if (conn != null) {
                System.out.println("Conectado ao PostgreSQL com sucesso!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}