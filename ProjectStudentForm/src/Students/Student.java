package Students;

public class Student {
	
	//variables
	private String fullName;
	private String iD;
	
	//constructor
	public Student(String fullName, String iD) {
		this.fullName = fullName;
		this.iD = iD;
	}
	
	//getters
	public String getFullName() { return fullName; }
	public String getID() { return iD; }
	
	//setters
	public void setFullNname(String fullName) { this.fullName = fullName; }
	public void setID(String iD) { this.iD = iD; }
		
}
