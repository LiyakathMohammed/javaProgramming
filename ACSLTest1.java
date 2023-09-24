package javaIntro;
import java.util.*;

public class ACSLTest1 {
	public static int getLeftMostDigit(long num) {
		while(num > 9)
			num /= 10;
		return (int)num;
	}
	
	public static long getAnswer(long n, int p,int d) {
		long powerOfTen = (long)Math.pow(10,  p -1), num = n/powerOfTen, pthDigit = num % 10;
		long replacement;
		if(pthDigit <= 4)
			replacement = (d + pthDigit) % 10;
		else
			replacement = getLeftMostDigit(Math.abs(d - pthDigit));
		long res = (num - pthDigit) + replacement;
		res *= powerOfTen;
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p, d;
		long n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		n = sc.nextLong();
		System.out.println("Enter two Numbers: ");
		p = sc.nextInt();
		d = sc.nextInt();
		long ans = getAnswer(n, p, d);
		System.out.println(ans);
	}

}
