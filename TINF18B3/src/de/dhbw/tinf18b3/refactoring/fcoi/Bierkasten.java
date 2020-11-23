package de.dhbw.tinf18b3.refactoring.fcoi;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Bierkasten {

	private LocalDateTime mhd;

	public Bierkasten(LocalDateTime mhd) {
		super();
		this.mhd = mhd;
	}
	
	@Override
	public String toString() {
		return "Haltbar bis " + this.mhd.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
	}
}
