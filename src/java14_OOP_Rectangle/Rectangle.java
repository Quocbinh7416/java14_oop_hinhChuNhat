package java14_OOP_Rectangle;
/* Rectangle class, homework */

public class Rectangle {
	
	/* properties */
	private Float chieuDai;
	private Float chieuRong;
	private Float chuVi;
	private Float dienTich;
	
	/* constructor */
	public Rectangle() {
		
	}

	
	/* getters/setters */
	public String getInfo() {
		return "Thong tin hinh chu nhat: Chieu dai: " + chieuDai + " Chieu rong: " + chieuRong;
	}
	
	public void setInfoChieuDai(Float chieuDai) {
		this.chieuDai = chieuDai;
	}
	public void setInfoChieuRong(Float chieuRong) {
		this.chieuRong = chieuRong;
	}
	
	/* methods */
	public void tinhChuVi() {
		chuVi = (chieuDai+chieuRong)*2;
		System.out.println("Chu vi hinh chu nhat la " + chuVi);
	}
	public void tinhDienTich() {
		dienTich = (chieuDai*chieuRong);
		System.out.println("Dien tich hinh chu nhat la " + dienTich);
	}
}
