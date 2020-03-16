package com.tedu.day07;

public class Demo002 {
	public static void main(String[] args) {
		final Hero hero1 = new Hero();
		hero1.name = "小狗";
		hero1.hp = 100;
		final Hero hero2 = new Hero();
		hero2.name = "小猫";
		hero2.hp = 200;
		final Hero hero3 = new Hero();
		hero3.name = "小鸟";
		hero3.hp = 300;
		final Hero hero4 = new Hero();
		hero4.name = "小猪";
		hero4.hp = 400;
		Thread thread1 = new Thread() {
			@Override
			public void run() {
				while (!hero1.isDead()) {
					try {
						Thread.sleep(500);
						hero2.attack(hero1);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		};
		thread1.start();
		try {
			thread1.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		Thread thread2 = new Thread() {
			@Override
			public void run() {
				while(!hero4.isDead()) {
					try {
						Thread.sleep(250);
						hero3.attack(hero4);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		};
		thread2.start();
	}

}
