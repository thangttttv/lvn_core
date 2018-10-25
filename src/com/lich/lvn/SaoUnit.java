package com.lich.lvn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.lich.lvn.model.Sao;

public class SaoUnit {

	public static final String SAO_HOANG_DAO[] = { "Thanh long", "Minh đường", "Thiên hình", "Chu Tước", "Kim quỹ",
			"Kim đường", "Bạch hổ", "Ngọc đường", "Thiên lao", "Nguyên vũ", "Tư mệnh", "Câu trần" };
	public static final String SAO_NGAY_MONTH_1[] = { "Tý", "Sửu", "Dần", "Mão", "Thìn", "Tị", "Ngọ", "Mùi", "Thân","Dậu", "Tuất", "Hợi" };

	public static final String SAO_NGAY_MONTH_2[] = { "Dần", "Mão", "Thìn", "Tị", "Ngọ", "Mùi", "Thân", "Dậu", "Tuất","Hợi", "Tý", "Sửu" };

	public static final String SAO_NGAY_MONTH_3[] = { "Thìn", "Tị", "Ngọ", "Mùi", "Thân", "Dậu", "Tuất", "Hợi", "Tý","Sửu", "Dần", "Mão" };

	public static final String SAO_NGAY_MONTH_4[] = { "Ngọ", "Mùi", "Thân", "Dậu", "Tuất", "Hợi", "Tý", "Sửu", "Dần","Mão", "Thìn", "Tị" };

	// Nguồn tại:
	// https://phongthuyso.vn/phuong-phap-chon-ngay-tot-tranh-ngay-xau.html
	public static final String SAO_NGAY_MONTH_5[] = { "Thân", "Dậu", "Tuất", "Hợi", "Tý", "Sửu", "Dần", "Mão", "Thìn","Tị", "Ngọ", "Mùi" };
	public static final String SAO_NGAY_MONTH_6[] = { "Tuất", "Hợi", "Tý", "Sửu", "Dần", "Mão", "Thìn", "Tị", "Ngọ",
			"Mùi", "Thân", "Dậu" };
	public static final String SAO_NGAY_MONTH_7[] = { "Tý", "Sửu", "Dần", "Mão", "Thìn", "Tị", "Ngọ", "Mùi", "Thân",
			"Dậu", "Tuất", "Hợi" };
	public static final String SAO_NGAY_MONTH_8[] = { "Dần", "Mão", "Thìn", "Tị", "Ngọ", "Mùi", "Thân", "Dậu", "Tuất",
			"Hợi", "Tý", "Sửu" };
	public static final String SAO_NGAY_MONTH_9[] = { "Thìn", "Tị", "Ngọ", "Mùi", "Thân", "Dậu", "Tuất", "Hợi", "Tý",
			"Sửu", "Dần", "Mão" };
	public static final String SAO_NGAY_MONTH_10[] = { "Ngọ", "Mùi", "Thân", "Dậu", "Tuất", "Hợi", "Tý", "Sửu", "Dần",
			"Mão", "Thân", "Dậu" };

	public static final String SAO_NGAY_MONTH_11[] = { "Thân", "Dậu", "Tuất", "Hợi", "Tý", "Sửu", "Dần", "Mão", "Thìn",
			"Tị", "Ngọ", "Mùi" };

	public static final String SAO_NGAY_MONTH_12[] = { "Tuất", "Hợi", "Tý", "Sửu", "Dần", "Mão", "Thìn", "Tị", "Ngọ",
			"Mùi", "Thân", "Dậu" };
	
	public static Map<String,Sao> saoMap = null;
	
	static {
		saoBuild();
	}
	
	public SaoUnit() {
		// TODO Auto-generated constructor stub
	}
	
