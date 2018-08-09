package math_demo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Demo {

	public static void main(String[] args) {

		Date date =new Date();
		System.out.println(date);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str = sdf.format(date);
		System.out.println(str);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
		Calendar calendar=Calendar.getInstance();
		
//		calendar.set(2018,calendar.AUGUST , calendar.getActualMaximum(calendar.DAY_OF_MONTH));
//		Date date2=calendar.getTime();
//		String str2=sdf.format(date2);
//		System.out.println(str2);
//		
//		calendar.set(2018,calendar.AUGUST , calendar.getActualMinimum(calendar.DAY_OF_MONTH));
//		Date date3=calendar.getTime();
//		String str3=sdf.format(date3);
//		System.out.println(str3);
		
		calendar.set(calendar.get(calendar.YEAR), calendar.get(calendar.MONTH), calendar.get(calendar.DAY_OF_MONTH)-1);
		date= calendar.getTime();
		String str2 = sdf.format(date);
		System.out.println(str2);
		
		
		
	}

}
