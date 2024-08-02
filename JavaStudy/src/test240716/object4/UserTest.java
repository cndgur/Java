package test240716.object4;

public class UserTest {
	public static void main(String[]args) throws CloneNotSupportedException {
		User[] users = new User[3];
		
		users[0] = new User("user01","pass01","김철수",32,'M',"010-1234-5678");
		users[1] = new User("user02","pass02","이영희",25,'F',"010-5555-7777");
		users[2] = new User("user03","pass03","황진이",20,'F',"010-9874-5632");
		System.out.println("users list -------------------------------------------------");
		for(int i = 0; i<users.length; i++)	{	
		System.out.println(users[i].toString());
		}
		
		User[] copyUsers = new User[users.length];
		System.out.println("");
		for(int i = 0; i<users.length; i++)	{	
			User copy = copyUsers[i];
			System.out.println(copy.toString());
			}
		}
}
