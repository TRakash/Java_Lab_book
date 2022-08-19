package lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_2 {

	static String[] sortString ( String [] arr) {
		
		Arrays.sort(arr);
		return arr;
	}
	
	public static void main(String[] args) {
		
    Scanner sc =new Scanner(System.in);
    int n =sc.nextInt();
    String[] srarr = new String[n];
    
    for(int i=0;i<srarr.length;i++) {
		 srarr[i]=sc.nextLine();}
    System.out.println(sortString(srarr));
}
}
