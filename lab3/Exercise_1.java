package lab3;

import java.util.StringTokenizer;

public class Exercise_1 {

	public static void main(String[] args) {
					
			int sum = 0;
			StringTokenizer sc = new StringTokenizer("1 4 45 74 8 10");
			while(sc.hasMoreTokens()) {
				
				String number = sc.nextToken();
				System.out.println(number);
				
				sum = sum + Integer.parseInt(number);
			}
			System.out.println("the sum is " + sum);
		}
	}


