package ru.vsu.sc.tretyakov_d_s;

public class Professor extends UnivEmployee {

	private String facultyName;

	/**
	 */
	public Professor(String firstName, String lastName, String email, String phoneNumber, String position) {
		super(firstName, lastName, email, phoneNumber, position);
	}

	/**
	 *
	 */
	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	/**
	 *
	 */
	public void postHomework() {
		// TODO - implement Professor.postHomework
		throw new UnsupportedOperationException();
	}

	/**
	 *
	 */
	public void checkHomework() {
		// TODO - implement Professor.checkHomework
		throw new UnsupportedOperationException();
	}

	@Override
	public String toString() {
		return "Professor{" +
				"facultyName='" + facultyName + '\'' +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", email='" + email + '\'' +
				", phoneNumber='" + phoneNumber + '\'' +
				", position='" + position + '\'' +
				'}';
	}
}