package javaIntroduction;

import java.util.Scanner;

public class DiamondStar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: "); 
		long n, line, star, numberOfSpaces, a, numberOfStars; 
        n = sc.nextInt();
//        Top part of Star
		for(line = 1; line <= n; line++) {
	        numberOfStars = line * 2 - 1;
			for(numberOfSpaces = 1; numberOfSpaces <= n-line; numberOfSpaces++) {
				System.out.print(" ");
			}
//			Displaying Stars
			for(star = 1; star <= numberOfStars; star++) {
				System.out.print("*");
			}
			System.out.println();	
		}
		// Bottom part of star
        numberOfStars = n * 2 - 1;
		for(line = 1; line <= n; line++) {
			for(numberOfSpaces = 1; numberOfSpaces < line; numberOfSpaces++) {
				System.out.print(" ");
			}
			for(star = 1; star <= numberOfStars; star++) {
				System.out.print("*");
			}
			numberOfStars = numberOfStars-2;
			System.out.println();	
		}
	}

}
