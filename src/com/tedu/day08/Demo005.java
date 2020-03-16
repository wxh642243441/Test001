package com.tedu.day08;

public class Demo005 {
	public static void main(String[] args) {
		Hero hero = new Hero("dog", 300);
		Thread thread1 = new Thread() {
			@Override
			public void run() {
				while (hero.isDead()) {
					hero.hurt();
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						e.printStackTrace();
					}
					if (hero.hp > 0) {
						System.out.println("剩余血量  " + hero.hp);
					} else {
						System.out.println("已死亡");
					}
				}

			}
		};
		thread1.start();
		Thread thread2 = new Thread() {
			@Override
			public void run() {
				while (hero.isDead()) {
					hero.recover();
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		};
		thread2.start();
	}

}
