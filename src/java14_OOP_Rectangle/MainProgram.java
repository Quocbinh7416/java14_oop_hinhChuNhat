package java14_OOP_Rectangle;

import java.util.Scanner;

public class MainProgram {
	public static void main(String[] args) {
		/* instance*/
		Rectangle hinhCN = new Rectangle();
		
		System.out.println("Nhap thong tin hinh chu nhat");
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap chieu dai");
		Float a = sc.nextFloat();
		System.out.println("Nhap chieu rong");
		Float b = sc.nextFloat();
		hinhCN.setInfoChieuDai(a);
		hinhCN.setInfoChieuRong(b);
		
		System.out.println(hinhCN.getInfo());
		System.out.println("Ket qua");
		hinhCN.tinhChuVi();
		hinhCN.tinhDienTich();
	}
}
