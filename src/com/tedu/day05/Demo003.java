package com.tedu.day05;

public class Demo003 {
	public static void main(String[] args) {
		P person=new P();
		person.setNumber(99);
		System.out.println(person.number);
	}
}
class P{
	public static int number;
	public static void setNumber(int value) {
		number=value;
	}
}
