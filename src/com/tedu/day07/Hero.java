package com.tedu.day07;

public class Hero {
	public String name;
	public int hp;

	public Hero() {

	}

	public Hero(String name) {
		this.name = name;
	}

	public Hero(int hp) {
		this.hp = hp;

	}

	public Hero(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}

	public boolean isDead() {
		return 0 >= hp ? true : false;
	}

	public void attack(Hero h) {
		h.hp -= 10;
		System.out.println(h.name + "还剩余" + h.hp + "点血");
		if (h.isDead()) {
			System.out.println(h.name + "已经死亡");
		}
	}
	@Override
	public String toString() {
		return "Hero [name=" + name + ", hp=" + hp + "]";
	}
}
