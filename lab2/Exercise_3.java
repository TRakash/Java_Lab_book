package lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_3 {

	static int getSorted(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			String org=Integer.toString(arr[i]);
			String rev="";
			for(int j=0;j<org.length();j++) {
				char ch= org.charAt(j);
		        rev=ch+rev;
			}
			arr[i]=Integer.parseInt(rev);
		}
		Arrays.sort(arr);
		return arr[i];
		
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	    int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(getSorted(arr));
	}

}
