package dec12;

public class Student {
	String name="Shivam";

	public Student() {
		name="Unknown";
		System.out.println(name);
	}

	public Student(String name) {
		if(name.equals(this.name)) {
			System.out.println(name);
		}	
	}
}
