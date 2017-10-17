/**
 * 
 */
/**
 * @author Administrator
 *
 */
package com.circle;

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int i=0;
		int[] year=new int[n];
		while(input.hasNext()) {
			double x=input.nextDouble();
			double y=input.nextDouble();
			year[i]=operatea(x, y);
			i++;
			if(i==n) break;
		}
		for(int j=0;j<year.length;j++) {
			System.out.println("Property "+(j+1)+": This property will begin eroding in year "+year[j]+"."); 
			if(j==year.length-1) {
				System.out.println("END OF OUTPUT.");
			}
		}
	}

	public static int operatea(double x,double y) {
		// TODO Auto-generated method stub
		double r=Math.sqrt(x*x+y*y);
		double s=(Math.PI*r*r)/2;
		int i=0;
		while(s>0) {
			s-=50;
			i++;	
		}
		return i;
	}
}