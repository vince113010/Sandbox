package objectsAndClasses;

import java.util.*;
/*
 * import java.math.*;
 * import java.io.*;
 * import java.sql.*;
 */

public class Sandbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter your first and last name: ");
		String firstName = input.next();
		String lastName = input.next();
		
		System.out.println();
		System.out.println("First Name: " + "\t" + firstName + "\n"
		+ "Last Name: " + "\t" + lastName);
		
		System.out.println("Please enter text");
		char[] text = input.next().toCharArray();
		
		for (int i = 0; i < text.length; i++)
			System.out.println(text[i]);

	}

}
