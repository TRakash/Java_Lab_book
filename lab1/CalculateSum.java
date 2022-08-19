package lab1;

import java.util.Scanner;


public class CalculateSum {

	static int cubesSum(int n) {
		int i,y,sum=0;
		for(i=n;n!=0;i++) {
			y=n%10;
			sum=sum+(y*y*y);
			n=n/10;
		}
		return sum;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the Digit");
		int n= sc.nextInt();
		System.out.println(cubesSum(n));

	}


	}


