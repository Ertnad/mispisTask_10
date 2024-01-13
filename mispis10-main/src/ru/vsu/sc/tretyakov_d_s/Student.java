package ru.vsu.sc.tretyakov_d_s;

public class Student {

	private final String facultyName;
	private final Integer year;
	private final Integer groupNumber;
	private final String firstName;
	private final String lastName;

	public Student(String facultyName, Integer year, Integer groupNumber, String firstName, String lastName) {
		this.facultyName = facultyName;
		this.year = year;
		this.groupNumber = groupNumber;
		this.firstName = firstName;
		this.lastName = lastName;
	}


	public void sendHomework(String homework){
		doHomework(homework);
	}

	public String doHomework(String homework){
		return homework;
	}



	@Override
	public String toString() {
		return "Student{" +
				"facultyName='" + facultyName + '\'' +
				", year=" + year +
				", groupNumber=" + groupNumber +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				'}';
	}
}