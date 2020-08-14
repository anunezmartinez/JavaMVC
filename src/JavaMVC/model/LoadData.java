package JavaMVC.model;

import java.sql.*;
import JavaMVC.controller.ConnectionDB;
public class LoadData {
    
public LoadData(){

    newConnection = new ConnectionDB();
}


public String startQuery(){

    Model myProducts = null;
    
    Connection connectionDB = newConnection.startConnection();
    try {
        Statement sections = connectionDB.createStatement();
        Statement countries = connectionDB.createStatement();
        rs = sections.executeQuery("SELECT type FROM sql_inventory.products GROUP BY type");
        rs2 = countries.executeQuery("SELECT country FROM sql_inventory.products GROUP BY country");
        myProducts = new Model();
        while(rs.next()){
            
            myProducts.setvType(rs.getString(1));
            
            return myProducts.getvType();
        }
        while(rs2.next()){
            myProducts.setvCountry(rs2.getString(1));
            return myProducts.getvCountry();
        }
    rs.close();
    rs2.close();
    connectionDB.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
    return myProducts.getvType();
}

ConnectionDB newConnection;
public ResultSet rs;
public ResultSet rs2;

}