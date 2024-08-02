package test240719.object3;

public abstract class Plane {

	protected String planeName;
	protected int fuelSize;
	public Plane() {
		super();
	}
	public Plane(String planeName, int fuelSize) {
		super();
		this.planeName = planeName;
		this.fuelSize = fuelSize;
	}
	
	public String getPlaneName() {
		return planeName;
	}
	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}
	public int getFuelSize() {
		return fuelSize;
	}
	public void setFuelSize(int fuelSize) {
		this.fuelSize = fuelSize;
	}
	public abstract void refuel(int fuel);
		
	
	
	public void flight(int distance) {
		int fuel = distance /10*30;
	}

}
