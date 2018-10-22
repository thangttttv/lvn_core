package com.lich.lvn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

public class SunClass {

	public SunClass() {
		// TODO Auto-generated constructor stub
	}

	public static int jdFromDate(int dd, int mm, int yy) {
		double a = Math.floor((14 - mm) / 12);
		double y = yy + 4800 - a;
		double m = mm + 12 * a - 3;
		double jd = dd + Math.floor((153 * m + 2) / 5) + 365 * y + Math.floor(y / 4) - Math.floor(y / 100)
				+ Math.floor(y / 400) - 32045;
		if (jd < 2299161) {
			jd = dd + Math.floor((153 * m + 2) / 5) + 365 * y + Math.floor(y / 4) - 32083;
		}
		System.out.println(jd);
		return (int) jd;
	}

	public static int[] jdToDate(double jd) {
		double c = 0, b = 0, a = 0;
		if (jd > 2299160) { // After 5/10/1582, Gregorian calendar
			a = jd + 32044;
			b = (int) Math.floor((4 * a + 3) / 146097);
			c = (int) (a - Math.floor((b * 146097) / 4));
		} else {
			b = 0;
			c = jd + 32082;
		}
		int d = (int) Math.floor((4 * c + 3) / 1461);
		int e = (int) (c - Math.floor((1461 * d) / 4));
		int m = (int) Math.floor((5 * e + 2) / 153);
		int day = (int) (e - Math.floor((153 * m + 2) / 5) + 1);
		int month = (int) (m + 3 - 12 * Math.floor(m / 10));
		int year = (int) (b * 100 + d - 4800 + Math.floor(m / 10));
		// echo "day = day, month = month, year = year\n";
		System.out.println("day = " + day + ", month = " + month + ", year = " + year + "\n");
		int kq[] = { day, month, year };
		return kq;
	}

	public static double getNewMoonDay(double k, double timeZone) {
		double T, T2, T3, dr, Jd1, M, Mpr, F, C1, deltat, JdNew;
		T = k / 1236.85; // Time in Julian centuries from 1900 January 0.5
		T2 = T * T;
		T3 = T2 * T;
		dr = Math.PI / 180;
		Jd1 = 2415020.75933 + 29.53058868 * k + 0.0001178 * T2 - 0.000000155 * T3;
		Jd1 = Jd1 + 0.00033 * Math.sin((166.56 + 132.87 * T - 0.009173 * T2) * dr); // Mean new moon
		M = 359.2242 + 29.10535608 * k - 0.0000333 * T2 - 0.00000347 * T3; // Sun"s mean anomaly
		Mpr = 306.0253 + 385.81691806 * k + 0.0107306 * T2 + 0.00001236 * T3; // Moon"s mean anomaly
		F = 21.2964 + 390.67050646 * k - 0.0016528 * T2 - 0.00000239 * T3; // Moon"s argument of latitude
		C1 = (0.1734 - 0.000393 * T) * Math.sin(M * dr) + 0.0021 * Math.sin(2 * dr * M);
		C1 = C1 - 0.4068 * Math.sin(Mpr * dr) + 0.0161 * Math.sin(dr * 2 * Mpr);
		C1 = C1 - 0.0004 * Math.sin(dr * 3 * Mpr);
		C1 = C1 + 0.0104 * Math.sin(dr * 2 * F) - 0.0051 * Math.sin(dr * (M + Mpr));
		C1 = C1 - 0.0074 * Math.sin(dr * (M - Mpr)) + 0.0004 * Math.sin(dr * (2 * F + M));
		C1 = C1 - 0.0004 * Math.sin(dr * (2 * F - M)) - 0.0006 * Math.sin(dr * (2 * F + Mpr));
		C1 = C1 + 0.0010 * Math.sin(dr * (2 * F - Mpr)) + 0.0005 * Math.sin(dr * (2 * Mpr + M));
		if (T < -11) {
			deltat = 0.001 + 0.000839 * T + 0.0002261 * T2 - 0.00000845 * T3 - 0.000000081 * T * T3;
		} else {
			deltat = -0.000278 + 0.000265 * T + 0.000262 * T2;
		}
		;
		JdNew = Jd1 + C1 - deltat;
		// echo "JdNew = JdNew\n";
		return Math.floor(JdNew + 0.5 + timeZone / 24);
	}

	public static double getSunLongitude(double jdn, int timeZone) {
		double T, T2, dr, M, L0, DL, L;
		T = (jdn - 2451545.5 - timeZone / 24) / 36525; // Time in Julian centuries from 2000-01-01 12:00:00 GMT
		T2 = T * T;
		dr = Math.PI / 180; // degree to radian
		M = 357.52910 + 35999.05030 * T - 0.0001559 * T2 - 0.00000048 * T * T2; // mean anomaly, degree
		L0 = 280.46645 + 36000.76983 * T + 0.0003032 * T2; // mean longitude, degree
		DL = (1.914600 - 0.004817 * T - 0.000014 * T2) * Math.sin(dr * M);
		DL = DL + (0.019993 - 0.000101 * T) * Math.sin(dr * 2 * M) + 0.000290 * Math.sin(dr * 3 * M);
		L = L0 + DL; // true longitude, degree
		// echo "\ndr =dr, M =M, T =T, DL =DL, L =L, L0 =L0\n";
		// obtain apparent longitude by correcting for nutation and aberration
		double omega = 125.04 - 1934.136 * T;
		L = L - 0.00569 - 0.00478 * Math.sin(omega * dr);
		L = L * dr;
		L = L - Math.PI * 2 * (Math.floor(L / (Math.PI * 2))); // Normalize to (0, 2*PI)
		return Math.floor(L / Math.PI * 6);
	}

	public static double getSunLongitude2(int jdn) {
		double T, T2, dr, M, L0, DL, lambda, theta, omega;
		T = (jdn - 2451545.0) / 36525; // Time in Julian centuries from 2000-01-01 12:00:00 GMT
		T2 = T * T;
		dr = Math.PI / 180; // degree to radian
		M = 357.52910 + 35999.05030 * T - 0.0001559 * T2 - 0.00000048 * T * T2; // mean anomaly, degree
		L0 = 280.46645 + 36000.76983 * T + 0.0003032 * T2; // mean longitude, degree
		DL = (1.914600 - 0.004817 * T - 0.000014 * T2) * Math.sin(dr * M);
		DL = DL + (0.019993 - 0.000101 * T) * Math.sin(dr * 2 * M) + 0.000290 * Math.sin(dr * 3 * M);
		theta = L0 + DL; // true longitude, degree
		// obtain apparent longitude by correcting for nutation and aberration
		omega = 125.04 - 1934.136 * T;
		lambda = theta - 0.00569 - 0.00478 * Math.sin(omega * dr);
		// Convert to radians
		lambda = lambda * dr;
		lambda = lambda - Math.PI * 2 * (Math.floor(lambda / (Math.PI * 2))); // Normalize to (0, 2*PI)
		return lambda;
	}

