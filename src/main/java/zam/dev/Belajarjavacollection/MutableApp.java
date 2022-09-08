package zam.dev.Belajarjavacollection;

public class MutableApp {

	public static void addHobies(Person person){
		// ini tidak boleh jadi misal kita ingin membuat list itu tidak bisa di rubah maka jadikan immutable
		person.getHobies().add("add hobies form method");
	}

	public static void main(String[] args) {
	
		Person person = new Person();
		person.showHobies();
		System.out.println("Person a");
		addHobies(person);
		person.showHobies();
	};

}
