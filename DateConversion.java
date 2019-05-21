package org.adarsh;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConversion {
	
	private String inputDate;
	private String inputDateFormate;
	private String outputDateFormate;
	
	public DateConversion(String inputDate,String inputDateFormate , String outputDateFormate) {
		this.inputDate=inputDate;
		this.inputDateFormate=inputDateFormate;
		this.outputDateFormate=outputDateFormate;
	}
	
	public String covertDate () throws Exception {
		SimpleDateFormat dt1 = new SimpleDateFormat(this.inputDateFormate);
		Date date= dt1.parse(this.inputDate);
		SimpleDateFormat dt2 = new SimpleDateFormat(this.outputDateFormate);
		return dt2.format(date);
	}
}
