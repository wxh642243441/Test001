package com.tedu.day04;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Demo002 {
	public static void main(String[] args) {
		// paixu();
		//jiangxu();
		erwei();
	}

	public static void paixu() {
		int a[] = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 100);
		}
		System.out.println(Arrays.toString(a));
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					int tem = a[j];
					a[j] = a[j + 1];
					a[j + 1] = tem;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

	public static void jiangxu() {
		int[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
		//排序前
		//System.out.println(Arrays.toString(ns));
		//先正序
		Arrays.sort(ns);
		System.out.println(Arrays.toString(ns));
		//再倒序(反过来冒泡)
		for(int i =0 ;i<ns.length-1;i++) {
			for(int j = 0 ; j< ns.length-1-i;j++) {
				if(ns[j]<ns[j+1]) {
					int tem = ns[j];
					ns[j]=ns[j+1];
					ns[j+1]=tem;
				}
			}
		}
		System.out.println(Arrays.toString(ns));
	}

	public static void erwei() {
		int[][] a = new int[5][5];
		for(int i=0;i<a.length;i++) {
			System.out.println("\n");
			for(int j=0;j<a.length;j++) {
				a[i][j]=(int) (Math.random()*100);
				System.out.print(a[i][j]+"  ");
			}
		}
	}
}
