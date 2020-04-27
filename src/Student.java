
public class Student extends Pupil{
	
	// PROPERTIES
	private String universityName;
	private String speciality;
	
	
	//////////////////////////////  CONSTRUCTOR  //////////////////////////////
	public Student() {}
	
	public Student(String fullName, String universityName, String speciality, int age, float averageGrade, int level) {
		super(fullName, null, age, averageGrade, level);
		setSpeciality(speciality);
		setUniversityName(universityName);
		setDegreeType("Student");
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
			super.setLevel(level, 1, 7);
	}
	
	public void setAge(int age) {
		super.setAge(age, 19, 30);
	}
	
	
	// PRINT - OUTPUT
	public void printInfo() {
		printInfo(getDegreeType(), getUniversityName(), getSpeciality());		
	}
}
