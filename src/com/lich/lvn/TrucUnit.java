package com.lich.lvn;

import java.util.HashMap;
import java.util.Map;

import com.lich.lvn.model.Truc;

public class TrucUnit {
	public static final String TRUC[] = { "Kiến", "Trừ", "Mãn", "Bình", "Định", "Chấp", "Phá", "Nguy", "Thành", "Thâu",
			"Khai", "Bế" };

	public static final String GIO_MONTH_1[] = { "Dần", "Mão", "Thìn", "Tỵ", "Ngọ", "Mùi", "Thân", "Dậu", "Tuất", "Hợi",
			"Tí", "Sửu" };

	public static final String GIO_MONTH_2[] = { "Mão", "Thìn", "Tỵ", "Ngọ", "Mùi", "Thân", "Dậu", "Tuất", "Hợi", "Tí",
			"Sửu", "Dần" };

	public static final String GIO_MONTH_3[] = { "Thìn", "Tỵ", "Ngọ", "Mùi", "Thân", "Dậu", "Tuất", "Hợi", "Tí", "Sửu",
			"Dần", "Mão" };

	public static final String GIO_MONTH_4[] = { "Tỵ", "Ngọ", "Mùi", "Thân", "Dậu", "Tuất", "Hợi", "Tí", "Sửu", "Dần",
			"Mão", "Thìn" };

	public static final String GIO_MONTH_5[] = { "Ngọ", "Mùi", "Thân", "Dậu", "Tuất", "Hợi", "Tí", "Sửu", "Dần", "Mão",
			"Thìn", "Tỵ" };

	public static final String GIO_MONTH_6[] = { "Mùi", "Thân", "Dậu", "Tuất", "Hợi", "Tí", "Sửu", "Dần", "Mão", "Thìn",
			"Tỵ", "Ngọ" };

	public static final String GIO_MONTH_7[] = { "Thân", "Dậu", "Tuất", "Hợi", "Tí", "Sửu", "Dần", "Mão", "Thìn", "Tỵ",
			"Ngọ", "Mùi" };

	public static final String GIO_MONTH_8[] = { "Dậu", "Tuất", "Hợi", "Tí", "Sửu", "Dần", "Mão", "Thìn", "Tỵ", "Ngọ",
			"Mùi", "Thân" };

	public static final String GIO_MONTH_9[] = { "Tuất", "Hợi", "Tí", "Sửu", "Dần", "Mão", "Thìn", "Tỵ", "Ngọ", "Mùi",
			"Thân", "Dậu" };

	public static final String GIO_MONTH_10[] = { "Hợi", "Tí", "Sửu", "Dần", "Mão", "Thìn", "Tỵ", "Ngọ", "Mùi", "Thân",
			"Dậu", "Tuất" };

	public static final String GIO_MONTH_11[] = { "Tí", "Sửu", "Dần", "Mão", "Thìn", "Tỵ", "Ngọ", "Mùi", "Thân", "Dậu",
			"Tuất", "Hợi" };

	public static final String GIO_MONTH_12[] = { "Sửu", "Dần", "Mão", "Thìn", "Tỵ", "Ngọ", "Mùi", "Thân", "Dậu",
			"Tuất", "Hợi", "Tí" };

	public static final String TUOI_CAN_CHI[] = { "Giáp Tý", "Ất Sửu", "Bính Dần", "Ðinh Mão", "Mậu Thìn", "Kỷ Tị",
			"Canh Ngọ", "Tân Mùi", "Nhâm Thân", "Quí Dậu", "Giáp Tuất", "Ất Hợi", "Bính Tý", "Ðinh Sửu", "Mậu Dần",
			"Kỷ Mão", "Canh Thìn", "Tân Tị", "Nhâm Ngọ", "Quí Mùi", "Giáp Thân", "Ất Dậu", "Bính Tuất", "Ðinh Hợi",
			"Mậu Tý", "Kỷ Sửu", "Canh Dần", "Tân Mão", "Nhâm Thìn", "Quí Tị", "Giáp Ngọ", "Ất Mùi", "Bính Thân",
			"Ðinh Dậu", "Mậu Tuất", "Kỷ Hợi", "Canh Tý", "Tân Sửu", "Nhâm Dần", "Quí Mão", "Giáp Thìn", "Ất Tị",
			"Bính Ngọ", "Ðinh Mùi", "Mậu Thân", "Kỷ Dậu", "Canh Tuất", "Tân Hợi", "Nhâm Tý", "Quí Sửu", "Giáp Dần",
			"Ất Mão", "Bính Thìn", "Ðinh Tị", "Mậu Ngọ", "Kỷ Mùi", "Canh Thân", "Tân Dậu", "Nhâm Tuất", "Quí Hợi" };
	
