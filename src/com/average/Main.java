/**
 * 
 */
/**
 * @author Administrator
 *
 */
package com.average;

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int month=0;
		double sumSale=0;
		while(input.hasNext()) {
			month++;
			double monthSale=input.nextDouble();
			if(monthSale>monthSale||monthSale<0) System.exit(0);
			sumSale+=monthSale;
			if(month==12) break;
		}
		System.out.println("$"+String.format("%.2f", sumSale/12.0).toString());
	}
	
}