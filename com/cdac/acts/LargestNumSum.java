package com.cdac.acts;
import java.util.Scanner;


public class LargestNumSum {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int largest= Math.max(num1, Math.max(num2, num3));
		
		
		int sum = largest;
		System.out.println(sum);
		
	}

}
