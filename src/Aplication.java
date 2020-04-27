
public class Aplication {

	public static void main(String[] args) {
		
		Educated educated = new Educated("Vasile Pupkin",
									      17, 9.52f, 9);
		
		educated.printInfo();
	
		Pupil pupil = new Pupil("Alexei Petrovici", 
							    "Liceul Teoretic \"Vasea Borş\"",
							     18, 8.72f, 12);
		
		pupil.printInfo();
		
		Student student = new Student("Ion Brânză", "UTM", 
								      "Facultatea de prăşit",
								       26, 8.72f, 6);
		
		student.printInfo();
		
		Master master = new Master("Vitalie Chişlămău", "USM",
								   "Facultatea de tuns bursuci",
								    30, 8.15f, 3);
		
		master.printInfo();
		
	}
}