	public static void saoBuild() {
		saoMap = new HashMap<>();
		Sao sao = new Sao(SaoConstant.THIEN_DUC, "Tốt", "Tốt mọi việc", "", "");
		saoMap.put(SaoConstant.THIEN_DUC, sao);
		sao = new Sao(SaoConstant.THIEN_DUC_HOP, "Tốt", "Tốt mọi việc", "", "");
		saoMap.put(SaoConstant.THIEN_DUC_HOP, sao);
		sao = new Sao(SaoConstant.NGUYET_DUC, "Tốt", "Tốt mọi việc", "", "");
		saoMap.put(SaoConstant.NGUYET_DUC, sao);
		sao = new Sao(SaoConstant.NGUYET_DUC_HOP, "Tốt", "Tốt mọi việc", "Kỵ tố tụng", "");
		saoMap.put(SaoConstant.NGUYET_DUC_HOP, sao);
		
		sao = new Sao(SaoConstant.THIEN_HY, "Tốt", "Tốt mọi việc, Nhất là cưới hỏi", "", "");
		saoMap.put(SaoConstant.THIEN_HY, sao);
		
		sao = new Sao(SaoConstant.THIEN_PHU, "Tốt", "Tốt mọi việc, nhất là xây dựng nhà cửa, khai trương và an táng", "", "");
		saoMap.put(SaoConstant.THIEN_PHU, sao);
		
		sao = new Sao(SaoConstant.THIEN_QUY, "Tốt", "Tốt mọi việc", "", "");
		saoMap.put(SaoConstant.THIEN_QUY, sao);
		
		sao = new Sao(SaoConstant.THIEN_MA, "Tốt", "Tốt cho việc xuất hành, giao dịch, cầu tài lộc", "", "");
		saoMap.put(SaoConstant.THIEN_MA, sao);
		
		sao = new Sao(SaoConstant.THIEN_TAI, "Tốt", "Tốt cho việc cầu tài lộc, khai trương", "", "Thiên Mã (Lộc mã) trùng với Bạch hổ: xấu");
		saoMap.put(SaoConstant.THIEN_TAI, sao);
		
		sao = new Sao(SaoConstant.DIA_TAI, "Tốt", "Tốt cho việc cầu tài lộc, khai trương", "", "Thiên tài trùng ngày Kim Quỹ Hoàng Đạo");
		saoMap.put(SaoConstant.DIA_TAI, sao);
		
		sao = new Sao(SaoConstant.NGUYET_TAI, "Tốt", "Tốt cho việc cầu tài lộc, khai trương, xuất hành, di chuyển, giao dịch", "", "");
		saoMap.put(SaoConstant.NGUYET_TAI, sao);
		
		sao = new Sao(SaoConstant.NGUYET_AN, "Tốt", "Tốt cho việc", "", "");
		saoMap.put(SaoConstant.NGUYET_AN, sao);
		
		sao = new Sao(SaoConstant.THIEN_XA, "Tốt", "Tốt cho tế tự, giải oan, trừ được các sao xấu.", "kiêng kỵ động thổ", "Nếu gặp trực khai thì rất tốt tức là ngày thiên xá gặp sinh khí");
		saoMap.put(SaoConstant.THIEN_XA, sao);
		
		sao = new Sao(SaoConstant.SINH_KHI, "Tốt", "Tốt mọi việc, nhất là làm nhà, sửa nhà, động thổ, trồng cây", "", "");
		saoMap.put(SaoConstant.SINH_KHI, sao);
		
		sao = new Sao(SaoConstant.THIEN_PHUC, "Tốt", "Tốt mọi việc", "", "");
		saoMap.put(SaoConstant.THIEN_PHUC, sao);
		
		sao = new Sao(SaoConstant.THIEN_THANH, "Tốt", "Tốt mọi việc", "", "Ngọc đường Hoàng Đạo");
		saoMap.put(SaoConstant.THIEN_THANH, sao);
		
		sao = new Sao(SaoConstant.THIEN_QUAN, "Tốt", "Tốt mọi việc", "", "Thiên Quan trùng với Tư mệnh Hoàng Đạo");
		saoMap.put(SaoConstant.THIEN_QUAN, sao);
		
		sao = new Sao(SaoConstant.KIM_QUY, "Tốt", "Tốt mọi việc", "", "Ngày Hoàng Đạo");
		saoMap.put(SaoConstant.KIM_QUY, sao);
		
		sao = new Sao(SaoConstant.THANH_LONG, "Tốt", "Tốt mọi việc", "", "Ngày Hoàng Đạo");
		saoMap.put(SaoConstant.THANH_LONG, sao);
		
		sao = new Sao(SaoConstant.MINH_DUONG, "Tốt", "Tốt mọi việc", "", "Ngày Hoàng Đạo");
		saoMap.put(SaoConstant.MINH_DUONG, sao);
		
		sao = new Sao(SaoConstant.KIM_DUONG, "Tốt", "Tốt mọi việc", "", "Ngày Hoàng Đạo");
		saoMap.put(SaoConstant.KIM_DUONG, sao);
		
		sao = new Sao(SaoConstant.NGOC_DUONG, "Tốt", "Tốt mọi việc", "", "Ngày Hoàng Đạo");
		saoMap.put(SaoConstant.NGOC_DUONG, sao);
		
		sao = new Sao(SaoConstant.TU_MENH, "Tốt", "Tốt mọi việc", "", "Ngày Hoàng Đạo");
		saoMap.put(SaoConstant.TU_MENH, sao);
		
		sao = new Sao(SaoConstant.PHUC_HAU, "Tốt", "Tốt về cầu tài lộc, khai trương", "", "");
		saoMap.put(SaoConstant.PHUC_HAU, sao);
		
		sao = new Sao(SaoConstant.DAI_HONG_SA, "Tốt", "Tốt mọi việc", "", "");
		saoMap.put(SaoConstant.DAI_HONG_SA, sao);
		
		sao = new Sao(SaoConstant.DAN_NHAT, "Tốt", "Tốt mọi việc", "", "");
		saoMap.put(SaoConstant.DAN_NHAT, sao);
		
		sao = new Sao(SaoConstant.THOI_DUC, "Tốt", "Tốt mọi việc", "", "");
		saoMap.put(SaoConstant.THOI_DUC, sao);
		
		sao = new Sao(SaoConstant.NGUYET_KHONG, "Tốt", "Tốt cho việc làm nhà, làm gường", "", "");
		saoMap.put(SaoConstant.NGUYET_KHONG, sao);
		
		sao = new Sao(SaoConstant.THANH_TAM, "Tốt", "Tốt mọi việc, nhất là cầu phúc, tế tự", "", "");
		saoMap.put(SaoConstant.THANH_TAM, sao);
		
		sao = new Sao(SaoConstant.NGU_PHU, "Tốt", "Tốt mọi việc", "", "");
		saoMap.put(SaoConstant.NGU_PHU, sao);
		
		sao = new Sao(SaoConstant.PHUC_SINH, "Tốt", "Tốt mọi việc", "", "");
		saoMap.put(SaoConstant.PHUC_SINH, sao);
		
		sao = new Sao(SaoConstant.CAT_KHANH, "Tốt", "Tốt mọi việc", "", "");
		saoMap.put(SaoConstant.CAT_KHANH, sao);
		
		
		
		sao = new Sao(SaoConstant.NGUYET_HINH, "Xấu", "", " Xấu mọi việc", "");
		saoMap.put(SaoConstant.NGUYET_HINH, sao);
		sao = new Sao(SaoConstant.TRUNG_PHUC, "Xấu", "", " Kỵ giá thú; an táng", "");
		saoMap.put(SaoConstant.TRUNG_PHUC, sao);
		sao = new Sao(SaoConstant.DIA_PHA, "Xấu", "", " Kỵ xây dựng nhà cửa, khởi công, động thổ", "");
		saoMap.put(SaoConstant.DIA_PHA, sao);
		sao = new Sao(SaoConstant.HOANG_VU, "Xấu", "", " Xấu mọi việc", "");
		saoMap.put(SaoConstant.HOANG_VU, sao);
		sao = new Sao(SaoConstant.TU_THOI_DAI_MO, "Xấu", "", " Kỵ an táng", "");
		saoMap.put(SaoConstant.TU_THOI_DAI_MO, sao);
		sao = new Sao(SaoConstant.VANG_VONG, "Xấu", "", " Kỵ xuất hành; cưới hỏi; cầu tài lộc; khởi công, động thổ", "");
		saoMap.put(SaoConstant.VANG_VONG, sao);
		sao = new Sao(SaoConstant.TIEU_HONG_SA, "Xấu", "", " Xấu mọi việc", "");
		saoMap.put(SaoConstant.TIEU_HONG_SA, sao);
		sao = new Sao(SaoConstant.THO_PHU, "Xấu", "", " Kỵ xây dựng nhà cửa, khởi công, động thổ", "");
		saoMap.put(SaoConstant.THO_PHU, sao);
		sao = new Sao(SaoConstant.NGUYET_KIEN_CHUYEN_SAT, "Xấu", "", " Kỵ khởi công, động thổ", "");
		saoMap.put(SaoConstant.NGUYET_KIEN_CHUYEN_SAT, sao);
		sao = new Sao(SaoConstant.PHI_MA_SAT, "Xấu", "", " Kỵ giá thú nhập trạch", "");
		saoMap.put(SaoConstant.PHI_MA_SAT, sao);
		sao = new Sao(SaoConstant.THU_TU, "Xấu", "", " Xấu mọi việc (trừ săn bắn tốt", "");
		saoMap.put(SaoConstant.THU_TU, sao);
		sao = new Sao(SaoConstant.NGUYET_PHA, "Xấu", "", " Xấu về xây dựng nhà cửa", "");
		saoMap.put(SaoConstant.NGUYET_PHA, sao);
		sao = new Sao(SaoConstant.THIEN_NGUC, "Xấu", "", " Xấu mọi việc", "");
		saoMap.put(SaoConstant.THIEN_NGUC, sao);
		sao = new Sao(SaoConstant.CAU_GIAO, "Xấu", "", " Xấu mọi việc, nhất là khởi công, động thổ,  xây dựng nhà cửa", "");
		saoMap.put(SaoConstant.CAU_GIAO, sao);
		sao = new Sao(SaoConstant.BACH_HO, "Xấu", "", " Kỵ an táng", "");
		saoMap.put(SaoConstant.BACH_HO, sao);
		sao = new Sao(SaoConstant.BANG_TIEU_NGOA_HAM, "Xấu", "", " Xấu mọi việc", "");
		saoMap.put(SaoConstant.BANG_TIEU_NGOA_HAM, sao);
		sao = new Sao(SaoConstant.TOI_CHI, "Xấu", "", " Xấu với tế tự; tố tụng", "");
		saoMap.put(SaoConstant.TOI_CHI, sao);
		sao = new Sao(SaoConstant.HOA_TAI, "Xấu", "", " Xấu đối với xây dựng nhà cửa; đổ mái; sửa sang nhà cửa", "");
		saoMap.put(SaoConstant.HOA_TAI, sao);
		sao = new Sao(SaoConstant.NHAN_CACH, "Xấu", "", " Xấu đối với giá thú, khởi tạo", "");
		saoMap.put(SaoConstant.NHAN_CACH, sao);
		sao = new Sao(SaoConstant.TRUNG_TANG, "Xấu", "", " Kỵ cưới hỏi; an táng; khởi công, động thổ, xây dựng nhà cửa", "");
		saoMap.put(SaoConstant.TRUNG_TANG, sao);
		sao = new Sao(SaoConstant.KIEP_SAT, "Xấu", "", " Kỵ xuất hành; cưới hỏi; an táng;  xây dựng nhà cửa", "");
		saoMap.put(SaoConstant.KIEP_SAT, sao);
		sao = new Sao(SaoConstant.DAI_HAO, "Xấu", "", " Xấu mọi việc", "");
		saoMap.put(SaoConstant.DAI_HAO, sao);
		sao = new Sao(SaoConstant.NGUYET_HU, "Xấu", "", " Xấu đối với việc giá thú, mở cửa, mở hàng", "");
		saoMap.put(SaoConstant.NGUYET_HU, sao);
		sao = new Sao(SaoConstant.LUC_BAT_THANH, "Xấu", "", " Xấu đối với xây dựng", "");
		saoMap.put(SaoConstant.LUC_BAT_THANH, sao);
		sao = new Sao(SaoConstant.KHONG_PHONG, "Xấu", "", " Kỵ cưới hỏi", "");
		saoMap.put(SaoConstant.KHONG_PHONG, sao);
		sao = new Sao(SaoConstant.TU_THOI_CO_QUA, "Xấu", "", " Kỵ cưới hỏi", "");
		saoMap.put(SaoConstant.TU_THOI_CO_QUA, sao);
		sao = new Sao(SaoConstant.THIEN_ON, "Xấu", "", " Kỵ xây dựng nhà cửa, khởi công, động thổ", "");
		saoMap.put(SaoConstant.THIEN_ON, sao);
		sao = new Sao(SaoConstant.CUU_KHONG, "Xấu", "", " Kỵ xuất hành; cầu tài lộc; khai trương", "");
		saoMap.put(SaoConstant.CUU_KHONG, sao);
		sao = new Sao(SaoConstant.QUA_TU, "Xấu", "", " Xấu với cưới hỏi", "");
		saoMap.put(SaoConstant.QUA_TU, sao);
		sao = new Sao(SaoConstant.AM_THAC, "Xấu", "", " Kỵ xuất hành; cưới hỏi; an táng", "");
		saoMap.put(SaoConstant.AM_THAC, sao);
		sao = new Sao(SaoConstant.NGUYET_YEM_DAI_HOA, "Xấu", "", " Xấu đối với xuất hành, giá thú", "");
		saoMap.put(SaoConstant.NGUYET_YEM_DAI_HOA, sao);
		sao = new Sao(SaoConstant.THIEN_DIA_CHUYEN_SAT, "Xấu", "", " Kỵ khởi công, động thổ", "");
		saoMap.put(SaoConstant.THIEN_DIA_CHUYEN_SAT, sao);
		sao = new Sao(SaoConstant.NGU_HU, "Xấu", "", " Kỵ khởi tạo; cưới hỏi; an táng", "");
		saoMap.put(SaoConstant.NGU_HU, sao);
		sao = new Sao(SaoConstant.LOI_CONG, "Xấu", "", " Xấu với xây dựng nhà cửa", "");
		saoMap.put(SaoConstant.LOI_CONG, sao);
		sao = new Sao(SaoConstant.CO_THAN, "Xấu", "", " Xấu với cưới hỏi", "");
		saoMap.put(SaoConstant.CO_THAN, sao);
		sao = new Sao(SaoConstant.THIEN_DIA_CHINH_CHUYEN, "Xấu", "", " Kỵ khởi công, động thổ", "");
		saoMap.put(SaoConstant.THIEN_DIA_CHINH_CHUYEN, sao);
		sao = new Sao(SaoConstant.LY_SANG, "Xấu", "", " Kỵ cưới hỏi", "");
		saoMap.put(SaoConstant.LY_SANG, sao);
		sao = new Sao(SaoConstant.THO_ON, "Xấu", "", " Kỵ xây dựng nhà cửa; đào ao, đào giếng; tế tự", "");
		saoMap.put(SaoConstant.THO_ON, sao);
		sao = new Sao(SaoConstant.THIEN_CUONG, "Xấu", "", " Xấu mọi việc", "");
		saoMap.put(SaoConstant.THIEN_CUONG, sao);
		sao = new Sao(SaoConstant.SAT_CHU, "Xấu", "", " Xấu mọi việc", "");
		saoMap.put(SaoConstant.SAT_CHU, sao);
		sao = new Sao(SaoConstant.THAN_CACH, "Xấu", "", " Kỵ tế tự", "");
		saoMap.put(SaoConstant.THAN_CACH, sao);
		sao = new Sao(SaoConstant.DIA_TAC, "Xấu", "", " Xấu đối với khởi tạo; an táng; khởi công động thổ; xuất hành", "");
		saoMap.put(SaoConstant.DIA_TAC, sao);
		sao = new Sao(SaoConstant.THIEN_TAC, "Xấu", "", " Xấu đối với khởi tạo; động thổ; về nhà mới; khai trương", "");
		saoMap.put(SaoConstant.THIEN_TAC, sao);
		sao = new Sao(SaoConstant.HOANG_SA, "Xấu", "", " Xấu đối với xuất hành", "");
		saoMap.put(SaoConstant.HOANG_SA, sao);
		sao = new Sao(SaoConstant.CAU_TRAN, "Xấu", "", " Kỵ an táng", "");
		saoMap.put(SaoConstant.CAU_TRAN, sao);
		sao = new Sao(SaoConstant.THIEN_LAI, "Xấu", "", " Xấu mọi việc", "");
		saoMap.put(SaoConstant.THIEN_LAI, sao);
		sao = new Sao(SaoConstant.NGUYET_HOA, "Xấu", "", " Xấu đối với sửa sang nhà cửa; đổ mái; xây bếp", "");
		saoMap.put(SaoConstant.NGUYET_HOA, sao);
		sao = new Sao(SaoConstant.TAM_TANG, "Xấu", "", " Kỵ khởi tạo; cưới hỏi; an táng", "");
		saoMap.put(SaoConstant.TAM_TANG, sao);
		sao = new Sao(SaoConstant.THO_CAM, "Xấu", "", " Kỵ xây dựng nhà cửa; an táng", "");
		saoMap.put(SaoConstant.THO_CAM, sao);
		sao = new Sao(SaoConstant.PHU_DAU_SAT, "Xấu", "", " Kỵ khởi công, động thổ", "");
		saoMap.put(SaoConstant.PHU_DAU_SAT, sao);
		sao = new Sao(SaoConstant.HA_KHOI, "Xấu", "", " Xấu mọi việc, nhất là khởi công, động thổ,  xây dựng nhà cửa", "");
		saoMap.put(SaoConstant.HA_KHOI, sao);
		sao = new Sao(SaoConstant.HUYEN_VU, "Xấu", "", " Kỵ an táng", "");
		saoMap.put(SaoConstant.HUYEN_VU, sao);
		sao = new Sao(SaoConstant.TIEU_HAO, "Xấu", "", " Xấu về giao dịch, mua bán; cầu tài lộc", "");
		saoMap.put(SaoConstant.TIEU_HAO, sao);
		sao = new Sao(SaoConstant.NGU_QUY, "Xấu", "", " Kỵ xuất hành", "");
		saoMap.put(SaoConstant.NGU_QUY, sao);
		sao = new Sao(SaoConstant.LO_BAN_SAT, "Xấu", "", " Kỵ khởi công, động thổ", "");
		saoMap.put(SaoConstant.LO_BAN_SAT, sao);
		sao = new Sao(SaoConstant.DUONG_THAC, "Xấu", "", " Kỵ xuất hành; cưới hỏi; an táng", "");
		saoMap.put(SaoConstant.DUONG_THAC, sao);
		sao = new Sao(SaoConstant.DOC_HOA, "Xấu", "", " Xấu đối với sửa sang nhà cửa; đổ mái; xây bếp", "");
		saoMap.put(SaoConstant.DOC_HOA, sao);
		sao = new Sao(SaoConstant.THIEN_HOA, "Xấu", "", " Xấu về lợp nhà", "");
		saoMap.put(SaoConstant.THIEN_HOA, sao);
		sao = new Sao(SaoConstant.QUY_KHOC, "Xấu", "", " Xấu với tế tự; an táng", "");
		saoMap.put(SaoConstant.QUY_KHOC, sao);
	}
	
