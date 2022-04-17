import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class DocFile {
	public static void main(String[] args) throws IOException {
		Random rd=new Random();
		//Scanner sc=new Scanner(System.in);
		int n= rd.nextInt(1,10);
		System.out.println(n);
		double[] a = new double[100];
		for(int i=0;i<n;i++) {
			a[i] = rd.nextDouble(100.0);
		}
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
		
		
		
		
		String str="Welcome to Java";
		System.out.println(str);
		PrintStream ps = new PrintStream(new File("E:\\testout.txt"));
		for(int i=0;i<n;i++) {
			ps.println(a[i]);
		}
		ps.println(str);
		ps.close();
		FileInputStream fin = null;
        try {
            fin = new FileInputStream("E:\\testout.txt");
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
	}
	}
	

