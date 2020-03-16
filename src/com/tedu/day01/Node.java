package com.tedu.day01;

import java.util.ArrayList;
import java.util.List;

public class Node {
	public Node leftNode;
	public Node rightNode;
	public Integer value;

	public void add(Integer integer) {
		if (value == null) {
			value = integer;
		} else {
			if (integer - value <= 0) {
				if (leftNode == null) {
					leftNode = new Node();
				}
				leftNode.add(integer);
			} else {
				if (rightNode == null) {
					rightNode = new Node();
				}
				rightNode.add(integer);
			}
		}
	}

	public List<Integer> list() {
		List<Integer> list = new ArrayList<Integer>();
		if (leftNode != null) {
			list.addAll(leftNode.list());
		}
		list.add(value);
		if (rightNode != null) {
			list.addAll(rightNode.list());
		}
		return list;
	}

	public static void main(String[] args) {
		int[] a = new int[10];
		for (int i = 0; i < 10; i++) {
			a[i] = (int) (Math.random() * 100);
		}
		for (int each : a) {
			System.out.print(each + "  ");
		}
		System.out.println();
		Node node = new Node();
		for (int number : a) {
			node.add(number);
		}
		System.out.println(node.list());
	}

}
