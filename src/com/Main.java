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
			BigDecimal base=cin.nextBigDecimal();//��ȡ����������Ϊ�˷���ֱ�Ӱѵ�������Ϊ������
			int exponent=cin.nextInt();//��ȡָ����
			System.out.println(Main.printBigNum(base, exponent));//��ӡ������
		}
	}
	public static String printBigNum(BigDecimal base,int exponent) {
		//����Ϊ0������е����⣬��������
		if(base.doubleValue()==0.0) 
		{
			System.out.println(0);
		}
		base=base.pow(exponent);//����ֵ��
		String resultString=base.toPlainString();//������ת��Ϊ�ַ�����������ʵ��StringBuilder,���ڴ淽��Ӧ�û���á�����
		int j=1;//����һ����ǣ�����C++ָ��Ĺ��ܣ������ж�'.'���ַ����е�λ�ã�
		if(resultString.charAt(0)=='0') 
		{
			while(resultString.charAt(j)!='.') 
			{
				j++;//���0����'.'����Ǻ���һλ��
			}
			resultString=resultString.substring(j);//ˢ���ַ�������Ȼ���ַ�ʽ��Ӵ��ڴ档����
		}
		//���ĩβΪ0����ɾ����
		while(resultString.charAt(resultString.length()-1)=='0') 
		{
			resultString=resultString.substring(0,resultString.length()-1);
		}
		//���ĩβΪ'.'��Ҳɾ����
		if(resultString.charAt(resultString.length()-1)=='.') 
		{
			resultString=resultString.substring(0,resultString.length()-1);
		}
		return resultString;
	}
}
