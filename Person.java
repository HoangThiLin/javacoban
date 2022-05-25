package Model;

import java.util.Date;

public abstract class Person {
    protected String fullName;
    protected Date birthday ;
    protected Boolean gender;
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Boolean getGender() {
		return gender;
	}
	public void setGender(Boolean gender) {
		this.gender = gender;
	}
	public Person(String fullName, Date birthday, Boolean gender) {
		super();
		this.fullName = fullName;
		this.birthday = birthday;
		this.gender = gender;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
    
}