	public static Sao getSao(String saoKey) {
		Sao sao = saoMap.get(saoKey);
		return sao;
	}

	public static String getSaoTheoNgay(int thangAl, String chiNgay) {
		String sao = "";
		Map<String, String> saoMap = new HashMap<>();
		String gio_month[] = null;
		switch (thangAl) {
		case 1:
			gio_month = SAO_NGAY_MONTH_1;
			break;
		case 2:
			gio_month = SAO_NGAY_MONTH_2;
			break;
		case 3:
			gio_month = SAO_NGAY_MONTH_3;
			break;
		case 4:
			gio_month = SAO_NGAY_MONTH_4;
			break;
		case 5:
			gio_month = SAO_NGAY_MONTH_5;
			break;
		case 6:
			gio_month = SAO_NGAY_MONTH_6;
			break;
		case 7:
			gio_month = SAO_NGAY_MONTH_7;
			break;
		case 8:
			gio_month = SAO_NGAY_MONTH_8;
			break;
		case 9:
			gio_month = SAO_NGAY_MONTH_9;
			break;
		case 10:
			gio_month = SAO_NGAY_MONTH_10;
			break;
		case 11:
			gio_month = SAO_NGAY_MONTH_11;
			break;
		case 12:
			gio_month = SAO_NGAY_MONTH_12;
			break;
		default:
			break;
		}

		int i = 0;
		for (String gio1 : gio_month) {
			saoMap.put(gio1, SAO_HOANG_DAO[i]);
			i++;
		}
		sao = saoMap.get(chiNgay);
		System.out.println(sao);
		return sao;
	}

