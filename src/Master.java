
public class Master extends Student {
	
	
	//////////////////////////////  CONSTRUCTOR  //////////////////////////////	
	public Master() {}

	public Master(String fullName, String universityName, String speciality, int age, float averageGrade, int level) {
		super(fullName, universityName, speciality, age, averageGrade, level);
		setDegreeType("Master");
	}
	
	
	////////////////////////////////  SETTERS  ////////////////////////////////
	public void setLevel(int level) {
		super.setLevel(level, 1, 3);
	}
	
	public void setAge(int age) {
		super.setAge(age, 22, 33);
	}

	
	// PRINT - OUTPUT
	public void printInfo() {
		super.printInfo(getDegreeType(), getUniversityName(), getSpeciality());
	}
}