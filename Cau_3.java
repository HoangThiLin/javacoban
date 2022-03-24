/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mangsapxep;

import java.util.Random;
import java.util.Scanner;

public class Cau_3 {
        public static void main(String[] args) {
        // int[] b= cau_a();
        giamDan();
         
    }
        public static int[]  cau_a(){
                         int[] a= new int[100];
                         int n;                       
                         Random rand = new Random(); 
                         n=rand.nextInt(1,9);
                    
		        for(int i=0;i<n;i++){		        
		            a[i] =rand.nextInt(10); 
                         		        }
                      return a;  
		    }
            public static void cauB(){
              Scanner sc = new Scanner(System.in);
                    int[] a= new int[100];
                        System.out.println("Nhap so phan tu mang: ");
                    int n= sc.nextInt();                     
		   	 System.out.println("Nhap mang A là: ");
		        for(int i=0;i<n;i++){
		            a[i]=sc.nextInt();
		        }
                    System.out.print("mang a la: ");
		        for(int i=0;i<n;i++){
		            System.out.print(a[i]+" ");
		    }
            }
        public static void tangDan(){
                 Scanner sc = new Scanner(System.in);
                    int[] a= new int[100];
                        System.out.println("Nhap so phan tu mang: ");
                    int n= sc.nextInt();                     
		   	 System.out.println("Nhap mang A là: ");
		        for(int i=0;i<n;i++){
		            a[i]=sc.nextInt();
		        }
                 int temp = a[0];
            for (int i = 0 ; i < n- 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (a[i] > a[j]){
                        temp = a[j];
                        a[j] = a[i];
                        a[i] = temp;
                    }
                }
            }
            System.out.print("Mang sau sap xep tang dan: ");
		        for(int i=0;i<n;i++){
		            System.out.print(a[i]+" ");
		    }
        }
        public static void giamDan(){
                 Scanner sc = new Scanner(System.in);
                    int[] a= new int[100];
                        System.out.println("Nhap so phan tu mang: ");
                    int n= sc.nextInt();                     
		   	 System.out.println("Nhap mang A là: ");
		        for(int i=0;i<n;i++){
		            a[i]=sc.nextInt();
		        }
                 int temp = a[0];
            for (int i = 0 ; i < n- 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (a[i] < a[j]){
                        temp = a[j];
                        a[j] = a[i];
                        a[i] = temp;
                    }
                }
            }
             System.out.print("Mang sau sap xep giam dan: ");
		        for(int i=0;i<n;i++){
		            System.out.print(a[i]+" ");
		    }
        }
             
            
            
}
