package com.lich.lvn;

import com.lich.lvn.model.NhiThapBatTu;

public class NhiThapBatTuUnit {

	public NhiThapBatTuUnit() {
		// TODO Auto-generated constructor stub
	}

	public static final String[] NTBT = { "Giác", "Cang", "Đê", "Phòng", "Tàm", "Vĩ", "Cơ", "Đẩu", "Ngưu", "Nữ", "Hư",
			"Nguy", "Thất", "Bích", "Khuê", "Lâu", "Vị", "Mão", "Tất", "Chuỷ", "Sâm", "Tỉnh", "Quỷ", "Liễu", "Tinh",
			"Trương", "Dự", "Chẩn" };
	public static final String[] NTBT_DONG_VAT = { "Giao Long", "Rồng", "Lạc", "Thỏ", "Hồ", "Hổ", "Báo", "Giải-Cua",
			"Ngưu", "Dơi", "Chuột", "Yến-Én", "Heo", "Du-Rái cá", "Lang-Chó sói", "Cẩu (Chó)", "Chim Trĩ", "Kê (Gà)",
			"Ô (Con quạ)", "Hầu (Khỉ)", "Viên (Vượn)", "Hãn (Hưu Bướu)", "(Dương) Dê", "Chương (Gâu ngựa)", "Mã (Ngựa)",
			"Lộc (Nai)", "Xà (Rắn)", "Dẫn (Giun)" };

	public static final String[] NTBT_NEN_LAM = {
			"Tạo tác mọi việc đều đặng vinh xương, tấn lợi. Hôn nhân cưới gả sanh con quý. Công danh khoa cử cao thăng, đỗ đạt.",
			"Cắt may áo màn (sẽ có lộc ăn).", "Sao Đê Đại Hung, không cò việc chi hạp với nó",
			"Khởi công tạo tác mọi việc đều tốt , thứ nhất là xây dựng nhà , chôn cất , cưới gả , xuất hành , đi thuyền , mưu sự , chặt cỏ phá đất , cắt áo.",
			"Tạo tác việc chi cũng không hạp với Hung tú này.",
			"Mọi việc đều tốt, tốt nhất là các vụ khởi tạo, chôn cất, cưới gả, xây cất, trổ cửa, đào ao giếng, khai mương rạch, các vụ thủy lợi, khai trương, chặt cỏ phá đất.",
			"Khởi tạo trăm việc đều tốt, tốt nhất là chôn cất, tu bổ mồ mã, trổ cửa, khai trương, xuất hành, các vụ thủy lợi (như tháo nước, đào kinh, khai thông mương rãnh...).",
			"Khởi tạo trăm việc đều tốt, tốt nhất là xây đắp hay sửa chữa phần mộ, trổ cửa, tháo nước, các vụ thủy lợi, chặt cỏ phá đất, may cắt áo mão, kinh doanh, giao dịch, mưu cầu công danh.",
			"Đi thuyền, cắt may áo mão.", "Kết màn, may áo.",
			"Hư có nghĩa là hư hoại, không có việc chi hợp với Sao Hư.", "Chôn cất rất tốt, lót giường bình yên.",
			"Khởi công trăm việc đều tốt. Tốt nhất là xây cất nhà cửa, cưới gả, chôn cất, trổ cửa, tháo nước, các việc thủy lợi, đi thuyền, chặt cỏ phá đất.",
			"Khởi công tạo tác việc chi cũng tốt. Tốt nhất là xây cất nhà, cưới gả, chôn cất, trổ cửa, dựng cửa, tháo nước, các vụ thuỷ lợi, chặt cỏ phá đất, cắt áo thêu áo, khai trương, xuất hành, làm việc thiện ắt Thiện quả tới mau hơn.",
			"Tạo dựng nhà phòng , nhập học , ra đi cầu công danh , cắt áo.",
			"Khởi công mọi việc đều tốt. Tốt nhất là dựng cột, cất lầu, làm dàn gác, cưới gả, trổ cửa dựng cửa, tháo nước hay các vụ thủy lợi, cắt áo.",
			"Khởi công tạo tác việc chi cũng lợi. Tốt nhất là xây cất, cưới gả, chôn cất, chặt cỏ phá đất, gieo trồng, lấy giống.",
			"Xây dựng, tạo tác.",
			"Khởi công tạo tác việc chi cũng tốt. Tốt nhất là chôn cất, cưới gả, trổ cửa dựng cửa, đào kinh, tháo nước, khai mương, móc giếng, chặt cỏ phá đất. Những việc khác cũng tốt như làm ruộng, nuôi tằm, khai trương, xuất hành, nhập học.",
			"Không có sự việc chi hợp với Sao Chủy.",
			"Khởi công tạo tác nhiều việc tốt như : xây cất nhà, dựng cửa trổ cửa, nhập học, đi thuyền, làm thủy lợi, tháo nước đào mương.",
			"Tạo tác nhiều việc tốt như xây cất, trổ cửa dựng cửa, mở thông đường nước, đào mương móc giếng, nhậm chức, nhập học, đi thuyền.",
			"Chôn cất, chặt cỏ phá đất, cắt áo.", "Không có việc chi hạp với Sao Liễu.", "Xây dựng phòng mới.",
			"Khởi công tạo tác trăm việc tốt, tốt nhất là xây cất nhà, che mái dựng hiên, trổ cửa dựng cửa, cưới gả, chôn cất, làm ruộng, nuôi tằm, đặt táng kê gác, chặt cỏ phá đất, cắt áo, làm thuỷ lợi.",
			"Cắt áo sẽ được tiền tài.",
			"Khởi công tạo tác mọi việc tốt lành, tốt nhất là xây cất lầu gác, chôn cất, cưới gả. Các việc khác cũng tốt như dựng phòng, cất trại, xuất hành, chặt cỏ phá đất."

	};

