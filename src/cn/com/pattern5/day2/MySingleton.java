package cn.com.pattern5.day2;

public class MySingleton {
	private static volatile MySingleton mySingleton;
	
	private MySingleton() {
		
	}
	
	public static MySingleton getMySingleton() {
		if (mySingleton == null) {
			synchronized (MySingleton.class) {
				if (mySingleton == null) {
					mySingleton = new MySingleton();
				}
			}
		}
		
		return mySingleton;
	}

}
