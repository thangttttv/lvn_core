package com.lich.lvn.model;

public class NgayLe {
	public String le;
	public String ngay;
	public boolean isAmLich;
	
	public NgayLe(String le, String ngay, int isAmLich) {
		// TODO Auto-generated constructor stub
		this.le = le;
		this.ngay = ngay;
		this.isAmLich = isAmLich==1?true:false;
	}

}
