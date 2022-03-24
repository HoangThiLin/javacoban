

import java.util.Random;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */

public class Cau4 {
    static int m;
     static int[] a1= new int[100];
    public static void main(String[] args) {
            int[] b= cau_a();   
            traiSangPhai();
            phaiSangTrai();
    }
     public static int[]  cau_a(){
                         int[] a= new int[100];
                         int n;                       
                         Random rand = new Random(); 
                         n=rand.nextInt(1,9);
                         m=n;
		        for(int i=0;i<n;i++){		        
		            a[i] = rand.nextInt(100); 
                            a1[i]=a[i];
		        }
                      return a;  
		    }
      public static void traiSangPhai(){                        
                System.out.println("So phan tu cua mang:"+m);  
                System.out.println("mang a tu trai sang phai la:");
                        for(int i=0;i<m;i++) {
                        System.out.print(a1[i] + " ");
                         }     
		    }
      public static void phaiSangTrai(){                        
               System.out.println("So phan tu cua mang:"+m);  
                System.out.println("mang a tu phai sang trai la:");
                        for(int i=m-1;i>=0;i--) {
                        System.out.print(a1[i] + " ");
                         }     
		    }
      
}
