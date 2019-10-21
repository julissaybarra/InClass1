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
			
			for(Object o: ar) {
				System.out.println(o);
			}
		} catch (NameException e) {
			e.printStackTrace();
		}
	}
}
