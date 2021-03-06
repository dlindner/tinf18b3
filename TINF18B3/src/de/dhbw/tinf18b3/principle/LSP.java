package de.dhbw.tinf18b3.principle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class LSP {

	public static void main(String[] args) {
		Number[] numbers = new Integer[10];
		System.out.println(numbers.length);
		numbers[0] = Integer.valueOf(132);
		System.out.println(numbers[0]);
		numbers[1] = new Double(218.0D);
		System.out.println(numbers[1]);
		System.out.println("-----");
		
		List<Integer> numbers2 = new ArrayList<Integer>();
		numbers2.add(132);
		numbers2.add(17);
		
		numbers2.forEach(System.out::println);

		// Invariant
		List<Number> nurGleicherTyp = new ArrayList<Number>();
		List<? extends Number> invariant = numbers2;
		List<Object> objekte = new ArrayList<Object>();
		List<? super Integer> kontra = objekte;
		
		// Kovariant
		List<? extends Number> kovariant = numbers2;
		
		// Kontravariant
		List<Object> ganzOben = new ArrayList<Object>();
		List<? super Number> kontravariant = ganzOben;
	}
	
	private <A extends Number & Serializable> A something() {
		return null;
	}
}
