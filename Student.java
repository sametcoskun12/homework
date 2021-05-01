package homework2;

public class Student extends User{
	String course;
	
public Student() {
	}

public Student(int id, String userFirstName, String userLastName, String userType, String eMail, String password,String course) {
	super(id, userFirstName, userLastName, userType, eMail, password);
	this.course = course;
}

public String getCourse() {
	return course;
}

public void setCourse(String course) {
	this.course = course;
}

}