	public static final String[] NTBT_KIENG_LAM = {
			"Chôn cất hoạn nạn 3 năm. Sửa chữa hay xây đắp mộ phần ắt có người chết. Sanh con nhằm ngày có Sao Giác khó nuôi, nên lấy tên Sao mà đặt tên cho nó mới an toàn. Dùng tên sao của năm hay của tháng cũng được.",
			"Chôn cất bị Trùng tang. Cưới gả e phòng không giá lạnh. Tranh đấu kiện tụng lâm bại. Khởi dựng nhà cửa chết con đầu. 10 hoặc 100 ngày sau thì gặp họa, rồi lần lần tiêu hết ruộng đất, nếu làm quan bị cách chức. Sao Cang thuộc Thất Sát Tinh, sanh con nhằm ngày này ắt khó nuôi, nên lấy tên của Sao mà đặt cho nó thì yên lành",
			"Khởi công xây dựng, chôn cất, cưới gả, xuất hành kỵ nhất là đường thủy, sanh con chẳng phải điềm lành nên làm Âm Đức cho nó. Đó chỉ là các việc Đại Kỵ, các việc khác vẫn kiêng cử.",
			"Sao Phòng là Đại Kiết Tinh, không kỵ việc chi cả.",
			"Khởi công tạo tác việc chi cũng không khỏi hại, thứ nhất là xây cất, cưới gả, chôn cất, đóng giường, lót giường, tranh tụng.",
			"Đóng giường, lót giường, đi thuyền.", "Đóng giường, lót giường, đi thuyền.",
			"Rất kỵ đi thuyền. Con mới sanh đặt tên nó là Đẩu, Giải, Trại hoặc lấy tên Sao của năm hay tháng hiện tại mà đặt tên cho nó dễ nuôi.",
			"Khởi công tạo tác việc chi cũng hung hại. Nhất là xây cất nhà, dựng trại, cưới gả, trổ cửa, làm thủy lợi, nuôi tằm, gieo cấy, khai khẩn, khai trương, xuất hành đường bộ.",
			"Khởi công tạo tác trăm việc đều có hại, hung hại nhất là trổ cửa, khơi đường tháo nước, chôn cất, đầu đơn kiện cáo.",
			"Khởi công tạo tác trăm việc đều không may, thứ nhất là xây cất nhà cửa, cưới gả, khai trương, trổ cửa, tháo nước, đào kinh rạch.",
			"Dựng nhà, trổ cửa, gác đòn đông, tháo nước, đào mương rạch, đi thuyền.",
			"Sao thất Đại Kiết không có việc chi phải cử.", "Sao Bích toàn kiết, không có việc chi phải kiêng cữ.",
			"Chôn cất , khai trương , trổ cửa dựng cửa , khai thông đường nước , đào ao móc giếng , thưa kiện , đóng giường lót giường.",
			"Đóng giường, lót giường, đi đường thủy.",
			"Đi thuyền.",
			"Chôn Cất (ĐẠI KỴ), cưới gả, trổ cửa dựng cửa, khai ngòi phóng thủy, khai trương, xuất hành, đóng giường lót giường. Các việc khác cũng không hay.",
			"Đi thuyền.",
			"Khởi công tạo tác việc chi cũng không tốt. KỴ NHẤT là chôn cất và các vụ thuộc về chết chôn như sửa đắp mồ mả, làm sanh phần (làm mồ mã để sẵn), đóng thọ đường (đóng hòm để sẵn).",
			"Cưới gả, chôn cất, đóng giường lót giường, kết bạn.",
			"Chôn cất, tu bổ phần mộ, làm sanh phần, đóng thọ đường.",
			"Khởi tạo việc chi cũng hại. Hại nhất là xây cất nhà, cưới gả, trổ cửa dựng cửa, tháo nước, đào ao giếng, động đất, xây tường, dựng cột.",
			"Khởi công tạo tác việc chi cũng hung hại. Hung hại nhất là chôn cất, xây đắp, trổ cửa dựng cửa, tháo nước, đào ao lũy, làm thủy lợi.",
			"Chôn cất, cưới gả, mở thông đường nước.",
			"Sửa hoặc làm thuyền chèo, đẩy thuyền mới xuống nước.",
			"Chôn cất, cưới gả, xây cất nhà, đặt táng kê gác, gác đòn dông, trổ cửa gắn cửa, các vụ thủy lợi.",
			"Đi thuyền.",

	};
	
