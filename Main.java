package homework2;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.setId(1);
		student1.setUserFirstName("Samet");
		student1.setUserLastName("CO�KUN");
		student1.setUserType("��renci");
		student1.seteMail("sametcoskun93@gmail.com");
		student1.setCourse("JAVA");
		student1.setPassword("121214");
		
		Student student2 = new Student(2,"�pek","AKKILIN�","��renci","ipek@gmail.com","12122014","JAVA");
		
		Student student3 = new Student(3,"Mustafa","YILDIZ","��renci","mustafa@gmail.com","12345","C#");
		
		Instructer instructer1 = new Instructer(1, "Engin", "DEM�RO�", "E�itmen", "engin@gmail.com", "12345",
				"JAVA", "Inheritance", true);
		instructer1.setId(1);
		
		UserManager userManager = new UserManager();
		userManager.add(student1);
		userManager.delete(student2);
		userManager.update(student3);
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student1);
		
		InstructerManager instructerManager = new InstructerManager();
		instructerManager.addCourse(instructer1);
		instructerManager.addHomework(instructer1);
	}

}