	public static double getLunarMonth11(int yy, int timeZone) {
		int off = jdFromDate(31, 12, yy) - 2415021;
		int k = (int) Math.floor(off / 29.530588853);
		double nm = getNewMoonDay(k, timeZone);
		double sunLong = getSunLongitude(nm, timeZone); // sun longitude at local midnight
		if (sunLong >= 9) {
			nm = getNewMoonDay(k - 1, timeZone);
		}
		return nm;
	}

	public static int getLeapMonthOffset(double a11, int timeZone) {
		int k = (int) Math.floor((a11 - 2415021.076998695) / 29.530588853 + 0.5);
		double last = 0;
		int i = 1; // We start with the month following lunar month 11
		double arc = getSunLongitude(getNewMoonDay(k + i, timeZone), timeZone);
		do {
			last = arc;
			i = i + 1;
			arc = getSunLongitude(getNewMoonDay(k + i, timeZone), timeZone);
		} while (arc != last && i < 14);
		return i - 1;
	}

	/**
	 * Kiểm tra xem năm dương có nhuận không?
	 * 
	 * @param null yyyy
	 * @return string
	 */
	public static String isSolarYearLeap(int yyyy) {
		if (yyyy % 4 == 0 || (yyyy % 100 == 0 && yyyy % 400 == 0)) {
			return "Năm dương nhuận";
		} else {
			return "Năm dương không nhuận";
		}
	}

	/**
	 * Kiểm tra xem năm âm tương ứng có nhuận không?
	 * 
	 * @param null yyyy
	 * @return string
	 */
	public static String isLunarYearLeap(int yyyy) {
		int arr[] = { 0, 3, 6, 9, 11, 14, 17 };
		int leap = yyyy % 19;
		if (Arrays.asList(arr).contains(leap)) {
			return "Năm âm nhuận";
		} else {
			return "Năm âm không nhuận";
		}
	}

	public static String getDayName(String key) {
		Map<String, String> arr = new HashMap<>();
		arr.put("Sunday", "Chủ nhật");
		arr.put("Monday", "Thứ 2");
		arr.put("Tuesday", "Thứ 3");
		arr.put("Wednesday", "Thứ 4");
		arr.put("Thursday", "Thứ 5");
		arr.put("Friday", "Thứ 6");
		arr.put("Saturday", "Thứ 7");
		
		arr.put("Sun", "Chủ nhật");
		arr.put("Mon", "Thứ 2");
		arr.put("Tue", "Thứ 3");
		arr.put("Wed", "Thứ 4");
		arr.put("Thu", "Thứ 5");
		arr.put("Fri", "Thứ 6");
		arr.put("Sat", "Thứ 7");

		if (arr.containsKey(key)) {
			return arr.get(key);
		} else {
			return "";
		}
	}

	public static String getMonthName(int month) {
		String arr2[] = { "Tháng Giêng", "Tháng Hai", "Tháng Ba", "Tháng Tư", "Tháng Năm", "Tháng Sáu", "Tháng Bảy",
				"Tháng Tám", "Tháng Chín", "Tháng Mười", "Tháng Mười Một", "Tháng Chạp" };
		return arr2[month];
	}

	public static String[] getListCan() {
		String arr2[] = { "Giáp", "Ất", "Bính", "Đinh", "Mậu", "Kỷ", "Canh", "Tân", "Nhâm", "Quí" };
		return arr2;
	}

	public static String[] getListChi() {
		String arr2[] = { "Tý", "Sửu", "Dần", "Mão", "Thìn", "Tỵ", "Ngọ", "Mùi", "Thân", "Dậu", "Tuất", "Hợi" };
		return arr2;
	}

	public static String getCanChiNam(int nam) {
		String arrCan[] = getListCan();
		String arrChi[] = getListChi();
		int can = (nam + 6) % 10;
		int chi = (nam + 8) % 12;
		return arrCan[can] + " " + arrChi[chi];
	}

	public static String getCanChiThang(int nam, int thang) {
		String arrCan[] = getListCan();
		String arrChi[] = getListChi();
		int can = (nam * 12 + thang + 3) % 10;
		int chi = (thang + 1) % 12;
		String canchithang = arrCan[can] + " " + arrChi[chi];
		return canchithang;
	}

	public static String getCanChiNgay(int jd) {
		String arrCan[] = getListCan();
		String arrChi[] = getListChi();
		int can = (jd + 9) % 10;
		int chi = (jd + 1) % 12;
		String canchingay = arrCan[can] + " " + arrChi[chi];
		return canchingay;
	}
	
	public static String getChiNgay(int jd) {
		String arrChi[] = getListChi();
		int chi = (jd + 1) % 12;
		String chingay = arrChi[chi];
		return chingay;
	}
	
	public static String getCanNgay(int jd) {
		String arrChi[] = getListCan();
		int can = (jd + 9) % 10;
		String chingay = arrChi[can];
		return chingay;
	}


	public static String getCanChiGio(int jd) {
		String arrCan[] = getListCan();
		String arrChi[] = getListChi();
		int can = (jd - 1) * 2 % 10;
		String canchigio = arrCan[can] + " " + arrChi[0];
		return canchigio;
	}

	public static String getTietKhi(int jd) {
		String arr[] = { "Xuân phân", "Thanh minh", "Cốc vũ", "Lập hạ", "Tiểu mãn", "Mang chủng", "Hạ chí", "Tiểu thử",
				"Đại thử", "Lập thu", "Xử thử", "Bạch lộ", "Thu phân", "Hàn lộ", "Sương giáng", "Lập đông",
				"Tiểu tuyết", "Đại tuyết", "Đông chí", "Tiểu hàn", "Đại hàn", "Lập xuân", "Vũ thủy", "Kinh trập" };
		int tietkhi = (int) Math.floor(getSunLongitude2((int) (jd + 1 - 0.5 - 7.0 / 24.0)) / Math.PI * 12);
		return arr[tietkhi];
	}

	public static String getHoangDao(int id) {
		String arr[] = { "110100101100", "001101001011", "110011010010", "101100110100", "001011001101",
				"010010110011" };
		return arr[id];
	}

