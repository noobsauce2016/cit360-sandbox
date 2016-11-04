package MVC;

import java.util.Scanner;

public class schoolApp {
	public static void main(String[] args){
		schoolView l_view = new schoolView();
		System.out.println("Welcome to the School App");
		l_view.displaySchools();
		Scanner random = new Scanner(System.in);
		String input = random.nextLine();
	}
	
}