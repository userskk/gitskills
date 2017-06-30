package com.gwi.exception;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ThreadLocalTest {
	public static void main(String[] args)throws Exception {
		ExecutorService es = Executors.newCachedThreadPool();
		
		for(int i=0; i<10000000; i++){
			Thread t = new Thread(){
				public void run(){
						System.out.println(Thread.currentThread().getName()+" thread run ");
						try {
							Thread.sleep(10000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
				}
			};
			
		}
		
		
		
				
				
		
	
	}
	
	
}
