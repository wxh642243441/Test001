package com.tedu.day02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Node<T> {
	public Node<T> leftNode;
	public Node<T> rightNode;
	public T value;

	public void add(T t) {
		// 判断，值为空则赋值
		if (value == null) {
			value = t;
		} else {
			// 新值与原来的值比较
			if ((Integer) t - (Integer) value <= 0) {
				// 判断左节点，为空则加到左节点
				if (leftNode == null) {
					leftNode = new Node<T>();
				}
				leftNode.add(t);

			} else {
				if (rightNode == null) {
					rightNode = new Node<T>();
				}
				rightNode.add(t);

			}
		}
	}

	public List<T> values() {
		List<T> values = new ArrayList<>();
		if (leftNode != null) {
			values.addAll(leftNode.values());
		}
		values.add(value);
		if (rightNode != null) {
			values.addAll(rightNode.values());
		}
		return values;
	}

	public static void main(String[] args) {
		// 创建随机数组长度为10
		int a[] = new int[10];
		for (int i = 0; i < 10; i++) {
			a[i] = (int) (Math.random() * 100) + 1;
		}
		//遍历输出数组
		for (int each : a) {
			System.out.print(each + "  ");
		}
		System.out.println();
		Node<Integer> node = new Node<>();
		for (int number : a) {
			node.add(number);
		}
		System.out.println(node.values());
	}
}
