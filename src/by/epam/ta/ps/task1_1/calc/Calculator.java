package by.epam.ta.ps.task1_1.calc;

import java.util.Scanner;

public class Calculator {
	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		float result = 0;

		in = new Scanner(System.in);
		System.out.print("Enter the first int number: ");
		float num1 = in.nextFloat();
		System.out.print("Enter the second int number: ");
		float num2 = in.nextFloat();
		System.out.print("Enter the operation (+,-,*,/): ");
		String action = in.next();

		switch (action) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / num2;
			break;
		default:
			System.out.println("Action is not valid");
			break;
		}
		System.out.println("Result: " + result);
	}
}
