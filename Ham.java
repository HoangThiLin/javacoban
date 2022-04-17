import java.util.Scanner;

public class Ham {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();
        bacHai(a,b,c);

	}
	// cau 1
    public static void thongBao(){
         System.out.println("Lap trinh java 2021");
    }
    //cau 2
    public static void chuoi(String a){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chuoi ky tu: ");
          a=sc.nextLine();
         System.out.println(a);    
    }
    //cau 3
    public static void cau3(int b,String a){
        Scanner sc = new Scanner(System.in);        
          do{
            System.out.println("nhap n");
            b=sc.nextInt();
          }while(b<0);
          for(int i=0;i<b;i++){
              chuoi(a);
          }
           
    }
    // cau 4
    public static void bacNhat(float a, float b){
        double nghiem;
           if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình này có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            nghiem = (double) -b / b;
            System.out.println("Phương trình có nghiệm x = " + nghiem);
        }
    }
    //cau 5
    public static void bacHai(float a, float b,float c){
        if(a==0){
           bacNhat(a,b) ;
        }
        else {
             double dt,x1,x2;
        dt = Math.pow(b,2) - 4 * a * c;
        if (dt < 0) {
            System.out.println("Phương trình vô nghiệm!");
        } else if (dt == 0) {
            x1 = -b / (2 * a);
            System.out.println("Phương trinh có 1 nghiệm là x1 = x2 = " + x1);
        } else {
            x1 = (-b + Math.sqrt(dt)) / (2 * a);
            x2 = (-b - Math.sqrt(dt)) / (2 * a);
            System.out.println("Phương trình có 2 nghiệm x1 = " + x1 + " và x2 = " + x2);
        }
           
        }
       
    }    
    //cau 6
    public static void chonLua(int n){
        System.out.println("Nhap lua chon: ");
        Scanner sc = new Scanner(System.in);
        if(n==1){
            System.out.println("nhap a");
            float a=sc.nextFloat();
            System.out.println("nhap b");
            float b=sc.nextFloat();
            bacNhat(a,b);
        }
        else if(n==2){
            System.out.println("nhap a");
            float a=sc.nextFloat();
            System.out.println("nhap b");
            float b=sc.nextFloat();
            System.out.println("nhap c");
            float c=sc.nextFloat();
            bacHai(a,b,c);
        }
        else {
            System.out.println("Khong co lua chon.");
        }
    }
    //cau 7
    public static void cau7(int n){
        Scanner sc = new Scanner(System.in);
        int a=1;
         while(a==1){
            System.out.println("Chon phuong trinh:");  
            n=sc.nextInt();
            chonLua(n);
            System.out.println("Ket thuc chuong trinh: ");
            a=sc.nextInt();
         }
    }

}
