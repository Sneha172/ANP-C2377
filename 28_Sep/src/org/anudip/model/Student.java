package org.anudip.model;

import java.time.LocalDate;
import java.util.Objects;

public class Student {
	private int studentId;
	private String studentName;
	private Gender gender;
	private LocalDate dob;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studentId, String studentName, Gender gender, LocalDate dob) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.gender = gender;
		this.dob = dob;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", dob=" + dob + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(dob, studentId, studentName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(dob, other.dob) && studentId == other.studentId
				&& Objects.equals(studentName, other.studentName);
	}
	


}
