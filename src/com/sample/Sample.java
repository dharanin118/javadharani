package com.sample;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		 System.out.println("Enter your age");
		 byte nextByte = s.nextByte();
		 System.out.println("my age is" +nextByte);
		 
		 System.out.println("Enter your ATM pinNo");
		 short nextShort = s.nextShort();
		 System.out.println("my atm pinNo is" +nextByte);
		 
		 System.out.println("Enter your IdNo");
		 int nextInt = s.nextInt();
		 System.out.println("my idNo is"+nextInt);
		 
		 System.out.println("Enter your phoneNo");
		 long nextLong = s.nextLong();
		 System.out.println("my phoneno is"+nextLong);
		 
		 System.out.println("Enter your salary");
		 float nextFloat = s.nextFloat();
		 System.out.println("my salary is"+nextFloat);
		 
		 System.out.println("The given condition is true or false");
		 boolean nextBoolean = s.nextBoolean();
		 System.out.println("the condition is"+nextBoolean);
		 
		 System.out.println("To fetch a particular character from given value");
		 char charAt = s.next().charAt(3);
		 System.out.println(charAt);
		 
		 System.out.println("Enter your name");
		 String next = s.next();
		 System.out.println("my name is"+next);
		 
		 System.out.println("Enter your name");
		 String nextLine = s.nextLine();
		 System.out.println("my name is"+nextLine);
		 
	}
}
