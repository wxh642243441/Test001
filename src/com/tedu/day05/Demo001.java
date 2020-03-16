package com.tedu.day05;

public class Demo001 {
	static String t = "Java,Python";
	static int t1 = t.indexOf('a');
	static int t2 = t.indexOf("ava");
	static int t3 = t.indexOf("thon", 3);
	static int t4 = t.indexOf('P', 8);

	public static void main(String[] args) {
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
		Person person1 = new Person();
		Person person2 = new Person();
		person1.setName("110");
		person2.setName("120", "119");
		System.out.println(person1.getName());
		System.out.println(person2.getName());
	}

}

class Person {
	private String name;

	public String getName() {
		return name;

	}

	public void setName(String name) {
		this.name = name;
	}

	public void setName(String name1, String name2) {
		this.name = name1 + "," + name2;
	}

}
