package com.tedu.day01;

import java.lang.reflect.Constructor;

public class Demo002 {
	public static void main(String[] args) {
		Hero hero =new Hero();
		hero.name="123";
		System.out.println(hero);
		 
		try {
			String className = "com.tedu.day01.Hero";
			Class class1 = Class.forName(className);
			Constructor constructor = class1.getConstructor();
			Hero hero2 =(Hero) constructor.newInstance();
			hero2.name="456";
			System.out.println(hero2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
