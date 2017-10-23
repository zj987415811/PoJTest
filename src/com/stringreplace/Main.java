/**
 * 
 */
/**
 * @author Administrator
 *
 */
package com.stringreplace;
public class Main{
	public static void main(String[] args) {
		String input="i andyou you dog!";
		new Main().replace(input);
	}
	public void replace(String input) {
		// TODO Auto-generated method stub
		if(input==null) {
			System.out.println("invaild paramter!");
		}
		StringBuilder stringBuilder=new StringBuilder(input);
		for(int i=0;i<stringBuilder.length();i++) {
			if(stringBuilder.charAt(i)=='y'&&stringBuilder.charAt(i+1)=='o'&&stringBuilder.charAt(i+2)=='u') {
				stringBuilder.replace(i, i+3, "we");
			}
		}
		System.out.println(stringBuilder);
	}
}