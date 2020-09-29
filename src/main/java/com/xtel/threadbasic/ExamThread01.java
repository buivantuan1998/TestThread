/**
 * 
 */
package com.xtel.threadbasic;

import java.util.Scanner;

import org.apache.log4j.Logger;

/**
 * @author TUAN
 *
 */
public class ExamThread01 extends Thread {

	Logger logger = Logger.getLogger(ExamThread01.class);
	
	private int count = 0;
	public boolean isStop = false;
	
	@Override
	public void run() {
		while (!isStop) {
			count ++;
			if(count >100) {
				count = 0;
			}
		}
	}
	
	public void end() {
		isStop = true;
	}
	
	public int getCount() {
		return count;
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhan phim bat ky de chay");
		sc.nextLine();
		
		ExamThread01 e = new ExamThread01();
		e.start();
		
		System.out.println("Nhan phim bat ky de ket thuc");
		sc.nextLine();
		
		e.end();
		System.out.println("Con so may man la: "+e.getCount());
	}

}
