package com.tedu.day05;

import java.util.HashSet;

public class Demo007 {
	public static void main(String[] args) {
		HashSet<Integer> hashSet = new HashSet<>();
		System.out.println();
		while (hashSet.size() < 500) {
			int i = (int) (Math.random() * 1000);
			hashSet.add(i);
		}
		System.out.println(hashSet);
	}

}
