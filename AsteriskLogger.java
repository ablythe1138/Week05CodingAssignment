package week05CodingAssignment;

import java.util.Arrays;

public class AsteriskLogger implements Logger{

	@Override
	public void log(String log) {
		System.out.println("***" + log + "***");
		
	}

	@Override
	public void error(String error) {
		//System.out.println("******************\n" + "***Error: " + error + "***\n" + "******************");
		int n = error.length();
		for (int i = 0; i < n + 2; i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.println("*" + error + "*");
		for (int i = 0; i < n + 2; i++) {
			System.out.print("*");
		}
		System.out.println();
	}

}
