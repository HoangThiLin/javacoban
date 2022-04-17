import java.io.Serializable;

public class Student extends Person implements Serializable{
	private String maSinhVien;
	private String hoVaTen;
	private float diemTrungBinh;
	public Student(String gioiTinh, int namSinnh, String maSinhVien, String hoVaTen, float diemTrungBinh) {
		super(gioiTinh, namSinnh);
		this.maSinhVien = maSinhVien;
		this.hoVaTen = hoVaTen;
		this.diemTrungBinh = diemTrungBinh;
	}
	public String getMaSinhVien() {
		return maSinhVien;
	}
	public void setMaSinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}
	public String getHoVaTen() {
		return hoVaTen;
	}
	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}
	public float getDiemTrungBinh() {
		return diemTrungBinh;
	}
	public void setDiemTrungBinh(float diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}
	@Override
	public String toString() {
		return gioiTinh+"\t"+namSinnh+"\t"+maSinhVien+"\t"+hoVaTen+"\t"+diemTrungBinh;
	}

}
