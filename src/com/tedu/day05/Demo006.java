package com.tedu.day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo006 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0 ;i <10;i++) {
			list.add(i);
		}
		System.out.println(list);
		//翻转数据
		Collections.reverse(list);
		System.out.println(list);
		//混淆数据
		Collections.shuffle(list);
		System.out.println(list);
		//排序
		Collections.sort(list);
		System.out.println(list);
		//交换
		Collections.swap(list, 5, 6);
		System.out.println(list);
		//滚动
		Collections.rotate(list, 3);
		System.out.println(list);
		//线程安全化
		List<Integer> synchronizedList = Collections.synchronizedList(list);
		
	}
}
