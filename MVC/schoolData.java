package MVC;

public class schoolData {

	//create a school
	public schoolData(String a_name, String a_city, String a_state, String a_mascot){
		//name
		setName(a_name);
		//city
		setCity(a_city);
		//state
		setState(a_state);
		//mascot
		setMascot(a_mascot);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getMascot() {
		return mascot;
	}
	public void setMascot(String mascot) {
		this.mascot = mascot;
	}
	private String name;
	private String city;
	private String state;
	private String mascot;
}