	public static final String CAT_TINH[] = {SaoConstant.THIEN_DUC, SaoConstant.THIEN_DUC_HOP, SaoConstant.NGUYET_DUC, SaoConstant.NGUYET_DUC_HOP, SaoConstant.THIEN_HY,
			SaoConstant.THIEN_PHU, SaoConstant.THIEN_QUY, SaoConstant.THIEN_MA, SaoConstant.THIEN_TAI, SaoConstant.DIA_TAI, SaoConstant.NGUYET_TAI,SaoConstant.NGUYET_AN
			, SaoConstant.THIEN_XA, SaoConstant.SINH_KHI, SaoConstant.THIEN_PHUC, SaoConstant.THIEN_THANH, SaoConstant.THIEN_QUAN
			, SaoConstant.KIM_QUY, SaoConstant.THANH_LONG, SaoConstant.MINH_DUONG, SaoConstant.KIM_DUONG, SaoConstant.NGOC_DUONG,
			SaoConstant.TU_MENH, SaoConstant.PHUC_HAU, SaoConstant.DAI_HONG_SA ,SaoConstant.DAN_NHAT, SaoConstant.THOI_DUC,SaoConstant.NGUYET_KHONG
			,SaoConstant.THANH_TAM,SaoConstant.NGU_PHU,SaoConstant.PHUC_SINH, SaoConstant.CAT_KHANH};
	
	
	public static List<String> saoTotXuatHienTheoNgayAm(int thangAl, String ngayCanChi) {
		List<String> saoXuatHien = new ArrayList<>();
		String thien_duc[]="Đinh;Thân;Nhâm;Tân;Hợi;Giáp;Quý;Dần;Bính;Ất;Tỵ;tháng12:ngàyCanh".split(";");
		String thien_duc_hop[]="Nhâm;Tỵ;Đinh;Bính;Dân;Kỷ;Mậu;Hợi;Tân;Canh;Thân;Ất".split(";");
		String nguyet_duc[]="Bính;Giáp;Nhâm;Canh;Bính;Giáp;Nhâm;Canh;Bính;Giáp;Nhâm;Canh".split(";");
		String nguyet_duc_hop[]="Tân;Kỷ;Đinh;Ất;Tân;Kỷ;Đinh;Ất;Tân;Kỷ;Đinh;Ất".split(";");
		String thien_hy[]="Tuất;Hợi;Tý;Sửu;Dần;Mão;Thìn;Tỵ;Ngọ;Mùi;Thân;Dậu".split(";");
		String thien_phu[]="Thìn;Tỵ;Ngọ;Mùi;Thân;Dậu;Tuất;Hợi;Tý,Tí;Sửu;Dần;Mão".split(";");
		String thien_quy[]="Giáp,Ất;Giáp,Ất;Giáp,Ất;Bính,Đinh;Bính,Đinh;Bính,Đinh;Canh,Tân;Canh,Tân;Canh,Tân;Nhâm,Quý;Nhâm,Quý;Nhâm,Quý".split(";");
		String thien_ma[]="Giáp;Tý;Dần;Thìn;Ngọ;Thân;Tuất;Tý;Dần;Thìn;Ngọ;Thân".split(";");
		String thien_tai[]="Thìn;Ngọ;Thân;Tuất;Tý;Dần;Thìn;Ngọ;Thân;Tuất;Tý;Dần".split(";");
		String dia_tai[]="Tỵ;Mùi;Dậu;Hợi;Sửu;Mão;Tỵ;Mùi;Dậu;Hợi;Sửu;Mão".split(";");
		String nguyet_tai[]="Ngọ;Tỵ;Tỵ;Mùi;Dậu;Hợi;Ngọ;Tỵ;Tỵ;Mùi;Dậu;Hợi".split(";");
		String nguyet_an[]="Bính;Đinh;Canh;Kỷ;Mậu;Tân;Nhâm;Quý;Canh;Ất;Giáp;Tân".split(";");
		String thien_xa[]="  Mậu Dần;   Mậu Dần;   Mậu Dần;   Giáp Ngọ; KC ;  Giáp Ngọ;   Mậu Thân;   Mậu Thân;   Mậu Thân;   Giáp Tý;  KC;   Giáp Tý".split(";");
		String sinh_khi[]="  Tý;   Sửu;   Dần;   Mão;   Thìn;   Tỵ;   Ngọ;   Mùi;   Thân;   Dậu;   Tuất;   Hợi".split(";");
		String thien_phuc[]="  Kỷ;   Mậu; k_c ;   Tân, Quý;   Canh, Nhâm;k_c;   Ất;   Giáp;k_c;   Đinh;   Bính;k_c ".split(";");
		String thien_thanh[]="  Mùi;   Dậu;   Hợi;   Sửu;   Mão;   Tỵ;   Mùi;   Dậu;   Hợi;   Sửu;   Mão;   Tý".split(";");
		String thien_quan[]="  Tuất;   Tý;   Dần;   Thìn;   Ngọ;   Thân;   Tuất;   Tý;   Dần;   Thìn;   Ngọ;   Thân".split(";");
		String thanh_long[]="  Tý;   Dần;   Thìn;   Ngọ;   Thân;   Tuất;   Tý;   Dần;   Thìn;   Ngọ;   Thân;   Tuất".split(";");
		String minh_duong[]="  Sửu;   Mão;   Tỵ;   Mùi;   Dậu;   Hợi;   Sửu;   Mão;   Tỵ;   Mùi;   Dậu;   Hợi".split(";");
		String kim_duong[]="  Tỵ;   Mùi;   Dậu;   Hợi;   Sửu;   Mão;   Tỵ;   Mùi;   Dậu;   Hợi;   Sửu;   Mão".split(";");
		String ngoc_duong[]="  Mùi;   Dậu;   Hợi;   Sửu;   Mão;   Tỵ;   Mùi;   Dậu;   Hợi;   Sửu;   Mão;   Tỵ".split(";");
		String tu_menh[]="  Tuất;   Tý;   Dần;   Thìn;   Ngọ;   Thân;   Tuất;   Tý;   Dần;   Thân;   Ngọ;   Thân".split(";");
		String phuc_hau[]="  Dần;   Dần;   Dần;   Tỵ;   Tỵ;   Tỵ;   Thân;   Thân;   Thân;   Hợi;   Hợi;   Hợi".split(";");
		String dai_hong_sa[]="  Tý, Sửu;   Tý, Sửu;   Tý, Sửu;   Thìn, Tỵ;   Thìn, Tỵ;   Thìn, Tỵ;   Ngọ, Mùi;   Ngọ, Mùi;   Ngọ, Mùi;   Thân, Tuất;   Thân, Tuất;   Thân, Tuất".split(";");
		String dan_dat[]="  Ngọ;   Ngọ;   Ngọ;   Dậu;   Dậu;   Dậu;   Tý;   Tý;   Tý;   Mão;   Mão;   Mão".split(";");
		String thoi_duc[]="  Ngọ;   Ngọ;   Ngọ;   Dậu;   Dậu;   Dậu;   Tý;   Tý;   Tý;   Mão;   Mão;   Mão".split(";");
		String nguyet_khong[]="  Nhâm;   Canh;   Bính;   Giáp;   Nhâm;   Canh;   Bính;   Giáp;   Nhâm;   Canh;   Bính;  Giáp".split(";");
		String thanh_tam[]="  Hợi;   Tỵ;   Tý;   Ngọ;   Sửu;   Mùi;   Dần;   Thân;   Mão;   Dậu;   Thìn;   Tuất".split(";");
		String ngu_phu[]="  Hợi;   Dần;   Tỵ;   Thân;   Hợi;   Dần;   Tỵ;   Thân;   Hợi;   Dần;   Tỵ;   Thân".split(";");
		String phuc_sinh[]="  Dậu;   Mão;   Tuất;   Thìn;   Hợi;   Tỵ;   Tý;   Ngọ;   Sửu;   Mùi;   Dần;   Thân".split(";");
		String cat_khanh[]="  Dậu;   Dần;   Hợi;   Thìn;   Sửu;   Ngọ;   Mão;   Thân;   Tỵ;   Tuất;   Mùi;   Tý".split(";");

		List<String[]> saos = new ArrayList<>();
		saos.add(thien_duc);
		saos.add(thien_duc_hop);
		saos.add(nguyet_duc);
		saos.add(nguyet_duc_hop);
		saos.add(thien_hy);
		saos.add(thien_phu);
		saos.add(thien_quy);
		saos.add(thien_ma);
		saos.add(thien_tai);
		saos.add(dia_tai);
		saos.add(nguyet_tai);
		saos.add(nguyet_an);
		saos.add(thien_xa);
		saos.add(sinh_khi);
		saos.add(thien_phuc);
		saos.add(thien_thanh);
		saos.add(thien_quan);
		saos.add(thien_tai);
		saos.add(thanh_long);
		saos.add(minh_duong);
		saos.add(kim_duong);
		saos.add(ngoc_duong);
		saos.add(tu_menh);
		saos.add(phuc_hau);
		saos.add(dai_hong_sa);
		saos.add(dan_dat);
		saos.add(thoi_duc);
		
		saos.add(nguyet_khong);
		saos.add(thanh_tam);
		saos.add(ngu_phu);
		saos.add(phuc_sinh);
		saos.add(cat_khanh);
		
		System.out.println("saos Tot:-------------->"+saos.size());
		int i = 0;
		for (String[] sao : saos) {
			if(sao.length<12)
			System.out.println(i+":-------------->"+sao.length);
			System.out.println(CAT_TINH[i]);
			if(checkSaoXuatHien(sao,thangAl,ngayCanChi)) {
				saoXuatHien.add(CAT_TINH[i]);
			}
			i++;
		}
		
		System.out.println(saoXuatHien);
		return saoXuatHien;
	}
	public static final String SAT_TINH[] = { "Thiên Tặc", "Địa Tặc", "Hỏa Tai","Nguyệt Hỏa Độc Hỏa","Nguyệt Yếm Đại Họa","Nguyệt Kiến chuyển sát"
			,"Thiên Địa Chính Chuyển","Lỗ Ban Sát","Phủ Đầu Sát","Phi Ma Sát","Ngũ Quỷ","Băng Tiêu Ngọa Hãm","Hà Khôi","Cẩu Giảo",
			"Quả Tú","Sát Chủ","Nguyệt Hình","Tội Chỉ","Thiên Cương (Diệt Môn)","Thiên Lại","Thiên Ngục","Thiên Hỏa","Tiểu Hồng Sa","Đại Hao (Tử Khí, Quan Phù)","Tiểu Hao",
			"Nguyệt Hư","Hoàng Sa","Lục Bất Thành","Nhân Cách","Thần Cách","Bạch Hổ","Huyền Vũ","Câu Trận","Lôi Công","Cô Thần","Chu Tước"
			,"Trùng phục","Quỷ khốc","Tam Tang"
			,"Ngũ Hư","Tứ Thời Đại Mộ","Thổ Cấm","Ly Sàng","Trùng Tang",SaoConstant.VANG_VONG,SaoConstant.DIA_PHA,SaoConstant.HOANG_VU,
			SaoConstant.THO_PHU,SaoConstant.THU_TU,SaoConstant.NGUYET_PHA,SaoConstant.KIEP_SAT,SaoConstant.KHONG_PHONG};
	
