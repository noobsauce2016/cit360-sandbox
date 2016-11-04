package MVC;

import java.util.ArrayList;

public class schoolView {
	
	//create a view named schoolView with a controller
	public schoolView(){
		//instantiate the controller
		controller = new schoolController(this);
		
			
	}
	//declare a controller for use with the view
	private schoolController controller;
	
	//create method for displaying schools for user to select
	public void displaySchools(){
		ArrayList<schoolData> listOfSchools = controller.getSchools();
		for(int i = 0; i < listOfSchools.size(); i++){
			System.out.println((i + 1) + ". " + listOfSchools.get(i).getName() + ", " + listOfSchools.get(i).getMascot());  
		}
	}
}
