import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

//import studentName.NameException;
//import studentName.Student;

public class Driver {

	public static void main(String[] args) {
		Object[] ar = new Object[10];
		
		try {
			Student s1 = new Student("Alex", "", 3);
			Student s2 = new Student("We", "Wa", 4);
			Student s3 = new Student("X", "Y", 5);
			
			ar[0] = 2;
			ar[1] = s1;
			ar[2] = "Aha";
			ar[3] = s2;
			ar[4] = s3;
			
			NameHolder bo = new Student("O", "p", 1);
			((Student)bo).getRating();
			
			
			for(Object o: ar) {
				System.out.println(o);
			}
			
			List<Student> students = new LinkedList<>(); 
			////can just do new ArrayList<>!!!
			///as long as the type matches ???????? or not??
			///i.e. ArrayList<> students = new ArrayList<>();
			
			students.add(s1);
			students.add(s2);
			students.add(s3);
			students.add((Student) bo); //remember to typecast
			
			Map<String, Student> m = new HashMap<String, Student>();
			
			Integer index = 0;
			for (Student s: students) {
				m.put("s1" + index++, s); 
				System.out.println(s);
			}
			
			System.out.print(m.size());
			
			//List<Student> sx = new ArrayList<>(); //list is an interface, so you can't instantiate is explicitly
			
		} catch (NameException e) {
			e.printStackTrace();
		}
	}
}
