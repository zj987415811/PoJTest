/**
 * 
 */
/**
 * @author Administrator
 *
 */
package com.biorhythms;

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int count=1;
		while(input.hasNextLine()) {
			int p=input.nextInt();
			int e=input.nextInt();
			int i=input.nextInt();
			int d=input.nextInt();
			if(p==e&&e==i&&i==d&d==-1) {
				System.exit(0);
			}
			int days=new Main().findDay(p, e, i, d);
			if(days>21252) {
				days=1;
			}
			if(count==1)
			System.out.println();
			System.out.println("Case "+count+": the next triple peak occurs in "+days+" days");	
			count++;
		}
		
	}
	public int findDay(int p,int e,int i,int d){
		int n=0;
		int j=0;
		int z=0;
		int days = 0;
		if(p==0||e==0||i==0) {
			if((p==0||e==0||i==0)&&d==0) {
				return 21252;
			}
			else {
				return 21252-d;
			}
		}else {
			while(23*n+p<212252) {
				while(23*n-28*j==e-p) {
					int k=n;
					//System.out.println(n);
					while(23*k-33*z!=i-p) {
						if(23*k-33*z>i-p) {
							z++;
						}else{
							k++;
						}
					}
					if(23*k-28*j==e-p) {
						System.out.println(n);
						days=k*23+p-d;
						return days;
					}else 
					{
						if(23*i-28*j>e-p){
							j++;
						} 
						if(23*i-28*j<e-p){
							z++;
						}
					}
					z=0;
					n++;
					k++;
				} 
				if(23*n-28*j>e-p){
					j++;
				} 
				if(23*n-28*j<e-p){
					n++;
				}			
			}
		}
		
		return days;
	}
}