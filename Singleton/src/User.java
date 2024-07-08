
public class User {
	public static User user;
	public static int count;
	public int age;
	
	public static User getInstance() {
		if(user == null) {
			user = new User();
		}
		return user;
	}
}
