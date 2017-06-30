package com.gwi.exception;

import java.lang.Thread.UncaughtExceptionHandler;


public class CrashError {
	{
		Thread.setDefaultUncaughtExceptionHandler(MyCrashHandler.INSTANS);
	}
	void doJavaCrash(){
		throw new NullPointerException();
	}
	
	static class MyCrashHandler implements UncaughtExceptionHandler{
		public static final MyCrashHandler INSTANS = new MyCrashHandler();
		private UncaughtExceptionHandler originalHandler;
		
		private MyCrashHandler() {
			originalHandler = Thread.getDefaultUncaughtExceptionHandler();
		}
		@Override
		public void uncaughtException(Thread t, Throwable e) {
			if(originalHandler != null)
				originalHandler.uncaughtException(t, e);
			
		}
		
	}
	
	public static void main(String[] args) {
		new CrashError().doJavaCrash();
	}
}
