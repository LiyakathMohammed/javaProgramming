package javaIntroduction;

import java.util.Scanner;

public class DownwardRightLeftTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: "); //71 is the best number to input
		long n, line, star, numberOfSpaces, numberOfStars; 
        n = sc.nextInt();
		System.out.println();
		// It prints the triangle from right to left upside down
		for(line = 1; line <= n; line++) {

			for(numberOfSpaces = 1; numberOfSpaces <= line - 1; numberOfSpaces++) {
				// 2 spaces
				System.out.print("  ");
			}
			numberOfStars = n-line+1;
			for(star = 1; star <= numberOfStars; star++) {
				System.out.print("* ");
			}
			System.out.println();	
		}

	}

}
