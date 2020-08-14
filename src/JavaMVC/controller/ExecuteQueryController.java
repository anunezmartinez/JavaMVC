package JavaMVC.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
        String countrySelected = (String) newFrame.country.getSelectedItem();

        newFrame.result.append(obj.filterDB(sectionSelected, countrySelected));
        newFrame.result.append("\n");
    }

    private AppFrame newFrame;
    private ExecuteQuery obj = new ExecuteQuery();
}