package lab3;

import java.util.Scanner;

public class Exercise_2 {

	public static void main(String[] args) {
		
		StringBuffer s = new StringBuffer();
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		System.out.print(s.append(word)+ "|"+ s.reverse());

	}

}
