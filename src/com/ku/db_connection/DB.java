/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ku.db_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Pubudu Kasun
 */
public class DB {

    private static Connection connection;
//3306 no password udayanga pradeep
    private static void init() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3309/udayanga_db", "root", "12345");
    }

    public static void iud(String sql) throws Exception {
        if (connection == null) {
            init();
        }
        connection.createStatement().executeUpdate(sql);
    }

    public static ResultSet search(String sql) throws Exception {
        if (connection == null) {
            init();
        }
        return connection.createStatement().executeQuery(sql);
    }

    public static Connection getNewConnection() throws Exception {
        if (connection == null) {
            init();
        }
        return connection;
    }
}
