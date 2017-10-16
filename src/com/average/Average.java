/**
 * 
 */
/**
 * @author Administrator
 *
 */
package com.average;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Average{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int month=0;
		double sumSale=0;
		while(input.hasNext()) {
			month++;
			double monthSale=input.nextDouble();
			sumSale+=monthSale;
			if(month==12) break;
		}
		DecimalFormat dFormat=new DecimalFormat("#.00");
		dFormat.format(sumSale/12.0);
		System.out.println("$"+dFormat.format(sumSale/12.0));
	}
	
}