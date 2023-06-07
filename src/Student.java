import java.util.ArrayList;

public class Student {
	private String name;
	ArrayList<String> subjects;
	ArrayList<Character> grades;
	
	public Student(String name) {
		this.name = name;
		subjects = new ArrayList<String>();
		grades = new ArrayList<Character>();
	}
	
	public String getName() {
		return name;
	}
	
	public ArrayList<String> getSubject() {
		return subjects;
	}
	
	public void add(String sub, Character g) {
		subjects.add(sub);
		grades.add(g);
	}
	
	public double getGPA() {
		double totalPoints = 0;
		for(Character g : grades) {
			switch(g) {
			
			case 'A':
				totalPoints += 4;
				break;
			case 'B':
				totalPoints += 3;
				break;
			case 'C':
				totalPoints += 2;
				break;
			case 'D':
				totalPoints += 1;
				break;
			case 'F':
				totalPoints += 0;
				break;
			default: 
				break;
			}
		}
		return totalPoints / subjects.size();
	}
	
}
