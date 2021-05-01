package homework2;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getUserFirstName()+" "+user.getUserLastName()+" adlý kullanýcý eklendi!");
	}	
	public void delete(User user) {
		System.out.println(user.getUserFirstName()+" "+user.getUserLastName()+" adlý kullanýcý silindi!");
	}
	public void update(User user) {
		System.out.println(user.getUserFirstName()+" "+user.getUserLastName()+" adlý kullanýcý güncellendi!");
	}
}