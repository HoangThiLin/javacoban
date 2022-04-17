
public class HinhTron {
	protected double banKinh;
    public HinhTron(double banKinh){
       this.banKinh=banKinh;
    }
    public void setbanKinh(double banKinh){
       this.banKinh=banKinh;
    }
     public double getbanKinh(){
       return banKinh;
    }
     public double tinhChuVi(){
       return  banKinh*2*3.14;
    }
    public double tinhDienTich(){
       return banKinh*banKinh*3.14;
    }
}  

