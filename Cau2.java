
import java.util.Random;
import java.util.Scanner;


public class Cau2 {
     public static void main(String[] args) {
            ranDom();
            trungBinh();
        
    }
    public static void  ranDom(){
                int[] a= new int[100];
                int tb=1,sum=0;                  
                Scanner sc = new Scanner(System.in);
                System.out.println("Nhap so phan tu mang: ");
                int n=sc.nextInt();
                System.out.println("Mang random:");
                    for(int i=0;i<n;i++){
                            Random rand = new Random();
                            a[i] = rand.nextInt(10);                              
                            System.out.println("Mang sau khi random: " + a[i]);
                            }
                    for(int i=0;i<n;i++){                                                   
                        System.out.println("Mang sau khi random: " + a[i]);
                    }          
    }
    public static void  trungBinh(){
                int[] a= new int[100];
                int tb,sum=0;   
                int dem=1;
                Scanner sc = new Scanner(System.in);
                System.out.println("Nhap so phan tu mang: ");
                int n=sc.nextInt();
                System.out.println("Mang random:");
                    for(int i=0;i<n;i++){
                            Random rand = new Random();
                            a[i] = rand.nextInt(10);                              
                            System.out.println("Mang sau khi random: " + a[i]);
                            }
                for(int i=0;i<n;i++){
		            sum=sum+a[i];
		            dem=dem+1;
		        }
                        tb=sum/dem;
                      System.out.println("Gia tri trung binh:"+tb);        
    }
    
}
