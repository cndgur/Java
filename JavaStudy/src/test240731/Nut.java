package test240731;

import java.util.Objects;

public class Nut extends Farm {
	private String name;

	public Nut() {
		super();
	}

	public Nut(String kind, String name) {
		super(kind);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return super.getKind() + ": " + this.name;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(this.name, super.getKind());
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Nut) {
			Nut n = ((Nut)obj);
			if(n.getName().equals(this.getName()) && n.getKind().equals(super.getKind())) {
				return true;
			}
		}
		return false;
	}
	
}
