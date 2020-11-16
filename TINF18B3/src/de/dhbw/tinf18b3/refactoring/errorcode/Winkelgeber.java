package de.dhbw.tinf18b3.refactoring.errorcode;

import java.util.Optional;

public class Winkelgeber {

	private Winkelsensor sensor;

	public Winkelgeber(Winkelsensor sensor) {
		super();
		this.sensor = sensor;
	}
	
	public int getAngle() {
		if (this.sensor.isWorking()) {
			return sensor.angle();
		}
		return -1;
	}
	
	public int getAngleOrException() throws SensorException {
		if (this.sensor.isWorking()) {
			return sensor.angle();
		}
		throw new SensorException();
	}
	
	public Integer getAngleOrNull() {
		if (this.sensor.isWorking()) {
			return sensor.angle();
		}
		return null;
	}
	
	public Optional<Integer> getAngleOrEmpty() {
		if (this.sensor.isWorking()) {
			return Optional.of(sensor.angle());
		}
		return Optional.empty();
	}
	
	public Optional<Integer> getMaybeAngleOrExceptionOnFailure() throws SensorException {
		// TODO Hausaufgabe
		return Optional.empty();
	}
}