	public static final String[] NTBT_NGOAI_LE = {
			"Sao Giác trúng ngày Dần là Đăng Viên được ngôi cao cả, mọi sự tốt đẹp. \nSao Giác trúng ngày Ngọ là Phục Đoạn Sát: rất Kỵ chôn cất, xuất hành, thừa kế, chia lãnh gia tài, khởi công lò nhuộm lò gốm. Nhưng nên dứt vú trẻ em, xây tường, lấp hang lỗ, làm cầu tiêu, kết dứt điều hung hại.\nSao Giác trúng ngày Sóc là Diệt Một Nhật: Đại Kỵ đi thuyền, và cũng chẳng nên làm rượu, lập lò gốm lò nhuộm, vào làm hành chánh, thừa kế.",
			"Sao Cang ở nhằm ngày Rằm là Diệt Một Nhật: Cử làm rượu, lập lò gốm lò nhuộm, vào làm hành chánh, thừa kế sự nghiệp, thứ nhất đi thuyền chẳng khỏi nguy hại (vì Diệt Một có nghĩa là chìm mất).\\nSao Cang tại Hợi, Mẹo, Mùi trăm việc đều tốt. Thứ nhất tại Mùi.",
			"Tại Thân, Tý, Thìn trăm việc đều tốt, nhưng Thìn là tốt hơn hết vì Sao Đê Đăng Viên tại Thìn.",
			"Tại Đinh Sửu và Tân Sửu đều tốt, tại Dậu càng tốt hơn, vì Sao Phòng Đăng Viên tại Dậu.\nTrong 6 ngày Kỷ Tị, Đinh Tị, Kỷ Dậu, Quý Dậu, Đinh Sửu, Tân Sửu thì Sao Phòng vẫn tốt với các việc khác, ngoại trừ chôn cất là rất kỵ. Sao Phòng nhằm ngày Tị là Phục Đoạn Sát: chẳng nên chôn cất, xuất hành, các vụ thừa kế, chia lãnh gia tài, khởi công làm lò nhuộm lò gốm. Nhưng nên dứt vú trẻ em, xây tường, lấp hang lỗ, làm cầu tiêu, kết dứt điều hung hại.",
			"Ngày Dần Sao Tâm Đăng Viên, có thể dùng các việc nhỏ.",
			"Tại Hợi, Mẹo, Mùi Kỵ chôn cất. Tại Mùi là vị trí Hãm Địa của Sao Vỹ. Tại Kỷ Mẹo rất Hung, còn các ngày Mẹo khác có thể tạm dùng được.",
			"Tại Thân, Tý, Thìn trăm việc kỵ, duy tại Tý có thể tạm dùng. Ngày Thìn Sao Cơ Đăng Viên lẽ ra rất tốt nhưng lại phạm Phục Đoạn. Phạm Phục Đoạn thì kỵ chôn cất, xuất hành, các vụ thừa kế, chia lãnh gia tài, khởi công làm lò nhuộm lò gốm ; Nhưng nên dứt vú trẻ em, xây tường, lấp hang lỗ, làm cầu tiêu, kết dứt điều hung hại.",
			"Tại Tị mất sức. Tại Dậu tốt. Ngày Sửu Đăng Viên rất tốt Nhưng lại phạm Phục Đoạn. Phạm Phục Đoạn thì kỵ chôn cất, xuất hành, thừa kế, chia lãnh gia tài, khởi công làm lò nhuộm lò gốm ; Nhưng nên dứt vú trẻ em, xây tường, lấp hang lỗ, làm cầu tiêu, kết dứt điều hung hại.",
			"Ngày Ngọ Đăng Viên rất tốt. Ngày Tuất yên lành. Ngày Dần là Tuyệt Nhật, chớ động tác việc chi, riêng ngày Nhâm Dần dùng được. Trúng ngày 14 ÂL là Diệt Một Sát, cử: làm rượu, lập lò nhuộm lò gốm, vào làm hành chánh, thừa kế sự nghiệp, kỵ nhất là đi thuyền chẳng khỏi rủi ro.\nSao Ngưu là 1 trong Thất sát Tinh, sanh con khó nuôi, nên lấy tên Sao của năm, tháng hay ngày mà đặt tên cho trẻ và làm việc Âm Đức ngay trong tháng sanh nó mới mong nuôi khôn lớn được.",
			"Tại Hợi Mẹo Mùi đều gọi là đường cùng. Ngày Quý Hợi cùng cực đúng mức vì là ngày chót của 60 Hoa giáp. Ngày Hợi tuy Sao Nữ Đăng Viên song cũng chẳng nên dùng. Ngày Mẹo là Phục Đoạn Sát, rất kỵ chôn cất, xuất hành, thừa kế sự nghiệp, chia lãnh gia tài, khởi công làm lò nhuộm lò gốm ; Nhưng nên dứt vú trẻ em, xây tường, lấp hang lỗ, làm cầu tiêu, kết dứt điều hung hại.",
			"Gặp Thân, Tý, Thìn đều tốt, tại Thìn Đắc Địa tốt hơn hết. Hạp với 6 ngày Giáp Tý, Canh Tý, Mậu Thân, Canh Thân, Bính Thìn, Mậu Thìn có thể động sự. Trừ ngày Mậu Thìn ra, còn 5 ngày kia kỵ chôn cất.\nGặp ngày Tý thì Sao Hư Đăng Viên rất tốt, Nhưng lại phạm Phục Đoạn Sát: Kỵ chôn cất, xuất hành, thừa kế, chia lãnh gia tài sự nghiệp, khởi công làm lò nhuộm lò gốm, Nhưng nên dứt vú trẻ em, xây tường, lấp hang lỗ, làm cầu tiêu, kết dứt điều hung hại.\nGặp Huyền Nhật là những ngày 7, 8 , 22, 23 ÂL thì Sao Hư phạm Diệt Một: Cử làm rượu, lập lò gốm lò nhuộm, vào làm hành chánh, thừa kế, thứ nhất là đi thuyền ắt chẳng khỏi rủi ro.",
			"Tại Tị, Dậu, Sửu trăm việc đều tốt, tại Dậu tốt nhất. Ngày Sửu Sao Nguy Đăng Viên: tạo tác sự việc được quý hiển.",
			"Tại Dần, Ngọ, Tuất nói chung đều tốt, ngày Ngọ Đăng viên rất hiển đạt.\nBa ngày Bính Dần, Nhâm Dần, Giáp Ngọ rất nên xây dựng và chôn cất, song những ngày Dần khác không tốt. Vì sao Thất gặp ngày Dần là phạm Phục Đoạn Sát ( kiêng cữ như trên ).",
			"Tại Hợi Mẹo Mùi trăm việc kỵ , thứ nhất trong Mùa Đông. Riêng ngày Hợi Sao Bích Đăng Viên nhưng phạm Phục Đọan Sát ( Kiêng cữ như trên ).",
			"Sao Khuê là 1 trong Thất Sát Tinh, nếu đẻ con nhằm ngày này thì nên lấy tên Sao Khuê hay lấy tên Sao của năm tháng mà đặt cho trẻ dễ nuôi.Sao Khuê Hãm Địa tại Thân: Văn Khoa thất bại. Tại Ngọ là chỗ Tuyệt gặp Sanh, mưu sự đắc lợi, thứ nhất gặp Canh Ngọ. Tại Thìn tốt vừa vừa. Ngày Thân Sao Khuê Đăng Viên: Tiến thân danh.",
			"Tại Ngày Dậu Đăng Viên : Tạo tác đại lợi. Tại Tị gọi là Nhập Trù rất tốt. Tại Sửu tốt vừa vừa. Gặp ngày cuối tháng thì Sao Lâu phạm Diệt Một: rất kỵ đi thuyền, cữ làm rượu, lập lò gốm lò nhuộm, vào làm hành chánh, thừa kế sự nghiệp.",
			"Sao Vị mất chí khí tại Dần, thứ nhất tại Mậu Dần, rất là Hung, chẳng nên cưới gả, xây cất nhà cửa. Tại Tuất Sao Vị Đăng Viên nên mưu cầu công danh, nhưng cũng phạm Phục Đoạn (kiêng cữ như các mục trên).",
			"Tại Mùi mất chí khí. Tại Ất Mẹo và Đinh Mẹo tốt, Ngày Mẹo Đăng Viên cưới gả tốt, nhưng ngày Quý Mẹo tạo tác mất tiền của. Hạp với 8 ngày: Ất Mẹo, Đinh Mẹo, Tân Mẹo, Ất Mùi, Đinh Mùi, Tân Mùi, Ất Hợi, Tân Hợi.",
			"Tại Thân, Tý, Thìn đều tốt. Tại Thân hiệu là Nguyệt Quải Khôn Sơn, trăng treo đầu núi Tây Nam, rất là tốt. Lại thên Sao tất Đăng Viên ở ngày Thân, cưới gả và chôn cất là 2 điều ĐẠI KIẾT.",
			"Tại tị bị đoạt khí, Hung càng thêm hung. Tại dậu rất tốt, vì Sao Chủy Đăng Viên ở Dậu, khởi động thăng tiến. Nhưng cũng phạm Phục Đoạn Sát. Tại Sửu là Đắc Địa, ắt nên. Rất hợp với ngày Đinh sửu và Tân Sửu, tạo tác Đại Lợi, chôn cất Phú Quý song toàn.",
			 "Ngày Tuất Sao sâm Đăng Viên, nên phó nhậm, cầu công danh hiển hách.",
			 "Tại Hợi, Mẹo, Mùi trăm việc tốt. Tại Mùi là Nhập Miếu, khởi động vinh quang.",
			 "Ngày Tý Đăng Viên thừa kế tước phong tốt, phó nhiệm may mắn. Ngày Thân là Phục Đoạn Sát kỵ chôn cất, xuất hành, thừa kế, chia lãnh gia tài, khởi công lập lò gốm lò nhuộm; Nhưng nên dứt vú trẻ em, xây tường, lấp hang lỗ, làm cầu tiêu, kết dứt điều hung hại. Nhằm ngày 16 ÂL là ngày Diệt Một kỵ làm rượu, lập lò gốm lò nhuộm, vào làm hành chánh, kỵ nhất đi thuyền.",
			 "Tại Ngọ trăm việc tốt. Tại Tị Đăng Viên: thừa kế và lên quan lãnh chức là 2 điều tốt nhất. Tại Dần, Tuất rất kỵ xây cất và chôn cất : Rất suy vi.",
			 "Sao Tinh là 1 trong Thất Sát Tinh, nếu sanh con nhằm ngày này nên lấy tên Sao đặt tên cho trẻ để dễ nuôi, có thể lấy tên sao của năm, hay sao của tháng cũng được. Tại Dần Ngọ Tuất đều tốt, tại Ngọ là Nhập Miếu, tạo tác được tôn trọng. Tại Thân là Đăng Giá ( lên xe ): xây cất tốt mà chôn cất nguy. Hạp với 7 ngày: Giáp Dần, Nhâm Dần, Giáp Ngọ, Bính Ngọ, Mậu Ngọ, Bính Tuất, Canh Tuất.",
			 "Tại Hợi, Mẹo, Mùi đều tốt. Tại Mùi Đăng viên rất tốt nhưng phạm Phục Đoạn.",
			 "Tại Thân, Tý, Thìn mọi việc tốt. Tại Thìn Vượng Địa tốt hơn hết. Tại Tý Đăng Viên nên thừa kế sự nghiệp, lên quan lãnh chức.",
			 "Tại Tị Dậu Sửu đều tốt. Tại Sửu Vượng Địa, tạo tác thịnh vượng. Tại Tị Đăng Viên là ngôi tôn đại, mưu động ắt thành danh.",
	};
	
