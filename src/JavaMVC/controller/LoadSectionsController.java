package JavaMVC.controller;
import java.awt.event.*;

import JavaMVC.model.LoadSections;
import JavaMVC.view.AppFrame;

public class LoadSectionsController extends WindowAdapter {

    public LoadSectionsController(AppFrame newFrame){
        this.newFrame = newFrame;
    }
    public void windowOpened(WindowEvent e){
        obj.startQuery();
        try {
            while(obj.rs.next()){
                newFrame.menuSections.addItem(obj.rs.getString(1));

            }
        } catch (Exception event) {
            event.printStackTrace();
        }


    }
    
    LoadSections obj = new LoadSections();
    private AppFrame newFrame;

}