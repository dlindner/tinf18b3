package de.dhbw.tinf18b3.refactoring.fcoi;

import java.util.LinkedList;
import java.util.Optional;

public class MyStack<TEIL> {
	
	private static final int abholort = 0;
	private final LinkedList<TEIL> unsere;
	
	public MyStack() {
		super();
		this.unsere = new LinkedList<TEIL>();
	}
	
	public void push(TEIL element) {
		this.unsere.add(abholort, element);
	}
	
	public Optional<TEIL> pop() {
		if (this.unsere.isEmpty()) {
			return Optional.empty();
		}
		return Optional.of(this.unsere.remove(abholort));
	}
}
