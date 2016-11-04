package MVC;

import java.util.ArrayList;

public class schoolController {
	
	//create a controller named schoolController
	public schoolController(schoolView a_view){
		//instantiate the view with the current controller object
		view = a_view;
		//instantiate the array of schools
		schoolList = new ArrayList<schoolData>();
		schoolList.add(new schoolData("BYU", "Provo", "Utah", "Cosmo"));
		schoolList.add(new schoolData("Utah", "Salt Lake City", "Utah", "Swoop"));
		schoolList.add(new schoolData("Boise State", "Boise", "Idaho", "Buster"));
		
	}
	//declare a view for the controller to use
	private schoolView view;
	private ArrayList<schoolData> schoolList;
	public ArrayList<schoolData> getSchools(){
		return schoolList;
		
	}
}
