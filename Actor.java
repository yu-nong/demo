package com.imooc.concurrent;

public class Actor extends Thread {

	
	public void run() {
		System.out.println(getName() + "��һ����Ա ��");
		
		int count = 0;
		
		System.out.println(getName() + "��̨�ݳ�:" + (++count));
		
		System.out.println(getName() + "���ݳ������ˣ�");
	}
	
	public static void main(String[] args) {
		Thread actor = new Actor();
		actor.setName("Mr.thread");
		
		actor.start();
	}
}
