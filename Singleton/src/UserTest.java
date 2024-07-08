
public class UserTest {

	public static void main(String[] args) {
		User u1 = User.getInstance();
		u1.age = 50;
		
		User u2 = User.getInstance();
		System.out.println(u2.age);
		
		System.out.println(u1);
		System.out.println(u2);
		
		System.out.println(1 == 1);
		System.out.println(u1 == u2);
	}
}
