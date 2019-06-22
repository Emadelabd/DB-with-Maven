/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dbmaven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Emad
 */
public class Db {
    public static void main(String[] args) throws SQLException
    {
    // assumes...
//     import java.sql.*;
Connection conn=DriverManager.getConnection(
        "jdbc:ucanaccess://C:/Users/Emad/Google Drive/Tools/Training/Database/Db.accdb");
Statement s = conn.createStatement();
ResultSet rs = s.executeQuery("SELECT [LastName] FROM [Clients]");
while (rs.next()) {
    System.out.println(rs.getString(1));
}         
    }
}
