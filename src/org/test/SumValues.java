package org.test;

public class SumValues {
	
	public static void main(String[] args) {
		
		int sum = 0;
		int sum1 =0;
		int []a= {1,2,3,4,5,6,7,8,9,10};
		for (int i=0;i<10;i++) {
			sum = sum + a[i];
			sum1 = sum1 + a[i];
			
		}
	
		System.out.println(sum);
		System.out.println(sum1);
		
	}
	

}
