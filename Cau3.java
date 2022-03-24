import java.util.Scanner;
import java.util.Random;

public class Cau3 {
    static int m;
    static int[] a1= new int[100];
    static  float [] b1= new float[100];
    public static void main(String[] args) {
        
           cau_a();
           
           cau_b(m);
           trungBinh(m);
    }
    
    public static void  cau_a(){
                         int[] a= new int[100];
                         int n;
                        
                         Random rand = new Random(); 
                         n=rand.nextInt(1,9);
                         System.out.println("So phan tu mang ngau nhien: "+n);
                         System.out.print("mang ngau nhien: ");
		        for(int i=0;i<n;i++){		        
		             a[i] = rand.nextInt(100);
                             a1[i]=a[i];
		            System.out.print( a[i]+" ");
		        }
                        m=n;
		    }
    public static void  cau_b(int m){	             
		        float [] b= new float[100];
                         
                         Random rand = new Random(); 
                       
                         System.out.println("So phan tu mang ngau nhien: "+m);
                         System.out.println("mang ngau nhien: ");
		        for(int i=0;i<m;i++){		        
		             b[i] = rand.nextFloat(0,1);
                             b1[i]=b[i];
		            System.out.print( b[i]+" ");
		        }                 
		    }
    
   
    public static float  trungBinh(int m){
        float sum=0;
		   for(int i=0;i<m;i++){
		      sum= sum+(a1[i]*b1[i]);     
		    }    
                    System.out.println("Trung binh cong la: "+sum/m);
                        return 0;
		    }
    
   
   

		  
}
