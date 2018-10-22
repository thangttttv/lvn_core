package com.lich.lvn;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MenhUnit {

	public enum Color {
		KIM, MOC, THUY, HOA, THO;
	}

	public MenhUnit() {
		// TODO Auto-generated constructor stub
	}

	public static String getMenhByTuoiCanChi(String tuoiCanChi) {
		String menh = "";
		String hoa[] = { "Bính Dần", "Ðinh Mão", "Giáp Tuất", "Ất Hợi", "Mậu Tý", "Kỷ Sửu", "Bính Thân", "Ðinh Dậu",
				"Giáp Thìn", "Ất Tị", "Mậu Ngọ", "Kỷ Mùi", };
		String kim[] = { "Giáp Tý", "Ất Sửu", "Nhâm Thân", "Quí Dậu", "Canh Thìn", "Tân Tị", "Giáp Ngọ", "Ất Mùi",
				"Nhâm Dần", "Quí Mão", "Canh Tuất", "Tân Hợi", };
		String Thuy[] = { "Bính Tý", "Ðinh Sửu", "Giáp Thân", "Ất Dậu", "Nhâm Thìn", "Quí Tị", "Bính Ngọ", "Ðinh Mùi",
				"Giáp Dần", "Ất Mão", "Nhâm Tuất", "Quí Hợi", };
		String Moc[] = { "Mậu Thìn", "Kỷ Tị", "Nhâm Ngọ", "Quí Mùi", "Canh Dần", "Tân Mão", "Mậu Tuất", "Kỷ Hợi",
				"Nhâm Tý", "Quí Sửu", "Canh Thân", "Tân Dậu", };

		List<String> list = Arrays.asList(hoa);
		if (list.contains(tuoiCanChi)) {
			menh = "Hỏa";
		} else {
			list = Arrays.asList(kim);
			if (list.contains(tuoiCanChi)) {
				menh = "Kim";
			} else {
				list = Arrays.asList(Thuy);
				if (list.contains(tuoiCanChi)) {
					menh = "Thủy";
				} else {
					list = Arrays.asList(Moc);
					if (list.contains(tuoiCanChi)) {
						menh = "Mộc";
					} else {
						menh = "Thổ";
					}
				}
			}
		}

		return menh;
	}
	
	public static String getHanhByTuoiCanChi(String tuoiCanChi) {
		String hanh = "";
		Map<String, String> mapTuoiHanh = new HashMap<>(); 
		mapTuoiHanh.put("Giáp Tý","Hãi Trung Kim");
		mapTuoiHanh.put("Ất Sửu","Hãi trung Kim");
		mapTuoiHanh.put("Bính Dần","Lô Trung Hỏa");
		mapTuoiHanh.put("Ðinh Mão","Lô Trung Hỏa");
		mapTuoiHanh.put("Mậu Thìn","Đại Lâm Mộc");
		mapTuoiHanh.put("Kỷ Tị","Đại Lâm Mộc");
		mapTuoiHanh.put("Canh Ngọ","Lộ Bàng Thổ");
		mapTuoiHanh.put("Tân Mùi","Lộ Bàng Thổ");
		mapTuoiHanh.put("Nhâm Thân","Kiếm Phong Kim");
		mapTuoiHanh.put("Quí Dậu","Kiếm Phong Kim");
		mapTuoiHanh.put("Giáp Tuất","Sơn Đầu Hỏa");
		mapTuoiHanh.put("Ất Hợi","Sơn Đầu Hỏa");
		mapTuoiHanh.put("Bính Tý","Giáng hạ Thủy");
		mapTuoiHanh.put("Ðinh Sửu","Giáng Hạ Thủy");
		mapTuoiHanh.put("Mậu Dần","Thành Đầu Thổ");
		mapTuoiHanh.put("Kỷ Mão","Thành Đầu Thổ");
		mapTuoiHanh.put("Canh Thìn","Bạch Lạp Kim");
		mapTuoiHanh.put("Tân Tị","Bạch Lạp Kim");
		mapTuoiHanh.put("Nhâm Ngọ","Dương Liễu Mộc");
		mapTuoiHanh.put("Quí Mùi","Dương Liễu Mộc");
		mapTuoiHanh.put("Giáp Thân","Tuyền Trung Thủy");
		mapTuoiHanh.put("Ất Dậu","Tuyền Trung Thủy");
		mapTuoiHanh.put("Bính Tuất","Ốc Thượng Thổ");
		mapTuoiHanh.put("Đinh Hợi","Ốc Thượng Thổ");
		
		mapTuoiHanh.put("Mậu Tý","Thích Lịch Hỏa");
		mapTuoiHanh.put("Kỷ Sửu","Thích Lịch Hỏa");
		mapTuoiHanh.put("Canh Dần","Tòng Bá Mộc");
		mapTuoiHanh.put("Tân Mão","Tòng Bá Mộc");
		mapTuoiHanh.put("Nhâm Thìn","Trường Lưu Thủy");
		mapTuoiHanh.put("Quí Tị","Trường Lưu Thủy");
		mapTuoiHanh.put("Giáp Ngọ","Sa Trung Kim");
		mapTuoiHanh.put("Ất Mùi","Sa Trung Kim");
		mapTuoiHanh.put("Bính Thân","Sơn Hạ Hỏa");
		mapTuoiHanh.put("Ðinh Dậu","Sơn Hạ Hỏa");
		mapTuoiHanh.put("Mậu Tuất","Bình Địa Mộc");
		mapTuoiHanh.put("Kỷ Hợi","Bình Địa Mộc");
		mapTuoiHanh.put("Canh Tý","Bích Thượng Thổ");
		mapTuoiHanh.put("Tân Sửu","Bích Thượng Thổ");
		mapTuoiHanh.put("Nhâm Dần","Kim Bạc Kim");
		mapTuoiHanh.put("Quí Mão","Kim Bạc Kim");
		mapTuoiHanh.put("Giáp Thìn","Phúc Đăng Hỏa");
		mapTuoiHanh.put("Ất Tị","Phúc Đăng Hỏa");
		mapTuoiHanh.put("Bính Ngọ","Thiên Hà Thủy");
		mapTuoiHanh.put("Ðinh Mùi","Thiên Hà Thủy");
		mapTuoiHanh.put("Mậu Thân","Đại Trạch Thổ");
		mapTuoiHanh.put("Kỷ Dậu","Đại Trạch Thổ");
		mapTuoiHanh.put("Canh Tuất","Thoa Xuyến Kim");
		mapTuoiHanh.put("Tân Hợi","Thoa Xuyến Kim");
		mapTuoiHanh.put("Nhâm Tý","Tang Đố Mộc");
		mapTuoiHanh.put("Quí Sửu","Tang Đố Mộc");
		mapTuoiHanh.put("Giáp Dần","Đại Khê Thủy");
		mapTuoiHanh.put("Ất Mão","Đại Khê Thủy");
		mapTuoiHanh.put("Bính Thìn","Sa Trung Thổ");
		mapTuoiHanh.put("Ðinh Tị","Sa Trung Thổ");
		mapTuoiHanh.put("Mậu Ngọ","Thiên Thượng Hỏa");
		mapTuoiHanh.put("Kỷ Mùi","Thiên Thượng Hỏa");
		mapTuoiHanh.put("Canh Thân","Thạch Lựu Mộc");
		mapTuoiHanh.put("Tân Dậu","Thạch Lựu Mộc");
		mapTuoiHanh.put("Nhâm Tuất","Đại Hãi Thủy");
		mapTuoiHanh.put("Quí Hợi","Đại Hãi Thủ");
		hanh = mapTuoiHanh.get(tuoiCanChi);
		return hanh;
	}
	
	public static String getHanhVnByTuoiCanChi(String tuoiCanChi) {
		String hanh = "";
		Map<String, String> mapTuoiHanh = new HashMap<>(); 
		mapTuoiHanh.put("Giáp Tý","Vàng trong biển ");
		mapTuoiHanh.put("Ất Sửu","Vàng trong biển ");
		mapTuoiHanh.put("Bính Dần","Lửa trong lò ");
		mapTuoiHanh.put("Ðinh Mão","Lửa trong lò ");
		mapTuoiHanh.put("Mậu Thìn","Gỗ trong rừng ");
		mapTuoiHanh.put("Kỷ Tị","Gỗ trong rừng ");
		mapTuoiHanh.put("Canh Ngọ","Ðất ven đường");
		mapTuoiHanh.put("Tân Mùi","Ðất ven đường");
		mapTuoiHanh.put("Nhâm Thân","Sắt đầu kiếm ");
		mapTuoiHanh.put("Quí Dậu","Sắt đầu kiếm ");
		mapTuoiHanh.put("Giáp Tuất","Lửa trên đỉnh núi ");
		mapTuoiHanh.put("Ất Hợi","Lửa trên đỉnh núi ");
		mapTuoiHanh.put("Bính Tý","Nước dưới lạch ");
		mapTuoiHanh.put("Ðinh Sửu","Nước dưới lạch ");
		mapTuoiHanh.put("Mậu Dần","Ðất đầu thành ");
		mapTuoiHanh.put("Kỷ Mão","Ðất đầu thành ");
		mapTuoiHanh.put("Canh Thìn","Kim bạch lạp ");
		mapTuoiHanh.put("Tân Tị","Kim bạch lạp ");
		mapTuoiHanh.put("Nhâm Ngọ","Gỗ dương liễu");
		mapTuoiHanh.put("Quí Mùi","Gỗ dương liễu");
		mapTuoiHanh.put("Giáp Thân","Nước trong khe ");
		mapTuoiHanh.put("Ất Dậu","Nước trong khe ");
		mapTuoiHanh.put("Bính Tuất","Ðất trên mái nhà");
		mapTuoiHanh.put("Đinh Hợi","Ðất trên mái nhà");
		mapTuoiHanh.put("Mậu Tý","Lửa trong chớp ");
		mapTuoiHanh.put("Kỷ Sửu","Lửa trong chớp ");
		mapTuoiHanh.put("Canh Dần","Gỗ tùng Bách ");
		mapTuoiHanh.put("Tân Mão","Gỗ tùng Bách ");
		mapTuoiHanh.put("Nhâm Thìn","Nước giữa dòng ");
		mapTuoiHanh.put("Quí Tị","Nước giữa dòng ");
		mapTuoiHanh.put("Giáp Ngọ","Vàng trong cát ");
		mapTuoiHanh.put("Ất Mùi","Vàng trong cát ");
		mapTuoiHanh.put("Bính Thân","Lửa chân núi ");
		mapTuoiHanh.put("Ðinh Dậu","Lửa chân núi ");
		mapTuoiHanh.put("Mậu Tuất","Gỗ đồng bằng ");
		mapTuoiHanh.put("Kỷ Hợi","Gỗ đồng bằng");
		mapTuoiHanh.put("Canh Tý","Ðất trên vách ");
		mapTuoiHanh.put("Tân Sửu","Ðất trên vách");
		mapTuoiHanh.put("Nhâm Dần","Bạch kim");
		mapTuoiHanh.put("Quí Mão","Bạch kim");
		mapTuoiHanh.put("Giáp Thìn","Lửa đèn ");
		mapTuoiHanh.put("Ất Tị","Lửa đèn ");
		mapTuoiHanh.put("Bính Ngọ","Nước trên trời");
		mapTuoiHanh.put("Ðinh Mùi","Nước trên trời ");
		mapTuoiHanh.put("Mậu Thân","Ðất vườn rộng");
		mapTuoiHanh.put("Kỷ Dậu","Ðất vườn rộng");
		mapTuoiHanh.put("Canh Tuất","Vàng trang sức");
		mapTuoiHanh.put("Tân Hợi","Vàng trang sức");
		mapTuoiHanh.put("Nhâm Tý","Gỗ dâu");
		mapTuoiHanh.put("Quí Sửu","Gỗ dâu");
		mapTuoiHanh.put("Giáp Dần","Nước giữa khe lớn ");
		mapTuoiHanh.put("Ất Mão","Nước giữa khe lớn");
		mapTuoiHanh.put("Bính Thìn","Ðất trong cát ");
		mapTuoiHanh.put("Ðinh Tị","Ðất trong cát ");
		mapTuoiHanh.put("Mậu Ngọ","Lửa trên trời");
		mapTuoiHanh.put("Kỷ Mùi","Lửa trên trời ");
		mapTuoiHanh.put("Canh Thân","Gỗ thạch Lựu ");
		mapTuoiHanh.put("Tân Dậu","Gỗ thạch Lựu");
		mapTuoiHanh.put("Nhâm Tuất","Nước giữa biển ");
		mapTuoiHanh.put("Quí Hợi","Nước giữa biển ");

		hanh = mapTuoiHanh.get(tuoiCanChi);
		return hanh;
	}
	
	
	public static String getTuoiSung(String tuoiCanChi) {
		String hanh = "";
		Map<String, String> mapTuoiHanh = new HashMap<>(); 
		mapTuoiHanh.put("Giáp Tý","Mậu Ngọ, Nhâm Ngọ, Canh Dần, Canh Thân");
		mapTuoiHanh.put("Ất Sửu","Kỷ Mùi, Quí Mùi, Tân Mão, Tân Dậu");
		mapTuoiHanh.put("Bính Dần","Giáp Thân, Nhâm Thân, Nhâm Tuất, Nhâm Thìn");
		mapTuoiHanh.put("Ðinh Mão","Ất Dậu, Quí Dậu, Quí Tị, Quí Hợi");
		mapTuoiHanh.put("Mậu Thìn","Canh Tuất, Bính Tuất");
		mapTuoiHanh.put("Kỷ Tị","Tân Hợi, Đinh Hợi");
		mapTuoiHanh.put("Canh Ngọ","Nhâm Tý, Bính Tý, Giáp Thân, Giáp Dần");
		mapTuoiHanh.put("Tân Mùi","Quí sửu, Đinh Sửu, Ất Dậu, Ất Mão");
		mapTuoiHanh.put("Nhâm Thân","Bính Dần, Canh Dần, Bính Thân");
		mapTuoiHanh.put("Quí Dậu","Ðinh Mão, Tân Mão, Đinh Dậu");
		mapTuoiHanh.put("Giáp Tuất","Nhâm Thìn, Canh Thìn, Canh Tuất");
		mapTuoiHanh.put("Ất Hợi","Quí Tị, Tân Tị, Tân Hợi");
		mapTuoiHanh.put("Bính Tý","Canh Ngọ, Mậu Ngọ");
		mapTuoiHanh.put("Ðinh Sửu","Tân Mùi, Kỷ Mùi");
		mapTuoiHanh.put("Mậu Dần","Canh Thân, Giáp Thân");
		mapTuoiHanh.put("Kỷ Mão","Tân Dậu, Ất Dậu");
		mapTuoiHanh.put("Canh Thìn","Giáp Tuất, Mậu Tuất, Giáp Thìn");
		mapTuoiHanh.put("Tân Tị","Ất Hợi, Kỷ Hợi, Ất Tị");
		mapTuoiHanh.put("Nhâm Ngọ","Giáp Tý, Canh Tý, Bính Tuất, Bính Thìn");
		mapTuoiHanh.put("Quí Mùi","Ất Sửu, Tân Sửu, Đinh Hợi, Đinh Tị");
		mapTuoiHanh.put("Giáp Thân","Mậu Dần, Bính Dần, Canh Ngọ, Canh Tý");
		mapTuoiHanh.put("Ất Dậu","Kỷ Mão, Đinh Mão, Tân Mùi, Tân Sửu");
		mapTuoiHanh.put("Bính Tuất","Mậu Thìn, Nhâm Thìn, Nhâm Ngọ, Nhâm Tý");
		mapTuoiHanh.put("Đinh Hợi","Kỷ Tị, Quí Tị, Quí Mùi, Quí Sửu");
		mapTuoiHanh.put("Mậu Tý","Bính Ngọ, Giáp Ngọ");
		mapTuoiHanh.put("Kỷ Sửu","Ðinh Mùi, Ất Mùi");
		mapTuoiHanh.put("Canh Dần","Nhâm Thân, Mậu Thân, Giáp Tý, Giáp Ngọ");
		mapTuoiHanh.put("Tân Mão","Quí Dậu, Kỷ Dậu, Ất Sửu, Ất Mùi");
		mapTuoiHanh.put("Nhâm Thìn","Bính Tuất, Giáp Tuất, Bính Dần");
		mapTuoiHanh.put("Quí Tị","Ðinh Hợi, Ất Hợi, Đinh Mão");
		mapTuoiHanh.put("Giáp Ngọ","Mậu Tý, Nhâm Tý, Canh Dần, Nhâm Dần");
		mapTuoiHanh.put("Ất Mùi","Kỷ Sửu, Quí Sửu, Tân Mão, Tân Dậu");
		mapTuoiHanh.put("Bính Thân","Giáp Dần, Nhâm Thân, Nhâm Tuất, Nhâm Thìn");
		mapTuoiHanh.put("Ðinh Dậu","Ất Mão, Quí Mão, Quí Tị, Quí Hợi");
		mapTuoiHanh.put("Mậu Tuất","Canh Thìn, Bính Thìn");
		mapTuoiHanh.put("Kỷ Hợi","Tân Tị, Đinh Tị.");
		mapTuoiHanh.put("Canh Tý","Nhâm Ngọ, Bính Ngọ, Giáp Thân, Giáp Dần");
		mapTuoiHanh.put("Tân Sửu","Quí Mùi, Đinh Mùi, Ất Dậu, Ất Mão");
		mapTuoiHanh.put("Nhâm Dần","Canh Thân, Bính Thân, Bính Dần");
		mapTuoiHanh.put("Quí Mão","Tân Dậu, Đinh Dậu, Đinh Mão");
		mapTuoiHanh.put("Giáp Thìn","Nhâm Tuất, Canh Tuất, Canh Thìn");
		mapTuoiHanh.put("Ất Tị","Quí Hợi, Tân Hợi, Tân Tị");
		mapTuoiHanh.put("Bính Ngọ","Mậu Tý, Canh Tý");
		mapTuoiHanh.put("Ðinh Mùi","Kỷ Sửu, Tân Sửu");
		mapTuoiHanh.put("Mậu Thân","Canh Dần, Giáp Dần");
		mapTuoiHanh.put("Kỷ Dậu","Tân Mão, Ất Mão");
		mapTuoiHanh.put("Canh Tuất","Giáp Thìn, Mậu Thìn, Giáp Tuất");
		mapTuoiHanh.put("Tân Hợi","Ất Tị, Kỷ Tị, Ất Hợi");
		mapTuoiHanh.put("Nhâm Tý","Giáp Ngọ, Canh Ngọ, Bính Tuất, Bính Thìn");
		mapTuoiHanh.put("Quí Sửu","Ất Mùi, Tân Mùi, Đinh Hợi, Đinh Tỵ");
		mapTuoiHanh.put("Giáp Dần","Mậu Thân, Bính Thân, Canh Ngọ, Canh Tý");
		mapTuoiHanh.put("Ất Mão","Kỷ Dậu, Đinh Dậu, Tân Mùi, Tân Sửu");
		mapTuoiHanh.put("Bính Thìn","Mậu Tuất, Nhâm Tuất, Nhâm Ngọ, Nhâm Tý");
		mapTuoiHanh.put("Ðinh Tị","Kỷ Hợi, Quí Hợi, Quí Sửu, Quí Mùi");
		mapTuoiHanh.put("Mậu Ngọ","Bính Tý, Giáp Tý");
		mapTuoiHanh.put("Kỷ Mùi","Ðinh Sửu, Ất Sửu");
		mapTuoiHanh.put("Canh Thân","Nhâm Dần, Mậu Dần, Giáp Tý, Giáp Ngọ");
		mapTuoiHanh.put("Tân Dậu","Quí Mão, Kỷ Mão, Ất Sửu, Ất Mùi");
		mapTuoiHanh.put("Nhâm Tuất","Bính Thìn, Giáp Thìn, Bính Thân, Bính Dần");
		mapTuoiHanh.put("Quí Hợi","Ðinh Tị, Ất Tị, Đinh Mão, Đinh Dậu");
		hanh = mapTuoiHanh.get(tuoiCanChi);
		return hanh;
	}
}
