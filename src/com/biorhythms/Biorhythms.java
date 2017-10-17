/**
 * 
 */
/**
 * @author Administrator
 *
 */
package com.biorhythms;
public class Biorhythms{
	public static void main(String[] args) {
		int i=0;
		int j=0;
		int z=0;
		while(23*i+5<21252&&0+28*j<21252&&33+34*z<21252) {
			if(23*i+5==20+28*j) {
				int k=i;
				if(23*k+5==33+34*z) {
					System.out.println(i);
				}
				else if(23*i+5>33+34*z) 
				{
					z++;
				}else {
					i++;
				}
				z=0;
			}else if(23*i+5>20+28*j) {
				j++;
			}else {
				i++;
			}
	}
		System.out.println("没有这一天！");
}
	private void findNum() {
		// TODO Auto-generated method stub
		
	}
}