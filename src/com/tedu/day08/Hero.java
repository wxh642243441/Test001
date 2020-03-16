package com.tedu.day08;

public class Hero {
	public String name;
	public int hp=60;
	int times = 3;

	public Hero() {

	}
	public Hero(String name) {
		this.name =name;
	}
	public Hero(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	public synchronized void recover() {
		if(hp>400) {
			try {
				this.wait();
				System.out.println("加血等待.....");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		int num =(int) (Math.random()*80+1);
		hp=hp+num;
		System.out.println("血量增加"+num);
		this.notify();
	}
	public synchronized void hurt() {
		if(hp<100) {
			try {
				this.wait();
				System.out.println("减血等待.....");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		int num = (int) (Math.random()*100+1);
		hp=hp-num;
		System.out.println("血量减少："+num);
		this.notify();
		
	}

	public void attack(Hero h) {
		h.hp -= 20;
		System.out.println("剩余能量：" + h.hp);
	}

	public boolean isDead() {
		return 0 <= hp ? true : false;
	}

	public void start() {
		while (true) {
			for (int i = 1; i <= times; i++) {
				try {
					System.out.println("第" + i + "次发功");
					attack(this);
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			try {
				System.out.println("集氣......");
				Thread.sleep(1000);
				hp=60;
				System.out.println("能量："+hp);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
