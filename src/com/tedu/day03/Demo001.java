package com.tedu.day03;

import java.util.Arrays;

public class Demo001 {
	public static void main(String[] args) {
		int a[]= {89 , -23 , 64 , 91 , 119 , 52 , 73};
		System.out.println("前三名：");
		Demo001 demo001 = new Demo001();
		demo001.test(a);
	}

	private void test(int a[]) {
		int num =0;
	Arrays.sort(a);	
	System.out.println(Arrays.toString(a));
	for(int i =a.length-1;i>=0;i--) {
		if(a[i]>100||a[i]<0) {
			continue;
		}
		num++;
		if(num>3) {
			break;
		}
		System.out.println(a[i]);
	}
		
	}
}
