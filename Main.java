package homework2;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.setId(1);
		student1.setUserFirstName("Samet");
		student1.setUserLastName("COŞKUN");
		student1.setUserType("Öğrenci");
		student1.seteMail("sametcoskun93@gmail.com");
		student1.setCourse("JAVA");
		student1.setPassword("121214");
		
		Student student2 = new Student(2,"İpek","AKKILINÇ","Öğrenci","ipek@gmail.com","12122014","JAVA");
		
		Student student3 = new Student(3,"Mustafa","YILDIZ","Öğrenci","mustafa@gmail.com","12345","C#");
		
		Instructer instructer1 = new Instructer(1, "Engin", "DEMİROĞ", "Eğitmen", "engin@gmail.com", "12345",
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
