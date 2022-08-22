package lab3;

import java.util.Scanner;

public class Exercise_3 {
	 
	static String alterString(String str) {
		
		char arr[]=str.toCharArray();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!='a' && arr[i]!='e' && arr[i]!='i' && arr[i]!='o' && arr[i]!='u') {
				arr[i]=(char)(arr[i]+1);
				
			}
		}
		String str1=new String(arr);
		return str1;
	}


	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println(alterString(str));
	}
}
