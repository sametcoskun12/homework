package homework2;

public class StudentManager {
	public void add(Student student) {
		System.out.println(student.getUserFirstName()+" "+student.getUserLastName()+" "+student.getCourse()+" kursuna kat�ld�!");
	}
	public void delete(Student student) {
		System.out.println(student.getUserFirstName()+" "+student.getUserLastName()+" "+student.getCourse()+" kursundan ��kt�!");
	}
	public void update(Student student) {
		System.out.println(student.getUserFirstName()+" "+student.getUserLastName()+" "+student.getCourse()+" kursu g�ncellendi!");
	}
}
