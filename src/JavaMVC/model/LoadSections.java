package JavaMVC.model;

import java.sql.*;
import JavaMVC.controller.ConnectionDB;
public class LoadSections {
    
public LoadSections(){

    newConnection = new ConnectionDB();
}


public String startQuery(){

    Model myProducts = null;
    Connection connectionDB = newConnection.startConnection();
    try {
        Statement sections = connectionDB.createStatement();
        rs = sections.executeQuery("SELECT type FROM sql_inventory.products GROUP BY type");
        while(rs.next()){
            myProducts = new Model();
            myProducts.setvType(rs.getString(1));
            return myProducts.getvType();
        }
    rs.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
    return myProducts.getvType();
    
}

ConnectionDB newConnection;
public ResultSet rs;

}