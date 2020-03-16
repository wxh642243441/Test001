package com.tedu.day08;

public class Demo003 {
	public static void main(String[] args) {
		Hero hero1 = new Hero("al");
		Hero hero2 = new Hero("an");
		Thread thread1 = new Thread() {
			public void run() {
				synchronized (hero1) {
					System.out.println("thread1 已占有al");
					try {
						Thread.sleep(3000);
					} catch (Exception e) {
						e.printStackTrace();
					}
					System.out.println("正在尝试占有an");
					System.out.println("等待中......");
					synchronized (hero2) {
						System.out.println("do something");
					}
				}

			}

		};
		thread1.start();
		Thread thread2 =new Thread() {
			public void run() {
				synchronized (hero2) {
					System.out.println("thread2 已占有an");
					try {
						Thread.sleep(3000);
					} catch (Exception e) {
						e.printStackTrace();
					}
					System.out.println("正在尝试占有al");
					System.out.println("等待中......");
					synchronized (hero1) {
					System.out.println("do something");	
					}
				}
			}
		};
		thread2.start();
	}

}
