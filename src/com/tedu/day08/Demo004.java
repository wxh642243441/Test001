package com.tedu.day08;

public class Demo004 {
	public static void main(String[] args) {
		Object a = new Object();
		Object b = new Object();
		Object c = new Object();
		Thread thread1 = new Thread() {
			@Override
			public void run() {
				synchronized (a) {
					System.out.println("已占有a");
					try {
						Thread.sleep(2000);
					} catch (Exception e) {
						e.printStackTrace();
					}
					synchronized (b) {
						System.out.println("尝试占有b");
						synchronized (c) {
							System.out.println("尝试占有c");
						}
					}
				}
			}
		};
				Thread thread2 = new Thread() {
			@Override
			public void run() {
				synchronized (b) {
					System.out.println("已占有b");
					try {
						Thread.sleep(2000);
					} catch (Exception e) {
						e.printStackTrace();
					}
					synchronized (a) {
						System.out.println("尝试占有a");
						synchronized (c) {
							System.out.println("尝试占有c");
						}

					}
				}
			}
		};
		Thread thread3 = new Thread() {
			@Override
			public void run() {
				synchronized (c) {
					System.out.println("已占有c");
					try {
						Thread.sleep(2000);
					} catch (Exception e) {
						e.printStackTrace();
					}
					synchronized (a) {
						System.out.println("尝试占有a");
						synchronized (b) {
							System.out.println("尝试占有c");
						}
					}
				}
			}

		};
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
