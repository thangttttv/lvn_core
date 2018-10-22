package com.lich.lvn;

import java.util.HashMap;
import java.util.Map;

public class HuongUnit {

	public HuongUnit() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * 1. Ngày Giáp và 6. Ngày Kỷ: Hướng Đông bắc 
	 * 2. Ngày Ất và 7. Ngày Canh: Hướng Tây Bắc 
	 * 3. Ngày Bính và 8. Ngày Tân: Hướng Tây Nam
	 * 4. Ngày Đinh và 9. Ngày Nhâm: Hướng chính Nam
	 * 5. Ngày Mậu và 10. Ngày Quý: Hướng Đông Nam
	 */

	public static String getHuong_HyThan_TheoCan(String canNgay) {
		String huong = "";
		Map<String, String> map = new HashMap<>();
		map.put("Giáp", "Hướng Đông bắc");
		map.put("Kỷ", "Hướng Đông bắc");
		map.put("Ất", "Hướng Tây Bắc");
		map.put("Canh", "Hướng Tây Bắc");

		map.put("Bính", "Hướng Tây Nam");
		map.put("Tân", "Hướng Tây Nam");

		map.put("Đinh", "Hướng Chính Nam");
		map.put("Nhâm", "Hướng Chính Nam");

		map.put("Mậu", "Hướng Đông Nam");
		map.put("Quý", "Hướng Đông Nam");
		huong = map.get(canNgay);
		return huong;
	}
	
	/*
	 * 1. Ngày Giáp và 2. Ngày Ất: Hướng Đông Nam
3. Ngày Bính và 4. Ngày Đinh: Hướng Đông
5. Ngày Mậu: Hướng Bắc 6. Ngày Kỷ: Hướng Nam
7. Ngày Canh và 8. Ngày Tân: Hướng Tây Nam
9. Ngày Nhâm: Hướng Tây 10: Ngày Quý: Hướng Tây Bắc.
	 */
	
	public static String getHuong_TaiThan_TheoCan(String canNgay) {
		String huong = "";
		Map<String, String> map = new HashMap<>();
		map.put("Giáp", "Hướng Đông Nam");
		map.put("Ất", "Hướng Đông Nam");
		
		map.put("Bính", "Hướng Đông");
		map.put("Đinh", "Hướng Đông");

		map.put("Mậu", "Hướng Bắc");
		map.put("Kỷ", "Hướng Nam");

		map.put("Canh", "Hướng Tây Nam");
		map.put("Tân", "Hướng Tây Nam");

		map.put("Nhâm", "Hướng Tây");
		map.put("Quý", "Hướng Tây Bắc");
		huong = map.get(canNgay);
		return huong;
	}
	
	/*
	 * Ngày Ất Mão (55) Bính Thìn (56) Đinh Tỵ (57) Mậu Ngọ (58) Kỷ Mùi (59): 5 ngày hướng đông
Ngày Canh Thân (60) Tân Dậu (01) Nhâm Tuất (02) Quý Hợi (03) Giáp Tý (04) Ất Sửu (05): 6 ngày hướng đông nam
Ngày Bính Dần (06) Đinh Mão (07) Mậu Thìn (08) Kỷ Tỵ (09) Canh Ngọ (10): 5 ngày hướng nam.

Ngày Tân Mùi (11) Nhâm Thân (12) Quý Dậu (13) Giáp Tuất (14) Ất Hợi (15) Bính Tý (16): 6 ngày hướng tây nam

Ngày Đinh Sửu (17) Mậu Dần (18) Kỷ Mão (19) Canh Thìn (20) Tân Tỵ (21): 5 ngày hướng tây

Ngày Nhâm Ngọ (22) Quý Mùi (23) Giáp Thân (24) Ất Dậu (25) Bính Tuất (26) Đinh Hợi (27): 6 ngày hướng tây bắc

Ngày Mậu Tý (28) Kỷ Sửu (29) Canh Dần (30) Tân Mão (31) Nhâm Thìn (32): 5 ngày hướng bắc

	 */
	public static String getHuong_HacThan_TheoCanChi(String ngayCanChi) {
		String huong = "";
		//Ngày Ất Mão (55) Bính Thìn (56) Đinh Tỵ (57) Mậu Ngọ (58) Kỷ Mùi (59): 5 ngày hướng đông
		if("Ất Mão".equals(ngayCanChi)||"Bính Thìn".equals(ngayCanChi)||"Đinh Tỵ".equals(ngayCanChi)||"Mậu Ngọ".equals(ngayCanChi)||
			"Kỷ Mùi".equals(ngayCanChi)){
			huong = "Hướng đông";
		}else if("Canh Thân".equals(ngayCanChi)||"Tân Dậu".equals(ngayCanChi)||"Nhâm Tuất".equals(ngayCanChi)||"Quý Hợi".equals(ngayCanChi)
				||"Giáp Tý".equals(ngayCanChi)||"Ất Sửu".equals(ngayCanChi)) {
			huong = "Hướng đông nam";
		}else if("Bính Dần".equals(ngayCanChi)||"Đinh Mão".equals(ngayCanChi)||"Mậu Thìn".equals(ngayCanChi)
				||"Kỷ Tỵ".equals(ngayCanChi)||"Canh Ngọ".equals(ngayCanChi)) {
			huong = "Hướng nam";
		}else if("Tân Mùi".equals(ngayCanChi)||"Nhâm Thân".equals(ngayCanChi)||"Quý Dậu".equals(ngayCanChi)||"Giáp Tuất".equals(ngayCanChi)||
				"Ất Hợi".equals(ngayCanChi)||"Bính Tý".equals(ngayCanChi)) {
			huong = "Hướng Tây nam";
		}else if("Đinh Sửu".equals(ngayCanChi)||"Mậu Dần".equals(ngayCanChi)||"Kỷ Mão".equals(ngayCanChi)||
				"Canh Thìn".equals(ngayCanChi)||"Tân Tỵ".equals(ngayCanChi)||"Kỷ Mão".equals(ngayCanChi)) {
			huong = "Hướng Tây";
		}else if("Nhâm Ngọ".equals(ngayCanChi)||"Quý Mùi".equals(ngayCanChi)||"Giáp Thân".equals(ngayCanChi)||
				"Bính Tuất".equals(ngayCanChi)||"Đinh Hợi".equals(ngayCanChi)) {
			huong = "Hướng Tây bắc";
		}else if("Mậu Tý".equals(ngayCanChi)||"Kỷ Sửu".equals(ngayCanChi)||"Canh Dần".equals(ngayCanChi)||
				"Tân Mão".equals(ngayCanChi)||"Nhâm Thìn".equals(ngayCanChi)) {
			huong = "Hướng Bắc";
		}else {
			huong = "Không xuất hiện";
		}
		return huong;
	}
}