	public static List<String> saoSauXuatHienTheoNgayAm(int thangAl, String ngayCanChi) {
		List<String> saoXuatHien = new ArrayList<>();
		String thien_tac[]="  Thìn;   Dậu;   Dần;   Mùi;   Tý,Tí;   Tỵ;   Tuất;   Mão;   Thân;   Sửu;   Ngọ;  Hợi".split(";");
		String dia_tac[]="  Sửu;   Tý,Tí;   Hợi;   Tuất;   Dậu;   Thân;   Mùi;   Ngọ;   Tỵ;   Thìn ;   Mão;   Dần".split(";");
		String hoa_tai[]="  Sửu;   Mùi;   Dần;   Thân;   Mão;   Dậu;   Thìn;   Tuất;   Tỵ;   Hợi  ; Ngọ;   Tý,Tí".split(";");
		String nguyet_hoa_doc_hoa[]="  Tỵ;   Thìn;   Mão;   Dần;   Sửu;   Tý,Tí;   Hợi;   Tuất;   Dậu;   Thân;   Mùi;   Ngọ".split(";");
		String nguyet_yem_dai_hoa[]="  Tuất;   Dậu;   Thân;   Mùi;   Ngọ;   Tỵ;   Thìn;   Mão;   Dần;   Sửu;   Tý,Tí;   Hợi".split(";");
		String nguyet_kiem_chuyen_sat[]="Mão ; Mão; Mão ; Ngọ; Ngọ; Ngọ;Dậu; Dậu; Dậu; Tý; Tý; Tý".split(";");
		String thien_dia_chinh_chuyen[]="Quý Mão , Tân Mão; Quý Mão , Tân Mão;Quý Mão , Tân Mão; Bính Ngọ, Mậu Ngọ; Bính Ngọ, Mậu Ngọ; Bính Ngọ, Mậu Ngọ; Đinh Dậu, Tân Dậu; Đinh Dậu, Tân Dậu; Đinh Dậu, Tân Dậu; Canh Tý, Nhâm Tý; Canh Tý, Nhâm Tý;Canh Tý, Nhâm Tý".split(";");
		String sat_lo_ban_sat[]="Tý;Tý;Tý; Mão;Mão; Mão; Ngọ;Ngọ;Ngọ; Dậu;Dậu;Dậu".split(";");
		String sat_phu_dau_sat[]="Thìn;Thìn;Thìn; Mùi;Mùi;Mùi; Dậu;Dậu;Dậu; Tý,Tí;Tý,Tí;Tý,Tí".split(";");
		String phi_ma_sat[]="  Tý;   Dậu;   Ngọ;   Mão;   Tý;   Dậu;   Ngọ;   Mão;   Tý,Tí;   Dậu;   Ngọ;   Mão".split(";");
		String ngu_quy[]="  Ngọ;   Dần;   Thìn;   Dậu;   Mão;   Thân;   Sửu;   Tỵ;   Tý,Tí;   Hợi;   Mùi;   Tuất".split(";");
		String bang_tieu_ngoa_ham[]="  Tỵ;   Tý;   Sửu;   Dần;   Mão;   Tuất;   Hợi;   Ngọ;   Mùi;   Thân;   Dậu;   Thìn".split(";");
		String ha_khoi[]="  Hợi;   Ngọ;   Sửu;   Thân;   Mão;   Tuất;   Tỵ;   Tý;   Mùi;   Dần;   Dậu;   Thìn".split(";");
		String qua_tu[]="  Thìn;   Tỵ;   Ngọ;   Mùi;   Thân;   Dậu;   Tuất;   Hợi;   Tý,Tí;   Sửu;   Dần;   Mão".split(";");
		String sat_chu[]="  Tỵ;   Tý;   Mùi;   Mão;   Thân;   Tuất;   Sửu;   Hợi;   Ngọ;   Dậu;   Dần;   Thìn".split(";");
		String nguyet_hinh[]="  Tỵ;   Tý;   Thìn;   Thân;   Ngọ;   Sửu;   Dần;   Dậu;   Mùi;   Hợi;   Mão;   Tuất".split(";");
		String toi_chi[]="  Ngọ;   Tý;   Mùi;   Sửu;   Thân;   Dần;   Dậu;   Mão;   Tuất;   Thìn;   Hợi;   Tỵ".split(";");
		String thien_cuong[]="  Tỵ;   Tý;   Mùi;   Dần;   Dậu;   Thìn;   Hợi;   Ngọ;   Sửu;   Thân;   Mão;   Tuất".split(";");
		String thien_lai[]="  Dậu;   Ngọ;   Mão;   Tý;   Dậu;   Ngọ;   Mão;   Tý;   Dậu;   Ngọ;   Mão;   Tý".split(";");
		String thien_nguc[]="  Tý;   Mão;   Ngọ;   Dậu;   Tý;   Mão;   Ngọ;   Dậu;   Tý;   Mão;   Ngọ;   Dậu".split(";");
		String thien_hoa[]="  Tý;   Mão;   Ngọ;   Dậu;   Tý;   Mão;   Ngọ;   Dậu;   Tý;   Mão;   Ngọ;   Dậu".split(";");
		String tieu_hong_sa[]="  Tỵ;   Dậu;   Sửu;   Tỵ;   Dậu;   Sửu;   Tỵ;   Dậu;   Sửu;   Tỵ;   Dậu;   Sửu".split(";");
		String dai_hao[]="  Ngọ;   Mùi;   Thân;   Dậu;   Tuất;   Hợi;   Tý;   Sửu;   Dần;   Mão;   Thìn;   Tỵ".split(";");
		String tieu_hao[]="  Tỵ;   Ngọ;   Mùi;   Thân;   Dậu;   Tuất;   Hợi;   Tý;   Sửu;   Dậu;   Mão;   Thìn".split(";");
		String nguyet_hu[]="  Sửu;   Tuất;   Mùi;   Thìn;   Sửu;   Tuất;   Mùi;   Thìn;   Sửu;   Tuất;   Mùi;Thìn".split(";");
		String hoang_sa[]="  Ngọ;   Dần;   Tý;   Ngọ;   Dần;   Tý;   Ngọ;   Dần;   Tý;   Ngọ;   Dần;   Tý".split(";");
		String luc_bat_thanh[]="  Dần;   Ngọ;   Tuất;   Tỵ;   Dậu;   Sửu;   Thân;   Tý;   Thìn;   Hợi;   Mão;   Mùi".split(";");
		String nhan_cach[]="  Dậu;   Mùi;   Tỵ;   Mão;   Sửu;   Hợi;   Dậu;   Mùi;   Tỵ;   Mão;   Sửu;   Hợi".split(";");
		String than_cach[]="  Tỵ;   Mão;   Sửu;   Hợi;   Dậu;   Mùi;   Tỵ;   Mão;   Sửu;   Hợi;   Dậu;   Mùi".split(";");
		String bach_ho[]="  Ngọ;   Thân;   Tuất;   Tý;   Dần;   Thìn;   Ngọ;   Thân;   Tuất;   Tý;   Dần;   Thìn".split(";");
		String huyen_vu[]="  Dậu;   Hợi;   Sửu;   Mão;   Tỵ;   Mùi;   Dậu;   Hợi;   Sửu;   Mão;   Tỵ;   Mùi".split(";");
		String cau_tran[]="  Hợi;   Sửu;   Mão;   Tỵ;   Mùi;   Dậu;   Hợi;   Sửu;   Mão;   Tỵ;   Mùi;   Dậu".split(";");
		String loi_cong[]="  Dần;   Hợi;   Tỵ;   Thân;   Dần;   Hợi;   Tỵ;   Thân;   Dần;   Hợi;   Tỵ;   Thân".split(";");
		String co_than[]="  Tuất;   Hợi;   Tý;   Sửu;   Dần;   Mão;   Thìn;   Tỵ;   Ngọ;   Mùi;   Thân;   Dậu".split(";");
		String chu_tuoc[] = "Mão;Tị;Mùi;Dậu;Hợi;Sửu; Mão;Tị;Mùi;Dậu;Hợi; Sửu".split(";");
		
		String trung_phuc[] = "Canh,Canh,Canh;Tân,Tân,Tân;Kỷ,Kỷ,Kỷ;Nhâm,Nhâm,Nhâm;Quý,Quý,Quý;Mậu,Mậu,Mậu,Mậu,Mậu,Mậu;Giáp,Giáp,Giáp;Ất,Ất,Ất;Kỷ,Kỷ;Nhâm,Nhâm,Nhâm;Quý,Quý,Quý;Kỷ,Kỷ,Kỷ".split(";");
		String quy_coc[]="Tuất;   Tuất;   Tuất;   Tuất;   Tuất;   Tuất;   Tuất;   Tuất;   Tuất;   Tuất;   Tuất;   Tuất".split(";");
		String tam_tang[]="Thìn;   Thìn;   Thìn;   Mùi;   Mùi;   Mùi;   Tuất;   Tuất;   Tuất;   Sửu;   Sửu;   Sửu".split(";");
		String ngu_hu[]=" Tỵ;   Dậu;   Sửu;   Thân;   Tý;   Thìn;   Hợi;   Mão;   Mùi;   Dần;   Ngọ;   Tuất".split(";");
		String tu_thoi_dai_mo[]=" Ất Mùi;   Ất Mùi;   Ất Mùi;   Bính Tuất;   Bính Tuất;   Bính Tuất;   Tân Sửu;   Tân Sửu;   Tân Sửu;   Nhâm Thìn;   Nhâm Thìn;   Nhâm Thìn".split(";");
		String tho_cam[]=" Hợi;   Hợi;   Hợi;   Dần;   Dần;   Dần;   Tỵ;   Tỵ;   Tỵ;   Thân;   Thân;   Thân".split(";");
		String ly_sang[] =" Dậu;   Dậu;   Dậu;   Dần;   Dần;   Dần;   Tuất;   Tuất;   Tuất;   Tỵ;   Tỵ;   Tỵ".split(";");
		
		String trung_tang[] ="Giáp,Giáp;Ất,Ất,Ất;Kỷ,Kỷ,Kỷ;Bính,Bính,Bính;Đinh,Đinh,Đinh;Kỷ,Kỷ,Kỷ,Kỷ,Kỷ,Kỷ;Canh,Canh;Tân,Tân,Tân;Kỷ,Kỷ;Nhâm,Nhâm,Nhâm;Quý,Quý,Quý;Kỷ,Kỷ,Kỷ".split(";");
		String vang_vong[] ="Dần,Dần;Tị,Tị;Thân,Thân;Hợi,Hợi,Hợi;Mão,Mão,Mão;Ngọ,Ngọ,Ngọ;Dậu,Dậu;Tý,Tý;Thìn,Thìn;Mùi,Mùi;Tuất,Tuất,Tuất;Sửu,Sửu".split(";");
		String dia_pha[] = "Hợi,Hợi;Tý,Tý,Tý;Sửu,Sửu;Dần,Dần;Mão,Mão,Mão;Thìn,Thìn;Tị,Tị;Ngọ,Ngọ,Ngọ;Mùi,Mùi;Thân,Thân,Thân;Dậu,Dậu,Dậu;Tuất,Tuất".split(";");
		
		String hoang_vu[] = "Tị,Dậu,Sửu,Tị,Dậu,Sửu,Tị;Dậu,Sửu,Tị,Dậu,Sửu,Tị,Dậu,Sửu;Tị,Dậu,Sửu,Tị,Dậu,Sửu,Tị;Thân,Tý,Thân,Tý,Thìn,Thân,Tý;Thìn,Thân,Tý,Thìn,Thân,Tý,Thìn;Thân,Tý,Thìn,Thân,Tý,Thìn,Thân,Tý,Thìn,Thân,Tý,Thìn,Thân,Tý,Thìn;Mùi,Hợi,Mão,Mùi,Hợi,Mão,Mùi;Hợi,Mão,Mùi,Hợi,Mão,Mùi,Hợi,Mão;Mùi,Hợi,Mão,Mùi,Hợi,Mão,Mùi;Tuất,Dần,Ngọ,Tuất,Dần,Ngọ,Tuất,Dần;Ngọ,Tuất,Dần,Ngọ,Tuất,Dần,Ngọ;Tuất,Dần,Ngọ,Tuất,Dần,Ngọ,Tuất".split(";");
		String tho_phu[] = "Dần,Dần;Mão,Mão;Thìn,Thìn,Thìn;Tị,Tị;Ngọ,Ngọ;Mùi,Mùi,Mùi;Thân,Thân;Dậu,Dậu,Dậu;Tuất,Tuất,Tuất;Hợi,Hợi;Tý,Tý,Tý;Sửu,Sửu".split(";");
		String thu_tu[] = "Tuất,Tuất;Thìn,Thìn;Hợi,Hợi;Tị,Tị;Tý,Tý;Ngọ,Ngọ,Ngọ;Sửu,Sửu,Sửu;Mùi,Mùi,Mùi;Dần,Dần,Dần;Thân,Thân,Thân;Mão,Mão;Dậu,Dậu".split(";");
		String nguyet_pha[] ="Thân,Thân;Dậu,Tuất,Dậu,Tuất,Dậu,Tuất;Tuất,Tuất;Hợi,Hợi,Hợi;Sửu,Tý,Sửu,Tý,Sửu;Sửu,Sửu;Dần,Dần,Dần;Mão,Thìn,Mão,Thìn;Thìn,Thìn;Tị,Tị,Tị;Ngọ,Mùi,Ngọ,Mùi;Mùi,Mùi,Mùi".split(";");
		String kiep_sat[] = "Hợi,Hợi;Thân,Thân,Thân;Tị,Tị,Tị;Dần,Dần;Hợi,Hợi;Thân,Thân,Thân;Tị,Tị;Dần,Dần;Hợi,Hợi,Hợi;Thân,Thân,Thân;Tị,Tị;Dần,Dần".split(";");
		String phong_khong[] = "Thìn,Tị,Tý,Tuất,Hợi,Mùi,Dần,Mão,Ngọ,Thân,Dậu,Sửu".split(";");
		
		List<String[]> saos = new ArrayList<>();
		saos.add(thien_tac);saos.add(dia_tac);saos.add(hoa_tai);saos.add(nguyet_hoa_doc_hoa);saos.add(nguyet_yem_dai_hoa);
		saos.add(nguyet_kiem_chuyen_sat);saos.add(thien_dia_chinh_chuyen);saos.add(sat_lo_ban_sat);saos.add(sat_phu_dau_sat);
		saos.add(phi_ma_sat);saos.add(ngu_quy);saos.add(bang_tieu_ngoa_ham);saos.add(ha_khoi);saos.add(ha_khoi);
		saos.add(qua_tu);saos.add(sat_chu);saos.add(nguyet_hinh);saos.add(toi_chi);saos.add(thien_cuong);saos.add(thien_lai);saos.add(thien_nguc);saos.add(thien_hoa);saos.add(tieu_hong_sa);saos.add(dai_hao);saos.add(tieu_hao);saos.add(nguyet_hu);saos.add(hoang_sa);saos.add(luc_bat_thanh);saos.add(nhan_cach);saos.add(than_cach);saos.add(bach_ho);saos.add(huyen_vu);saos.add(cau_tran);saos.add(loi_cong);saos.add(co_than);saos.add(chu_tuoc);saos.add(trung_phuc);saos.add(quy_coc);saos.add(tam_tang);
		saos.add(ngu_hu);saos.add(tu_thoi_dai_mo);saos.add(tho_cam);saos.add(ly_sang);saos.add(trung_tang);saos.add(vang_vong);
		saos.add(dia_pha);saos.add(hoang_vu);saos.add(tho_phu);saos.add(thu_tu);saos.add(nguyet_pha);saos.add(kiep_sat);
		saos.add(phong_khong);
		
		System.out.println("saos Xau:-------------->"+saos.size());
		int i = 0;
		for (String[] sao : saos) {
			//System.out.println(SAT_TINH[i]);
			if(sao.length<12)
			System.out.println(i+":-------------->"+sao.length);
			if(checkSaoXuatHien(sao,thangAl,ngayCanChi)) {
				saoXuatHien.add(SAT_TINH[i]);
			}
			i++;
		}
		
		System.out.println(saoXuatHien);
		return saoXuatHien;
	}
	
