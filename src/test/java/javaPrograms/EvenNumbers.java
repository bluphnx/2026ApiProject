package javaPrograms;

import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {

		int number;
		Scanner scanner = new Scanner(System.in);

//		String inputString = scanner.nextLine();

		System.out.println("Enter a number: ");

		number = scanner.nextInt();

//		System.out.println(inputString);
//		System.out.println(number);
		
		if(number%2 == 0) {
			
			System.out.println("even");
		} else {
			System.out.println("odd");
		}

		scanner.close();
		System.out.println("End");
	}

}