package com.tedu.day05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo008 {
	public static void main(String[] args) {
		List<Integer> list ;
		list =new ArrayList<>();
		insert(list,"ArraryList");
		list =new LinkedList<>();
		insert(list,"LinkedList");
		
	}
	private static void insert(List<Integer> list, String string) {
		int total = 10000*10;
		final int num = 5;
		long start =  System.currentTimeMillis();
		for(int i =0; i<total;i++) {
			list.add(0,num);
		}
		long  end  =  System.currentTimeMillis();
		System.out.printf("  %s,  %d,  %d \n", string, total,end-start);
	}
}
