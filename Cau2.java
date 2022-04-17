import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class Cau2 {
	public static void main(String[] args) throws IOException {
		//double[] a = new double[100];
		Student[] st=new Student[100];
		 st[0] = new Student("nu", 2002, "20T1020056", "Hoang Thi Lin", 8);
		 st[1] = new Student("nu", 2003, "20T1020056", "Hoang Thi Lin", 8);
		 st[2] = new Student("nu", 2005, "20T1020056", "Hoang Thi Lin", 8);
		PrintStream ps = new PrintStream(new File("E:\\data.txt"));
		for(int i=0;i<3;i++) {
			ps.println(st[i]);
		}
		ps.close();
		FileInputStream fin = null;
        try {
            fin = new FileInputStream("E:\\data.txt");
            int i = 0;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            fin.close();
        }
//		try {
//			FileOutputStream f = new FileOutputStream("E:\\data.txt");
//			ObjectOutput osi = new ObjectOutputStream(f);
//			osi.writeObject(st1);
//			osi.writeObject(st2);
//			osi.writeObject(st3);
//			osi.close();
//			f.close();		
//			FileInputStream fi = new FileInputStream("E:\\data.txt");
//			ObjectInput os = new ObjectInputStream(fi);
//			while(fi.available()>0) {
//				try {
//					Student s = (Student) os.readObject();
//					System.out.println(os);
//				} catch (Exception e) {					
//				}
//			}			
//			System.out.println(os);
//			os.close();
//			fi.close();
//		} catch (Exception e) {
//
//		}
	}

}