	public TrucUnit() {
		// TODO Auto-generated constructor stub
	}

	public static Truc getTruc(int thangAl, String gio) {
		Truc truc = new Truc();
		String title = "";
		Map<String, String> trucMap = new HashMap<>();
		String gio_month[] = null;
		switch (thangAl) {
		case 1:
			gio_month = GIO_MONTH_1;
			break;
		case 2:
			gio_month = GIO_MONTH_2;
			break;
		case 3:
			gio_month = GIO_MONTH_3;
			break;
		case 4:
			gio_month = GIO_MONTH_4;
			break;
		case 5:
			gio_month = GIO_MONTH_5;
			break;
		case 6:
			gio_month = GIO_MONTH_6;
			break;
		case 7:
			gio_month = GIO_MONTH_7;
			break;
		case 8:
			gio_month = GIO_MONTH_8;
			break;
		case 9:
			gio_month = GIO_MONTH_9;
			break;
		case 10:
			gio_month = GIO_MONTH_10;
			break;
		case 11:
			gio_month = GIO_MONTH_11;
			break;
		case 12:
			gio_month = GIO_MONTH_12;
			break;
		default:
			break;
		}

		int i = 0;
		for (String gio1 : gio_month) {
			trucMap.put(gio1, TRUC[i]);
			i++;
		}
		title = trucMap.get(gio);
		System.out.println(trucMap.get(gio));
		
		truc = getTrucDetail(title);
		return truc;
	}

	
	

