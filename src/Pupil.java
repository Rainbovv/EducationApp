
public class Pupil extends Educated {
	
	// PROPERTIES
	private String schoolName;

	
	//////////////////////////////  CONSTRUCTOR  //////////////////////////////
	public Pupil() {}

	public Pupil(String fullName, String schoolName, int age, float averageGrade, int level) {
		
		super(fullName, age, averageGrade, level);
		setSchoolName(schoolName);
	}

	
	////////////////////////////////  GETTERS  ////////////////////////////////
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	
	//////////////////////////////// SETTERS  ////////////////////////////////
	public void setLevel (int level) {
		
		if (level >= 1 && level <= 12)
			super.setLevel(level);
		else
			printErrValue("CLASS", 1, 12);
	}
	
	public void setAge(int age) {
		
		if (age >= 6 && age <= 20)
			super.setAge(age);
		else
			printErrValue("AGE", 6, 20);
	}
	
	
	// PRINT - OUTPUT
	public void printInfo() {
		super.printInfo(1,"","");
		System.out.println("\nSchool: " + schoolName);
	}
}
