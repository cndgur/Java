package test240719.object3;

public class Cargoplane extends Plane{

	public Cargoplane() {
		super();
	}

	public Cargoplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}

	public void flight(int distance) {
		
	}

	@Override
	public String toString() {
		return planeName + "\t\t\t" + fuelSize;
	}

	@Override
	public int refuel() {
		return this.getFuelSize()/100;
		
	}
	
}
