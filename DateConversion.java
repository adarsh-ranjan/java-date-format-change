package org.adarsh;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConversion {
	
	private String inputDate;
	private String inputDateFormat;
	private String outputDateFormat;
	
	public DateConversion(String inputDate,String inputDateFormat , String outputDateFormat) {
		this.inputDate=inputDate;
		this.inputDateFormat=inputDateFormat;
		this.outputDateFormat=outputDateFormat;
	}
	
	public String covertDate () throws Exception {
		SimpleDateFormat dt1 = new SimpleDateFormat(this.inputDateFormat);
		Date date= dt1.parse(this.inputDate);
		SimpleDateFormat dt2 = new SimpleDateFormat(this.outputDateFormat);
		return dt2.format(date);
	}
}
