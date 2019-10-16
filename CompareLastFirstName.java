import java.util.Comparator;

public class CompareLastFirstName implements Comparator<Student> {

	public CompareLastFirstName(Student first, Student last) {
		String firstName = first.getFirstName();
		String lastName = last.getLastName();
		
		String firstNameLast = last.getFirstName();
		String lastNameLast = last.getLastName();
		
		if (firstName.compareTo(firstNameLast) < 0) {
			//do something
		} 
		else if (firstName.compareTo(firstNameLast) == 0) {
			//do the equal thing
		}
		else {
			
		}
	}
	
}
