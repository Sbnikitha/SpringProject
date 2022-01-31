package in.codersclub.SpringBootExercises.Model;

public class Student {
	private String usn;
	public String getusn() {
		return usn;
	}
	public void setUSN(String usn) {
		this.usn = usn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	private String name;
	private String gender;
	private String city;
	
	public Student() {
		
	}
	public Student(String usn, String name,String gender,String city) {
		super();
		this.usn=usn;
		this.name = name;
		this.gender = gender;
		this.city = city;
	}
	
}
