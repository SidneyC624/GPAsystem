
public class Driver {

	public static void main(String[] args) {
		Student alan = new Student("Alan");
		alan.add("English", 'A');
		alan.add("Maths", 'A');
		alan.add("Geography", 'C');
		alan.add("History", 'B');
		
		System.out.println(alan.getName() + " has a GPA of " + alan.getGPA());
		System.out.println("It is obtained from these subjects");
		for(String sub : alan.getSubject()) {
			System.out.println(sub);
		}

	}

}
