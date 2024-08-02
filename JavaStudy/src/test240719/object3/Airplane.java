package test240719.object3;

public class Airplane extends Plane {

	public Airplane() {
		super();
	}

	public Airplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}
	
	public void flight (int distance) {
		setFuelSize(getFuelSize() - (distance / 10) * 5);
	}

	@Override
	public String toString() {
		return planeName + "\t" +fuelSize;
	}

	@Override
	public void refuel(int fuel) {
		
	}
		
	}


