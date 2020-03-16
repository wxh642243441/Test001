package com.tedu.day06;

import java.util.HashMap;

import com.tedu.day01.Hero;

public class Demo003 {
	public static void main(String[] args) {
		HashMap<String, Hero> hashMap = new HashMap<String, Hero>();
		for (int i = 0; i < 2000000; i++) {
			Hero hero = new Hero("hero" + i);
			hashMap.put(hero.name, hero);
		}
		for (int j = 0; j < 10; j++) {
			long start = System.currentTimeMillis();
			Hero target = hashMap.get("hero100000");
			System.out.println("找到" + target.name);
			long end = System.currentTimeMillis();
			System.out.println(end - start);
		}
	}

}
