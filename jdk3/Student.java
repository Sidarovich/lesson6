package epm.com.jdk3;

public class Student {

	private String name;
	private String surname;
	private double[] marks;
	private int countofMarks = 0;

	public int getCountOfMarks() {
		return countofMarks;
	}

	public Student(String name, String surname, int numberOfSubjects) {
		this.name = name;
		this.surname = surname;
		marks = new double[numberOfSubjects];

	}

	// private int freeMarkPlaceIndex = 0;

	public boolean setMark(double currentMark) {
		if (countofMarks >= marks.length) {
			countofMarks++;
			return false;
		}
		marks[countofMarks] = currentMark;
		countofMarks++;
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public double[] getMarks() {
		return marks;
	}

	// public double getAvrMark() {
	// double avr = 0;
	//
	// for (double d : marks) {
	// avr = avr + d;
	// }
	// avr = avr / countofMarks;
	// return avr;
	// }
}