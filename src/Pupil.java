
public class Pupil extends Educated {
	
	// PROPERTIES
	private String schoolName;

	
	//////////////////////////////  CONSTRUCTOR  //////////////////////////////
	public Pupil() {
	}

	public Pupil(String fullName, String schoolName, int age, float averageGrade, int level) {		
		super(fullName, age, averageGrade, level);
		setSchoolName(schoolName);
		setDegreeType("Pupil");
	}

	
	////////////////////////////////  GETTERS  ////////////////////////////////
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	
	//////////////////////////////// SETTERS  ////////////////////////////////
	public void setLevel(int level){
		setLevel(level, 1, 12);
	}
	
	public void setLevel (int level, int minLevel, int maxLevel) {
		
		if (level >= minLevel && level <= maxLevel)
			super.setLevel(level);
		
		else
			super.printErrValue("CLASS", minLevel, maxLevel);
	}
	
	public void setAge(int age) {
		setAge(age,6,20);
	}
	
	public void setAge(int age, int minAge, int maxAge) {
		if (minAge <= age && age <= maxAge) 
			super.setAge(age);
		else 
			super.printErrValue("AGE", minAge, maxAge);
	}
		
	
	// PRINT - OUTPUT
	public void printInfo() {
		super.printInfo(getDegreeType(), schoolName, "");
	}
}
