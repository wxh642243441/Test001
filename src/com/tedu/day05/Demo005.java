package com.tedu.day05;

import java.util.HashSet;
import java.util.Iterator;

public class Demo005 {
	public static void main(String[] args) {
		HashSet<Integer> num =new HashSet<>();
		for(int i = 0 ; i < 10 ; i ++) {
			num.add(i);
		}
		Iterator<Integer> it =num.iterator();
		while(it.hasNext()) {
			Integer integer =it.next();
			System.out.println(integer);
		}
	}
}
