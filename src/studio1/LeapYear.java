package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("What Year is it?");
		int year = in.nextInt();
		boolean divisibleByFour = year % 4 == 0;
		boolean notDivisibleByOneHundred = year % 100 != 0;
		boolean divisibleByFourHundred = year % 400 == 0;
		boolean isLeapYear = (divisibleByFour && notDivisibleByOneHundred) || divisibleByFourHundred;
		System.out.println(year + " is a leap year: " + isLeapYear);
	}

}
