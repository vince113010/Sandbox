package intro;

import java.util.Date;

public class HelloWorld {

	public static void main(String[] args) {
	
		Date date = new Date(1234567);
		System.out.println("First Date and Time: " + date.toString() + "\n");
		
		m1(date);
		System.out.println("Second Date and Time: " + date.toString() + "\n");
		
		System.out.println("Time Value: " + date.getTime());
	  }
	
	public static void m1(Date date) {
		date.setTime(87654321);
	}
}
