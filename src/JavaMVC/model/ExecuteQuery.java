package JavaMVC.model;

import java.sql.*;

import JavaMVC.controller.*;

public class ExecuteQuery {
    public ExecuteQuery(){

        newConnection = new ConnectionDB();
    }

    public ResultSet filterDB(String section, String country){

        Connection connectionDB = newConnection.startConnection();
        rs=null;
        
        try {

            if(section.equals("All") && !country.equals("All")){

                sendTextQuery = connectionDB.prepareStatement(queryCountryStatement);
                sendTextQuery.setString(1, country);
                rs = sendTextQuery.executeQuery();

            }else if(!section.equals("All") && country.equals("All")){
                sendTextQuery = connectionDB.prepareStatement(querySectionStatement);
                sendTextQuery.setString(1, section);
                rs = sendTextQuery.executeQuery();
    
            }else if(!section.equals("All") && !country.equals("All")){
                sendTextQuery = connectionDB.prepareStatement(querySC);
                sendTextQuery.setString(1, section);
                sendTextQuery.setString(2, country);
                rs = sendTextQuery.executeQuery();
            }
            else{
                sendTextQuery = connectionDB.prepareStatement(queryFullStatement);
                rs = sendTextQuery.executeQuery();
            };


        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }

        
        return rs;

    }

    ConnectionDB newConnection;
    public ResultSet rs;
    private PreparedStatement sendTextQuery;
    private final String queryCountryStatement = "SELECT name, unit_price FROM sql_inventory.products WHERE country = ?";
    private final String querySectionStatement = "SELECT name, unit_price FROM sql_inventory.products WHERE type = ?";
    private final String querySC = "SELECT name, unit_price FROM sql_inventory.products WHERE type = ? AND country = ?";
    private final String queryFullStatement = "SELECT name, unit_price FROM sql_inventory.products";

}