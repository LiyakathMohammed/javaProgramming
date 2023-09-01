package javaIntroduction;
import java.util.*;
public class LCMofNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int n, a, numberChecker;
		System.out.print("Enter a number: ");
		n = sc.nextInt();
		System.out.print("Enter a number: ");
		a = sc.nextInt();
		for(numberChecker=n; numberChecker>0; numberChecker++) {
			if((numberChecker%n)==0 & (numberChecker%a)==0) {
				System.out.println("The LCM of your number inputed is"+" " +numberChecker);
				numberChecker=-1;
			}
		}
	}
}