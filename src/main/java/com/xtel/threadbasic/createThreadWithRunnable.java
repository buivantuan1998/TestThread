/**
 * 
 */
package com.xtel.threadbasic;

import org.apache.log4j.Logger;

/**
 * @author TUAN
 *
 */
public class createThreadWithRunnable implements Runnable{
	
	Logger logger = Logger.getLogger(createThreadWithRunnable.class);
	
	private String name;
	
	
	
	public createThreadWithRunnable(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void run() {
		int count = 10;
		for (int i = count; i >0; i--) {
			logger.info(this.getName() + " "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				logger.error("Error: "+e.getMessage());
			}
		}
		logger.info(this.getName()+" - End time");
	}
	
	public void output() throws InterruptedException {
		createThreadWithRunnable c = new createThreadWithRunnable("Thread_1");
		Thread t1 = new Thread(c);
		logger.info(t1.getName()+" - "+ t1.getState());
		t1.start();
		logger.info(t1.getName()+" - "+ t1.getState());
		try {
			logger.info(t1.getName()+" - "+ t1.getState());
//			t1.setPriority(3);
			logger.info(t1.getName()+" - "+ t1.getState());
//			t1.join();
			logger.info(t1.getName()+" - "+ t1.getState());
			Thread.sleep(1100);
			logger.info(t1.getName()+" - "+ t1.getState());
		} catch (InterruptedException e) {
			logger.error("Error: "+e.getMessage());
		}

		logger.info(t1.getName()+" - "+ t1.getState());
		
		createThreadWithRunnable b = new createThreadWithRunnable("Thread_2");
		Thread t2 = new Thread(b);
		logger.info(t2.getName()+" - "+ t2.getState());
		
		t2.start();
		logger.info(t2.getName()+" - "+ t2.getState());
		try {
			logger.info(t2.getName()+" - "+ t2.getState());
//			t2.setPriority(10);
			logger.info(t2.getName()+" - "+ t2.getState());
//			t2.join();
			logger.info(t2.getName()+" - "+ t2.getState());
			Thread.sleep(1200);
			logger.info(t2.getName()+" - "+ t2.getState());
		} catch (InterruptedException e) {
			logger.error("Error: "+e.getMessage());
		}
		logger.info(t2.getName()+" - "+ t2.getState());
		
		createThreadWithRunnable d = new createThreadWithRunnable("Thread_3");
		Thread t3 = new Thread(d);
		logger.info(t3.getName()+" - "+ t3.getState());
		t3.start();
		logger.info(t3.getName()+" - "+ t3.getState());
		try {
			logger.info(t3.getName()+" - "+ t3.getState());
//			t3.setPriority(5);
			logger.info(t3.getName()+" - "+ t3.getState());
//			t3.join();
			logger.info(t3.getName()+" - "+ t3.getState());
			Thread.sleep(1000);
			logger.info(t3.getName()+" - "+ t3.getState());
		} catch (InterruptedException e) {
			logger.error("Error: "+e.getMessage());
		}
		logger.info(t3.getName()+" - "+ t3.getState());
		
	}
	
	public static void main(String[] args) {
		createThreadWithRunnable c = new createThreadWithRunnable("");
		try {
			c.output();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}


}
