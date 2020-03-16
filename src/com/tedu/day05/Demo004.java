package com.tedu.day05;

import java.lang.reflect.Method;

public class Demo004 {
	public static void main(String[] args) throws Exception {
		String string="java";
		Method method = String.class.getMethod("substring", int.class);
		String r = (String) method.invoke(string, 5);
			System.out.println(r);
	}

}
