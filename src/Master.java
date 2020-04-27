
public class Master extends Student {
	
	
	//////////////////////////////  CONSTRUCTOR  //////////////////////////////	
	public Master() {}

	public Master(String fullName, String universityName, String speciality, int age, float averageGrade, int level) {
		super(fullName, universityName, speciality, age, averageGrade, level);
	}
	
	
	////////////////////////////////  SETTERS  ////////////////////////////////
	public void setLevel(int level) {
		if (level >= 1 && level <= 3)
			super.setLevel(level);
		else
			printErrValue("LEVEL", 1, 3);
	}
	
	public void setAge(int age) {
		if (age >= 22 && age <= 33)
			super.setAge(age);
		else
			printErrValue("AGE", 22, 33);
	}

	
	// PRINT - OUTPUT
	public void printInfo() {
		super.printInfo(3, getUniversityName(), getSpeciality());
	}
}