package labs;

public class Lab2 {

	public static void main(String[] args) {
		// Create a Student
		Student stu1 = new Student("Janelle", "321456987");
        
		stu1.enroll("Math");
		stu1.enroll("English");
		
		stu1.showCourses();
		// stu1.checkBalance();
		stu1.payTuition(600);
		stu1.checkBalance();
		System.out.println(stu1.toString());
	}

}

class Student {
	// Properties
	private static int iD = 1000;
	private String userId;
	private String name;
	private String SSN;
	private String email;
	private String courses = "";
	private static final int costOfCourse = 800;
	private int balance;
	
	public Student (String name, String SSN) {
		iD++;
		this.name = name;
		this.SSN = SSN;
		setUserId();
		setEmail();
	}
	
	private void setEmail() {
		email = name.toLowerCase() + "."+ iD + "@sdetuniversity.com";
		System.out.println("Your email: " + email);
	}
	
	private void setUserId () {
		int max = 9000;
		int min = 1000;
		int randNum = (int) (Math.random()*(max - min));
		randNum = randNum  + min;
		userId = iD + "" + randNum + SSN.substring(5);
		System.out.println("Your User ID: " + userId);
	}
	
	public void enroll(String course) {
		this.courses = this.courses +"\n" + course;
		// System.out.println(courses);
		balance = balance + costOfCourse;
	}
	public void payTuition(int amount) {
		balance = balance - amount;
		System.out.println("Payment: " + amount);
	}
	
	public void checkBalance() {
		System.out.println("Balance is " + balance);
	}
	public void showCourses() {
		System.out.println(courses);
	}
	public String toString() {
		return "[Name: " + name + "]\n[Courses: " + courses + "]\n[Balance: " + balance + "]";

}
}