	public static String getGioHoangDao(int jd) {
		double chiOfDay = (jd + 1) % 12;
		String gioHD = getHoangDao((int) (chiOfDay % 6)); // same values for Ty" (1) and Ngo. (6), for Suu and Mui etc.
		String ret = "";
		int count = 0;
		int i = 0;
		for (i = 0; i < 12; i++) {
			String s = gioHD.substring(i, i + 1); // substr(gioHD, i, 1);
			if ("1".equals(s)) {
				ret = ret + getListChi()[i];
				ret = ret + " (" + ((i * 2 + 23) % 24) + "-" + ((i * 2 + 1) % 24) + ")";
				if (count++ < 5)
					ret += ", ";
				// if (count == 3) ret += "\n";
			}
		}
		return ret;
	}
	
	public static String getGioHacDao(int jd) {
		String chi = getChiNgay(jd);
		String hHacDao  = "";
		switch (chi) {
		case "Tý":
			hHacDao = "Dần (3-5), Thìn (7-9), Tỵ (9-11), Mùi (13-15), Tuất (19-21), Hợi (21-23)";
			break;
		case "Ngọ":
			hHacDao = "Dần (3-5), Thìn (7-9), Tỵ (9-11), Mùi (13-15), Tuất (19-21), Hợi (21-23)";
			break;
		case "Sửu":
			hHacDao = "Tý (23-1), Sửu (1-3), Thìn (7-9), Ngọ (11-13), Mùi (13-15), Dậu (17-19)";
			break;
		case "Mùi":
			hHacDao = "Tý (23-1), Sửu (1-3), Thìn (7-9), Ngọ (11-13), Mùi (13-15), Dậu (17-19)";
			break;
		case "Dần":
			hHacDao = "Dần (3-5), Mão (5-7), Ngọ (11-13), Thân (15-17), Dậu (17-19)";
			break;
		case "Thân":
			hHacDao = "Dần (3-5), Mão (5-7), Ngọ (11-13), Thân (15-17), Dậu (17-19)";
			break;
		case "Mão":
			hHacDao = "Sửu (1-3), Thìn (7-9), Tỵ (9-11), Thân (15-17), Tuất (19-21), Hợi (21-23)";
			break;
		case "Dậu":
			hHacDao = "Sửu (1-3), Thìn (7-9), Tỵ (9-11), Thân (15-17), Tuất (19-21), Hợi (21-23)";
			break;
		case "Thìn":
			hHacDao = "Tý (23-1), Sửu (1-3), Mão (5-7), Ngọ (11-13), Mùi (13-15), Tuất (19-21)";
			break;
		case "Tuất":
			hHacDao = "Tý (23-1), Sửu (1-3), Mão (5-7), Ngọ (11-13), Mùi (13-15), Tuất (19-21)";
			break;
		case "Tỵ":
			hHacDao = "Tý (23-1), Dần (3-5), Mão (5-7), Tỵ (9-11), Thân (15-17), Dậu (17-19)";
			break;
		case "Hợi":
			hHacDao = "Tý (23-1), Dần (3-5), Mão (5-7), Tỵ (9-11), Thân (15-17), Dậu (17-19)";
			break;
		default:
			break;
		}
		
		return hHacDao;
	}

	public static String getSuKienNam(int da, int ma) {
		Map<String, String> mEvent = new HashMap<>();
		mEvent.put("1_1", "Tết Nguyên Đán");
		mEvent.put("15_1", "Rằm Tháng Giêng");
		mEvent.put("10_3", "Giỗ Tổ Hùng Vương");
		mEvent.put("15_4", "Lễ Phật Đản");
		mEvent.put("5_5", "Tết Đoan Ngọ");
		mEvent.put("15_7", "Lễ Vu Lan");
		mEvent.put("15_8", "Tết Trung Thu");
		mEvent.put("23_12", "Ông Táo chầu trời");
		String key = da + "_" + ma;
		if (mEvent.containsKey(da + "_" + ma)) {
			return mEvent.get(key);
		} else {
			return "Ngày thường";
		}
	}

	private static String getDateSunInfo(int dd, int mm, int yy) {
		// date_sun_info(strtotime(yy . "-" . mm . "-" . dd), 21.03, 105.85);
		return "";
	}

	private static String getNewMoon(int dd, int mm, int yy) {
		int k = (int) Math.floor((jdFromDate(dd, mm, yy) - 2415021) / 29.530588853);
		double j = getNewMoonDay(k, 7);
		int arrDate[] = jdToDate(j);
		Calendar calendar = Calendar.getInstance();
		calendar.set(arrDate[2], arrDate[1] - 1, arrDate[0] - 1, 0, 0);
		// int preDate = mktime(0, 0, 0, arrDate[1], arrDate[0] - 1, arrDate[2]);
		String sDate = calendar.get(Calendar.DAY_OF_MONTH) + "/" + calendar.get(Calendar.MONTH) + "/"
				+ calendar.get(Calendar.YEAR);
		return sDate;
	}

	/* timestamp: second jon not mili second */

	private static String getEndOfMoon(long timestamp) {
		System.out.println("getEndOfMoon: timestamp-->" + timestamp + "");
		// timestamp = 1538438400;
		// timestamp = timestamp/1000;
		// date.
		double synmonth = 29.53058868;
		double arrPhase[] = phasehunt(timestamp, synmonth);
		double next_new_moon = arrPhase[4];
		System.out.println("getEndOfMoon: next_new_moon" + next_new_moon + "");
		Date date = new Date((long) next_new_moon * 1000 - (24 * 60 * 60 * 1000));
		// mktime(0, 0, 0, date("m", next_new_moon), date("d", next_new_moon) - 1,
		// date("Y", next_new_moon));

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");

		long preDate = date.getTime();
		System.out.println("getEndOfMoon: preDate" + preDate + "");

		simpleDateFormat = new SimpleDateFormat("dd");
		String d = simpleDateFormat.format(date);
		simpleDateFormat = new SimpleDateFormat("MM");
		String MM = simpleDateFormat.format(date);
		simpleDateFormat = new SimpleDateFormat("yyyy");
		String yyyy = simpleDateFormat.format(date);
		preDate = convertSolar2Lunar(Integer.parseInt(d), Integer.parseInt(MM), Integer.parseInt(yyyy), 7);
		if (preDate > 0) {
			date = new Date((long) preDate);
			simpleDateFormat = new SimpleDateFormat("dd");
			System.out.println("getEndOfMoon: kq" + simpleDateFormat.format(date) + "");
			return simpleDateFormat.format(date);
		} else {
			return null;
		}
	}

