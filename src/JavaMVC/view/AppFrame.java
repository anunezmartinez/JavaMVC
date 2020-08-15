package JavaMVC.view;

import javax.swing.*;

import JavaMVC.controller.ExecuteQueryController;
import JavaMVC.controller.LoadSectionsMenus;

import java.awt.*;




public class AppFrame extends JFrame{
	
    public AppFrame(){

    
        setTitle ("BBDD query");
		
		setBounds(500,300,400,400);
		
		setLayout(new BorderLayout());
		
		JPanel options=new JPanel();
		
		options.setLayout(new FlowLayout());
		
		menuSections=new JComboBox();
		
		menuSections.setEditable(false);
		
		menuSections.addItem("All");
		
		menuCountry=new JComboBox();
		
		menuCountry.setEditable(false);
		
		menuCountry.addItem("All");
		
		result= new JTextArea(4,50);
		
		result.setEditable(false);
		
		add(result);
		
		options.add(menuSections);
		
		options.add(menuCountry);	
		
		add(options, BorderLayout.NORTH);
		
		add(result, BorderLayout.CENTER);
		
		JButton queryBttn=new JButton("Search");	
		
        add(queryBttn, BorderLayout.SOUTH);
        
		addWindowListener(new LoadSectionsMenus(this));
		queryBttn.addActionListener(new ExecuteQueryController(this));

}
		


	public JComboBox menuSections;
	
	public JComboBox menuCountry;
	
	public JTextArea result;	

}
