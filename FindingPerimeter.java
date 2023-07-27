package javaIntroduction;
import java.util.*;
public class FindingPerimeter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long  length, width;
		System.out.println("Enter the length of your rectangle:");
		length = sc.nextLong();
		System.out.println("Enter the width of your rectangle:");
		width = sc.nextLong();
		System.out.println("The perimeter of the rectangle is "+ (2 * width + 2 * length));

	}

}
