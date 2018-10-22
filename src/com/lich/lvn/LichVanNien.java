package com.lich.lvn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import com.lich.lvn.model.NhiThapBatTu;
import com.lich.lvn.model.Sao;

public class LichVanNien {

	public LichVanNien() {
		// TODO Auto-generated constructor stub
	}
	
	public static void getDateInfo(int dd, int mm, int yyyy) {
		// get Ngay Am Lich
		int timeZone = 7;
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
		Date date;
		try {
			date = simpleDateFormat.parse(yyyy + "-" + mm + "-" + dd);
			long intDate = date.getTime();
			
			String ngayAm = SunClass.chuyenDuongLichAmLich(dd, mm, yyyy, timeZone);
			System.out.println("Ngay Duong Lich: "+yyyy+"-"+mm+"-"+dd);
			System.out.println("Ngay Am Lich: "+ngayAm);
			
			int lunarYear = Integer.parseInt(ngayAm.split("-")[0]);
			int lunarMonth = Integer.parseInt(ngayAm.split("-")[1]);
			int lunarDay = Integer.parseInt(ngayAm.split("-")[2]);
			
			simpleDateFormat = new SimpleDateFormat("E");
			System.out.println("input_duong:"+ simpleDateFormat.format(date));
			System.out.println("thu_vi:" + SunClass.getDayName(simpleDateFormat.format(date)));
			
			int jd = SunClass.jdFromDate(dd, mm, yyyy);
			System.out.println("can_chi_nam:"+ SunClass.getCanChiNam(lunarYear));
			System.out.println("can_chi_thang:"+ SunClass.getCanChiThang(lunarYear, lunarMonth));
			System.out.println("can_chi_ngay:"+ SunClass.getCanChiNgay(SunClass.jdFromDate(dd, mm, yyyy)));
			System.out.println("can_chi_gio:"+ SunClass.getCanChiGio(SunClass.jdFromDate(dd, mm, yyyy)));
			System.out.println("tiet_khi:"+ SunClass.getTietKhi(SunClass.jdFromDate(dd, mm, yyyy)));
			System.out.println("day_info:"+SunClass.getSuKienNam((int) lunarDay, lunarMonth));
			System.out.println("hoang_dao:"+ SunClass.getGioHoangDao(SunClass.jdFromDate(dd, mm, yyyy)));
			System.out.println("hac_dao:"+ SunClass.getGioHacDao(SunClass.jdFromDate(dd, mm, yyyy)));
			
			// Ngay Hoang Dao - Hac Dao 
			String sao = SaoUnit.getSaoTheoNgay(lunarMonth,SunClass.getChiNgay(jd));
			System.out.println("SAO:"+sao);
			System.out.println("Ngày:"+SaoUnit.getNgayHoangDaoHacDao(sao));
			
			// Mệnh
			System.out.println("Ngày-Mệnh:"+MenhUnit.getMenhByTuoiCanChi(SunClass.getCanChiNgay(jd)));
			System.out.println("Ngày-Hành:"+MenhUnit.getHanhByTuoiCanChi(SunClass.getCanChiNgay(jd))+" - "+MenhUnit.getHanhVnByTuoiCanChi(SunClass.getCanChiNgay(jd)));
			
			System.out.println("Năm-Mệnh:"+MenhUnit.getMenhByTuoiCanChi(SunClass.getCanChiNam(lunarYear)));
			System.out.println("Năm-Hành:"+MenhUnit.getHanhByTuoiCanChi(SunClass.getCanChiNam(lunarYear))+" - "+MenhUnit.getHanhVnByTuoiCanChi(SunClass.getCanChiNam(lunarYear)));
			
			System.out.println("Tuổi sung:"+MenhUnit.getTuoiSung(SunClass.getCanChiNgay(jd)));
			
			// Nhi Thap Bat Tu
			NhiThapBatTu nhiThapBatTu = NhiThapBatTuUnit.getNhiThapBatTu(dd, mm, yyyy);
			System.out.println(nhiThapBatTu);
			
			System.out.println("Nhi Thap Bat Tu Tiêu đề:"+nhiThapBatTu.tieuDe);
			System.out.println("Nhi Thap Bat Tu Mô tả:"+nhiThapBatTu.moTa);
			System.out.println("Nhi Thap Bat Tu SAO:"+nhiThapBatTu.sao);
			System.out.println("Nhi Thap Bat Tu Động Vật:"+nhiThapBatTu.dongVat);
			System.out.println("Nhi Thap Bat Tu Hành:"+nhiThapBatTu.hanh);
			System.out.println("Nhi Thap Bat Tu Phương:"+nhiThapBatTu.huong);
			System.out.println("Nhi Thap Bat Tu Việc nên làm:"+nhiThapBatTu.nenLam);
			System.out.println("Nhi Thap Bat Tu Việc kiêng làm:"+nhiThapBatTu.kiengLam);
			System.out.println("Nhi Thap Bat Tu Việc ngoại lệ:"+nhiThapBatTu.ngoaiLe);
			System.out.println("Nhi Thap Bat Tu Thơ:"+nhiThapBatTu.tho);
			
			// Xuất Hành
			System.out.println("Hướng Hỷ Thần:"+HuongUnit.getHuong_HyThan_TheoCan(SunClass.getCanNgay(jd)));
			System.out.println("Hướng Tài Thần:"+HuongUnit.getHuong_TaiThan_TheoCan(SunClass.getCanNgay(jd)));
			System.out.println("Hướng Hạc Thần:"+HuongUnit.getHuong_HacThan_TheoCanChi(SunClass.getCanChiNgay(jd)));
			// Cát Tinh
		    List<String> saos =	SaoUnit.saoTotXuatHienTheoNgayAm(lunarMonth, SunClass.getCanChiNgay(jd));
		    for (String saoKey : saos) {
		    	Sao catTinh  = SaoUnit.getSao(saoKey);
		    	System.out.println("-------------------------------------------");
		    	System.out.println("Cat Tinh :"+catTinh.name);
		    	System.out.println("Cat Tinh - Nên làm :"+catTinh.nenLam);
		    	System.out.println("Cat Tinh - Kiêng:"+catTinh.kiengLam);
		    	System.out.println("Cat Tinh - Ngoại lệ:"+catTinh.ngoaiLe);
			}
		    
		 // Sát Tinh
		    saos =	SaoUnit.saoSauXuatHienTheoNgayAm(lunarMonth, SunClass.getCanChiNgay(jd));
		    for (String saoKey : saos) {
		    	Sao catTinh  = SaoUnit.getSao(saoKey);
		    	System.out.println("-------------------------------------------");
		    	System.out.println("Cat Tinh :"+catTinh.name);
		    	System.out.println("Cat Tinh - Nên làm :"+catTinh.nenLam);
		    	System.out.println("Cat Tinh - Kiêng:"+catTinh.kiengLam);
		    	System.out.println("Cat Tinh - Ngoại lệ:"+catTinh.ngoaiLe);
			}
		    
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		int dd = 22;
		int mm = 10;
		int yyyy = 2018;
		
		LichVanNien.getDateInfo(dd, mm, yyyy);
	}
}
