
public class Educated {

	// PROPERTIES
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

	
    ////////////////////////////////  SETTERS  ////////////////////////////////
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
			printErrValue("GRADE", 1 , 10);
	}

	public void setLevel(int level) {				
		this.level = (byte)level;		
	}
	
	
	// PRINT-OUTPUT
	public void printInfo() {
		printInfo(1, "", "");
		System.out.println();
	}
	
	protected void printInfo(int type, String universityName, String speciality) {		
		System.out.printf("%nFull Name: %s (%d years)%n", 
				   fullName, age);
		
		switch (type) {			
			case 3: 
				System.out.print("Master's Degree ");							
			case 2:
				System.out.print("Year: " + level);
				break;			
			default:			
				System.out.print("Class: " + level);
		}
		
		System.out.print("\nGrade: " + averageGrade);
		
		if (type == 2 || type == 3)
			System.out.printf("%nUniversity: %s%nSpeciality: %s%n", 
					   universityName, speciality);
	}	

	protected void printErrValue(String variable, int minValue, int maxValue) {		
		System.err.printf("%nUNACCEPTABLE VALUE FOR %s!%n"+
				  "Please enter a value from the range %d - %d%n",
				   variable, minValue, maxValue);
	}
}