	public static final String[] NTBT_THO = {
			"Giác tinh tọa tác chủ vinh xương,\nNgoại tiến điền tài cập nữ lang,\nGiá thú hôn nhân sinh quý tử,\nVănh nhân cập đệ kiến Quân vương.\nDuy hữu táng mai bất khả dụng,\nTam niên chi hậu, chủ ôn đậu,\nKhởi công tu trúc phần mộ địa,\nĐường tiền lập kiến chủ nhân vong.",
			"Đê tinh tạo tác chủ tai hung,\nPhí tận điền viên, thương khố không,\nMai táng bất khả dụng thử nhật,\nHuyền thằng, điếu khả, họa trùng trùng,\nNhược thị hôn nhân ly biệt tán,\nDạ chiêu lãng tử nhập phòng trung.\nHành thuyền tắc định tạo hướng một,\nCánh sinh lung ách, tử tôn cùng.",
			"Can tinh tạo tác Trưởng phòng đường,\r\n" + 
			"Thập nhật chi trung chủ hữu ương,\r\n" + 
			"Điền địa tiêu ma, quan thất chức,\r\n" + 
			"Đầu quân định thị hổ lang thương.\r\n" + 
			"Giá thú, hôn nhân dụng thử nhật,\r\n" + 
			"Nhi tôn, Tân phụ chủ không phòng,\r\n" + 
			"Mai táng nhược hoàn phùng thử nhật,\r\n" + 
			"Đương thời tai họa, chủ trùng tang.\r\n" ,
			"Phòng tinh tạo tác điền viên tiến,\nHuyết tài ngưu mã biến sơn cương,\nCánh chiêu ngoại xứ điền trang trạch,\nVinh hoa cao quý, phúc thọ khang.\nMai táng nhược nhiên phùng thử nhật,\nCao quan tiến chức bái Quân vương.\nGiá thú: Thường nga quy Nguyệt điện,\nTam niên bào tử chế triều đường.",
			"Tâm tinh tạo tác đại vi hung,\nCánh tao hình tụng, ngục tù trung,\nNgỗ nghịch quan phi, điền trạch thoái,\nMai táng tốt bộc tử tương tòng.\nHôn nhân nhược thị phùng thử nhật,\nTử tử nhi vong tự mãn hung.\nTam niên chi nội liên tạo họa,\nSự sự giáo quân một thủy chung.",
			"Vĩ tinh tạo tác đắc thiên ân,\nPhú quý, vinh hoa, phúc thọ ninh,\nChiêu tài tiến bảo, tiến điền địa,\nHòa hợp hôn nhân, quý tử tôn.\nMai táng nhược năng y thử nhật,\nNam thanh, nữ chính, tử tôn hưng.\nKhai môn, phóng thủy, chiêu điền địa,\nĐại đại công hầu, viễn bá danh.",
			"Cơ tinh tạo tác chủ cao cường,\nTuế tuế niên niên đại cát xương,\nMai táng, tu phần đại cát lợi,\nĐiền tàm, ngưu mã biến sơn cương.\nKhai môn, phóng thủy chiêu tài cốc,\nKhiếp mãn kim ngân, cốc mãn thương.\nPhúc ấm cao quan gia lộc vị,\nLục thân phong lộc, phúc an khang.",
			"Đẩu tinh tạo tác chủ chiêu tài,\nVăn vũ quan viên vị đỉnh thai,\nĐiền trạch tiền tài thiên vạn tiến,\nPhần doanh tu trúc, phú quý lai.\nKhai môn, phóng thủy, chiêu ngưu mã,\nVượng tài nam nữ chủ hòa hài,\nNgộ thử cát tinh lai chiến hộ,\nThời chi phúc khánh, vĩnh vô tai.",
			"Ngưu tinh tạo tác chủ tai nguy,\nCửu hoành tam tai bất khả thôi,\nGia trạch bất an, nhân khẩu thoái,\nĐiền tàm bất lợi, chủ nhân suy.\nGiá thú, hôn nhân giai tự tổn,\nKim ngân tài cốc tiệm vô chi.\nNhược thị khai môn, tính phóng thủy,\nNgưu trư dương mã diệc thương bi.",
			"Nữ tinh tạo tác tổn bà nương,\nHuynh đệ tương hiềm tựa hổ lang,\nMai táng sinh tai phùng quỷ quái,\nĐiên tà tật bệnh cánh ôn hoàng.\nVi sự đáo quan, tài thất tán,\nTả lị lưu liên bất khả đương.\nKhai môn, phóng thủy phùng thử nhật,\nToàn gia tán bại, chủ ly hương.",
			"Hư tinh tạo tác chủ tai ương,\nNam nữ cô miên bất nhất song,\nNội loạn phong thanh vô lễ tiết,\nNhi tôn, tức phụ bạn nhân sàng,\nKhai môn, phóng thủy chiêu tai họa,\nHổ giảo, xà thương cập tốt vong.\nTam tam ngũ ngũ liên niên bệnh,\nGia phá, nhân vong, bất khả đương.",
			"Nguy tinh bất khả tạo cao đường,\nTự điếu, tao hình kiến huyết quang\nTam tuế hài nhi tao thủy ách,\nHậu sinh xuất ngoại bất hoàn lương.\nMai táng nhược hoàn phùng thử nhật,\nChu niên bách nhật ngọa cao sàng,\nKhai môn, phóng thủy tạo hình trượng,\nTam niên ngũ tái diệc bi thương.",
			"Thất tinh tạo tác tiến điền ngưu,\nNhi tôn đại đại cận quân hầu,\nPhú quý vinh hoa thiên thượng chỉ,\nThọ như Bành tổ nhập thiên thu.\nKhai môn, phóng thủy chiêu tài bạch,\nHòa hợp hôn nhân sinh quý nhi.\nMai táng nhược năng y thử nhật,\nMôn đình hưng vượng, Phúc vô ưu!",
			"Bích tinh tạo ác tiến trang điền\nTi tâm đại thục phúc thao thiên,\nNô tỳ tự lai, nhân khẩu tiến,\nKhai môn, phóng thủy xuất anh hiền,\nMai táng chiêu tài, quan phẩm tiến,\nGia trung chủ sự lạc thao nhiên\nHôn nhân cát lợi sinh quý tử,\nTảo bá thanh danh khán tổ tiên.",
			"Khuê tinh tạo tác đắc trinh tường,\nGia hạ vinh hòa đại cát xương,\nNhược thị táng mai âm tốt tử,\nĐương niên định chủ lưỡng tam tang.\nKhán khán vận kim, hình thương đáo,\nTrùng trùng quan sự, chủ ôn hoàng.\nKhai môn phóng thủy chiêu tai họa,\nTam niên lưỡng thứ tổn nhi lang.",
			"Lâu tinh thụ trụ, khởi môn đình,\nTài vượng, gia hòa, sự sự hưng,\nNgoại cảnh, tiền tài bách nhật tiến,\nNhất gia huynh đệ bá thanh danh.\nHôn nhân tiến ích, sinh quý tử,\nNgọc bạch kim lang tương mãn doanh,\nPhóng thủy, khai môn giai cát lợi,\nNam vinh, nữ quý, thọ khang ninh.",
			"Vị tinh tạo tác sự như hà,\nPhú quý, vinh hoa, hỷ khí đa,\nMai táng tiến lâm quan lộc vị,\nTam tai, cửu họa bất phùng tha.\nHôn nhân ngộ thử gia phú quý,\nPhu phụ tề mi, vĩnh bảo hòa,\nTòng thử môn đình sinh cát khánh,\nNhi tôn đại đại bảo kim pha.",
			"Mão tinh tạo tác tiến điền ngưu,\nMai táng quan tai bất đắc hưu,\nTrùng tang nhị nhật, tam nhân tử,\nMại tận điền viên, bất năng lưu.\nKhai môn, phóng thủy chiêu tai họa,\nTam tuế hài nhi bạch liễu đầu,\nHôn nhân bất khả phùng nhật thử,\nTử biệt sinh ly thật khả sầu.",
			"Tất tinh tạo tác chủ quang tiền,\nMãi dắc điền viên hữu lật tiền\nMai táng thử nhật thiêm quan chức,\nĐiền tàm đại thực lai phong niên\nKhai môn phóng thủy đa cát lật,\nHợp gia nhân khẩu đắc an nhiên,\nHôn nhân nhược năng phùng thử nhật,\nSinh đắc hài nhi phúc thọ toàn.",
			"Truỷ tinh tạo tác hữu đồ hình,\nTam niên tất đinh chủ linh đinh,\nMai táng tốt tử đa do thử,\nThủ định Dần niên tiện sát nhân.\nTam tang bất chỉ giai do thử,\nNhất nhân dược độc nhị nhân thân.\nGia môn điền địa giai thoán bại,\nThương khố kim tiền hóa tác cần.",
			"Sâm tinh tạo tác vượng nhân gia,\nVăn tinh triều diệu, đại quang hoa,\nChỉ nhân tạo tác điền tài vượng,\nMai táng chiêu tật, táng hoàng sa.\nKhai môn, phóng thủy gia quan chức,\nPhòng phòng tôn tử kiến điền gia,\nHôn nhân hứa định tao hình khắc,\nNam nữ chiêu khai mộ lạc hoa.",
			"Tỉnh tinh tạo tác vượng tàm điền,\nKim bảng đề danh đệ nhất tiên,\nMai táng, tu phòng kinh tốt tử,\nHốt phong tật nhập hoàng điên tuyền\nKhai môn, phóng thủy chiêu tài bạch,\nNgưu mã trư dương vượng mạc cát,\nQuả phụ điền đường lai nhập trạch,\nNhi tôn hưng vượng hữu dư tiền.",
			"Quỷ tinh khởi tạo tất nhân vong,\nĐường tiền bất kiến chủ nhân lang,\nMai táng thử nhật, quan lộc chí,\nNhi tôn đại đại cận quân vương.\nKhai môn phóng thủy tu thương tử,\nHôn nhân phu thê bất cửu trường.\nTu thổ trúc tường thương sản nữ,\nThủ phù song nữ lệ uông uông.",
			"Liễu tinh tạo tác chủ tao quan,\nTrú dạ thâu nhàn bất tạm an,\nMai táng ôn hoàng đa bệnh tử,\nĐiền viên thoái tận, thủ cô hàn,\nKhai môn phóng thủy chiêu lung hạt,\nYêu đà bối khúc tự cung loan\nCánh hữu bổng hình nghi cẩn thận,\nPhụ nhân tùy khách tẩu bất hoàn.",
			"Tinh tú nhật hảo tạo tân phòng,\nTiến chức gia quan cận Đế vương,\nBất khả mai táng tính phóng thủy,\nHung tinh lâm vị nữ nhân vong.\nSinh ly, tử biệt vô tâm luyến,\nTự yếu quy hưu biệt giá lang.\nKhổng tử cửu khúc châu nan độ,\nPhóng thủy, khai câu, thiên mệnh thương.",
			"Trương tinh nhật hảo tạo long hiên,\nNiên niên tiện kiến tiến trang điền,\nMai táng bất cửu thăng quan chức,\nĐại đại vi quan cận Đế tiền,\nKhai môn phóng thủy chiêu tài bạch,\nHôn nhân hòa hợp, phúc miên miên.\nĐiền tàm đại lợi, thương khố mãn,\nBách ban lợi ý, tự an nhiên.",
			"Dực tinh bất lợi giá cao đường,\nTam niên nhị tái kiến ôn hoàng,\nMai táng nhược hoàn phùng thử nhật,\nTử tôn bất định tẩu tha hương.\nHôn nhân thử nhật nghi bất lợi,\nQuy gia định thị bất tương đương.\nKhai môn phóng thủy gia tu phá,\nThiếu nữ tham hoa luyến ngoại lang.",
			"Chẩn tinh lâm thủy tạo long cung,\nĐại đại vi quan thụ sắc phong,\nPhú quý vinh hoa tăng phúc thọ,\nKhố mãn thương doanh tự Xương: long.\nMai táng văn tinh lai chiếu trợ,\nTrạch xá an ninh, bất kiến hung.\nCánh hữu vi quan, tiên đế sủng,\nHôn nhân long tử xuất long cung."
			
			
	};
	
