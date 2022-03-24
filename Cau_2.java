/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mangsapxep;

import java.util.Random;

public class Cau_2 {
    static int m;
        static int[] a1= new int[100]; 
        public static void main(String[] args) {
         int[] b= cau_a();
         //int n=0;
          System.out.print("Mang b la:");
                        for(int i=0;i<m;i++) {
                        System.out.print(b[i] + " ");
                        }  
             cau_b(b,8);
    }
        public static int[]  cau_a(){
                         int[] a= new int[100];
                         int n;                       
                         Random rand = new Random(); 
                         n=rand.nextInt(1,9);
                         m=n;
		        for(int i=0;i<n;i++){		        
		            a[i] =rand.nextInt(10); 
                            a1[i]=a[i];
		        }
                      return a;  
		    }
        public static int  cau_b(int b[],int n){
            for(int i=0;i<m;i++){   
               if(a1[i]==n){
               System.out.println(n+" Co vi tri trong mang la: "+(i+1)); 
               return i+1;
               }
          }  
            System.out.print("Khong co "+n+"trong mang:"); 
            return -1; 
        }
}
