package JavaMVC.main;

import javax.swing.JFrame;

import JavaMVC.view.AppFrame;

public class Main {
    public static void main(String[] args) {
        AppFrame newFrame = new AppFrame();
        newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        newFrame.setVisible(true);
        
    }    
}