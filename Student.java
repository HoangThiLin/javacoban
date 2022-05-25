package Model;

import java.io.Serializable;
import java.util.Date;

public class Student extends Person implements Comparable<Student>,Serializable{
	private String StudentID;
	private String major;
	private Date enrolledDate;
	public String getStudentID() {
		return StudentID;
	}
	public void setStudentID(String studentID) {
		StudentID = studentID;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public Date getEnrolledDate() {
		return enrolledDate;
	}
	public void setEnrolledDate(Date enrolledDate) {
		this.enrolledDate = enrolledDate;
	}
	public Student(String fullName, Date birthday, Boolean gender, String studentID, String major, Date enrolledDate) {
		super(fullName, birthday, gender);
		StudentID = studentID;
		this.major = major;
		this.enrolledDate = enrolledDate;
	}
	@Override
	public int compareTo(Student o) {
		
		return 0;
	}

	

}
