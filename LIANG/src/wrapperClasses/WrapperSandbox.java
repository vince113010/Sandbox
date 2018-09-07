package wrapperClasses;

import java.util.Scanner;

public class WrapperSandbox {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter your phone number: ");
		String phoneNumber = input.next();
		
		System.out.println();
		
		System.out.println("The format is " + phoneNumber.matches("\\d{3}-\\d{3}-\\d{4}"));
	}

}
