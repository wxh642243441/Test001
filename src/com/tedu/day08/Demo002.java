package com.tedu.day08;

public class Demo002 {
	public static void main(String[] args) {
		final Hero hero = new Hero("小紅", 10000);
		System.out.println("初始血量" + hero.hp);

		int num = 10000;
		Thread[] add = new Thread[num];
		Thread[] minus = new Thread[num];
		for (int i = 0; i < num; i++) {
			Thread t = new Thread() {
				public void run() {
						hero.recover();
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			};
			t.start();
			add[i] = t;
		}
		for (int j = 0; j < num; j++) {
			Thread t = new Thread() {
				public void run() {
						hero.hurt();
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						e.printStackTrace();
					}
				};
			};
			t.start();
			minus[j] = t;
		}
		for (Thread t : add) {
			try {
				t.join();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		for (Thread t : minus) {
			try {
				t.join();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("增加减少后：" + hero.hp);
	}

}
