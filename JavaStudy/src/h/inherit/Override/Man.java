package h.inherit.Override;

public class Man {
	private String name;

	public Man() {
		super();
	}

	public Man(String name) {
		super();
		this.name = name;
	}
	
	public void tellYourName() {
		System.out.println("My name is " + this.name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	@Override
	public String toString() {
		return "Man [name=" + name + "]";
	}
	
	
}
