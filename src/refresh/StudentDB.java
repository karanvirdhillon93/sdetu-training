package refresh;

public class StudentDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student kd= new Student("373297","Karanvir");
		kd.enroll(112, "ics");
		kd.pay(1250);
		kd.showCourses();
		System.out.println(kd.toString());
	}

}
