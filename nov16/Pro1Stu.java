package nov16;

class Student{
	int rollNo;
	String name;
	public Student(int rollNo,String name) {
		this.rollNo=rollNo;
		this.name=name;
	}
	void display() {
		System.err.print(+ rollNo + " ");
		System.out.print(name + " \n");
	}
}

public class Pro1Stu {
	
	public static void main(String[] args) {
		Student student1 = new Student(1, "Shivam");
		Student student2 = new Student(2, "Vishal");
		student1.display();
		student2.display();
		

	}

}
