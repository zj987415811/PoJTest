package com.hangover;

import java.util.Scanner;

public class Hangover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		while(input.hasNext()) {
			double length=input.nextDouble();
			System.out.println(hangover(length));
		}
		
	}
static public int hangover(double length) {
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
