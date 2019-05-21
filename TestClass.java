package org.adarsh;

public class TestClass {

	public static void main(String[] args) {
		DateConversion dateConversion= new DateConversion("10/05/2019", "dd/MM/yyy", "yyyy-MM-dd");
		try {
			System.out.println("Converted date :: " + dateConversion.covertDate());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
