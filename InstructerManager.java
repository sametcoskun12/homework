package homework2;

public class InstructerManager {
	
	public void addCourse(Instructer instructer) {
		System.out.println(instructer.getUserFirstName()+" "+instructer.getUserLastName()+" JAVA kursunu ekledi");
	}
	public void addHomework(Instructer instructer) {
		System.out.println(instructer.getHomework()+" ödevi "+instructer.getUserFirstName()+" "+instructer.getUserLastName()+" tarafýndan sisteme eklendi!");
	}
}
