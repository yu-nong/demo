package com.imooc.concurrent;

public class Actor extends Thread {

	
	public void run() {
		System.out.println(getName() + "是一个演员 ！");
		
		int count = 0;
		
		System.out.println(getName() + "登台演出:" + (++count));
		
		System.out.println(getName() + "的演出结束了！");
	}
	
	public static void main(String[] args) {
		Thread actor = new Actor();
		actor.setName("Mr.thread");
		
		actor.start();
	}
}
