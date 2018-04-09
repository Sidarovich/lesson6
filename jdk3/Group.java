package epm.com.jdk3;

public class Group {
	private Student[] students;
	private static final int Max_Mark = 5; // maximum mark for A-students
	private int countOfStudents = 0;

	public Group(int groupSize) {
		students = new Student[groupSize];

	}

	public boolean add(Student st) {
		if (countOfStudents >= students.length) {
			return false;
		}
		  students[countOfStudents] = st;//
		  countOfStudents++;
		  return true;
	}

	 public int getCountOfStudents() {
		  return countOfStudents;
		 }
	 
	 public Student[] getStudents() {
	 return students;
	 }
	// public double getAvgMark() {
	// double avr=0;
	// for (Student st:students) {
	// if (st!=null) {
	// avr=avr+st.getAvrMark();
	// }
	// }
	// avr = avr/countOfStudents;
	// return avr;
	// }
}