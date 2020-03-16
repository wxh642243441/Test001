package com.tedu.day06;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class Demo001 {
	public static void main(String[] args) {
		/*HashMap<String, String> map = new HashMap<String, String>();
		HashMap<String, String> temp = new HashMap<String, String>();
		map.put("dag", "小狗");
		map.put("cat", "小猫");
		System.out.println(map);
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(key);
			String value = map.get(key);
			temp.put(value, key);
		}
		map.clear();
		map.putAll(temp);
		System.out.println(map);*/
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
		String num = String.valueOf(Math.PI);
		System.out.println(num);
		num = num.replace(".", "");
		char[] a = num.toCharArray();
		for(char c : a ) {
			int parseInt = Integer.parseInt(String.valueOf(c));
			linkedHashSet.add(parseInt);
		}
		System.out.println(String.valueOf(Math.PI));
		System.out.println(linkedHashSet);
		
	}

}
