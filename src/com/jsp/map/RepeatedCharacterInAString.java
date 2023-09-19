package com.jsp.map;
import java.util.*;

public class RepeatedCharacterInAString {
	
	public static LinkedHashMap<Character, Integer> repeatedChar(String s){
		
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		
		for(int i=0; i<s.length(); i++) {
			if(!map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i),1);
			}
			else {
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}
		}
		return map;
		
	}

	public static void main(String[] args) {
		String s1 = "Java Programming";
		System.out.println(repeatedChar(s1));

	}

}
