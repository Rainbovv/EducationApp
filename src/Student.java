
public class Student extends Educated{
	
	// PROPERTIES
	private String universityName;
	private String speciality;
	
	
	//////////////////////////////  CONSTRUCTOR  //////////////////////////////
	public Student() {}
	
	public Student(String fullName, String universityName, String speciality, int age, float averageGrade, int level) {
		super(fullName, age, averageGrade, level);
		setSpeciality(speciality);
		setUniversityName(universityName);
	}

	
	////////////////////////////////  GETTERS  ////////////////////////////////
	public String getUniversityName() {
		return universityName;
	}

	public String getSpeciality() {
		return speciality;
	}

	
	////////////////////////////////  SETTERS  ////////////////////////////////
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	
	public void setLevel(int level) {
		if (level >= 1 && level <= 7)
			super.setLevel(level);
		else
			printErrValue("LEVEL", 1, 7);
	}
	
	public void setAge(int age) {
		if (age >= 19 && age <= 30)
			super.setAge(age);
		else
			printErrValue("AGE", 19, 30);
	}
	
	
	// PRINT - OUTPUT
	public void printInfo() {
		printInfo(2, getUniversityName(), getSpeciality());
		
	}
}