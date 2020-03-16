package com.tedu.day07;

public class Demo001 {
	public static void main(String[] args) {
		Thread thread = new Thread() {
			public void run() {
				int time = 0;
				while(true) {
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						e.printStackTrace();
					}
					System.out.println(time++);
					if(time>20) {
						break;
					}
				}
			};
		};
		thread.start();
	}

}
