package ViDu;

import java.io.Serializable;
import java.sql.Date;

public class Student implements Comparable<Student>,Cloneable,Serializable     {	
		 private String fullNmae;
		 private Date BirthDate;
		 private Boolean genDer;
		 private float gpa;
		 private int socialActivities;
		 private static final long serialVersionUID = 1L;
		public Student(String fullNmae, Date birthDate, Boolean genDer, float gpa, int socialActivities) {
			this.fullNmae = fullNmae;
			BirthDate = birthDate;
			this.genDer = genDer;
			this.gpa = gpa;
			this.socialActivities = socialActivities;
		}
		public String getFullNmae() {
			return fullNmae;
		}
		public void setFullNmae(String fullNmae) {
			this.fullNmae = fullNmae;
		}
		public Date getBirthDate() {
			return BirthDate;
		}
		public void setBirthDate(Date birthDate) {
			BirthDate = birthDate;
		}
		public Boolean isGenDer() {
			return genDer;
		}
		public void setGenDer(Boolean genDer) {
			this.genDer = genDer;
		}
		public float getGpa() {
			return gpa;
		}
		public void setGpa(float gpa) {
			this.gpa = gpa;
		}
		public int getSocialActivities() {
			return socialActivities;
		}
		public void setSocialActivities(int socialActivities) {
			this.socialActivities = socialActivities;
		}
		@Override
		public int compareTo(Student o) {
			if ((this.gpa - o.gpa)>0)
			 return 1;
			else if ((this.gpa - o.gpa)==0) {
				return this.socialActivities-o.socialActivities;
				//return 0;
				
			}
				
			else
			//return this.socialActivities-o.socialActivities;
			return -1;
			
		}	
		@Override
		   protected Object clone() throws CloneNotSupportedException {
		       return super.clone();
		   }

}
