package TypeTest;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {
	public static Date date=new Date();
	public static void main(String[] args) {
		SimpleDateFormat ft=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(ft.format(date));//2018-09-11 10:51:31
//		System.out.printf("HH:MM格式（24时制）：%tR",date);  
		Calendar c = Calendar.getInstance();//默认是当前日期
		int year=c.get(Calendar.DATE);
		System.out.println(year);
	}
	
}