	public static final String SAO_MOTA[] = {
			"(Bình Tú) Tướng tinh con Giao Long, chủ trị ngày thứ 5",
			"(Hung Tú) Tướng tinh con Rồng , chủ trị ngày thứ 6",
			"(Hung Tú) Tướng tinh con Lạc Đà, chủ trị ngày thứ 7",
			"(Kiết Tú) Tướng tinh con Thỏ , chủ trị ngày Chủ nhật",
			"(Hung tú) Tướng tinh con chồn, chủ trị ngày thứ 2",
			"(Kiết Tú) Tướng tinh con cọp, chủ trị ngày thứ 3",
			"(Kiết Tú) Tướng tinh con Beo , chủ trị ngày thứ 4",
			"(Kiết Tú) Tướng tinh con cua , chủ trị ngày thứ 5",
			"(Hung Tú) Tướng tinh con trâu , chủ trị ngày thứ 6",
			"(Hung Tú) Tướng tinh con dơi , chủ trị ngày thứ 7",
			"(Hung Tú) Tướng tinh con chuột, chủ trị ngày chủ nhật",
			"(Bình Tú) Tướng tinh con chim én, chủ trị ngày thứ 2",
			"(Kiết Tú) Tướng tinh con heo, chủ trị ngày thứ 3",
			"(Kiết Tú) Tướng tinh con rái cá , chủ trị ngày thứ 4",
			"(Bình Tú) Tướng tinh con chó sói, chủ trị ngày thứ 5",
			"(Kiết Tú) Tướng tinh con chó , chủ trị ngày thứ 6",
			"(Kiết Tú) Tướng tinh con chim trĩ , củ trị ngày thứ 7",
			"(Hung Tú) Tướng tinh con gà, chủ trị ngày chủ nhật",
			"(Kiết Tú) Tướng tinh con quạ, chủ trị ngày thứ 2",
			"(Hung Tú) Tướng tinh con khỉ, chủ trị ngày thứ 3",
			"(Bình Tú) Tướng tinh con vượn , chủ trị ngày thứ 4",
			"(Bình Tú) Tướng tinh con dê trừu, chủ trị ngày thứ 5",
			"(Hung Tú) Tướng tinh con dê , chủ trị ngày thứ 6",
			"(Hung tú) Tướng tinh con gấu ngựa , chủ trị ngày thứ 7",
			"(Bình Tú) Tướng tinh con ngựa , chủ trị ngày chủ nhật",
			"(Kiết Tú) Tướng tinh con nai , chủ trị ngày thứ 2",
			"(Hung Tú) Tướng tinh con rắn , chủ trị ngày thứ 3",
			"(Kiết Tú) Tướng tinh con giun, chủ trị ngày thứ 4",
	}; 
	
