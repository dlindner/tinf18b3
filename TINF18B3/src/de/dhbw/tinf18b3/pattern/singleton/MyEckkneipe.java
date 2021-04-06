package de.dhbw.tinf18b3.pattern.singleton;

public final class MyEckkneipe {

	private static Object lock = new Object();
	private static MyEckkneipe einziges;
	
	private MyEckkneipe() {
		//super();
	}
	
	public static MyEckkneipe getInstance() {
		synchronized (lock) {
			if (null == einziges) {
				einziges = new MyEckkneipe();
			}
			return einziges;
		}
	}
	
	public void drink() {
		System.out.println("Lecker!");
	}
}
