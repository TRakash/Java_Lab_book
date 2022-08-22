package lab3;

import java.util.Scanner;

public class Exercise_2 {

   static String getImage(String sb) {
		
		StringBuffer sb1 = new StringBuffer(sb);
		String image = sb1+"|"+sb1.reverse();
		System.out.println(image);
		return image;
	}
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		sb.append(sc.nextLine());
		 getImage(sb.toString());
		
		
		
	}

}
