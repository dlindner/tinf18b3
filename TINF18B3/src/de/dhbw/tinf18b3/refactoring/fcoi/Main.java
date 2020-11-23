package de.dhbw.tinf18b3.refactoring.fcoi;

import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {
		MyStack<Bierkasten> lager = new MyStack<Bierkasten>();
		lager.push(new Bierkasten(LocalDateTime.now().plusMonths(1)));
		lager.push(new Bierkasten(LocalDateTime.now().plusMonths(2)));
		lager.push(new Bierkasten(LocalDateTime.now().plusMonths(3)));
		lager.push(new Bierkasten(LocalDateTime.now().plusMonths(4)));
		
//		lager.remove(3);
//		lager.clear();
		
		System.out.println(lager.pop());
		System.out.println(lager.pop());
		System.out.println(lager.pop());
		System.out.println(lager.pop());
		System.out.println(lager.pop());
		System.out.println(lager.pop());
		System.out.println(lager.pop());
		System.out.println(lager.pop());
		System.out.println(lager.pop());
		System.out.println(lager.pop());
		
		lager.push(new Bierkasten(LocalDateTime.now().plusMonths(6)));
		System.out.println(lager.pop());
		System.out.println(lager.pop());
	}
}