	public static final String SAO_TIEU_DE[] = {
			"Giác mộc Giao - Đặng Vũ: Tốt",
			"Cang kim Long - Ngô Hán: Xấu",
			"Đê thổ Lạc - Giả Phục: Xấu",
			"Phòng nhật Thố - Cảnh Yêm: Tốt",
			"Tâm nguyệt Hồ - Khấu Tuân: Xấu",
			"Vĩ hỏa Hổ - Sầm Bành: Tốt",
			"Cơ thủy Báo - Phùng Dị: Tốt",
			"Đẩu mộc Giải - Tống Hữu: Tốt",
			"Ngưu kim Ngưu - Sái Tuân: Xấu",
			"Nữ thổ Bức - Cảnh Đan: Xấu",
			"Hư nhật Thử - Cái Duyên: Xấu",
			"Nguy nguyệt Yến - Kiên Đàm: Xấu",
			"Thất hỏa Trư - Cảnh Thuần: Tốt",
			"Bích thủy Du - Tang Cung: Tốt",
			"Khuê mộc Lang - Mã Vũ: Xấu",
			"Lâu kim Cẩu - Lưu Long: Tốt",
			 "Vị thổ Trĩ - Ô Thành: Tốt",
			 "Mão nhật Kê - Vương Lương: Xấu",
			 "Tất nguyệt Ô - Trần Tuấn: Tốt",
			 "Truỷ hỏa Hầu - Phó Tuấn: Xấu",
			 "Sâm thủy Viên - Đỗ Mậu: Tốt",
			 "Tỉnh mộc Hãn - Diêu Kỳ: Tốt",
			 "Quỷ kim Dương - Vương Phách: Xấu",
			 "Liễu thổ Chương - Nhậm Quang: Xấu",
			 "Tinh nhật Mã - Lý Trung: Xấu",
			 "Trương nguyệt Lộc - Vạn Tu: Tốt",
			 "Dực hỏa Xà - Bi Đồng: Xấu",
			 "Chẩn thủy Dẫn - Lưu Trực: Tốt",
	};