	public static String getNgayHoangDaoHacDao(String sao) {
		String loaiNgay = "Bình thường";
		String arrSaoHoangD[] = { "thanh long", "minh đường", "kim quỹ", "kim đường", "ngọc đường", "tư mệnh" };
		String arrSaoHacD[] = { "thiên hình", "chu tước", "bạch hổ", "thiên lao", "nguyên vũ", "câu trần" };

		// Convert String Array to List
		List<String> list = Arrays.asList(arrSaoHoangD);
		sao = SaoUnit.removeWhiteSpace(sao);
		sao = sao.toLowerCase();
		if (list.contains(sao)) {
			loaiNgay = "Hoàng Đạo";
		} else {
			list = Arrays.asList(arrSaoHacD);
			if (list.contains(sao)) {
				loaiNgay = "Hắc Đạo";
			}
		}
		System.out.println(loaiNgay);
		return loaiNgay;
	}
	
	private static boolean  checkSaoXuatHien(String arrSao[],int thangAl, String ngayCanChi) {
		if(ngayCanChi.contains("Tí")) {
			ngayCanChi = ngayCanChi.replace("Tí", "Tý");
		}
		ngayCanChi = removeWhiteSpace(ngayCanChi);
		ngayCanChi = ngayCanChi.trim();
		boolean kq = false;
		ngayCanChi = ngayCanChi.trim().toLowerCase();
		String saoChi = arrSao[thangAl-1];
		saoChi = saoChi.trim().toLowerCase();
		saoChi = removeWhiteSpace(saoChi);
		
		String ngays[] = saoChi.split(",");
		
		for (String canchi : ngays) {
			String arrSCC[] =  canchi.split(" ");
			// Neu la danh [can chi]
			if(arrSCC.length>=2) {
				if(ngayCanChi.compareTo(canchi)==0) {
					kq= true;
				}
			}else {
				// Neu chi [can] or [chi]
				String arrCanChi[] = ngayCanChi.split(" ");
				String can = arrCanChi[0] ;
				String chi = arrCanChi[1] ;
				if(can.compareTo(canchi)==0||chi.compareTo(canchi)==0) {
					kq= true;
				}
			}
			if(kq) break;
		}
		
		return kq;
	}
	
