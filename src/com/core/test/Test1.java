package com.core.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test1 {
	public static void main(String arg[]) {
		String startdate="11/01/2020";
		String end="12/01/2020";
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate date1=LocalDate.parse(startdate, dtf);
		LocalDate date=LocalDate.parse(end, dtf);
	 
	}

	 


}
