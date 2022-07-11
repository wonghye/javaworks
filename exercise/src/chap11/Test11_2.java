package chap11;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Test11_2 {

	public static void main(String[] args) {
		//1
		Date now2 = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분");
		System.out.println(sdf.format(now2));
		
		//2
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		
		int month = now.get(Calendar.MONTH);
		//String strMonth = (month<10)? ("0"+month) : (""+month);
		
		int dayOfMonth = now.get(Calendar.DAY_OF_MONTH);
		
		String[]dayArray = {"일","월","화","수","목","금","토"};
		int dayOfWeek = now.get(Calendar.DAY_OF_WEEK);
		String strWeek = dayArray[dayOfWeek -1];
		
		int hour = now.get(Calendar.HOUR_OF_DAY);
		int second = now.get(Calendar.SECOND);
		
		System.out.print(year + "년 ");
		System.out.print(month + "월 ");
		System.out.print(dayOfMonth + "일 ");
		System.out.print(strWeek + "요일 ");
		System.out.print(hour + "시 ");
		System.out.print(second + "분 ");

		}
}
