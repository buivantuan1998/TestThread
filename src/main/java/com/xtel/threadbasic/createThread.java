/**
 * 
 */
package com.xtel.threadbasic;

import org.apache.log4j.Logger;

/**
 * @author TUAN
 *
 */
public class createThread extends Thread{

	Logger logger = Logger.getLogger(createThread.class);
	
	@Override
	public void run() {
		int count = 10;
		for (int i = count; i >0; i--) {
			logger.info(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				logger.error("Error: "+e.getMessage());
			}
		}
		logger.info("End time");
	}
	
	public static void main(String[] args) {
		createThread c = new createThread();
		c.start();
		System.out.println(c.getName());
		System.out.println(c.getPriority());
		System.out.println(c.getId());
		System.out.println(c.getState());
	}

}