	public static NhiThapBatTu getNhiThapBatTu(int dd, int mm, int yy) {
		NhiThapBatTu nhiThapBatTu = new NhiThapBatTu();
		int jd220170 = SunClass.jdFromDate(22, 01, 1970);
		int jdNow = SunClass.jdFromDate(dd, mm, yy);
		int sub = jdNow - jd220170;
		int stt = sub % 28;

		if (stt >=0) {
			nhiThapBatTu.sao = NTBT[stt];
		} else {
			stt = 28 + stt;
			nhiThapBatTu.sao = NTBT[stt];
		}

		if (stt <= 6) {
			nhiThapBatTu.huong = "Phương Đông";
		} else if (stt <= 13) {
			nhiThapBatTu.huong = "Phương Bắc";
		} else if (stt <= 20) {
			nhiThapBatTu.huong = "Phương Tây";
		} else {
			nhiThapBatTu.huong = "Phương Nam";
		}

		if (stt == 0 || stt == 7 || stt == 14 || stt == 21) {
			nhiThapBatTu.hanh = "Mộc";
		} else if (stt == 1 || stt == 8 || stt == 15 || stt == 22) {
			nhiThapBatTu.hanh = "Kim";
		} else if (stt == 2 || stt == 9 || stt == 16 || stt == 23) {
			nhiThapBatTu.hanh = "Thổ";
		} else if (stt == 3 || stt == 10 || stt == 17 || stt == 24) {
			nhiThapBatTu.hanh = "Thái Dương";
		} else if (stt == 4 || stt == 11 || stt == 18 || stt == 25) {
			nhiThapBatTu.hanh = "Thái Âm";
		} else if (stt == 5 || stt == 12 || stt == 19 || stt == 26) {
			nhiThapBatTu.hanh = "Hỏa";
		} else {
			nhiThapBatTu.hanh = "Thủy";
		}

		nhiThapBatTu.dongVat = NTBT_DONG_VAT[stt];
		nhiThapBatTu.nenLam = NTBT_NEN_LAM[stt];
		nhiThapBatTu.kiengLam = NTBT_KIENG_LAM[stt];
		nhiThapBatTu.ngoaiLe =  NTBT_NGOAI_LE[stt];
		nhiThapBatTu.tho = NTBT_THO[stt];
		nhiThapBatTu.moTa = SAO_MOTA[stt];
		nhiThapBatTu.tieuDe = SAO_TIEU_DE[stt];
		System.out.println("SAO_MOTA:" + SAO_MOTA.length);
		return nhiThapBatTu;
	}

	public static void main(String[] args) {
		int jd220170 = SunClass.jdFromDate(22, 01, 1970);
		int jdNow = SunClass.jdFromDate(11, 10, 1951);

		int sub = jdNow - jd220170;
		int lan = sub % 28;
		int stt = lan;
		System.out.println("stt:" + stt);

		jd220170 = SunClass.jdFromDate(22, 01, 1970);
		jdNow = SunClass.jdFromDate(23, 2, 1995);

		sub = jdNow - jd220170;
		lan = sub % 28;
		stt = lan;
		System.out.println("stt:" + stt);

		NhiThapBatTu nhiThapBatTu = NhiThapBatTuUnit.getNhiThapBatTu(11, 10, 1951);
		System.out.println(nhiThapBatTu);
	}
}
