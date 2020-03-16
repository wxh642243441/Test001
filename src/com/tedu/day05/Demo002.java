package com.tedu.day05;

public class Demo002 {
	public static void main(String[] args) {
		Person1 p1=new Student();
		p1.run();
	}
}
 abstract class Person1{
	public abstract void run();
		
}
 class Student extends Person1{

	@Override
	public void run() {
		System.out.println("Student.run");
		
	}
	 
 }
