import java.util.ArrayList;
import java.util.List;

public class Write
{
	
	
	public static void main(String[] args){
		
		Student student = new Student();
		student.setName("satya");
		student.setId(1);
		student.setMarks(92);
		
		
		Student student2 = new Student();
		student2.setName("Anindita");
		student2.setId(2);
		student2.setMarks(93);
		
		
		List<Student> students = new ArrayList<Student>();
		students.add(student);
		students.add(student2);
		System.out.println(students.size());
		
		for(Student stu : students){
			Student student3 = new Student();
			System.out.println(stu.getName() +"name");
			System.out.println(stu.getMarks() +"Marks");
		}
		
		
	}
	
	
	
}