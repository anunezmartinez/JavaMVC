package JavaMVC.controller;
import java.sql.*;
public class ConnectionDB {
    

    Connection conn = null;
    public ConnectionDB(){

    }

    public Connection startConnection() {

        try {
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/?user=root", "root","abc123.");
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }

        return conn;
    }

}