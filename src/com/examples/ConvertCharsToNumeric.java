package com.examples;

import java.util.HashMap;
import java.util.Map;


public class ConvertCharsToNumeric {

	public static void main(String[] args) {
		
		String str="aabbbcccc";
		
		char[] ch=str.toCharArray();
		int count=0;
		
		HashMap<Character,Integer> map= new HashMap<Character,Integer>();
		
		for(int i=0;i<ch.length;i++) {
			
			if(map.containsKey(ch[i])) {
			    count=map.get(ch[i]);
				map.put(ch[i], count+1);
				
			}else {
				map.put(ch[i], 1);
			}
		}
		
		for(Map.Entry m:map.entrySet()) {
			System.out.print(m.getKey()+""+m.getValue());
		}
		

	}

}
