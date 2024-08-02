package test240716.object1;

public class Circle extends Point{
	private int raidus;

	public Circle() {
		super();
	}

	public Circle(int x, int y, int radius) {
		super(x,y);
		this.raidus = raidus;
	}

	public int getRaidus() {
		return raidus;
	}

	public void setRaidus(int raidus) {
		this.raidus = raidus;
	}

	@Override
	public String toString() {
		return "Circle [raidus=" + raidus + "]";
	}
	
}
