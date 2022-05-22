package ViDu;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.sql.Date;
public class QLSV {
 public static void main(String[] args) throws CloneNotSupportedException  {
	 Student sv1= new Student("Hoang Thi Lin", Date.valueOf("2002-07-27"), true, 5.9f, 6);
	//Student sv2 = (Student) sv1.clone();
	Student sv2 = new Student("Nguyen van A", Date.valueOf("2002-07-27"), true, 5.9f, 5);
	System.out.println(sv1.compareTo(sv2));	
	try ( FileOutputStream fos = new FileOutputStream("sv1.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos); ) {
          oos.writeObject(sv1);
      } catch (IOException i) {
    	  i.printStackTrace();
      }
      System.err.println(sv1.getFullNmae());  
}
}
