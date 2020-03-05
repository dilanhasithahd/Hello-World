
public class Student {

	int sno;
	String name;
	float avg;
	
	Student(int sno, String name, float avg) {
		this.sno = sno;
		this.name = name;
		this.avg = avg;
	}
	
	void displayDetails() {
		System.out.println(sno + " " + name + " " + avg);
	}
}
