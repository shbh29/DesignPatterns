package org.example.designpatterns.sigleton;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InvokeSingleton {

    public static void main(String[] args) throws SQLException {
        DBSingleton instance = DBSingleton.getInstance();

        System.out.println(instance);

        Connection connection = instance.getConnection();

        String sql = "Create table students (ID int primary key, name varchar(50))";

        Statement statement = connection.createStatement();

        statement.execute(sql);

        System.out.println("Created table students.");

        sql = "Insert into students (ID, name) values (1, 'Nam Ha Minh')";

        int rows = statement.executeUpdate(sql);

        if (rows > 0) {
            System.out.println("Inserted a new row.");
        }

        connection.close();

    }
}
