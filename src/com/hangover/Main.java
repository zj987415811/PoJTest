package com.hangover;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		while(input.hasNext()) {
			double length=input.nextDouble();
			if(length<0.01||length>5.20) {
				System.exit(0);
			}
			System.out.println(new Main().hangover(length)+" card(s)");
		}
		
	}
public int hangover(double length) {
		int i=0;
		double sum=0;
		while(sum<length)
		{
			i++;
			sum+=1.0/(i+1);
		}
		return i;
	}
}
