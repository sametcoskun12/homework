package homework2;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getUserFirstName()+" "+user.getUserLastName()+" adl� kullan�c� eklendi!");
	}	
	public void delete(User user) {
		System.out.println(user.getUserFirstName()+" "+user.getUserLastName()+" adl� kullan�c� silindi!");
	}
	public void update(User user) {
		System.out.println(user.getUserFirstName()+" "+user.getUserLastName()+" adl� kullan�c� g�ncellendi!");
	}
}