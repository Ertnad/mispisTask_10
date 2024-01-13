package ru.vsu.sc.tretyakov_d_s;

public class Dean extends UnivEmployee {

	private String facultyName;


	public Dean(String firstName, String lastName, String email, String phoneNumber, String position) {
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
	public void appointEmployee() {
		// TODO - implement Dean.appointEmployee
		throw new UnsupportedOperationException();
	}

	/**
	 *
	 */
	public void approveCurriculum() {
		// TODO - implement Dean.approveCurriculum
		throw new UnsupportedOperationException();
	}

	@Override
	public String toString() {
		return "Dean{" +
				"facultyName='" + facultyName + '\'' +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", email='" + email + '\'' +
				", phoneNumber='" + phoneNumber + '\'' +
				", position='" + position + '\'' +
				'}';
	}
}