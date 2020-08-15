package JavaMVC.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import JavaMVC.model.*;

import JavaMVC.view.AppFrame;

public class ExecuteQueryController implements ActionListener {

    public ExecuteQueryController(AppFrame newFrame) {
        this.newFrame = newFrame;
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
        String sectionSelected = (String) newFrame.menuSections.getSelectedItem();
        String countrySelected = (String) newFrame.menuCountry.getSelectedItem();
        
        queryResult = obj.filterDB(sectionSelected, countrySelected);

        try {
            newFrame.result.setText("");
            while(queryResult.next()){
                newFrame.result.append(queryResult.getString(1));
                newFrame.result.append(", ");
                newFrame.result.append(queryResult.getString(2));
                newFrame.result.append("\n");
            }
        } catch (Exception exc) {
            //TODO: handle exception
            exc.printStackTrace();
        }
    }

    private ResultSet queryResult;
    private AppFrame newFrame;
    private ExecuteQuery obj = new ExecuteQuery();
}