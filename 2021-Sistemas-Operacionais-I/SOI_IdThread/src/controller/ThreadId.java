package controller;

public class ThreadId extends Thread{
	
	@Override
	public void run() {
		System.out.println("TID #" + getId());
	}

}