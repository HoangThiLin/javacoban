
public abstract class Person {
     protected String gioiTinh;
     protected int namSinnh;
	public Person(String gioiTinh, int namSinnh) {
		this.gioiTinh = gioiTinh;
		this.namSinnh = namSinnh;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public int getNamSinnh() {
		return namSinnh;
	}
	public void setNamSinnh(int namSinnh) {
		this.namSinnh = namSinnh;
	}
	@Override
	public String toString() {
		return "Person [gioiTinh=" + gioiTinh + ", namSinnh=" + namSinnh + "]";
	}
	
     
}
