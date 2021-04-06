package de.dhbw.tinf18b3.pattern.singleton;

public class Main {

	public static void main(String[] args) {
		MyEckkneipe singleton1 = MyEckkneipe.getInstance();
		MyEckkneipe singleton2 = MyEckkneipe.getInstance();
		
		singleton1.drink();
		
		MyEckkneipe2.instance.drink();
	}
}
