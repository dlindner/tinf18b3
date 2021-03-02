package de.dhbw.tinf18b3.principle;

import java.util.function.Supplier;

public class Console {
	
	private boolean isActive;
	
	public Console(boolean isActive) {
		super();
		this.isActive = isActive;
	}
	
	public void print(Supplier<String> text) {
		if (this.isActive) {
			String ausgabe = text.get();
			System.out.println(ausgabe);
			this.isActive = false;
		}
	}
}
