package org.example.designpatterns.sigleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBSingleton {

    private Connection connection;

    private DBSingleton() {
        String jdbcURL = "jdbc:h2:mem:test";

        try {
            connection = DriverManager.getConnection(jdbcURL);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Connected to H2 in-memory database.");

    }
    static {
        System.out.println("Outer class static initializer");
    }

    private static class LazyLoader {
        private static DBSingleton instance = new DBSingleton();
        static {
            System.out.println("Static initializer inner class");
        }
    }

    public static DBSingleton getInstance() {
        System.out.println("getInstance Method call");
        return LazyLoader.instance;
    }

    public Connection getConnection() {
        return connection;
    }
}