	public static String getViecNenLamTheoTruc(String truc) {
		String todo = "";
		Map<String, String> todos = new HashMap<>();
		todos.put("Kiến", "KIẾN 建:  là kiến lập, khai tạo ra cái mới." + " Nên làm: các việc nhỏ, không quan trọng. "
				+ " Không lên làm: Ngày Kiến thường bất lợi đối với mọi việc [bách sự kỵ], đặc biệt là những đại sự, việc lớn, việc quan trọng.");
		todos.put("Trừ",
				" TRỪ 除 :  là “bỏ đi”, là “bỏ hết cái cũ mà thay bằng cái mới”. Trừ thuộc Hoàng đạo, mạnh nhất trong chức năng “lột xác”, “tẩy uế”, “thanh tẩy”, “tảo trừ ác sát, khứ cựu nghênh tân”.\r\n"
						+ " - Nên làm: Cúng tế, bào chế thuốc, “chỉnh nhan sắc, chỉnh quân trang”, đi thăm dân, thăm hàng xóm, cúng tạ lễ, tắm rửa, quét rửa nhà cửa, xe cộ, đường sá, kiếm thầy thuốc, thuốc thang…"
						+ " - Không nên làm: không nên làm hôn nhân, đi xa, đào giếng, ký giao kèo hay hợp đồng, xuất vốn, vào nhà mới, khai trương, châm chích, hội hợp [Trừ ngày Đinh Tỵ, Kỷ Tỵ của tháng Ba; Giáp Ngọ, Nhâm Ngọ của tháng Tư; Giáp Thân của tháng Sáu; Canh Mậu Giáp Tuất của tháng Tám; Ất Hợi, Đinh Hợi của tháng Chín; Giáp Tý của tháng 10; các ngày Sửu của tháng 11 nếu theo Đổng công].");
		todos.put("Mãn", "MÃN 滿 :  là “Đầy đủ, đầy tràn, thừa”.\r\n"
				+ "   - Nên làm: Mãn thích hợp với mọi loại công việc mang tính giao ước, thoả thuận [trừ Hôn nhân ]. Mãn cũng rất thích hợp để tế lễ, cầu nguyện, trả lễ, chi xài, may áo, dệt vải, dời đồ, dời bếp, lên kèo cột…\r\n"
				+ "   - Không nên làm: Sáu lễ trong hôn nhân, việc tang, thăm dân, thăm thân, lên quan, tìm thầy tìm thuốc, nhận chức mới.\r\n"
				+ "");
		todos.put("Bình", "BÌNH平:  - Nên làm: rời bếp, thượng lương, làm chuồng lục súc. \r\n"
				+ "- Không nên làm: khai trương, xuất nhập tài vật, giá thú, động thổ.");
		todos.put("Định",
				"ĐỊNH 定 :  - Nên làm: giá thú, khai thị, khởi tạo, cầu phúc, nhập học, nhậm chức, sửa sang, làm đường, làm nhà, tế tự, động thổ, mua trâu ngựa, hội họp, thương lượng. \r\n"
						+ "- Không nên làm: giao thiệp, kiện tụng, xuất hành, mổ xẻ, phẫu thuật, phân công người chỉ huy một công việc nào đó.");
		todos.put("Chấp", "CHẤP 執: "
				+ " - Nên làm: tu tạo, sửa chữa, làm nhà, trồng trọt, săn bắn, đào giếng, gửi tiền vào bank, trữ hạt giống, hôn nhân, nhận người.\r\n"
				+ "- Không nên làm: chuyển nhà, đi chơi, mở cửa hàng buôn bán, chi xuất tiền của, dời đồ, xuất kho, khai trương..");
		todos.put("Phá",
				"PHÁ 破:  -  Mọi việc đều bất lợi. Duy chỉ có những việc mang tính “phá” như việc tháo dỡ nhà cửa, cầu y chữa bệnh là tiến hành được.");

		todos.put("Nguy",
				"NGUY 危:  là nguy hiểm. Cái mới chưa tạo dựng mà cái cũ đã bị xóa bỏ nên không biết theo cái nào, dựa vào đâu. Vậy nên muôn việc vào ngày có trực này đều là bất lợi.");
		todos.put("Thành",
				" THÀNH 成:  là thành công, Thiên đế kỷ vạn vật thành tựu. Hầu hết “nhân tài” tuyển trạch đều “trước sau như một” xếp Trực thành vào diện “ưu tiên cho đi du học”.\r\n"
						+ " - Nên làm: khai trương kinh doanh, nhập học, kết hôn, nhậm chức, nhập trạch vào nhà mới, vỗ về dân ven đô, biên giới, chăn nuôi, cầu tài, thoả thuận, trồng trọt, dựng cột, lên kèo."
						+ " - Không nên làm: kiện tụng, tranh chấp.");
		todos.put("Thâu", "THÂU [THU] 收:  Thâu là thu nhặt, gom về, bắt giữ."
				+ " - Nên làm: viêc có tính chất “thu vào” như dựng kho tàng, cất giữ của cải, săn bắn, thu hoạch hoa màu, ngũ cốc, nhập học, trồng tỉa, mua bán, làm nhà, hoãn…thi hành án, giải oan, bố thí, nạp súc, thu tiền"
				+ " - Không nên làm: các công việc mới như khai trương, đi du lịch, châm chích, an dân, lập khoán, tuyên bố chính sự, tuyển dụng. Kỵ an táng, cầu thầy kiếm thuốc, động thổ [vì trùng Địa Phá].");

		todos.put("Khai", "KHAI 開:  là lợi cho việc mang tính “mở”."
				+ " - Nên làm: kết hôn, bắt đầu (khai trương) kinh doanh hay khởi công, khánh thành, ban chiếu chỉ, dựng cột lên kèo, cầu hiền, cầu y, trả lễ, dời đồ, an sàng giường, lập nghiệp, hoãn hình ngục, làm ân huệ, dâng biểu chương, lên công đường."
				+ " - Không nên làm: khai trương, đi du lịch, châm chích, an dân, lập khoán, tuyên bố chính sự, tuyển dụng. Kỵ an táng, cầu thầy kiếm thuốc, động thổ [vì trùng Địa Phá].");

		todos.put("Bế",
				"BẾ 閉:  là đóng, là bít, là ngưng trệ, vùi lấp, là ngày thiên địa âm dương “kín cổng cao tường” vậy nên chỉ thích hợp những công việc mang tính chất của “Bế” của “đóng lại”. "
						+ "- Nên làm: như đắp đập, ngăn nước, xây vá những chỗ sụt lở đê, đập, tường vách, an táng, lấp ao hồ giếng, dựng cửa, ráp cửa, gắn cửa… "
						+ "- Không lên làm: Không nên làm những việc mang tính “mở ra”, “xuất ra”, mới mẻ [khai trương, kết hôn, khởi công, khơi thông dòng chảy…].");
		todo = todos.get(truc);
		System.out.println(todo);
		return todo;
	}
	
