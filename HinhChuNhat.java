
public class HinhChuNhat {
	  protected double dai, rong;
      public HinhChuNhat(double dai ,double rong){
         this.dai=dai;
         this.rong=rong;
      }
      public void setDai(double dai){
         this.dai=dai;
      }
      public void setRong(double rong){
         this.rong=rong;
      }
      public double getDai(){
         return dai;
      }
      public double getRong(){
         return rong;
      }
      public double tinhChuVi(){
         return (dai + rong) * 2;
      }
      public double tinhDienTich(){
         return dai*rong;
      }
     
}
