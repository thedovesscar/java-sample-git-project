
public class UserDemo {
	
	public static void main(String[] args) {
		
		User person = new User();
		User person2 = new User("Felicia", 23);
		
		person.setAge(44);
		person.setName("Johnny Boy");
		
		
		System.out.println(person);
		
		System.out.println(person2);
	}
}
