package com.tedu.day06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Demo002 {
	public static void main(String[] args) {
		List<Dog> list =new ArrayList<Dog>();
		for(int i =0 ; i<2000000 ; i++) {
			Dog dog=new Dog("哈士奇"+i);
			list.add(dog);
		}
		for(int j =0 ;j<10;j++) {
			Collections.shuffle(list);
			long start = System.currentTimeMillis();
			for(Dog dog : list) {
				if(dog.name.equals("哈士奇100000")) {
					System.out.println("找到");
					break;
				}
				
			}
			long end = System.currentTimeMillis();
			System.out.println(end-start);
		}
	}
}

class Dog {
	String name;

	public Dog() {

	}

	public Dog(String name) {
		this.name = name;

	}

	@Override
	public String toString() {
		return "Dog [name=" + name + "]";
	}

}
