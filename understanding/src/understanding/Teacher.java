package understanding;

public class Teacher {
	int noOfStudentString;
	String teacherName;
	
	public Teacher(int num, String name) {
		
		this.noOfStudentString = num;
		this.teacherName = name;
		System.out.println(noOfStudentString + " "+ teacherName);
		}
	
	
	public static void main(String[] args) {
		
		Teacher teacher = new Teacher(1,"meet")	;
		}
}
