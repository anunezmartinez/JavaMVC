package JavaMVC.controller;
import java.awt.event.*;

import JavaMVC.model.LoadData;
import JavaMVC.view.AppFrame;

public class LoadSectionsMenus extends WindowAdapter {

    public LoadSectionsMenus(AppFrame newFrame){
        this.newFrame = newFrame;
    }
    public void windowOpened(WindowEvent e){

        obj.startQuery();
        try {
            while(obj.rs.next()){
                newFrame.menuSections.addItem(obj.rs.getString(1));
            }
            while(obj.rs2.next()){
                newFrame.menuCountry.addItem(obj.rs2.getString(1));
            }

        } catch (Exception event) {
            event.printStackTrace();
        }


    }
    
    LoadData obj = new LoadData();
    private AppFrame newFrame;

}