	private static Truc getTrucDetail(String title) {
		Truc truc = new Truc();
		truc.truc = title;
		title = title.toLowerCase();
		switch (title) {
		case "kiến":
			truc.moTa = "KIẾN 建: là kiến lập, khai tạo ra cái mới.";
			truc.nenLam = "Nên làm: các việc nhỏ, không quan trọng.";
			truc.kiengLam  = "Ngày Kiến thường bất lợi đối với mọi việc [bách sự kỵ], đặc biệt là những đại sự, việc lớn, việc quan trọng.";
			break;
		case "trừ":
			truc.moTa = "TRỪ 除 : là “bỏ đi”, là “bỏ hết cái cũ mà thay bằng cái mới”. Trừ thuộc Hoàng đạo, mạnh nhất trong chức năng “lột xác”, “tẩy uế”, “thanh tẩy”, “tảo trừ ác sát, khứ cựu nghênh tân.”";
			truc.nenLam = "Cúng tế, bào chế thuốc, “chỉnh nhan sắc, chỉnh quân trang”, đi thăm dân, thăm hàng xóm, cúng tạ lễ, tắm rửa, quét rửa nhà cửa, xe cộ, đường sá, kiếm thầy thuốc, thuốc thang…";
			truc.kiengLam  = "không nên làm hôn nhân, đi xa, đào giếng, ký giao kèo hay hợp đồng, xuất vốn, vào nhà mới, khai trương, châm chích, hội hợp [Trừ ngày Đinh Tỵ, Kỷ Tỵ của tháng Ba; Giáp Ngọ, Nhâm Ngọ của tháng Tư; Giáp Thân của tháng Sáu; Canh Mậu Giáp Tuất của tháng Tám; Ất Hợi, Đinh Hợi của tháng Chín; Giáp Tý của tháng 10; các ngày Sửu của tháng 11 nếu theo Đổng Trọng Thư].";
			break;
		case "mãn":
			truc.moTa = "MÃN 滿 :  là “Đầy đủ, đầy tràn, thừa”. Nghĩa là cái mới đã phát triển ở giai đoạn sung mãn, đủ đầy như trăng ngày rằm hàng tháng vậy.";
			truc.nenLam = "Mãn thích hợp với mọi loại công việc mang tính giao ước, thoả thuận [trừ Hôn nhân ]. Mãn cũng rất thích hợp để tế lễ, cầu nguyện, trả lễ, chi xài, may áo, dệt vải, dời đồ, dời bếp, lên kèo cột…";
			truc.kiengLam  = "Sáu lễ trong hôn nhân, việc tang, thăm dân, thăm thân, lên quan, tìm thầy tìm thuốc, nhận chức mới.";
			break;
		case "bình":
			truc.moTa = "BÌNH平: Vì sự vật đã phát triển đến độ sung mãn thì tất phải dừng lại để hoàn thiện nên tiếp sau Mãn là Bình";
			truc.nenLam = "Rời bếp, thượng lương, làm chuồng lục súc.";
			truc.kiengLam  = "Khai trương, xuất nhập tài vật, giá thú, động thổ.";
			break;
		case "định":
			truc.moTa = "ĐỊNH 定 : Định là “xếp đặt được yên ổn, không bị lay động nữa, toan tính”, thuộc Hoàng đạo.";
			truc.nenLam = "Giá thú, khai thị, khởi tạo, cầu phúc, nhập học, nhậm chức, sửa sang, làm đường, làm nhà, tế tự, động thổ, mua trâu ngựa, xe, hội họp, thương lượng.";
			truc.kiengLam  = "Giao thiệp, kiện tụng, xuất hành, mổ xẻ, phẫu thuật, phân công người chỉ huy một công việc nào đó.";
			break;
		case "chấp":
			truc.moTa = "CHẤP 執: Theo ý nghĩa của thập nhị trực thì chấp có nghĩa là giữ lại cái đã hoàn thành nhờ Bình – Định.";
			truc.nenLam = "Tiến hành những việc có lợi cho việc lưu giữ lâu dài cái tốt cho mai sau như trồng trọt, cất giữ tiền bạc, hạt giống… ";
			truc.kiengLam  = "Những việc như xuất tiền của, dời nhà ở, xuất hành, mở cửa hàng, công xưởng…";
			break;
		case "phá":
			truc.moTa = "PHÁ 破: có nghĩa là bỏ cái bất lợi, cái cũ nát.";
			truc.nenLam = "Mọi việc đều bất lợi. Duy chỉ có những việc mang tính “phá” như việc tháo dỡ nhà cửa, cầu y chữa bệnh là tiến hành được";
			truc.kiengLam  = "";
			break;
		case "nguy":
			truc.moTa = "NGUY 危: “Nguy” tức là nguy hiểm.";
			truc.nenLam = "Cái mới chưa tạo dựng mà cái cũ đã bị xóa bỏ nên không biết theo cái nào, dựa vào đâu. Vậy nên muôn việc vào ngày có trực này đều là bất lợi.";
			truc.kiengLam  = "";
			break;
		case "thành":
			truc.moTa = "THÀNH 成: là thành công, Thiên đế kỷ vạn vật thành tựu. Hầu hết “nhân tài” tuyển trạch đều “trước sau như một” xếp Trực thành vào diện “ưu tiên cho đi du học”";
			truc.nenLam = "Khai trương kinh doanh, nhập học, kết hôn, nhậm chức, nhập trạch vào nhà mới, vỗ về dân ven đô, biên giới, chăn nuôi, cầu tài, thoả thuận, trồng trọt, dựng cột, lên kèo";
			truc.kiengLam  = "Kiện tụng, tranh chấp.";
			break;
		case "thâu":
			truc.moTa = "THÂU [THU] 收:  Thâu là thu nhặt, gom về, bắt giữ.";
			truc.nenLam = "Viêc có tính chất “thu vào” như dựng kho tàng, cất giữ của cải, săn bắn, thu hoạch hoa màu, ngũ cốc, nhập học, trồng tỉa, mua bán, làm nhà, hoãn…thi hành án, giải oan, bố thí, nạp súc, thu tiền";
			truc.kiengLam  = "Các công việc mới như khai trương, đi du lịch, châm chích, an dân, lập khoán, tuyên bố chính sự, tuyển dụng. Kỵ an táng, cầu thầy kiếm thuốc, động thổ [vì trùng Địa Phá].";
			break;
		case "khai":
			truc.moTa = "KHAI 開:  là lợi cho việc mang tính “mở”.";
			truc.nenLam = "Tổ chức những công việc mới như kết hôn, bắt đầu kinh doanh…";
			truc.kiengLam  = "Các công việc không sạch sẽ như đào đất, chôn cất… rất kị những công việc mang tính hủy diệt như săn bắt, chặt cây...";
			break;
		case "bế":
			truc.moTa = "BẾ 閉: là đóng, là bít, là ngưng trệ, vùi lấp, là ngày thiên địa âm dương “kín cổng cao tường” vậy nên chỉ thích hợp những công việc mang tính chất của “Bế” của “đóng lại”.";
			truc.nenLam = "Đắp đập, ngăn nước, xây vá những chỗ sụt lở đê, đập, tường vách, an táng, lấp ao hồ giếng, dựng cửa, ráp cửa, gắn cửa…";
			truc.kiengLam  = "Không nên làm những việc mang tính “mở ra”, “xuất ra”, mới mẻ [khai trương, kết hôn, khởi công, khơi thông dòng chảy…].";
			break;
		
		default:
			break;
		}
		return truc;
	}
		
	// Tinh sao nhi thap batu:
	// https://phongthuyso.vn/phuong-phap-chon-ngay-tot-tranh-ngay-xau.html

	public static void main(String[] args) {
		Truc truc =	TrucUnit.getTruc(9, "Hợi");
		TrucUnit.getViecNenLamTheoTruc("Mãn");
	}

}
