package com;
import java.math.BigDecimal;
import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) 
	{
		Scanner cin=new Scanner(System.in);
		while(cin.hasNext()) 
		{
			BigDecimal base=cin.nextBigDecimal();//读取底数，这里为了方便直接把底数设置为大数；
			int exponent=cin.nextInt();//读取指数；
			System.out.println(Main.printBigNum(base, exponent));//打印大数；
		}
	}
	public static String printBigNum(BigDecimal base,int exponent) {
		//底数为0的情况有点特殊，单独处理；
		if(base.doubleValue()==0.0) 
		{
			System.out.println(0);
		}
		base=base.pow(exponent);//计算值；
		String resultString=base.toPlainString();//将大数转化为字符串，这里其实用StringBuilder,在内存方面应该会更好。。。
		int j=1;//给定一个标记，类似C++指针的功能，用来判定'.'在字符串中的位置；
		if(resultString.charAt(0)=='0') 
		{
			while(resultString.charAt(j)!='.') 
			{
				j++;//如果0后不是'.'，标记后移一位；
			}
			resultString=resultString.substring(j);//刷新字符串，虽然这种方式会加大内存。。。
		}
		//如果末尾为0，就删除；
		while(resultString.charAt(resultString.length()-1)=='0') 
		{
			resultString=resultString.substring(0,resultString.length()-1);
		}
		//如果末尾为'.'，也删除；
		if(resultString.charAt(resultString.length()-1)=='.') 
		{
			resultString=resultString.substring(0,resultString.length()-1);
		}
		return resultString;
	}
}
