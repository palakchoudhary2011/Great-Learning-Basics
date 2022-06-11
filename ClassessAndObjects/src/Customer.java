
public class Customer {
	
	String fullName;
	int age;
	
	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.fullName = "Palak Choudhary";
		customer.age = 26;
		
		System.out.println("My name is " + customer.fullName + " and age is "+ customer.age);
		
	}
}
