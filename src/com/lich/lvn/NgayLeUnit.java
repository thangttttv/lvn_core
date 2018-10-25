package com.lich.lvn;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import com.lich.lvn.model.DanhNgon;
import com.lich.lvn.model.NgayLe;

public class NgayLeUnit {
	public static HashMap<String,NgayLe> ngayLeList = null;
	
		
	static {
		ngayLeList = new HashMap<String,NgayLe>();
		
		NgayLe nl = new NgayLe("Tết dương lịch","01/01",0);
		ngayLeList.put(nl.ngay+"_"+nl.isAmLich, nl);
		nl = new NgayLe("Ngày giải phóng miền nam","30/04",0);
		ngayLeList.put(nl.ngay+"_"+nl.isAmLich, nl);
		nl = new NgayLe("Ngày quốc tế lao động","01/05",0);
		ngayLeList.put(nl.ngay+"_"+nl.isAmLich, nl);
		nl = new NgayLe("Ngày quốc khánh","02/09",0);
		ngayLeList.put(nl.ngay+"_"+nl.isAmLich, nl);
		nl = new NgayLe("Ngày thành lập ĐCSVN","03/02",0);
		ngayLeList.put(nl.ngay+"_"+nl.isAmLich, nl);
		nl = new NgayLe("Ngày thầy thuốc Việt Nam","27/02",0);
		ngayLeList.put(nl.ngay+"_"+nl.isAmLich, nl);
		nl = new NgayLe("Ngày quốc tế Phụ nữ","08/03",0);
		ngayLeList.put(nl.ngay+"_"+nl.isAmLich, nl);
		nl = new NgayLe("Ngày thương binh liệt sỹ","27/07",0);
		ngayLeList.put(nl.ngay+"_"+nl.isAmLich, nl);
		nl = new NgayLe("Cách mạng tháng tám","19/08",0);
		ngayLeList.put(nl.ngay+"_"+nl.isAmLich, nl);
		nl = new NgayLe("Ngày giải phóng thủ đô","10/10",0);
		ngayLeList.put(nl.ngay+"_"+nl.isAmLich, nl);
		
		nl = new NgayLe("Ngày phụ nữ Việt Nam","20/10",0);
		ngayLeList.put(nl.ngay+"_"+nl.isAmLich, nl);
		nl = new NgayLe("Ngày nhà giáo Việt Nam","20/11",0);
		ngayLeList.put(nl.ngay+"_"+nl.isAmLich, nl);
		nl = new NgayLe("Ngày thành lập QĐNDVN","22/12",0);
		ngayLeList.put(nl.ngay+"_"+nl.isAmLich, nl);
		nl = new NgayLe("Ngày lễ giáng sinh","24/12",0);
		ngayLeList.put(nl.ngay+"_"+nl.isAmLich, nl);
		nl = new NgayLe("Ngày sinh chủ tịch Hồ Chí Minh","19/05",0);
		ngayLeList.put(nl.ngay+"_"+nl.isAmLich, nl);
		nl = new NgayLe("Ngày lễ tình yêu","14/02",0);
		ngayLeList.put(nl.ngay+"_"+nl.isAmLich, nl);
		nl = new NgayLe("Giỗ tổ Hùng Vương","10/03",1);
		ngayLeList.put(nl.ngay+"_"+nl.isAmLich, nl);
		nl = new NgayLe("Hội Côn Sơn","15/01",1);
		ngayLeList.put(nl.ngay+"_"+nl.isAmLich, nl);
		nl = new NgayLe("Tết dân tộc Khmer Nam Bộ","14/04",1);
		ngayLeList.put(nl.ngay+"_"+nl.isAmLich, nl);
		nl = new NgayLe("Lễ Phật Đản","15/04",1);
		ngayLeList.put(nl.ngay+"_"+nl.isAmLich, nl);
		nl = new NgayLe("Tết đoan ngọ","05/05",1);
		ngayLeList.put(nl.ngay+"_"+nl.isAmLich, nl);
		nl = new NgayLe("Lễ Vu Lan","15/07",1);
		ngayLeList.put(nl.ngay+"_"+nl.isAmLich, nl);
		nl = new NgayLe("Tết trung thu","15/08",1);
		ngayLeList.put(nl.ngay+"_"+nl.isAmLich, nl);
		nl = new NgayLe("Ngày ông Táo chầu trời","23/12",1);
		ngayLeList.put(nl.ngay+"_"+nl.isAmLich, nl);
		nl = new NgayLe("Hội đền Hai Bà Trưng","04/01",1);
		ngayLeList.put(nl.ngay+"_"+nl.isAmLich, nl);
		nl = new NgayLe("Hội Đống Đa","05/01",1);
		ngayLeList.put(nl.ngay+"_"+nl.isAmLich, nl);
		nl = new NgayLe("Khai hội chùa Hương","06/01",1);
		ngayLeList.put(nl.ngay+"_"+nl.isAmLich, nl);
		nl = new NgayLe("Hội chùa Đậu","08/01",1);
		ngayLeList.put(nl.ngay+"_"+nl.isAmLich, nl);
		nl = new NgayLe("Khai hội Yên Tử","09/01",1);
		ngayLeList.put(nl.ngay+"_"+nl.isAmLich, nl);
		nl = new NgayLe("Hội đua voi","10/01",1);
		ngayLeList.put(nl.ngay+"_"+nl.isAmLich, nl);
		nl = new NgayLe("Hội Lim","13/01",1);
		ngayLeList.put(nl.ngay+"_"+nl.isAmLich, nl);
		nl = new NgayLe("Hội chùa Tây Phương","06/03",1);
		ngayLeList.put(nl.ngay+"_"+nl.isAmLich, nl);
		nl = new NgayLe("Hội chùa Thầy","07/03",1);
		ngayLeList.put(nl.ngay+"_"+nl.isAmLich, nl);
		nl = new NgayLe("Hội Thánh Gióng","09/04",1);
		ngayLeList.put(nl.ngay+"_"+nl.isAmLich, nl);
		nl = new NgayLe("Hội bà chúa Xứ","26/04",1);
		ngayLeList.put(nl.ngay+"_"+nl.isAmLich, nl);
		nl = new NgayLe("Hội chọi trâu Đồ Sơn","09/08",1);
		ngayLeList.put(nl.ngay+"_"+nl.isAmLich, nl);
		nl = new NgayLe("Hội đền Kiếp Bạc","20/08",1);
		ngayLeList.put(nl.ngay+"_"+nl.isAmLich, nl);
		nl = new NgayLe("Tết hàn thực","03/03",1);
		ngayLeList.put(nl.ngay+"_"+nl.isAmLich, nl);
		nl = new NgayLe("Khai hội chùa Keo","13/09",1);
		ngayLeList.put(nl.ngay+"_"+nl.isAmLich, nl);
		nl = new NgayLe("Tết nguyên đán","01/01",1);
		ngayLeList.put(nl.ngay+"_"+nl.isAmLich, nl);

	}
	
	private NgayLeUnit() {
		// TODO Auto-generated constructor stub
		
	}
	
	public static NgayLe getNgayLe(double jd) {
		int[]  days = SunClass.jdToDate(jd);
		String day  = days[0]<10?"0"+days[0]:days[0]+"";
		String month  = days[1]<10?"0"+days[1]:days[1]+"";
		String keyDL = day+"/"+month+"_false";
		NgayLe nl = ngayLeList.get(keyDL);
		if(nl==null)
		{
			 days = SunClass.convertSolar2ArrLunar(days[0], days[1], days[2], 7);
			  day  = days[0]<10?"0"+days[0]:days[0]+"";
				 month  = days[1]<10?"0"+days[1]:days[1]+"";
			String	 keyAL = day+"/"+month+"_true";
				 nl = ngayLeList.get(keyAL);
			
		}
		return nl;
	}
	
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(2130, 10, 10);
		NgayLe danhNgon = NgayLeUnit.getNgayLe(SunClass.jdFromDate(17, 4, 2130));
		if(danhNgon!=null)
		System.out.println(danhNgon.le);
	}

}
