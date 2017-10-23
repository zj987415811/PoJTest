/**
 * 
 */
/**
 * @author Administrator
 *
 */
package com.bignumadd;

import java.math.BigInteger;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		while(input.hasNext()) {
			int n=99;
			BigInteger sum1 = input.nextBigInteger();
			BigInteger sum2 = input.nextBigInteger();
			BigInteger sum3 = input.nextBigInteger();
			if(sum1.intValue()<0||sum2.intValue()<0||sum3.intValue()<0||sum1.intValue()>32767||sum2.intValue()>32767||sum3.intValue()>32767) {
					System.out.println("invaild paramter!");
					System.exit(0);
			}
			if(n<3) System.out.println("invaild paramter!");
			System.out.println(new Main().add1(sum1, sum2, sum3,n));
		}
	}
	public BigInteger add1(BigInteger sum1,BigInteger sum2,BigInteger sum3,int n){
		if(n==3) return sum3.add(sum2.add(sum1));
		BigInteger sum=sum3.add(sum2.add(sum1));
		if(n>3) {
			return add1(sum2, sum3,sum,n-1);
		}
		return add1(sum2, sum3,sum,n);
	}
}