	/* Comvert solar date dd/mm/yyyy to the corresponding lunar date */
	public static Map<String, String> getArrayDateInfo(int dd, int mm, int yy, int timeZone) {
		Map<String, String> reMap = new HashMap<>();

		int dayNumber = jdFromDate(dd, mm, yy);
		int k = (int) Math.floor((dayNumber - 2415021.076998695) / 29.530588853);
		double monthStart = getNewMoonDay(k + 1, timeZone);
		if (monthStart > dayNumber) {
			monthStart = getNewMoonDay(k, timeZone);
		}
		double a11 = getLunarMonth11(yy, timeZone);
		double b11 = a11;
		int lunarYear = 0;
		if (a11 >= monthStart) {
			lunarYear = yy;
			a11 = getLunarMonth11(yy - 1, timeZone);
		} else {
			lunarYear = yy + 1;
			b11 = getLunarMonth11(yy + 1, timeZone);
		}
		int lunarDay = (int) (dayNumber - monthStart + 1);
		int diff = (int) Math.floor((monthStart - a11) / 29);
		int lunarLeap = 0;
		int lunarMonth = diff + 11;
		int leapMonthDiff;
		if (b11 - a11 > 365) {
			leapMonthDiff = getLeapMonthOffset(a11, timeZone);
			if (diff >= leapMonthDiff) {
				lunarMonth = diff + 10;
				if (diff == leapMonthDiff) {
					lunarLeap = 1;
				}
			}
		}
		if (lunarMonth > 12) {
			lunarMonth = lunarMonth - 12;
		}
		if (lunarMonth >= 11 && diff < 4) {
			lunarYear -= 1;
		}

		//
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
		Date date;
		try {

			date = simpleDateFormat.parse(yy + "-" + mm + "-" + dd);
			long intDate = date.getTime();
			String dateSunInfo = getDateSunInfo(dd, mm, yy);
			String nhuan = (lunarLeap == 1) ? "Nhuận" : "Không";
			String tenthang = (getEndOfMoon(intDate / 1000) == "30" ? "Đủ" : "Thiếu");
			Map<String, Long> moon = getMoonTimes(dd, mm, yy, 21.03, 105.85);

			reMap.put("input_duong", simpleDateFormat.format(date));
			reMap.put("output_am", lunarYear + "-" + lunarMonth + "-" + lunarDay);
			simpleDateFormat = new SimpleDateFormat("E");
			reMap.put("thu_en", simpleDateFormat.format(date));
			reMap.put("thu_vi", getDayName(simpleDateFormat.format(date)));
			reMap.put("thang_am", getMonthName(lunarMonth - 1));
			reMap.put("thang_am_nhuan", nhuan);
			reMap.put("thang_am_du_thieu", tenthang);
			reMap.put("nam_duong_nhuan", isSolarYearLeap(yy));
			reMap.put("nam_am_nhuan", getCanChiNam(lunarYear));
			reMap.put("can_chi_nam", getCanChiNam(lunarYear));
			reMap.put("can_chi_thang", getCanChiThang(lunarYear, lunarMonth));
			reMap.put("can_chi_ngay", getCanChiNgay(jdFromDate(dd, mm, yy)));
			reMap.put("can_chi_gio", getCanChiGio(jdFromDate(dd, mm, yy)));
			reMap.put("tiet_khi", getTietKhi(jdFromDate(dd, mm, yy)));
			reMap.put("day_info", getSuKienNam((int) lunarDay, lunarMonth));
			reMap.put("hoang_dao", getGioHoangDao(jdFromDate(dd, mm, yy)));
			reMap.put("hac_dao", getGioHacDao(jdFromDate(dd, mm, yy)));
			
			reMap.put("sun_sunrise", "");
			reMap.put("sun_transit", "");
			reMap.put("sun_sunset", "");
			reMap.put("sun_length", "");

			reMap.put("moonrise", moon.get("moonrise") + "");
			reMap.put("moonset", moon.get("moonset") + "");
			reMap.put("moon_lenght", "");
			reMap.put("moon_phase", "");

			
			//reMap.put("moon_cycle", json);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return reMap;

	}

	public static long convertSolar2Lunar(int dd, int mm, int yy, int timeZone) {
		int dayNumber = jdFromDate(dd, mm, yy);
		int k = (int) Math.floor((dayNumber - 2415021.076998695) / 29.530588853);
		double monthStart = getNewMoonDay(k + 1, timeZone);
		if (monthStart > dayNumber) {
			monthStart = getNewMoonDay(k, timeZone);
		}
		double a11 = getLunarMonth11(yy, timeZone);
		double b11 = a11;
		int lunarYear = 0;
		if (a11 >= monthStart) {
			lunarYear = yy;
			a11 = getLunarMonth11(yy - 1, timeZone);
		} else {
			lunarYear = yy + 1;
			b11 = getLunarMonth11(yy + 1, timeZone);
		}
		System.out.println("dayNumber:" + dayNumber);
		System.out.println("monthStart:" + monthStart);
		int lunarDay = (int) (dayNumber - monthStart + 1);
		int diff = (int) Math.floor((monthStart - a11) / 29);
		int lunarLeap = 0;
		int lunarMonth = diff + 11;
		if (b11 - a11 > 365) {
			int leapMonthDiff = getLeapMonthOffset(a11, timeZone);
			if (diff >= leapMonthDiff) {
				lunarMonth = diff + 10;
				if (diff == leapMonthDiff) {
					lunarLeap = 1;
				}
			}
		}
		if (lunarMonth > 12) {
			lunarMonth = lunarMonth - 12;
		}
		if (lunarMonth >= 11 && diff < 4) {
			lunarYear -= 1;
		}

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			System.out.println(lunarYear + "-" + lunarMonth + "-" + lunarDay);
			date = simpleDateFormat.parse(lunarYear + "-" + lunarMonth + "-" + lunarDay);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return date.getTime();
	}

	
	public static String chuyenDuongLichAmLich(int dd, int mm, int yy, int timeZone) {
		int dayNumber = jdFromDate(dd, mm, yy);
		int k = (int) Math.floor((dayNumber - 2415021.076998695) / 29.530588853);
		double monthStart = getNewMoonDay(k + 1, timeZone);
		if (monthStart > dayNumber) {
			monthStart = getNewMoonDay(k, timeZone);
		}
		double a11 = getLunarMonth11(yy, timeZone);
		int lunarYear = 0;
		if (a11 >= monthStart) {
			lunarYear = yy;
			a11 = getLunarMonth11(yy - 1, timeZone);
		} else {
			lunarYear = yy + 1;
		}
		System.out.println("dayNumber:" + dayNumber);
		System.out.println("monthStart:" + monthStart);
		int lunarDay = (int) (dayNumber - monthStart + 1);
		int diff = (int) Math.floor((monthStart - a11) / 29);
		int lunarMonth = diff + 11;
		if (lunarMonth > 12) {
			lunarMonth = lunarMonth - 12;
		}
		if (lunarMonth >= 11 && diff < 4) {
			lunarYear -= 1;
		}

		return lunarYear + "-" + lunarMonth + "-" + lunarDay;
	}
	/* Convert a lunar date to the corresponding solar date */
	public static int[] convertLunar2Solar(int lunarDay, int lunarMonth, int lunarYear, int lunarLeap, int timeZone) {
		double a11, b11, k;
		if (lunarMonth < 11) {
			a11 = getLunarMonth11(lunarYear - 1, timeZone);
			b11 = getLunarMonth11(lunarYear, timeZone);
		} else {
			a11 = getLunarMonth11(lunarYear, timeZone);
			b11 = getLunarMonth11(lunarYear + 1, timeZone);
		}
		k = (int) Math.floor(0.5 + (a11 - 2415021.076998695) / 29.530588853);
		int off = lunarMonth - 11;
		if (off < 0) {
			off += 12;
		}
		if (b11 - a11 > 365) {
			int leapOff = getLeapMonthOffset(a11, timeZone);
			int leapMonth = leapOff - 2;
			if (leapMonth < 0) {
				leapMonth += 12;
			}
			if (lunarLeap != 0 && lunarMonth != leapMonth) {
				int kq[] = { 0, 0, 0 };
				return kq;
			} else if (lunarLeap != 0 || off >= leapOff) {
				off += 1;
			}
		}
		int monthStart = (int) getNewMoonDay(k + off, timeZone);
		return jdToDate(monthStart + lunarDay - 1);
	}

	/// --------------------------------------------- THE MOON INFO
	/// -----------------------------------------------------
	/**
	 * Calculates the moon rise/set for a given location and day of year
	 */
	public static Map<String, Long> getMoonTimes(int day, int month, int year, double lat, double lon) {
		double utrise = 0, utset = 0;
		int timezone = (int) (lon / 15);
		int date = modifiedJulianDate(month, day, year);
		date -= timezone / 24;
		double latRad = deg2rad(lat);
		double sinho = 0.0023271056;
		double sglat = Math.sin(latRad);
		double cglat = Math.cos(latRad);

		boolean rise = false;
		boolean set = false;
		boolean above = false;
		int hour = 1;
		double ym = sinAlt(date, hour - 1, lon, cglat, sglat) - sinho;

		above = ym > 0;
		while (hour < 25 && (false == set || false == rise)) {
			double yz = sinAlt(date, hour, lon, cglat, sglat) - sinho;
			double yp = sinAlt(date, hour + 1, lon, cglat, sglat) - sinho;

			double quadout[] = quad(ym, yz, yp);
			double nz = quadout[0];
			double z1 = quadout[1];
			double z2 = quadout[2];
			double xe = quadout[3];
			double ye = quadout[4];

			if (nz == 1) {
				if (ym < 0) {
					utrise = hour + z1;
					rise = true;
				} else {
					utset = hour + z1;
					set = true;
				}
			}

			if (nz == 2) {
				if (ye < 0) {
					utrise = hour + z2;
					utset = hour + z1;
				} else {
					utrise = hour + z1;
					utset = hour + z2;
				}
			}

			ym = yp;
			hour += 2.0;
		}
		// Convert to unix timestamps and return as an array
		Map<String, Integer> mutrise = convertTime(utrise);
		Map<String, Integer> mutset = convertTime(utset);
		Calendar calendar1 = Calendar.getInstance();
		calendar1.set(year, month, day, mutrise.get("hrs"), mutrise.get("min"));

		Calendar calendar2 = Calendar.getInstance();
		calendar2.set(year, month, day + 1, 0, 0);

		long moonrise = rise ? calendar1.getTimeInMillis() / 1000 : calendar2.getTimeInMillis() / 1000;

		calendar1.set(year, month, day, mutset.get("hrs"), mutset.get("min"));
		calendar2.set(year, month, day + 1, 0, 0);
		long moonset = set ? calendar1.getTimeInMillis() / 1000 : calendar2.getTimeInMillis() / 1000;
		Map<String, Long> retVal = new HashMap<>();
		retVal.put("moonrise", moonrise);
		retVal.put("moonset", moonset);

		return retVal;
	}

	/**
	 * Converts an hours decimal to hours and minutes
	 */
	private static Map<String, Integer> convertTime(double hours) {
		int hrs = (int) ((int) (hours * 60 + 0.5) / 60.0);
		int h = (int) (hrs);
		int m = (int) (60 * (hrs - h) + 0.5);
		Map<String, Integer> kq = new HashMap<>();
		kq.put("hrs", h);
		kq.put("min", m);
		return kq;
	}

	/**
	 * Takes the day, month, year and hours in the day and returns the modified
	 * julian day number defined as mjd = jd - 2400000.5 checked OK for Greg era
	 * dates - 26th Dec 02
	 */
	private static int modifiedJulianDate(int month, int day, int year) {
		int a, b;
		if (month <= 2) {
			month += 12;
			year--;
		}

		a = 10000 * year + 100 * month + day;
		b = 0;
		if (a <= 15821004.1) {
			b = -2 * (int) ((year + 4716) / 4) - 1179;
		} else {
			b = (int) (year / 400) - (int) (year / 100) + (int) (year / 4);
		}

		a = 365 * year - 679004;
		return a + b + (int) (30.6001 * (month + 1)) + day;
	}

	/**
	 * finds the parabola throuh the three points (-1,ym), (0,yz), (1, yp) and
	 * returns the coordinates of the max/min (if any) xe, ye the values of x where
	 * the parabola crosses zero (roots of the quadratic) and the number of roots
	 * (0, 1 or 2) within the interval [-1, 1]
	 *
	 * well, this routine is producing sensible answers
	 *
	 * results passed as array [nz, z1, z2, xe, ye]
	 */
	private static double[] quad(double ym, double yz, double yp) {
		double z2 = 0, z1 = 0, nz = 0, dx;
		double a = 0.5 * (ym + yp) - yz;
		double b = 0.5 * (yp - ym);
		double c = yz;
		double xe = -b / (2 * a);
		double ye = (a * xe + b) * xe + c;
		double dis = b * b - 4 * a * c;
		if (dis > 0) {
			dx = 0.5 * Math.sqrt(dis) / Math.abs(a);
			z1 = xe - dx;
			z2 = xe + dx;
			nz = Math.abs(z1) < 1 ? nz + 1 : nz;
			nz = Math.abs(z2) < 1 ? nz + 1 : nz;
			z1 = z1 < -1 ? z2 : z1;
		}
		double kq[] = { nz, z1, z2, xe, ye };
		return kq;
	}

	/**
	 * this rather mickey mouse function takes a lot of arguments and then returns
	 * the sine of the altitude of the moon
	 */
	private static double sinAlt(double mjd, double hour, double glon, double cglat, double sglat) {
		double t, ra, dec, decRad, tau;
		mjd += hour / 24;
		t = (mjd - 51544.5) / 36525;
		double objpos[] = minimoon(t);

		ra = objpos[1];
		dec = objpos[0];
		decRad = deg2rad(dec);
		tau = 15 * (lmst(mjd, glon) - ra);

		return sglat * Math.sin(decRad) + cglat * Math.cos(decRad) * Math.cos(deg2rad(tau));
	}

	private static double deg2rad(double deg) {
		return (deg * Math.PI / 180.0);
	}

	/* ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::: */
	/* :: This function converts radians to decimal degrees : */
	/* ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::: */
	private static double rad2deg(double rad) {
		return (rad * 180 / Math.PI);
	}

	/**
	 * returns an angle in degrees in the range 0 to 360
	 */
	private static double degRange(double x) {
		double a, b, retVal;
		b = x / 360;
		a = 360 * (b - (int) b);
		retVal = a < 0 ? a + 360 : a;
		return retVal;
	}

	private static double lmst(double mjd, double glon) {
		double d, t, lst;
		d = mjd - 51544.5;
		t = d / 36525;
		lst = degRange(280.46061839 + 360.98564736629 * d + 0.000387933 * t * t - t * t * t / 38710000);
		return lst / 15 + glon / 15;
	}

	/**
	 * takes t and returns the geocentric ra and dec in an array mooneq claimed good
	 * to 5' (angle) in ra and 1' in dec tallies with another approximate method and
	 * with ICE for a couple of dates
	 */
	private static double[] minimoon(double t) {
		double p2, arc, coseps, sineps, lo, l, l2, ls, d, d2, f, f2, sinf2, sinls, dl, s, h, n, x, y;
		p2 = 6.283185307;
		arc = 206264.8062;
		coseps = 0.91748;
		sineps = 0.39778;

		lo = frac(0.606433 + 1336.855225 * t);
		l = p2 * frac(0.374897 + 1325.552410 * t);
		l2 = l * 2;
		ls = p2 * frac(0.993133 + 99.997361 * t);
		d = p2 * frac(0.827361 + 1236.853086 * t);
		d2 = d * 2;
		f = p2 * frac(0.259086 + 1342.227825 * t);
		f2 = f * 2;

		sinls = Math.sin(ls);
		sinf2 = Math.sin(f2);

		dl = 22640 * Math.sin(l);
		dl += -4586 * Math.sin(l - d2);
		dl += 2370 * Math.sin(d2);
		dl += 769 * Math.sin(l2);
		dl += -668 * sinls;
		dl += -412 * sinf2;
		dl += -212 * Math.sin(l2 - d2);
		dl += -206 * Math.sin(l + ls - d2);
		dl += 192 * Math.sin(l + d2);
		dl += -165 * Math.sin(ls - d2);
		dl += -125 * Math.sin(d);
		dl += -110 * Math.sin(l + ls);
		dl += 148 * Math.sin(l - ls);
		dl += -55 * Math.sin(f2 - d2);

		s = f + (dl + 412 * sinf2 + 541 * sinls) / arc;
		h = f - d2;
		n = -526 * Math.sin(h);
		n += 44 * Math.sin(l + h);
		n += -31 * Math.sin(-l + h);
		n += -23 * Math.sin(ls + h);
		n += 11 * Math.sin(-ls + h);
		n += -25 * Math.sin(-l2 + f);
		n += 21 * Math.sin(-l + f);

		double L_moon, B_moon, cb, rho, dec, ra, w, z, v;

		L_moon = p2 * frac(lo + dl / 1296000);
		B_moon = (18520.0 * Math.sin(s) + n) / arc;

		cb = Math.cos(B_moon);
		x = cb * Math.cos(L_moon);
		v = cb * Math.sin(L_moon);
		w = Math.sin(B_moon);
		y = coseps * v - sineps * w;
		z = sineps * v + coseps * w;
		rho = Math.sqrt(1 - z * z);
		dec = (360 / p2) * Math.atan(z / rho);
		ra = (48 / p2) * Math.atan(y / (x + rho));
		ra = ra < 0 ? ra + 24 : ra;
		double kq[] = { dec, ra };
		return kq;
	}

	/**
	 * returns the fractional part of x as used in minimoon and minisun
	 */
	private static int frac(double x) {
		x -= (int) x;
		return (int) (x < 0 ? x + 1 : x);
	}

	private static String getMoonPhase(int day, int month, int year) {
		double days_y, days_m;
		int phase, julian;
		if (month < 4) {
			year = year - 1;
			month = month + 12;
		}
		days_y = 365.25 * year;
		days_m = 30.42 * month;
		julian = (int) (days_y + days_m + day - 694039.09);
		julian = (int) (julian / 29.53);
		phase = julian;
		julian = julian - phase;
		phase = (int) Math.round(julian * 8 + 0.5);
		if (phase == 8) {
			phase = 0;
		}
		// phase_array = array('new', 'waxing crescent', 'first quarter', 'waxing
		// gibbous', 'full', 'waning gibbous', 'last quarter', 'waning crescent');
		String phase_array[] = { "Trăng mới", "Trăng lưỡi liềm đầu tháng", "Trăng bán nguyệt đầu tháng",
				"Trăng khuyết đầu tháng", "Trăng tròn", "Trăng khuyết cuối tháng", "Trăng bán nguyệt cuối tháng",
				"Trăng lưỡi liềm cuối tháng" };
		return phase_array[phase];
	}

	// --------------------------------------------- THE MOON INFO
	// -----------------------------------------------------
	public static Map<String, String> getMoonCycle(long pdate) {
		if (pdate == 0) {
			Calendar calendar = Calendar.getInstance();
			pdate = calendar.getTimeInMillis() / 1000;
		}

		/* Astronomical constants */
		double epoch = 2444238.5; // 1980 January 0.0

		/* Constants defining the Sun's apparent orbit */
		double elonge = 278.833540; // Ecliptic longitude of the Sun at epoch 1980.0
		double elongp = 282.596403; // Ecliptic longitude of the Sun at perigee
		double eccent = 0.016718; // Eccentricity of Earth's orbit
		double sunsmax = 1.495985e8; // Semi-major axis of Earth's orbit, km
		double sunangsiz = 0.533128; // Sun's angular size, degrees, at semi-major axis distance

		/* Elements of the Moon's orbit, epoch 1980.0 */
		double mmlong = 64.975464; // Moon's mean longitude at the epoch
		double mmlongp = 349.383063; // Mean longitude of the perigee at the epoch
		double mlnode = 151.950429; // Mean longitude of the node at the epoch
		double minc = 5.145396; // Inclination of the Moon's orbit
		double mecc = 0.054900; // Eccentricity of the Moon's orbit
		double mangsiz = 0.5181; // Moon's angular size at distance a from Earth
		double msmax = 384401; // Semi-major axis of Moon's orbit in km
		double mparallax = 0.9507; // Parallax at distance a from Earth
		double synmonth = 29.53058868; // Synodic month (new Moon to new Moon)
		double lunatbase = 2423436.0; // Base date for E. W. Brown's numbered series of lunations (1923 January 16)

		/* Properties of the Earth */
		// earthrad = 6378.16; // Radius of Earth in kilometres
		// PI = 3.14159265358979323846; // Assume not near black hole

		long timestamp = pdate;
		// pdate is coming in as a UNIX timstamp, so convert it to Julian
		pdate = (long) (pdate / 86400 + 2440587.5);

		/* Calculation of the Sun's position */
		double Day = pdate - epoch; // Date within epoch
		double N = fixangle((360 / 365.2422) * Day); // Mean anomaly of the Sun
		double M = fixangle(N + elonge - elongp); // Convert from perigee co-ordinates to epoch 1980.0
		double Ec = kepler(M, eccent); // Solve equation of Kepler
		Ec = Math.sqrt((1 + eccent) / (1 - eccent)) * (Ec / 2);
		Ec = 2 * rad2deg(Math.atan(Ec)); // True anomaly
		double Lambdasun = fixangle(Ec + elongp); // Sun's geocentric ecliptic longitude

		double F = ((1 + eccent * Math.cos(deg2rad(Ec))) / (1 - eccent * eccent)); // Orbital distance factor
		double SunDist = sunsmax / F; // Distance to Sun in km
		double SunAng = F * sunangsiz; // Sun's angular size in degrees

		/* Calculation of the Moon's position */
		double ml = fixangle(13.1763966 * Day + mmlong); // Moon's mean longitude
		double MM = fixangle(ml - 0.1114041 * Day - mmlongp); // Moon's mean anomaly
		double MN = fixangle(mlnode - 0.0529539 * Day); // Moon's ascending node mean longitude
		double Ev = 1.2739 * Math.sin(deg2rad(2 * (ml - Lambdasun) - MM)); // Evection
		double Ae = 0.1858 * Math.sin(deg2rad(M)); // Annual equation
		double A3 = 0.37 * Math.sin(deg2rad(M)); // Correction term
		double MmP = MM + Ev - Ae - A3; // Corrected anomaly
		double mEc = 6.2886 * Math.sin(deg2rad(MmP)); // Correction for the equation of the centre
		double A4 = 0.214 * Math.sin(deg2rad(2 * MmP)); // Another correction term
		double lP = ml + Ev + mEc - Ae + A4; // Corrected longitude
		double V = 0.6583 * Math.sin(deg2rad(2 * (lP - Lambdasun))); // Variation
		double lPP = lP + V; // True longitude
		double NP = MN - 0.16 * Math.sin(deg2rad(M)); // Corrected longitude of the node
		double y = Math.sin(deg2rad(lPP - NP)) * Math.cos(deg2rad(minc)); // Y inclination coordinate
		double x = Math.cos(deg2rad(lPP - NP)); // X inclination coordinate

		double Lambdamoon = rad2deg(Math.atan2(y, x)) + NP; // Ecliptic longitude
		double BetaM = rad2deg(Math.asin(Math.sin(deg2rad(lPP - NP)) * Math.sin(deg2rad(minc)))); // Ecliptic latitude

		/* Calculation of the phase of the Moon */
		double MoonAge = lPP - Lambdasun; // Age of the Moon in degrees
		double MoonPhase = (1 - Math.cos(deg2rad(MoonAge))) / 2; // Phase of the Moon

		// Distance of moon from the centre of the Earth
		double MoonDist = (msmax * (1 - mecc * mecc)) / (1 + mecc * Math.cos(deg2rad(MmP + mEc)));

		double MoonDFrac = MoonDist / msmax;
		double MoonAng = mangsiz / MoonDFrac; // Moon's angular diameter
		// MoonPar = mparallax / MoonDFrac; // Moon's parallax

		// store results
		double phase = fixangle(MoonAge) / 360;
		Map<String, String> result = new HashMap<>();
		result.put("illum_percent", (double) (Math.round(MoonPhase * 100) / 100) + "");
		result.put("age", synmonth * phase + "");
		result.put("dist", MoonDist + "");
		result.put("sundist", SunDist + "");
		result.put("new_moon", get_phase(0, timestamp, synmonth) + "");
		result.put("first_quarter", get_phase(1, timestamp, synmonth) + "");
		result.put("full_moon", get_phase(2, timestamp, synmonth) + "");
		result.put("last_quarter", get_phase(3, timestamp, synmonth) + "");
		result.put("next_new_moon", get_phase(4, timestamp, synmonth) + "");
		result.put("next_first_quarter", get_phase(5, timestamp, synmonth) + "");
		result.put("next_full_moon", get_phase(6, timestamp, synmonth) + "");
		result.put("next_last_quarter", get_phase(7, timestamp, synmonth) + "");

		return result;
	}

	private static double fixangle(double a) {
		return (a - 360 * Math.floor(a / 360));
	}

	// KEPLER -- Solve the equation of Kepler.
	private static double kepler(double m, double ecc) {
		double epsilon = 0.000001; // 1E-6
		double e = m = deg2rad(m);
		double delta = 0;
		do {
			delta = e - ecc * Math.sin(e) - m;
			e -= delta / (1 - ecc * Math.cos(e));
		} while (Math.abs(delta) > epsilon);
		return e;
	}

	/*
	 * Calculates time of the mean new Moon for a given base date. This argument K
	 * to this function is the precomputed synodic month index, given by: K = (year
	 * - 1900) * 12.3685 where year is expressed as a year and fractional year.
	 */
	private static double meanphase(double sdate, double k, double synmonth) {
		// Time in Julian centuries from 1900 January 0.5
		double t = (sdate - 2415020.0) / 36525;
		double t2 = t * t;
		double t3 = t2 * t;

		double nt1 = 2415020.75933 + synmonth * k + 0.0001178 * t2 - 0.000000155 * t3
				+ 0.00033 * Math.sin(deg2rad(166.56 + 132.87 * t - 0.009173 * t2));

		return nt1;
	}

	/*
	 * Given a K value used to determine the mean phase of the new moon, and a phase
	 * selector (0.0, 0.25, 0.5, 0.75), obtain the true, corrected phase time.
	 */
	private static double truephase(double k, double phase, double synmonth) {
		boolean apcor = false;

		k += phase; // Add phase to new moon time
		double t = k / 1236.85; // Time in Julian centuries from 1900 January 0.5
		double t2 = t * t; // Square for frequent use
		double t3 = t2 * t; // Cube for frequent use
		double pt = 2415020.75933 // Mean time of phase
				+ synmonth * k + 0.0001178 * t2 - 0.000000155 * t3
				+ 0.00033 * Math.sin(deg2rad(166.56 + 132.87 * t - 0.009173 * t2));

		double m = 359.2242 + 29.10535608 * k - 0.0000333 * t2 - 0.00000347 * t3; // Sun's mean anomaly
		double mprime = 306.0253 + 385.81691806 * k + 0.0107306 * t2 + 0.00001236 * t3; // Moon's mean anomaly
		double f = 21.2964 + 390.67050646 * k - 0.0016528 * t2 - 0.00000239 * t3; // Moon's argument of latitude
		if (phase < 0.01 || Math.abs(phase - 0.5) < 0.01) {
			// Corrections for New and Full Moon
			pt += (0.1734 - 0.000393 * t) * Math.sin(deg2rad(m)) + 0.0021 * Math.sin(deg2rad(2 * m))
					- 0.4068 * Math.sin(deg2rad(mprime)) + 0.0161 * Math.sin(deg2rad(2 * mprime))
					- 0.0004 * Math.sin(deg2rad(3 * mprime)) + 0.0104 * Math.sin(deg2rad(2 * f))
					- 0.0051 * Math.sin(deg2rad(m + mprime)) - 0.0074 * Math.sin(deg2rad(m - mprime))
					+ 0.0004 * Math.sin(deg2rad(2 * f + m)) - 0.0004 * Math.sin(deg2rad(2 * f - m))
					- 0.0006 * Math.sin(deg2rad(2 * f + mprime)) + 0.0010 * Math.sin(deg2rad(2 * f - mprime))
					+ 0.0005 * Math.sin(deg2rad(m + 2 * mprime));
			apcor = true;
		} else if (Math.abs(phase - 0.25) < 0.01 || Math.abs(phase - 0.75) < 0.01) {
			pt += (0.1721 - 0.0004 * t) * Math.sin(deg2rad(m)) + 0.0021 * Math.sin(deg2rad(2 * m))
					- 0.6280 * Math.sin(deg2rad(mprime)) + 0.0089 * Math.sin(deg2rad(2 * mprime))
					- 0.0004 * Math.sin(deg2rad(3 * mprime)) + 0.0079 * Math.sin(deg2rad(2 * f))
					- 0.0119 * Math.sin(deg2rad(m + mprime)) - 0.0047 * Math.sin(deg2rad(m - mprime))
					+ 0.0003 * Math.sin(deg2rad(2 * f + m)) - 0.0004 * Math.sin(deg2rad(2 * f - m))
					- 0.0006 * Math.sin(deg2rad(2 * f + mprime)) + 0.0021 * Math.sin(deg2rad(2 * f - mprime))
					+ 0.0003 * Math.sin(deg2rad(m + 2 * mprime)) + 0.0004 * Math.sin(deg2rad(m - 2 * mprime))
					- 0.0003 * Math.sin(deg2rad(2 * m + mprime));
			if (phase < 0.5) // First quarter correction
				pt += 0.0028 - 0.0004 * Math.cos(deg2rad(m)) + 0.0003 * Math.cos(deg2rad(mprime));
			else // Last quarter correction
				pt += -0.0028 + 0.0004 * Math.cos(deg2rad(m)) - 0.0003 * Math.cos(deg2rad(mprime));
			apcor = true;
		}
		if (!apcor) // function was called with an invalid phase selector
			return 0;

		return pt;
	}

	/*
	 * Find time of phases of the moon which surround the current date. Five phases
	 * are found, starting and ending with the new moons which bound the current
	 * lunation.
	 */
	private static double[] phasehunt(long timestamp, double synmonth) {
		long sdate = utctojulian(timestamp);
		double adate = sdate - 45;
		long ats = timestamp - 86400 * 45 * 1000;

		Date date = new Date(ats);
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
		dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
		System.out.println("UTC Time is: " + dateFormat.format(date));

		int yy = Integer.parseInt(dateFormat.format(date));

		dateFormat = new SimpleDateFormat("M");
		dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
		int mm = Integer.parseInt(dateFormat.format(date));
		int k2 = 0;
		double nt2, nt1;
		int k1 = (int) Math.floor((yy + ((mm - 1) * (1 / 12)) - 1900) * 12.3685);
		adate = nt1 = meanphase(adate, k1, synmonth);

		while (true) {
			adate += synmonth;
			k2 = k1 + 1;
			nt2 = meanphase(adate, k2, synmonth);
			// if nt2 is close to sdate, then mean phase isn't good enough, we have to be
			// more accurate
			if (Math.abs(nt2 - sdate) < 0.75)
				nt2 = truephase(k2, 0.0, synmonth);
			if (nt1 <= sdate && nt2 > sdate)
				break;
			nt1 = nt2;
			k1 = k2;
		}

		// results in Julian dates
		double data[] = { truephase(k1, 0.0, synmonth), truephase(k1, 0.25, synmonth), truephase(k1, 0.5, synmonth),
				truephase(k1, 0.75, synmonth), truephase(k2, 0.0, synmonth), truephase(k2, 0.25, synmonth),
				truephase(k2, 0.5, synmonth), truephase(k2, 0.75, synmonth) };

		double quarters[] = new double[8];
		int i = 0;
		for (double v : data) {
			quarters[i] = (v - 2440587.5) * 86400; // convert to UNIX time
			i++;
		}

		return quarters;
	}

	/*
	 * Convert UNIX timestamp to astronomical Julian time (i.e. Julian date plus day
	 * fraction).
	 */
	private static long utctojulian(long ts) {
		return (long) (ts / 86400 + 2440587.5);
	}

	private static String get_phase(int n, long timestamp, double synmonth) {
		double[] arrPhase = phasehunt(timestamp, synmonth);
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		long time = (long) (arrPhase[n] * 1000);
		String d = dateFormat.format(new Date(time));
		return d;
	}

	public static void main(String[] args) {
		SunClass.jdToDate(2451545);
		SunClass.jdFromDate(1, 1, 2000);
		SunClass.convertSolar2Lunar(8, 10, 2018, 7);
		Map<String, String> map = SunClass.getArrayDateInfo(22, 10, 2018, 7);
			}

}
