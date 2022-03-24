/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */import java.util.Scanner;
import java.util.Random;
public class Cau1 {
    
     public static void main(String[] args) {
        int[] a= new int[100];
        Scanner sc = new Scanner(System.in);
        int n=0;
        cau1();
        
    }
      public static float cau1(){
          Scanner sc = new Scanner(System.in);
                      int[] a= new int[100];
                       System.out.println("Nhap so phan tu mang: ");
                      int n= sc.nextInt();
                      
		   	 System.out.println("Nhap mang A là: ");
		        for(int i=0;i<n;i++){
		            a[i]=sc.nextInt();
		        }
		        int dem=1,sum=0;
		        float tb=0;
                         System.out.print("mang a la: ");
		        for(int i=0;i<n;i++){
		            System.out.print(a[i]+" ");
		        }
		        for(int i=0;i<n;i++){
		            sum=sum+a[i];
		            dem=dem+1;
		        }
		        tb=sum/dem;
		        
		        return tb; 
	  }
		    //cau 2
                        public static float  cau2(int a[], int n){
                                  int tb=1,sum=0;
                                  float trungBinh;
                            Scanner sc = new Scanner(System.in);
                            n=sc.nextInt();
                            for(int i=0;i<n;i++){
                               Random rand = new Random();
                                 a[i] = rand.nextInt(10);
                                 tb=tb+i;
                                 sum=sum+a[i];
                                System.out.println("Random number is " + a[i]);
                            }
                                trungBinh=sum/tb;

                                 return trungBinh;      
                        }
		    
     
}
