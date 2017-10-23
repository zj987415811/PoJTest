/**
 * 
 */
/**
 * @author Administrator
 *
 */
package com.addorsubtraction;

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n1,n2,n3,d1,d2,d3,op,x,y,z;
		boolean neg = false;
		while(input.hasNext()) {
			String string=input.nextLine();
			n1=string.charAt(0)-'0';
			d1=string.charAt(2)-'0';
			op=1;
			if(string.charAt(3)=='-') {
				op=-1;
			}
			n2=string.charAt(4)-'0';
			d2=string.charAt(6)-'0';
			n3=n1*d2+op*n2*d1;
			d3=d1*d2;
			if(n3==0) {
				System.out.println(0);
			}
			if(n3<0) {
				neg = true;
			}
			n3=Math.abs(n3);
			d3=Math.abs(d3);
			x=n3>d3?n3:d3;
			y=n3<d3?n3:d3;
			z=gcd(x,y);
			n3=n3/z;
			d3=d3/z;
			if(neg) {
				System.out.print("-");
			}
			if(n3==1) {
				System.out.println(n3);
			}else {
				System.out.println(n3+"/"+d3);
			}
		}
	}

	private static int gcd(int x, int y) {
		// TODO Auto-generated method stub
		int z;
		z=x%y;
		while(z!=0) {
			x=y;
			y=z;
			z=x%y;
		}
		return y;
	}
	
}