package com.mod;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		while(input.hasNext()) {
			int a=input.nextInt();
			int b=input.nextInt();
			System.out.println(new Main().mod(a, b));
		}
	}
	public int mod(int a,int b) {
		if(a<1||b>32767) System.out.println("invaild paramter!");
		if(a%b==0) return 0;
		if(a<b) return a;
		return mod(a%b, b);
	}
}
