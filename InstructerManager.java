package homework2;

public class InstructerManager {
	
	public void addCourse(Instructer instructer) {
		System.out.println(instructer.getUserFirstName()+" "+instructer.getUserLastName()+" JAVA kursunu ekledi");
	}
	public void addHomework(Instructer instructer) {
		System.out.println(instructer.getHomework()+" �devi "+instructer.getUserFirstName()+" "+instructer.getUserLastName()+" taraf�ndan sisteme eklendi!");
	}
}
