
public class Educated {

	// PROPERTIES
	private String degreeType;
	private String fullName;
	private byte age;
	private float averageGrade;
	private byte level;
	
	
	//////////////////////////////  CONSTRUCTOR  //////////////////////////////
	public Educated() {}
	
	public Educated(String fullName, int age, float averageGrade, int level) {
		setFullName(fullName);
		setAge(age);
		setAverageGrade(averageGrade);
		setLevel(level);
		setDegreeType("Educated");
	}

	
	////////////////////////////////  GETTERS  ////////////////////////////////
	public String getFullName() {
		return fullName;
	}

	public byte getAge() {
		return age;
	}

	public float getAverageGrade() {
		return averageGrade;
	}

	public byte getLevel() {
		return level;
	}
	
	public String getDegreeType() {
		return degreeType;
	}

	
    ////////////////////////////////  SETTERS  ////////////////////////////////
	public void setDegreeType(String degreeType) {
		this.degreeType = degreeType;
	}

	
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public void setAge(int age) {
		this.age = (byte)age;
	}

	public void setAverageGrade(float averageGrade) {
		
		if (averageGrade >= 1.00 && averageGrade <= 10.00)
			this.averageGrade = averageGrade;
		
		else
			printErrValue("GRADE", 1, 10);
	}

	public void setLevel(int level) {				
		this.level = (byte)level;		
	}
	
	
	// PRINT-OUTPUT
	public void printInfo() {
		printInfo(degreeType, "", "");
	}
	
	protected void printInfo(String degreeType, String institutionName, String speciality) {		
		System.out.printf("Full Name: %s (%d years)%n", 
				   fullName, age);
		
		switch (degreeType) {			
			case "Master": 
				System.out.print("Master's Degree in ");				
			
			case "Student":
				System.out.printf("University: %s%nSpeciality: %s%n", 
				   		   institutionName, speciality);
				break;
			
			case "Pupil":		
				System.out.printf("School: %s%n", institutionName);
								
		}
		System.out.printf("Level: %s%n", level);
		System.out.printf("Grade: %.2f%n", averageGrade);
		System.out.println();
	}	

	protected void printErrValue(String property, int minValue, int maxValue) {

		System.err.printf("%nUNACCEPTABLE VALUE FOR %s!%n"+
 		   		  "Enter a value from the range %d - %d%n",
				   property, minValue, maxValue);
	}
}
