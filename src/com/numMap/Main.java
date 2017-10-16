package com.numMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.omg.CORBA.DynAnyPackage.Invalid;
public class Main {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String[]strings=new String[n];
		String[]strings1=new String[n];
		int i=0;
		int j=0;
		Map<Integer,String> map=new HashMap<Integer, String>();
		while(in.hasNext()) 
		{
				String string1;
				strings[i]=in.next();
				string1=Main.numMap(strings[i]);
				if(string1!=null) 
				{
					
					strings1[i]=string1;
					strings1[i]=strings1[i].replaceAll("null","");
					map.put(j,strings1[i]);
					j++;
					i++;
				}
				if(i==n) break;
		}
		Map<String,Integer> res=new HashMap<String,Integer>();  
        for (Map.Entry<Integer,String> entry:map.entrySet()){  
            if (res.containsKey(entry.getValue())){  
                res.put(entry.getValue(),res.get(entry.getValue())+1);  
            }else{  
                res.put(entry.getValue(),1);  
            }  
        }  
       boolean flag=false;
       for(Map.Entry<String, Integer> entry:res.entrySet()) {
        	StringBuilder string=new StringBuilder(entry.getKey());
	    	string.insert(3, "-");
	    	if(entry.getValue()>1) {
        		flag=true;
	    	  	System.out.println(string+" "+entry.getValue());
	    	}
        }
    	if(flag==false) 
    		{
        		System.out.println("No duplicates.");
    		}
}
	static public String numMap(String input) 
	{
		Map<String,Integer> numMap=new HashMap<String,Integer>();
		numMap.put("A",2);
		numMap.put("B",2);
		numMap.put("C",2);
		numMap.put("D",3);
		numMap.put("E",3);
		numMap.put("F",3);
		numMap.put("G",4);
		numMap.put("H",4);
		numMap.put("I",4);
		numMap.put("J",5);
		numMap.put("K",5);
		numMap.put("L",5);
		numMap.put("M",6);
		numMap.put("N",6);
		numMap.put("O",6);
		numMap.put("P",7);
		numMap.put("R",7);
		numMap.put("S",7);
		numMap.put("T",8);
		numMap.put("U",8);
		numMap.put("V",8);
		numMap.put("W",9);
		numMap.put("X",9);
		numMap.put("Y",9);
		String string = null;
		if(input!=null) 
		{
			for(int i=0;i<input.length();i++) 
			{
				String key=String.valueOf(input.charAt(i));
				if(key.equals("Q")||key.equals("Z")) 
				{
					System.exit(0);
				}
				if(input.charAt(i)!='-') 
				{
					if(numMap.containsKey(key)) 
					{
						string+=numMap.get(key);
					}else
					{
						string+=Character.getNumericValue(input.charAt(i));
					}
				}
				
			}
		}
		return string.replace("null", "");
	}
}