	private static void laySao(String ten_sao,String s) {
		s = removeWhiteSpace(s);
		Pattern p = Pattern.compile("Tháng \\d:");
		Matcher m = p.matcher(s ); // get a matcher object
		s  = s.replaceAll("Tháng \\d{1,}:", "");
		System.out.println(s);
		s  = s.replaceAll("tháng \\d{1,}:", "");
		System.out.println(s);
		s  = s.replaceAll("ngày", "");
		System.out.println(s);
		/*s  = s.replaceAll(";", ",");
		System.out.println(s);
		*/
		/*s  = s.replaceAll("\\s+", "");
		System.out.println(s);*/
		
		StringBuffer stringBuffer = new StringBuffer("String "+ten_sao+"[]=");
		stringBuffer.append("\"");
		stringBuffer.append(s);
		stringBuffer.append("\".split(\";\");");
		System.out.println(stringBuffer.toString());
	}
	
	private static String removeWhiteSpace(String s) {
		s  = s.replaceAll("\\s{2,}", " ");
		System.out.println(s);
		return s;
	}
	public static void main(String[] args) {
		SaoUnit.getSaoTheoNgay(9,"Tý");
		SaoUnit.getNgayHoangDaoHacDao("thanh long");
		
		String s = "Tháng 1: ngày Hợi; tháng 2: ngày Dần; tháng 3: ngày Tỵ; tháng 4: ngày Thân; tháng 5: ngày Hợi; tháng 6: ngày Dần; tháng 7: ngày Tỵ; tháng 8: ngày Thân; tháng 9: ngày Hợi; tháng 10: ngày Dần; tháng 11: ngày Tỵ; tháng 12: ngày Thân" ;
		SaoUnit.removeWhiteSpace(s);
		SaoUnit.laySao("ngu_phu",s);
		//SaoUnit.saoTotXuatHienTheoNgayAm(9, "Đinh Sửu");
		SaoUnit.saoSauXuatHienTheoNgayAm(10, "Đinh Dậu");
		Sao sao = SaoUnit.getSao(SaoConstant.CAT_KHANH);
		System.out.println(sao.name);
	}
}
