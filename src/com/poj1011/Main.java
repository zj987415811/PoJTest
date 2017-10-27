/**
 * 
 */
/**
 * @author Administrator
 *
 */
package com.poj1011;
public class Main{
	public static void main(String[] args) {
		int n=9;
		int[] arr= {5,2,1,5,2,1,5,2,1};
		int sum=24;
		for(int i:arr) {
			sum+=i;
		}
		int []arr1;
		int a;
		int b;
		while(sum!=0) {
			int j=0;
			if(sum%j!=0) {
				System.out.println(j);
				j++;
			}else {
				j++;
				if(sum%j==0) {
					System.out.println(j);
				}
			}
		}
	}
	
}