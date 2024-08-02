package o.collection.map;

public class Snack {
	private String flavor;
	private int caloty;
	public Snack() {
		super();
	}
	public Snack(String flavor, int caloty) {
		super();
		this.flavor = flavor;
		this.caloty = caloty;
	}
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	public int getCaloty() {
		return caloty;
	}
	public void setCaloty(int caloty) {
		this.caloty = caloty;
	}
	@Override
	public String toString() {
		return "Snack [flavor=" + flavor + ", caloty=" + caloty + "]";
	}
	
}
